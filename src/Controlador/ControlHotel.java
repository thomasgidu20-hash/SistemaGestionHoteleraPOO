
package Controlador;
import Modelo.*;
import java.util.ArrayList;
public class ControlHotel {
    
private ArrayList<Huesped> listaHuespedes;
private ArrayList<Habitacion> listaHabitaciones;
private ArrayList<Reservas> listaReservas;

public ControlHotel(){
    listaHuespedes = new ArrayList<>();

    listaHabitaciones = new ArrayList<>();

    listaReservas = new ArrayList<>();
    
}

    public ControlHotel(ArrayList<Huesped> listaHuespedes
            , ArrayList<Habitacion> listaHabitaciones,
            ArrayList<Reservas> listaReservas) {
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

    public void registrarHuesped(Huesped h){

    listaHuespedes.add(h);
}
public Huesped buscarHuesped(String documento){

    for(Huesped h : listaHuespedes){

        if(h.getDocumento().equals(documento)){
            return h;
        }
    }

    return null;
}

public boolean eliminarHuesped(String documento){

    for(Huesped h : listaHuespedes){

        if(h.getDocumento().equals(documento)){

            listaHuespedes.remove(h);

            return true;
        }
    }

    return false;
}
public boolean registrarHabitacion(Habitacion h){

    for(Habitacion hab : listaHabitaciones){

        if(hab.getNumero() == h.getNumero()){

            return false;
        }
    }

    listaHabitaciones.add(h);

    return true;
}
public Habitacion buscarHabitacion(int numero){

    for(Habitacion hab : listaHabitaciones){

        if(hab.getNumero() == numero){
            return hab;
        }
    }

    return null;
}
public boolean eliminarHabitacion(int numero){

    for(Habitacion hab : listaHabitaciones){

        if(hab.getNumero() == numero){

            listaHabitaciones.remove(hab);

            return true;
        }
    }

    return false;
}
public boolean actualizarDisponibilidad(int numero,boolean disponible){

    Habitacion hab = buscarHabitacion(numero);

    if(hab != null){

        hab.setDisponible(disponible);

        return true;
    }

    return false;
}
public boolean crearReservas(Reservas r){

    if(!r.getHabitacion().isDisponible()){

        return false;
    }

    r.getHabitacion().setDisponible(false);

    listaReservas.add(r);

    return true;
}
public boolean cancelarReservas(Reservas r){

    if(listaReservas.remove(r)){

        r.getHabitacion().setDisponible(true);

        return true;
    }

    return false;
}
}
