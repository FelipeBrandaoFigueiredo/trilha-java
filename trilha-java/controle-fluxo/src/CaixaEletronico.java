public class CaixaEletronico {

    public static void main(String[] args) {
        System.out.println("Estruturas de fluxo de controle - Condicional Simples\n");
        double saldo = 25.0, valorSolicitado = 17.0;

        if (valorSolicitado < saldo) {
            saldo -= valorSolicitado;
        }else
        System.out.println(saldo);

        /*Agora refazendo a operação, mas atribuindo um novo valor ao saldo, abaixo do valorSolicitado,
        * para vermos qual o comportamento do programa . */

        double saldo2 = 25.0, valorSolicitado2 = 26.0;

        if (valorSolicitado2 < saldo2) {
            saldo2 -= valorSolicitado2;
        }
            System.out.println(saldo2);
        /* O valor impresso será 25, pois no nosso controle de fluxo, por não
        atender a condição, ele não foi executado, e pulou o bloco de código.
         */

        System.out.println("\n---------------------------------------------------------------------------\n");


    }

}
