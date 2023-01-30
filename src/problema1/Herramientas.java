package problema1;

import java.util.Locale;
import java.util.Scanner;

public class Herramientas {

    public static boolean validarTexto(String texto) {
        boolean esTexto = (texto != null && !texto.matches("[0-9]+"));
        return esTexto;
    }

    public static Cliente registrarCliente() {
        Scanner nuevoDato = new Scanner(System.in);
        try {
            System.out.println("Ingrese nombre");
            String nombre = nuevoDato.nextLine();
            if (validarTexto(nombre)) {
                System.out.println("Ingresa número de cedula: ");
                Integer cedula = nuevoDato.nextInt();
                Cliente registrado = new Cliente(nombre, cedula);
                return registrado;
            } else {
                return null;
            }
        } catch (Exception e) {
            System.out.println("Por favor ingrese un dato valido. ");
            return null;
        }
    }

    public static void mostrarClientes(Cliente[] clientes) {
        System.out.println("=====================================");
        System.out.println("********CLIENTES REGISTRADOS*********");
        System.out.println("=====================================");
        if (clientes[0] == null) {
            System.out.println("No existe cliente registrado");
        } else {
            //ForEach para conocer los objetos almacenados en el arreglo.
            for (Cliente client : clientes) {
                System.out.println((client));
            }
        }

    }

    public static void buscarCliente(Cliente[] clientes) {
        System.out.println("=====================================");
        System.out.println("****BUSCAR CLIENTES REGISTRADOS******");
        System.out.println("=====================================");
        System.out.println("Ingrese cedula a buscar: ");

        Scanner cedula = new Scanner(System.in);
        int Buscar = cedula.nextInt();

        try {
            for (int i = 0; i < clientes.length; i++) {
                if (clientes[i].getCedula() == Buscar) {
                    System.out.println("El cliente que se busca está en la posición "
                                       + i + " El cliente se llama " + clientes[i].getNombre() +
                                       " y su cédula es: " + clientes[i].getCedula());

                } else {
                    System.out.println("No existe cliente registrado con esa Cédula");
                }

            }

        }catch (Exception e){
            System.out.println("Error, debes ingresar un número");
        }

    }

//    public Cliente[] eliminarCliente(Cliente[] clientes){
//        Scanner borrar = new Scanner(System.in);
//        Cliente[] clientes1 = clientes;
//        System.out.println("Ingrese la posición a borrar.");
//        int posicion = borrar.nextInt();
//       if(posicion>=0 && posicion< clientes.length-1){
//
//       }
//    }
}

