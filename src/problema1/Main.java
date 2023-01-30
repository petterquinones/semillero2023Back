package problema1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Clase scanner para ingresar datos y validar
        Scanner ingreso = new Scanner(System.in);

        //Declaración de un array de tipo cliente
        Cliente [] clientes = new Cliente[4];
        String []menu = {
                "a. Añadir nuevo cliente ",
                "b. Borrar un cliente.",
                "c. Buscar un cliente.",
                "d. Mostrar los clientes.",
                "e. Salir."
        };

        //Asignación de clientes al array
        clientes[0] = new Cliente("Sara", 1111);
        clientes[1] = new Cliente("Pedro", 2222);
        clientes[2] = new Cliente("Jesus", 3333);
        clientes[3] = new Cliente("Victoria", 4444);

                boolean salir = false;

        do {
            System.out.println("===============================");
            System.out.println("********MENÚ PRINCIPAL*********");
            System.out.println("===============================");
            for (String arrayMenu : menu) {//Recorro el array y se imprime el menú
                System.out.println(arrayMenu);
            }
            System.out.println("===============================");
            System.out.println("Seleccione una opción:");
            String datoIngreso = ingreso.nextLine();

            //Evaluar el dato de ingreso y estudiar que case evaluar
            switch (datoIngreso) {
                case "a":
                    if(clientes.length < 10){
                        Cliente client = Herramientas.registrarCliente();
                        if(client != null){
                            clientes = Arrays.copyOf(clientes,clientes.length+1); //Crear una copia del array y aumentar el tamaño
                            clientes[clientes.length-1] = client; //Actualizar array con nuevo cliente
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
                    Herramientas.buscarCliente(clientes);
                    salir = true;
                    break;

                case "d":
                    Herramientas.mostrarClientes(clientes);
                    salir = true;
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
