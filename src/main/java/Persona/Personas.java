package Persona;

public class Personas 
{
    private String nombre;
    private String apellido1;
    private String apellido2; 
    private String destino;
    private String genero;
    private int edad;
    private double cDelBoleto;
    private String nPasaporte; 
    private String nTiquete;
    private String nAsiento;
    private int nVuelo;
    private String ciudadanoOro;

    public Personas() {
    }//Constructor vacio
    
    //Getters

    public String getNombre() {
        return nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public String getDestino() {
        return destino;
    }

    public String getGenero() {
        return genero;
    }

    public int getEdad() {
        return edad;
    }

    public double getcDelBoleto() {
        return cDelBoleto;
    }

    public String getnPasaporte() {
        return nPasaporte;
    }

    public String getnTiquete() {
        return nTiquete;
    }

    public String getnAsiento() {
        return nAsiento;
    }

    public int getnVuelo() {
        return nVuelo;
    }

    public String getCiudadanoOro() {
        return ciudadanoOro;
    }
    
    //Setters

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setcDelBoleto(double cDelBoleto) {
        this.cDelBoleto = cDelBoleto;
    }

    public void setnPasaporte(String nPasaporte) {
        this.nPasaporte = nPasaporte;
    }

    public void setnTiquete(String nTiquete) {
        this.nTiquete = nTiquete;
    }

    public void setnAsiento(String nAsiento) {
        this.nAsiento = nAsiento;
    }

    public void setnVuelo(int nVuelo) {
        this.nVuelo = nVuelo;
    }

    public void setCiudadanoOro(String ciudadanoOro) {
        this.ciudadanoOro = ciudadanoOro;
    }
    
    
    
}//Fin Persona
