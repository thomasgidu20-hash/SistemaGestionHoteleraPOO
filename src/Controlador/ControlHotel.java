package Controlador;
import Modelo.*;
public class ControlHotel {

private Hotel hotel;

public ControlHotel(){
  
  hotel = new Hotel();
  
}
public Hotel getHotel() {

    return hotel;
}
    
    
 // =========================
    // HUÉSPEDES
    // =========================

     public Huesped crearHuesped(String MetodoPago, double TiempoPermanencia, String NombreCompleto, String Documento, int Edad, String Profesion) {

       if (buscarHuesped(Documento)== null){
           try {
               Huesped huesped = new Huesped(MetodoPago, TiempoPermanencia, NombreCompleto, Documento, Edad, Profesion);
               hotel.getListaHuespedes().add(huesped);
               return huesped;
               
           }catch (Exception ex) {
                System.out.println("error al crear cliente: " + ex.getMessage());
                return null ;
       }
    }else {
            System.out.println("El cliente ya existe: " + Documento);
            return null ;
     }
    }

    public Huesped buscarHuesped(String Documento) {
        for (Huesped huesped : hotel.getListaHuespedes()) {
            if (Documento.equals(huesped.getDocumento())) {
                return huesped;
            }
        }
        return null;
    }

    public boolean eliminarHuesped(String documento) {
        try {
            Huesped huesped = buscarHuesped(documento);

            if (huesped != null) {
                hotel.listaHuespedes.remove(huesped);
                return true;
            }

            return false;

        } catch (Exception e) {
            System.out.println("Error al eliminar huésped: " + e.getMessage());
            return false;
        }
    }

    public boolean actualizarHuesped(String MetodoPago, double TiempoPermanencia,
            String NombreCompleto, String Documento, int Edad, String Profesion) {
        Huesped huesped = buscarHuesped(Documento);
        
        if(huesped!= null){
            try{
                huesped.setDocumento(Documento);
                huesped.setEdad(Edad);
                huesped.setMetodoPago(MetodoPago);
                huesped.setNombreCompleto(NombreCompleto);
                huesped.setTiempoPermanencia(TiempoPermanencia);
                huesped.setMetodoPago(MetodoPago);
                return true;
            }catch (Exception ex) {
                System.out.println("error al actualizar el huesped: " + ex.getMessage());
                return false;
            } 
        }else {
            System.out.println("El huesped no existe: " + Documento);
            return false;
        }
    }

    // =========================
    // HABITACIONES
    // =========================

    public Habitacion crearHabitacion(int numero, double precio, boolean disponible) {
        if (buscarHabitacion(numero)== null){
            try{
                Habitacion habitacion = new Habitacion(numero, precio, disponible);
                hotel.getListaHabitaciones().add(habitacion);
                return habitacion;
            }catch (Exception ex){
               System.out.println("error al crear la habitacion: " + ex.getMessage());
                return null ;                
            }
        }else {
            System.out.println("El cliente ya existe: " + numero);
            return null ;
    }
    }

    public Habitacion buscarHabitacion(int numero) {
        try {
            for (Habitacion habitacion : hotel.listaHabitaciones) {
                if (numero == habitacion.getNumero()) {
                    return habitacion;
                }
            }

        } catch (Exception e) {
            System.out.println("Error al buscar habitación: " + e.getMessage());
        }

        return null;
    }

    public boolean eliminarHabitacion(int numero) {
        try {
            Habitacion habitacion = buscarHabitacion(numero);

            if (habitacion != null) {
                hotel.listaHabitaciones.remove(habitacion);
                return true;
            }

            return false;

        } catch (Exception e) {
            System.out.println("Error al eliminar habitación: " + e.getMessage());
            return false;
        }
    }

    public boolean actualizarHabitacion(int numero, double precio, boolean disponible) {
        Habitacion habitacion = buscarHabitacion(numero);
        if (habitacion != null){
            try {
                habitacion.setNumero(numero);
                habitacion.setDisponible(disponible);
                habitacion.setPrecio(precio);
                return true;
            }catch (Exception ex) {
                System.out.println("error al actualizar la habitacion: " + ex.getMessage());
                return false;
            } 
        }else {
            System.out.println("La habitacion no existe: " + numero);
            return false;
    }
    }

    public boolean actualizarDisponibilidadHabitacion(int numero, boolean disponible) {
        try {
            Habitacion habitacion = buscarHabitacion(numero);

            if (habitacion != null) {
                habitacion.setDisponible(disponible);
                return true;
            }

            return false;

        } catch (Exception e) {
            System.out.println("Error al actualizar disponibilidad: " + e.getMessage());
            
        }
      return false;
    }

  // =========================
    // RESERVAS
    // =========================

    public boolean crearReserva() {

    }

    public boolean eliminarReserva(int numeroHabitacion) {
        try {
            Reservas reservaEncontrada = null;

            for (Reservas r : hotel.listaReservas) {
                if (r.getHabitacion().getNumero() == numeroHabitacion) {
                    reservaEncontrada = r;
                    break;
                }
            }

            if (reservaEncontrada != null) {
                reservaEncontrada.getHabitacion().setDisponible(true);
                hotel.listaReservas.remove(reservaEncontrada);
                return true;
            }

            return false;

        } catch (Exception e) {
            System.out.println("Error al eliminar reserva: " + e.getMessage());
            return false;
        }
    }
}



