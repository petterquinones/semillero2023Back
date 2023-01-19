package problema1;

import java.util.Locale;
import java.util.Scanner;

public class Herramientas {

    public static boolean validarTexto(String texto){
        boolean esTexto = (texto != null && !texto.matches("[0-9]+"));
        return esTexto;
    }

    public static Cliente registrarCliente(){
        Scanner nuevoDato = new Scanner(System.in);
        try{
            System.out.println("Ingrese nombre");
            String nombre = nuevoDato.nextLine();
            if(validarTexto(nombre)){
                System.out.println("Ingresa número de cedula: ");
                Integer cedula = nuevoDato.nextInt();
                Cliente registrado = new Cliente(nombre,cedula);
                return registrado;
            }else {
                return null;
            }
        }catch(Exception e){
            System.out.println("Por favor ingrese un dato valido. ");
            return null;
        }
    }
}
