package bucles;

public class EJerciciosPara {
    public static void main(String[] args) {
        // escribe un algoritmo que calcule e inprima
        // la suma de los primeros cien numeros
        int sumaTotal = 0 ;
        for (int valorInicial = 1; valorInicial <= 100; valorInicial++){
            sumaTotal += valorInicial;


        }
        System.out.println("la suma de los cien primeros numeros es:"+ sumaTotal);

    }
}
