package proyecto2;

import java.util.ArrayList;
import java.util.Scanner;


import static proyecto2.Funciones.*;


public class Main {

    public static void main(String[] args){

        Cliente cliente1 = new Cliente();
        
        crearCliente();




        //menu();

    }
    private static void menu(){
        System.out.println("Bienvenido al Banco Roma");
        System.out.println("En que podemos ayudarlo?");
        System.out.println("Opcion 1: crear cuenta");
        System.out.println("Opcion 2: ingresar a mi cuenta");
        System.out.println("Opcion 3: Quiero salir");
        Scanner leer = new Scanner(System.in);
        int opcion = leer.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Entendido, vamos a necesitar los siguietes datos para crear su cuenta: ");
                esValido(new Cliente());
                crearCliente();

                break;
            case 2:
                System.out.println("Por favor ingrese su usuario y luego su contraseña");
                menu();
                break;
            case 3:
                System.out.println("De acuerdo, nos vemos!");
                break;
            default:
                System.out.println("Esa opcion no es correcta por lo tanto vas a salir de la pagina del banco");
                break;
        }

    }






}














