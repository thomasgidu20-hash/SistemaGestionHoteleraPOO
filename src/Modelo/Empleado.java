
package Modelo;
/**
 * Representa a un empleado del hotel.
 * Hereda los atributos de Persona y agrega
 * información relacionada con el salario y las horas de trabajo.
 */
public class Empleado extends Persona {
    
    private double Salario;
    private int HorasTrabajo;

    public Empleado() {
    }
    
    
    public Empleado(double Salario, int HorasTrabajo, String NombreCompleto, String Documento, int Edad, String Profesion) {
        super(NombreCompleto, Documento, Edad, Profesion);
        this.Salario = Salario;
        this.HorasTrabajo = HorasTrabajo;
    }

    public double getSalario() {
        return Salario;
    }

    public void setSalario(double Salario) {
        this.Salario = Salario;
    }

    public int getHorasTrabajo() {
        return HorasTrabajo;
    }

    public void setHorasTrabajo(int HorasTrabajo) {
        this.HorasTrabajo = HorasTrabajo;
    }
  
    
    
}
