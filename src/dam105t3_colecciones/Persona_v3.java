
package dam105t3_colecciones;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Comparator;
import java.util.Objects;

public class Persona_v3 implements Comparable {
    
    private String nombre;
    private String DNI;
    private int telefono;
    private String email;
    private LocalDate fechaNaci;

    Persona_v3(String nom, String dni, int tlf, String correo, LocalDate fNaci) {
        
        nombre = nom;
        DNI = dni;
        telefono = tlf;
        email = correo;
        fechaNaci = fNaci;
        
    }
    
    public String getNombre() { return nombre; }

    public String getEmail() { return email; }

    public LocalDate getFechaNaci() { return fechaNaci; }
    
    public int calcEdad() {
        
        int edad = (int) ChronoUnit.YEARS.between(fechaNaci, LocalDate.now());
        
        return edad;
        
    }

    @Override

    public String toString() {

        return "Persona {" + "Nombre = " + nombre + ", DNI = " + DNI + " Telefono = " + telefono + ", Email = " + email + ", Fecha Nacimiento = " + fechaNaci + '}';

    }

    @Override

    public int hashCode() {

        int hash = 3;

        hash = 47 * hash + Objects.hashCode(this.nombre.toLowerCase());

        return hash;

    }

    @Override

    public boolean equals(Object obj) {

        if (this == obj) {

            return true;

        }

        if (obj == null) {

            return false;

        }

        if (getClass() != obj.getClass()) {

            return false;

        }

        final Persona_v3 other = (Persona_v3) obj;

        if (!this.nombre.toLowerCase().equals(other.nombre.toLowerCase())) {

            return false;

        }

        return true;
        
    }

    @Override
    public int compareTo(Object o) {   // Orden Descendente

        Persona_v3 pers = (Persona_v3) o;

        return this.fechaNaci.compareTo(pers.fechaNaci);
    }
    
}

class ComparaEmail implements Comparator {

    public int compare(Object o1, Object o2) {   // Orden Descendente

        Persona_v3 pers1 = (Persona_v3) o1;
        
        Persona_v3 pers2 = (Persona_v3) o2;

        return pers1.getEmail().compareToIgnoreCase(pers2.getEmail());

    }

}

class ComparaEdad implements Comparator {

    public int compare(Object o1, Object o2) {   // Orden Descendente

        Persona_v3 pers1 = (Persona_v3) o1;
        
        Persona_v3 pers2 = (Persona_v3) o2;

        return pers1.getFechaNaci().compareTo(pers2.getFechaNaci());

    }

}