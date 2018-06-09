package bucles;

import java.util.Scanner;

public class Ejemplo2 {
    public static void main(String[] args) {
        Scanner entradadeDatos = new Scanner(System.in);
        double  gastos = 0, totalGastos = 0;
        System.out.println("ingrese su gasto, si no tiene ingrese 0");
        gastos = entradadeDatos.nextDouble();
        if (gastos == 0){
            System.out.println("no tiene ningun gasto");

        }else{
            while (gastos != 0){
                totalGastos = totalGastos + gastos;
                System.out.println("mis gastos son: "+ totalGastos);
                System.out.println("ingrese su gasto");
                gastos=entradadeDatos.nextDouble();




            }
        }
        entradadeDatos.close();
    }
}
