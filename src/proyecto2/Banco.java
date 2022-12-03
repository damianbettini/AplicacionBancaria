package proyecto2;

import java.util.ArrayList;
import java.util.Scanner;



public class Banco {

    private static Scanner leer = new Scanner(System.in);

    private String nombre;
    private ArrayList<Cliente> nuevosClientes = new ArrayList<>();

    public Banco() {
    }

    public Banco(String nombre, ArrayList<Cliente> nuevosClientes) {
        this.nombre = nombre;
        this.nuevosClientes = nuevosClientes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Cliente> getClientes() {
        return nuevosClientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) { this.nuevosClientes = clientes; }

    @Override
    public String toString() {
        return "Banco{" +
                "nombre='" + nombre + '\'' +
                ", clientes=" + nuevosClientes +
                '}';
    }



}



