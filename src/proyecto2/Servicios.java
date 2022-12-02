package proyecto2;

import java.util.Scanner;

public class Servicios {

    public static void Menu() {
        System.out.println("Bienvenido al Banco Roma");
        System.out.println("En que podemos ayudarlo?");
        Scanner leer = new Scanner(System.in);
        int opcion = leer.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Quiero crear una cuenta de banco");
                break;
            case 2:
                System.out.println("Quiero ingresar a mi cuenta de banco");
                break;
            case 3:
                System.out.println("Quiero salir");
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
            } finally {
                leer2.close();
            }
            if (edad >= 18) {
                System.out.println("Ingrese el usuario que quiere crear");
                Scanner leer3 = new Scanner(System.in);
                String usuario = leer3.nextLine();
                System.out.println("Ingrese la clave que quiere crear");
                Scanner leer4 = new Scanner(System.in);
                String clave = leer4.nextLine();
            } else {
                System.out.println("No tienes la edad suficiente para crear una cuenta bancaria, lo sentimos");
            }
        }

        if (opcion == 2){
            System.out.println("Ingrese su usuario");
            Scanner leer2 = new Scanner(System.in);
            String usuario = leer2.nextLine();
            System.out.println("Ingrese su clave");
            Scanner leer3 = new Scanner(System.in);
            String clave = leer3.nextLine();

        }

    }
}

  /*  public static void CrearCliente(){
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


}
*/