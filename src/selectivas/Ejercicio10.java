package selectivas;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner EntradadeDatos = new Scanner(System.in);
        System.out.println(" ingresar costo");
        double Costo = EntradadeDatos.nextDouble();

                if (Costo>200 ){
                    System.out.println("pago en efectivo");

                    
                }else {
                    System.out.println("pago en tarjeta");
                }
        EntradadeDatos.close();
    }
}
