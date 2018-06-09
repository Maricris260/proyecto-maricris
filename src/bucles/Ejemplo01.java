package bucles;

import java.lang.foreign.SymbolLookup;
import java.util.Scanner;

public class Ejemplo01 {
    public static void main(String[] args) {
        Scanner entradadeDatos = new Scanner(System.in);
        String nombreUsuario = "";
        String clave = "";


        while (!nombreUsuario.equals("juan") || !clave.equals("12345")){
            System.out.println("ingrese su nombre de usuario");
            nombreUsuario = entradadeDatos.nextLine();

            System.out.println("ingrese su clave");
            clave = entradadeDatos.nextLine();

            if (!nombreUsuario.equals("juan") || !clave.equals("12345")){
                System.out.println("datos incorrectos,no puedes ingresar");
            }

        }
        System.out.println("bienvenidos al sistema");
        entradadeDatos.close();
    }
}
