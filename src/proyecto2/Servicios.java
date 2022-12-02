package proyecto2;

import java.util.Scanner;

public class Servicios {

    public static void Menu() {
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
                break;
            case 2:
                System.out.println("Por favor ingrese su usuario y luego su contraseña");
                break;
            case 3:
                System.out.println("De acuerdo");
                break;
            default:
                System.out.println("Esa opcion no es correcta");
                break;
        }
        if (opcion == 1) {
            System.out.println("Cuantos años tenes?");
            Scanner leer2 = new Scanner(System.in);
            int edad = 0;
            try {
                edad = leer.nextInt();
                System.out.println("Tu edad es " + edad);
            } catch (Exception e) {
                System.out.println("Por favor ingresar un numero correcto");
            }
            if (edad >= 18) {
                System.out.println("Ingrese su nombre");
                Scanner leer3 = new Scanner(System.in);
                String nombre = leer3.nextLine();
                System.out.println("Ingrese su apellido");
                Scanner leer4 = new Scanner(System.in);
                String apellido = leer4.nextLine();
                System.out.println("Ingrese su direccion de domicilio actual");
                Scanner leer5 = new Scanner(System.in);
                String direccion = leer5.nextLine();
                System.out.println("Ingrese su numero de celular");
                Scanner leer6 = new Scanner(System.in);
                String numero = leer6.nextLine();
                System.out.println("Buenisimo! Solo unos datos mas");
                System.out.println("Ingrese su nuevo usuario");
                Scanner leer7 = new Scanner(System.in);
                String usuario = leer7.nextLine();
                System.out.println("Ingrese su nueva clave");
                Scanner leer8 = new Scanner(System.in);
                String clave = leer8.nextLine();
            } else {
                System.out.println("No tienes la edad suficiente para crear una cuenta bancaria, lo sentimos");
            }
        }

        if (opcion == 2) {
            System.out.println("Ingrese su usuario");
            Scanner leer2 = new Scanner(System.in);
            String usuario = leer2.nextLine();
            System.out.println("Ingrese su clave");
            Scanner leer3 = new Scanner(System.in);
            String clave = leer3.nextLine();

        }

        if (opcion == 3) {
            System.out.println("Nos vemos,que tengas un buen dia!");
        }

    }
}


    /*public static void CrearCliente(){
        Cliente p = new Cliente();
        p.getName();
        p.getApellido();
        p.getDireccion();
        p.getNumeroCelular();
        p.getCorreo();
        p.getUsuario();
        p.getClave();
    }

    public static void CrearCuenta(){

    }


}*/
