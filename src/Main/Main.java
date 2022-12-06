package Main;

import java.util.Scanner;


import static Entidades.Movimientos.Funciones.*;


public class Main {

    public static void main(String[] args) {

        menu();

    }

    public static void menu() {
        Scanner leer = new Scanner(System.in);
        int opcion;
        usuariosClientes();

        do {
            System.out.println("Bienvenido al Banco Roma");
            System.out.println("En que podemos ayudarlo?");
            System.out.println("Opcion 1: crear cuenta");
            System.out.println("Opcion 2: ingresar a mi cuenta");
            System.out.println("Opcion 3: Quiero salir");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Entendido, vamos a necesitar los siguietes datos para crear su cuenta: ");
                    if (esValido()) {
                        guardarClientes();}
                    break;
                case 2:
                    System.out.println("Por favor ingrese su usuario y luego su contraseña");
                    validarCuenta();

                    break;
                case 3:
                    System.out.println("De acuerdo, nos vemos!");
                    break;
                default:
                    System.out.println("Esa opcion no es correcta por lo tanto vas a salir de la pagina del banco");
                    break;
            }

        } while (opcion != 3);
    }
}





















