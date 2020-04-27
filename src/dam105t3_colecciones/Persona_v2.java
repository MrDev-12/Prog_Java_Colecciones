
package dam105t3_colecciones;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Objects;

public class Persona_v2 {
    
    private String nombre;
    private int telefono;
    private String email;
    private LocalDate fechaNaci;

    Persona_v2(String nom, int tlf, String correo, LocalDate fNaci) {
        
        nombre = nom;
        telefono = tlf;
        email = correo;
        fechaNaci = fNaci;
        
    }
    
    public String getNombre() { return nombre; }
    
    public int calcEdad() {
        
        int edad = (int) ChronoUnit.YEARS.between(fechaNaci, LocalDate.now());
        
        return edad;
        
    }

    @Override

    public String toString() {

        return "Persona {" + "Nombre = " + nombre + ", Telefono = " + telefono + ", Email = " + email + ", Fecha Nacimiento = " + fechaNaci + '}';

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

        final Persona_v2 other = (Persona_v2) obj;

        if (!this.nombre.toLowerCase().equals(other.nombre.toLowerCase())) {

            return false;

        }

        return true;
        
    }
    
}
