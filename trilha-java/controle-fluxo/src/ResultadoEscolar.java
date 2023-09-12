public class ResultadoEscolar {
    public static void main(String[] args) {
        System.out.println("Controle de fluxo - Execução Condicional composta");
        /*Sistema de resultado escolar, onde se o aluno tirar uma nota
         * Que seja igual ou maior que 7*/
        int nota = 6;

        /*Neste caso irá ser imprimida a mensagem reprovado, pela condição
         * ser não atender ao se especifico, sendo falsa. */
        if (nota >= 7) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
        /*Agora, alterando o valor da nota para 8, para acompanhar o novo fluxo do programa.*/
        nota = 8;

        /*Neste caso irá ser imprimida a mensagem aprovado, pela condição
         * ser atendida, sendo verdadeira. */
        if (nota >= 7) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }

        /*Agora trazendo o exemplo da classe CaixaEletronico, adicionando o else
        * e adicionando um novo algoritmo a estrutura condicional composta.*/
        double saldo2 = 25.0, valorSolicitado2 = 26.0;

        if (valorSolicitado2 < saldo2) {
            saldo2 -= valorSolicitado2;
        }else{
            System.out.println("Saldo insuficiente.");
        }/*Neste caso, como nosso saldo é menor do que o valor solicitado para saque
        o programa seguira o fluxo e irá ser imprimido o que está dentro de Else
        que nos indica que não possuo saldo.*/

        System.out.println(saldo2);

    }
}

