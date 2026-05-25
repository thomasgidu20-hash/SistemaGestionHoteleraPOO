
package Modelo;

public class HabitacionDoble extends Habitacion {

    public HabitacionDoble(int numero, double precio, boolean disponible) {

        super(numero, precio, disponible);
    }

    @Override
    public double calcularCosto() {

        return precio * 1.2;
    }
}