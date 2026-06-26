package estructura_datos;

import java.util.Arrays;

public class Ejemplo_arrays {
    public static void main(String[] args) {


        String[]verduras = {"LECHUGA","ZANAHORIA","ZAPALLO","TOMATE"};
        System.out.println(Arrays.toString(verduras));

        for (int iterador = 0; iterador <= verduras.length;iterador++){
            System.out.println(verduras[iterador]);
        }
    }
}
