
package Modelo;

import java.util.ArrayList;
/**
 * Clase encargada de almacenar todas las listas
 * principales del sistema:
 * huéspedes, habitaciones y reservas.
 * Funciona como contenedor de la información del hotel.
 */
public class Hotel {
    public ArrayList<Huesped> listaHuespedes;
    public ArrayList<Habitacion> listaHabitaciones;
    public ArrayList<Reservas> listaReservas;
   
   public Hotel (){
       this.listaHuespedes = new ArrayList<>();
       this.listaHabitaciones = new ArrayList<>();
       this.listaReservas = new ArrayList<>();
   }

    public Hotel(ArrayList<Huesped> listaHuespedes, ArrayList<Habitacion> listaHabitaciones, ArrayList<Reservas> listaReservas) {
        this.listaHuespedes = listaHuespedes;
        this.listaHabitaciones = listaHabitaciones;
        this.listaReservas = listaReservas;
    }

    public ArrayList<Huesped> getListaHuespedes() {
        return listaHuespedes;
    }

    public void setListaHuespedes(ArrayList<Huesped> listaHuespedes) {
        this.listaHuespedes = listaHuespedes;
    }

    public ArrayList<Habitacion> getListaHabitaciones() {
        return listaHabitaciones;
    }

    public void setListaHabitaciones(ArrayList<Habitacion> listaHabitaciones) {
        this.listaHabitaciones = listaHabitaciones;
    }

    public ArrayList<Reservas> getListaReservas() {
        return listaReservas;
    }

    public void setListaReservas(ArrayList<Reservas> listaReservas) {
        this.listaReservas = listaReservas;
    }
   
}


