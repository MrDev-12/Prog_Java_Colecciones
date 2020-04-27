
package dam105t3_colecciones;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Objects;

public class Persona {
    
    private String nombre;
    private int telefono;
    private String email;
    private LocalDate fechaNaci;

    Persona(String nom, int tlf, String correo, LocalDate fNaci) {
        
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

        hash = 47 * hash + Objects.hashCode(this.nombre);

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

        final Persona other = (Persona) obj;

        if (!this.nombre.equals(other.nombre)) {

            return false;

        }

        return true;
        
    }
    
}
