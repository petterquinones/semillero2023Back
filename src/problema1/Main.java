package problema1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Clase scanner para ingresar datos y validar
        Scanner ingreso = new Scanner(System.in);

        //Declaración de un array de tipo cliente
        Cliente [] cliente = new Cliente[4];

        //Asignación de clientes al array
        cliente[0] = new Cliente("Uno", 111111);
        cliente[1] = new Cliente("Dos", 222222);
        cliente[2] = new Cliente("Tres", 333333);
        cliente[3] = new Cliente("Cuatro", 44444);

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

            System.out.println("*******");
            System.out.println(cliente.length);
            System.out.println("*******");
            System.out.println("===============================");
            System.out.println("Seleccione una opción:");
            String datoIngreso = ingreso.nextLine();

            //Evaluar el dato de ingreso y estudiar que case evaluar
            switch (datoIngreso) {
                case "a":
                    if(cliente.length < 10){
                        Cliente client = Herramientas.registrarCliente();
                        if(client != null){
                            cliente = Arrays.copyOf(cliente,cliente.length+1); //Crear una copia del array y aumentar el tamaño
                            cliente[cliente.length-1] = client; //Actualizar array con nuevo cliente
                            System.out.println("Usuario registrado");
                        }else{
                            System.out.println("Verifica los datos ingresados");
                        }

                    }else{
                        System.out.println("Debe borrar un cliente antes de poder ingresar uno nuevo");
                    }
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
