package bucles;

public class Para {
    public static void main(String[] args) {
      /*
      sintaxis de ciclo for = para
      for (2 inicio; 1 condicion ; 3 incremento o actualizacion){
      4 bloque de instruccciones  a realizar acciones
       */
        for (int valorInicial =0; valorInicial <= 10;valorInicial=valorInicial+2){

            System.out.println("en esta buelta ahora es: "+valorInicial);

            for (int inicio =3; inicio <= 10; inicio=inicio*1){
                System.out.println("multilpicador:"+inicio);
            }
        }
    }
}
