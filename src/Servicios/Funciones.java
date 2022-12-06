package Entidades;

import java.util.ArrayList;
import java.util.Scanner;

public class Funciones {

    private static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    private static ArrayList<Cliente> nuevosClientes = new ArrayList<>();

    public static boolean esValido() {
        boolean resultado = false;
        int edad;
        System.out.println("Ingresar edad");
        edad = leer.nextInt();
        if (edad >= 18) {
            resultado = true;
            System.out.println("Perfecto, vamos a necesitar unos datos mas para crear tu cuenta:");
        } else {
            System.out.println("Lo sentimos pero no puede crear una cuenta ya que es menor de edad");
        }
        return resultado;
    }

    public static Cliente crearCliente() {
        Cliente cliente = new Cliente();
        System.out.println("Ingresar nombre");
        cliente.setNombre(leer.next());
        System.out.println("Ingrese su apellido");
        cliente.setApellido(leer.next());
        System.out.println("Por favor valide su edad nuevamente");
        cliente.setEdad(leer.nextInt());
        System.out.println("Ingrese la direccion de su domicilio");
        cliente.setDireccion(leer.next());
        System.out.println("Ingrese su numero de celular");
        cliente.setNumeroCelular(leer.nextInt());
        System.out.println("Ingrese su correo");
        cliente.setCorreo(leer.next());
        System.out.println("Ingrese su usuario");
        cliente.setUsuario(leer.next());
        System.out.println("Ingrese su clave");
        cliente.setClave(leer.next());
        return cliente;
    }

    public void Cliente (Cliente clientes) {
        Cliente cliente1 = new Cliente("Rosana", "Ferrari", 45, "Buenos Aires", 1189458713,
                "rosanaFerrari@gmail.com", 478445789, 01,"rosana2022", "rosanaferrari");
        Cliente cliente2 = new Cliente("Alejandro", "Beatriz", 30, "Catamarca", 1113124789,
                "alejandro_beatriz@gmail.com", 454678945, 02,"alejandro30", "ale2022");
        Cliente cliente3 = new Cliente("Carlos", "Rodriguez", 57, "San Juan", 1156748142,
                "carlosrodriguez@gmail.com", 445789, 01,"carlos_2021", "carlos1968");
    }

    public static void guardarClientes() {
        Cliente cliente = crearCliente();
        nuevosClientes.add(cliente);
        System.out.println("Su usuario fue creado correctamente");
    }


    public static void mostrarClientes() {
        System.out.println(nuevosClientes);
    }

    public static void validarCuenta() {
        Cuentas cuenta = new Cuentas();
        System.out.println("Ingrese su usuario");
        String usuario = leer.next();
        System.out.println("Por favor ingrese su clave");
        String clave = leer.next();
        for (Cliente clientes : nuevosClientes) {
            if (clientes.getUsuario().equals(usuario)) {
                if (clientes.getClave().equals(clave)) {
                    System.out.println("Bievenido a su cuenta");
                } else {
                    System.out.println("Su clave no es correcta, vuelva a iniciar el proceso desde el menu");
                }

            } else {
                System.out.println("Su usuario no es correcto, vuelva a iniciar el proceso desde el menu");
            }
        }
    }


}























