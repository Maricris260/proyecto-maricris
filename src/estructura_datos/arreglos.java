package estructura_datos;

import java.util.Arrays;

public class arreglos {
    public static void main(String[] args) {
        //arreglo vacio01


        //creando mi areglo de numeros
        /*
        int[]nombreDelarreglo = new int[cantidad de elementos];
         */
        int[]numeros = new int[6];
        numeros[0]=10;
        numeros[1]=8;
        numeros[2]=15;
        numeros[3]=0;
        numeros[4]=20;
        numeros[5]=12;

        System.out.println(Arrays.toString(numeros));

        //arreglo con inicializacion
        int[]notas ={10,18,13,15,20,16,18,14};
        System.out.println(Arrays.toString(notas));
        String[]verduras = {"LECHUGA,ZANAHORIA,ZAPALLO,TOMATE"};
        System.out.println(Arrays.toString(verduras));

    }
}
