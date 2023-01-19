package problema1;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Clase scanner para ingresar datos y validar
        Scanner ingreso = new Scanner(System.in);

        //Declaración de un array de tipo cliente
        Cliente [] clientes = new Cliente[4];

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
            System.out.println("a. Añadir nuevo cliente ");
            System.out.println("b. Borrar un cliente.");
            System.out.println("c. Buscar un cliente.");
            System.out.println("d. Mostrar los clientes.");
            System.out.println("e. Salir.");

            System.out.println("*******");
            System.out.println(clientes.length);
            System.out.println("*******");
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
                    System.out.println("=====================================");
                    System.out.println("****BUSCAR CLIENTES REGISTRADOS******");
                    System.out.println("=====================================");
                    System.out.println("Ingrese cedula a buscar: ");
                    int cedulaBuscar = ingreso.nextInt();
                    for (int i = 0; i < clientes.length; i++) {
                      if(clientes[i].getCedula() == cedulaBuscar){
                          System.out.println("El cliente que se busca está en la posición "
                                  + i +" El cliente se llama "+ clientes[i].getNombre() +
                                  " y su cédula es: " + clientes[i].getCedula());
                      }
                    }
                    salir = true; //salir del caso para finalizar menú
                    break;

                case "d":
                    System.out.println("=====================================");
                    System.out.println("********CLIENTES REGISTRADOS*********");
                    System.out.println("=====================================");


                    for (int i = 0; i < clientes.length; i++) {
                        System.out.println("Cliente número: " + i +
                                            " El cliente se llama " + clientes[i].getNombre() +
                                            " y su cédula es " + clientes[i].getCedula());

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
