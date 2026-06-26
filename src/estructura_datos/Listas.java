package estructura_datos;

import java.util.ArrayList;
import java.util.List;

public class Listas {
    public static void main(String[] args) {
        //lista de arreglo- mutables o que puedan ser
        // manipulables al momento de hacer el uso


        /*
        SINTAXIS DE UNA LISTA
        List <TipoDato> nombreLista = new ArrayList<>()

         */
        List<String> FRUTAS = new ArrayList<>();
        FRUTAS.add("PIÑA");
        FRUTAS.add("MANZANA");
        FRUTAS.add("MANDARINA");
        FRUTAS.add("NARANJA");
        FRUTAS.add("FRESA");

        System.out.println(FRUTAS);
        for (int iterador = 0 ; iterador <= FRUTAS.size();iterador++){
            System.out.println(FRUTAS.get(iterador));
        }

    }
}
