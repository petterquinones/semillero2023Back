package problema1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner opcion = new Scanner(System.in);
        String datoIngreso = opcion.nextLine();

        System.out.println("Hola" + datoIngreso);

        System.out.println("===============================");
        System.out.println("********MENÚ PRINCIPAL*********");
        System.out.println("===============================");
        System.out.println("a. Añadir nuevo cliente ");
        System.out.println("b. Borrar un cliente.");
        System.out.println("c. Buscar un cliente.");
        System.out.println("d. Mostrar los clientes.");
        System.out.println("e. Salir.");
        System.out.println("===============================");
        System.out.println("Seleccione una opción:");

        switch (datoIngreso){
            case "a":
                    System.out.println("Has seleccionado la opción A");
                    break;
            case "b":
                    System.out.println("Has seleccionado la opción B");
                    break;
            case "c":
                    System.out.println("Has seleccionado la opción C");
                    break;
            case "d":
                    System.out.println("Has seleccionado la opción D");
                    break;
            case "e":
                    System.out.println("Has seleccionado la opción E");
                    break;
            default:
                    System.out.println("Error");
                    break;
            }
    }
}
