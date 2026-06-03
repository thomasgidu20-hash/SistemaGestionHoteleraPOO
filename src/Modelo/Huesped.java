
package Modelo;
/**
 * Representa a un huésped del hotel.
 * Hereda los atributos de Persona y agrega
 * información relacionada con la estadía,
 * como método de pago y tiempo de permanencia.
 */
public class Huesped extends Persona{
    
    private String MetodoPago;
    private double TiempoPermanencia;
    
    public Huesped(){
        
    }
    public Huesped(String MetodoPago, double TiempoPermanencia, String NombreCompleto, String Documento, int Edad, String Profesion) {
        super(NombreCompleto, Documento, Edad, Profesion);
        this.MetodoPago = MetodoPago;
        this.TiempoPermanencia = TiempoPermanencia;
    }

    public String getMetodoPago() {
        return MetodoPago;
    }

    public void setMetodoPago(String MetodoPago) {
        this.MetodoPago = MetodoPago;
    }

    public double getTiempoPermanencia() {
        return TiempoPermanencia;
    }

    public void setTiempoPermanencia(double TiempoPermanencia) {
        this.TiempoPermanencia = TiempoPermanencia;
    }
    
}
