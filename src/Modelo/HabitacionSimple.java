
package Modelo;
/**
 * Representa el tipo habitación del hotel.
 * Hereda los atributos de las clase habiatcion
 */
public class HabitacionSimple extends Habitacion {

    public HabitacionSimple(int numero, double precio, boolean disponible) {

        super(numero, precio, disponible);
    }

    @Override
    public double calcularCosto() {

        return precio;
    }
}

