
package dam105t3_colecciones;

import java.util.Objects;

public class Jugador {
    
    private String nombre;
    private double salario;

    Jugador(String nom, double sal) {
        
        nombre = nom;
        salario = sal;
        
    }

    public String getNombre() { return nombre; }
    
    public double getSalario() { return salario; }
    
    public void incSalario() {
        
        salario += salario * 0.10;
        
    }

    @Override

    public int hashCode() {

        int hash = 7;

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

        final Jugador other = (Jugador) obj;

        return true;

    }
    
}
