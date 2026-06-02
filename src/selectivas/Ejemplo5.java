package selectivas;

import java.util.Scanner;

public class Ejemplo5 {
    public static void main(String[] args) {
        Scanner entradadeDatos = new Scanner(System.in);
        System.out.println("ingresar nombre de usuario");
          String usuario = entradadeDatos.nextLine();

        System.out.println("ingrese su contraeña");
        String contraseña = entradadeDatos.nextLine();

        String UsuarioSistema ="PEJE LEON";
        String ClaveSistema = "MARICRIS";
        if (usuario.equalsIgnoreCase(UsuarioSistema)){
            System.out.println("usuario incorrecto");


        }





    }

}
