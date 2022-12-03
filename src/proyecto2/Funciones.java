package proyecto2;

import java.util.ArrayList;
import java.util.Scanner;

public class Funciones {

    private static Scanner leer = new Scanner(System.in);

    public static void esValido(Cliente cliente) {
        boolean esValido = false;
        System.out.println("Ingresar edad");
        cliente.setEdad(leer.nextInt());
        if (cliente.getEdad() >= 18) {
            System.out.println("Perfecto, vamos a necesitar unos datos mas para crear tu cuenta:");
        } else {
            System.out.println("Lo sentimos pero no puede crear una cuenta ya que es menor de edad");
        }
    }
    public static void crearCliente() {
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
       String nuevosClientes = (cliente.nombre + cliente.apellido + cliente.edad + cliente.direccion + cliente.numeroCelular + cliente.correo)



        public void Cliente{
            Cliente nuevoCliente = new Cliente();
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

        }

    }
}











