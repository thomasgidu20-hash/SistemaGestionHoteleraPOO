

package Modelo;
/**
 * Representa una habitación del hotel.
 * Permite almacenar el número de habitación,
 * el precio y su estado de disponibilidad.
 */
public class Habitacion {

    protected int numero;
    protected double precio;
    protected boolean disponible;

    public Habitacion(int numero, double precio, boolean disponible) {

        this.numero = numero;
        this.precio = precio;
        this.disponible = disponible;
    }

    public double calcularCosto(){

        return precio;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

   
}

