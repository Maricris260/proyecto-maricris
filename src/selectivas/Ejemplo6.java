package selectivas;

import java.util.Scanner;

public class Ejemplo6 {
    public static void main(String[] args) {
        Scanner entradadeDatos = new Scanner(System.in);
        System.out.println("ingresar el monto total de compras");
        double montoCompra = entradadeDatos.nextDouble();
        System.out.println("tiene una membresia? si o no:");
        String membresia = entradadeDatos.nextLine();

        if (montoCompra >= 500){
            System.out.println("has aprobado");
            if (membresia.equalsIgnoreCase("si")){
                double descuento=montoCompra *1.20;
                descuento = montoCompra-descuento;
                System.out.println("tu descuento es el 20%"+descuento);


            }else {
                double descuento = montoCompra *1.10;
                descuento = montoCompra-descuento;
                System.out.println("tu descueto es el 10%"+descuento);
            }

        }else {
            System.out.println("no tiene descuento");
        }
    }
}
