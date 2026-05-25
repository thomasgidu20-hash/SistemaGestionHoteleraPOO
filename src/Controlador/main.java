package Controlador;
import Modelo.*;
import java.time.LocalDate;

public class main {

    public static void main(String[] args) {

        // Crear controlador
         ControlHotel control = new ControlHotel();

        // Crear huésped
        Huesped h1 = new Huesped("Efectivo", 5, "Thomas Giraldo"," 12345", 17, "medico");

        // Crear habitaciones
        HabitacionSimple hab1 = new HabitacionSimple(121, 345, true);
                       

        HabitacionSuite hab2 = new HabitacionSuite(123, 643, true);
                
        // Registrar habitaciones
        control.registrarHabitacion(hab1);

        control.registrarHabitacion(hab2);

        // Buscar habitación
        Habitacion encontrada =
                control.buscarHabitacion(121);

        System.out.println(
                "Habitación encontrada: "
                        + encontrada.getNumero()
        );

        // Eliminar habitación
        boolean eliminado =
                control.eliminarHabitacion(123);

        System.out.println(
                "¿Habitación eliminada?: "
                        + eliminado
        );

        // Actualizar disponibilidad
        control.actualizarDisponibilidad(
                121,
                false
        );

        System.out.println(
                "Disponibilidad habitación 101: "
                        + hab1.isDisponible()
        );

        // Crear reserva
        Reservas r1 = new Reservas(
                h1,
                hab1,
                LocalDate.of(2026,5,20),
                LocalDate.of(2026,5,25)
        );

        // Calcular total
        System.out.println(
                "Total reserva simple: "
                        + r1.calcularTotal()
        );

        // Probar polimorfismo con Suite
        Reservas r2 = new Reservas(
                h1,
                hab2,
                LocalDate.of(2026,5,20),
                LocalDate.of(2026,5,25)
        );

        System.out.println(
                "Total reserva suite: "
                        + r2.calcularTotal()
        );

    }
}