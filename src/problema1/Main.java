package problema1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Clase scanner para ingresar datos y validar
        Scanner opcion = new Scanner(System.in);

        //Declaración de un array de tipo cliente
        int longitudArray = 4;
        Cliente [] cliente = new Cliente[longitudArray];

        //Asignación de clientes al array
        cliente[0] = new Cliente("Sara", 111111);
        cliente[1] = new Cliente("Pedro", 222222);
        cliente[2] = new Cliente("Victoria", 333333);
        cliente[3] = new Cliente("Damian", 444444);

        boolean salir = false;

        do {
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
            String datoIngreso = opcion.nextLine();

            switch (datoIngreso) {
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
                    System.out.println("=====================================");
                    System.out.println("********CLIENTES REGISTRADOS*********");
                    System.out.println("=====================================");

                    //ForEach para conocer los objetos almacenados en el arreglo.
                    for (Cliente client : cliente) {
                        System.out.println((client));
                    }
                    salir = true; //salir del caso para finalizar menú
                    break;

                case "e":
                    System.out.println("Adiós.");
                    salir = true; //mostrar y salir del caso para finalizar menú
                    break;
                default:
                    System.out.println("Error");
                    break;
            }
        }
        while(!salir);
    }
}
