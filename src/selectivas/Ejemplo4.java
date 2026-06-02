package selectivas;

import java.util.Scanner;

public class Ejemplo4 {
    public static void main(String[] args) {
        Scanner EntradadeDatos = new Scanner(System.in);
        System.out.println("ingresar una calificasion");
        int calificasion = EntradadeDatos.nextInt();

        if (calificasion >= 13){
            System.out.println("has aprobado");
            if (calificasion >= 15){
                System.out.println("obtubiste una nueva calificasion");
            }
        }else {
            System.out.println("has reprobado el curso,sigue estudiando");
        }

    }
}
