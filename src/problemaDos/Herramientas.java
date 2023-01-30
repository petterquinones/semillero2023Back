package problemaDos;

import java.util.List;
import java.util.Scanner;

public class Herramientas {

    public static Cliente registrarCliente(){
        Scanner console = new Scanner(System.in);
        Cliente cliente;
        System.out.println("Ingresa el nombre del cliente.");
        String nombre = console.nextLine();
        int cedula = console.nextInt();

        cliente = new Cliente(cedula,nombre);

        return cliente;
    }

    public static void listarCliente(List<Cliente> clienteList){

        if(clienteList.isEmpty()){
            System.out.println("No hay clientes registrados.");
        }else {
            for (Cliente clientes: clienteList){
                System.out.println(clientes);
            }
        }

    }
}
