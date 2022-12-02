package proyecto2;

import java.util.ArrayList;

public class Cliente extends Persona {

    private Integer numeroTarjeta;
    private Integer numeroCliente;
    private String usuario;
    private String clave;
    private ArrayList<Persona> nuevasPersonas;

    public Cliente (Integer numeroTarjeta, Integer numeroCliente, String usuario, String clave){
        this.numeroTarjeta = numeroTarjeta;
        this.numeroCliente = numeroCliente;
        this.usuario = usuario;
        this.clave = clave;
    }


    public Cliente (){
        nuevasPersonas = new ArrayList<Persona>();
    }

    public void addnuevasPersona(Persona p){
        nuevasPersonas.add(p);
    }


    public Integer getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(Integer numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public Integer getNumeroCliente() {
        return numeroCliente;
    }

    public void setNumeroCliente(Integer numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public ArrayList<Persona> getNuevasPersonas() {
        return nuevasPersonas;
    }

    public void setNuevasPersonas() {
        this.nuevasPersonas = nuevasPersonas;
    }
}



