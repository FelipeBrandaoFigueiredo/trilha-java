import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Locale;
public class AboutMe {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in).useLocale(Locale.US);
            String nome, sobrenome;
            int idade;
            double altura;

            System.out.print("Digite seu nome: ");
            nome = input.next();
            System.out.print("Digite seu sobrenome: ");
            sobrenome = input.next();
            System.out.print("Digite sua idade: ");
            idade = input.nextInt();
            System.out.print("Digite sua altura: ");
            altura = input.nextDouble();


            // imprimindo os dados obtidos do usuario
            System.out.println("\nOlá, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase() + " ");
            System.out.printf("Tenho %d anos", idade);
            System.out.printf("\nMinha altura é %.2f", altura);

        }catch(InputMismatchException e){
                System.err.println("Os campos idade e altura precisam ser númericos.");
                boolean confirmation = true;
            }
        }
    }
