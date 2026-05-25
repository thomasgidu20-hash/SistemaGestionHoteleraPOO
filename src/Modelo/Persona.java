
package Modelo;

public class Persona {
    
    private String NombreCompleto;
    private String Documento; 
    private int Edad;
    private String Profesion;
    
    public Persona(){
        
    }

    public Persona(String NombreCompleto, String Documento, int Edad, String Profesion) {
        this.NombreCompleto = NombreCompleto;
        this.Documento = Documento;
        this.Edad = Edad;
        this.Profesion = Profesion;
    }

    public String getNombreCompleto() {
        return NombreCompleto;
    }

    public void setNombreCompleto(String NombreCompleto) {
        this.NombreCompleto = NombreCompleto;
    }

    public String getDocumento() {
        return Documento;
    }

    public void setDocumento(String Documento) {
        this.Documento = Documento;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getProfesion() {
        return Profesion;
    }

    public void setProfesion(String Profesion) {
        this.Profesion = Profesion;
    }
    
    
}
