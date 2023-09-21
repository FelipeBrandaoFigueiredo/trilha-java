public class ExemploBreakContinue {
    public static void main(String[] args) {
        System.out.println("Exemplo break");
        for (int numero = 1; numero <= 5; numero++) {
            if (numero == 3) {

                break;

            }System.out.println(numero);

        }
        //Agora com o exemplo continue
        System.out.println("\nExemplo continue");
        for (int i = 1; i <= 5; i++){
            if (i == 3){
                continue;
            }
            System.out.println("" +i);
        }
    }

}
