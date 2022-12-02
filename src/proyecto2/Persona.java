package proyecto2;

public class Persona {

    private String name;
    private String apellido;
    private String direccion;

    private Integer numeroCelular
            ;
    private String correo;

    private Cliente numeroTarjeta;
    private Cliente numeroCliente;
    private Cliente usuario;
    private Cliente clave;

    public Persona (){}

    public Persona(String name, String apellido, String direccion, Integer numeroCelular, String correo, Cliente numeroTarjeta,
                   Cliente numeroCliente, Cliente usuario, Cliente clave) {
        this.name = name;
        this.apellido = apellido;
        this.direccion = direccion;
        this.numeroCelular = numeroCelular;
        this.correo = correo;
        this.numeroTarjeta = numeroTarjeta;
        this.numeroCliente = numeroCliente;
        this.usuario = usuario;
        this.clave = clave;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Integer getNumeroCelular() {
        return numeroCelular;
    }

    public void setNumeroCelular(Integer numeroCelular) {
        this.numeroCelular = numeroCelular;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }




}





