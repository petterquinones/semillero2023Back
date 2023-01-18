package problema1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner opcion = new Scanner(System.in);

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

        String datoIngreso =opcion.nextLine();

        System.out.println(datoIngreso);

        switch (datoIngreso){
            case "a":
                System.out.println("Has seleccionado la opción A");
                break;
            case "b":
                System.out.println("Has seleccionado la opciópn B");
                break;
            case "c":
                System.out.println("Has seleccionado la opciópn C");
                break;
            case "d":
                System.out.println("Has seleccionado la opciópn D");
                break;
            case "e":
                System.out.println("Has seleccionado la opciópn E");
                break;
            default:
                System.out.println("has ingresado un valor no especificado");
        break;
        }

    }
}
