import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner EntradadeDatos = new Scanner(System.in);
        System.out.println("ingrese su factorial");
        int numero = EntradadeDatos.nextInt();
        int factorial = 1;


        System.out.println("el factorial de 5");

        for (int valorInicial = 1; valorInicial <=5; valorInicial++ ){
            factorial *= valorInicial;

        }
        System.out.println("el factorial total de 5 es:"+factorial);
        EntradadeDatos.close();
    }
}
