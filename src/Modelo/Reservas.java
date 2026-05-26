
package Modelo;

import java.time.LocalDate;

public class Reservas {
    
    private Huesped huesped;
    private Habitacion habitacion;

    private LocalDate fechaIngreso;
    private LocalDate fechaSalida;

    public Reservas(Huesped huesped, Habitacion habitacion,
                   LocalDate fechaIngreso, LocalDate fechaSalida) {

        this.huesped = huesped;
        this.habitacion = habitacion;
        this.fechaIngreso = fechaIngreso;
        this.fechaSalida = fechaSalida;
    }

    public double calcularTotal() {

        long dias = fechaSalida.toEpochDay() - fechaIngreso.toEpochDay();

        return dias * habitacion.calcularCosto();
}

    public Huesped getHuesped() {
        return huesped;
    }

    public void setHuesped(Huesped huesped) {
        this.huesped = huesped;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public LocalDate getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(LocalDate fechaSalida) {
        this.fechaSalida = fechaSalida;
    }
    
    public String generarComprobante(){

    return """
           ===== RESERVA =====
           Hu\u00e9sped: """
            + huesped.getNombreCompleto()
            + "\nHabitación: "
            + habitacion.getNumero()
            + "\nIngreso: "
            + fechaIngreso
            + "\nSalida: "
            + fechaSalida
            + "\nTotal: "
            + calcularTotal();
}
}
