
package Modelo;

public class HabitacionSuite extends Habitacion {

    public HabitacionSuite(int numero, double precio, boolean disponible) {

        super(numero, precio, disponible);
    }

    @Override
    public double calcularCosto() {

        return precio * 1.5;
    }
}
