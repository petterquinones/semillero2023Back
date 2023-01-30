package problemaDos;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import problema1.Cliente;
import problema1.Herramientas;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        boolean salir = false;
        List<String> menu = List.of(" a. Añadir nuevo cliente ",
                                    " b. Borrar un cliente. ",
                                    " c. Buscar un cliente. ",
                                    " d. Mostrar los clientes. ",
                                    " e. Salir.");

        do{
            //Imprimir menú, organizado en una lista
            for(String opt : menu){
                System.out.println(opt);
            }

            System.out.println("===============================");
            System.out.println("Seleccione una opción:");
            String opcion = console.nextLine();
            switch (opcion){
                case "a":
                    break;

                case "b":
                    break;

                case "c":
                    break;

                case "d":
                    break;

                case "e":
                    System.out.println("Adiós.");
                    salir = true; //mostrar y salir del caso para finalizar menú
                    break;

                default:
                    System.out.println("Error");
                    break;

            }
            salir = true;

        }while(!salir);
    }

}
