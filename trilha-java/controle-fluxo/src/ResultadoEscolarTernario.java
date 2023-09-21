import java.util.Scanner;
public class ResultadoEscolarTernario {
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);
        int nota;

        System.out.print("Digite a nota do aluno: ");
        nota = input.nextInt();

        String resultado = nota >= 7 ? "Aluno aprovado" : nota >= 5 && nota < 7 ? "Aluno em recuperação" : "Aluno reprovado";

        System.out.println(resultado);

    }
}
