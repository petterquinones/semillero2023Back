package problema1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Clase scanner para ingresar datos y validar
        Scanner ingreso = new Scanner(System.in);

        //Declaración de un array de tipo cliente
        Cliente [] cliente = new Cliente[4];

        //Asignación de clientes al array
        cliente[0] = new Cliente("Sara", 111111);
        cliente[1] = new Cliente("Pedro", 222222);
        cliente[2] = new Cliente("Victoria", 333333);

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
            String datoIngreso = ingreso.nextLine();

            //Evaluar el dato de ingreso y estudiar que case evaluar
            switch (datoIngreso) {
                case "a":
                    System.out.println("=====================================");
                    System.out.println("*******REGISTRAR NUEVO CLIENTE*******");
                    System.out.println("=====================================");

                    //Solicitar datos para creación nuevo Cliente
                    System.out.println("Ingresa el nuevo Nombre: ");
                    String name = ingreso.nextLine();
                    System.out.println("Ingresa número de cedula: ");
                    Integer cedula = ingreso.nextInt();
                    //Actualizar array con nuevo cliente
                    cliente[3] = new Cliente(name,cedula);
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
