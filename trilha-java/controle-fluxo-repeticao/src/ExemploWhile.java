import java.util.concurrent.ThreadLocalRandom;
public class ExemploWhile{

    public static void main(String [] args){
        double mesada = 50.0;
        double valorDoce = valorAleatorio();

        while(mesada > 0){

            if(valorDoce > mesada){
                valorDoce = mesada;
            }
            System.out.printf("\nDoce do valor %.2f adicionado no carrinho.", valorDoce);

            mesada -= valorDoce;

        }

        System.out.println("\n\nMesada: " + mesada);
        System.out.println("Joãozinho gastou toda a sua mesada.");


    }private static double valorAleatorio(){

        return ThreadLocalRandom.current().nextDouble(2,8);
    }


}