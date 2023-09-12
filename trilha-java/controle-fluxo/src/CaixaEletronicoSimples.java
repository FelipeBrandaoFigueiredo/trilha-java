public class CaixaEletronicoSimples {

    public static void main(String[] args) {
        System.out.println("Controle de fluxo - Execução Condicional Simples");
        double saldo = 25.0, valorSolicitado = 17.0;

        if (valorSolicitado < saldo) {
            saldo -= valorSolicitado;
        }
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

        System.out.println("---------------------------------------------------------------------------\n");


    }

}
