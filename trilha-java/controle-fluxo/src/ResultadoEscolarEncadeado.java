public class ResultadoEscolarEncadeado {
    public static void main(String[] args) {
        System.out.println("Controle de fluxo - Execução Condicional composta");
        int nota = 8;


        if (nota >= 7) {
            System.out.println("Aprovado");
        } else if (nota >= 5 && nota < 7) {
            System.out.println("Aluno em recuperação. Prova de recuperação");
        } else {
            System.out.println("Aluno Reprovado.");
        }



    }
}