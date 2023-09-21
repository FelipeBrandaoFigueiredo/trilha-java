import java.util.Scanner;
public class SistemaMedida {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Digite a sigla: ");
        String sigla = input.next();
        // Neste caso, utilizamos uma estrutura condicional para determinar o tamanho com base na sigla inserida pelo usuário.
        if (sigla.equals("P")) {
            System.out.println("PEQUENO");
        } else if (sigla.equals("M")) {
            System.out.println("MEDIO");
        } else if (sigla.equals("G")) {
            System.out.println("GRANDE");
        } else {
            System.out.println("INDEFINIDO");
        }

        // Agora, iremos refatorar o código para usar a estrutura de controle switch-case.
        System.out.print("Digite a sigla: ");
        sigla = input.next();
        switch (sigla){
            case "P":
                System.out.println("PEQUENO");
                break;
            case "M":
                System.out.println("MEDIO");
                break;
            case "G":
                System.out.println("GRANDE");
                break;
            default:
                System.out.println("INDEFINIDO");

        }




    }
}