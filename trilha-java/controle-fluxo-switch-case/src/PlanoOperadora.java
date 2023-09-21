import java.util.Scanner;
public class PlanoOperadora {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String plano;
        System.out.println("Olá! Escolha o seu plano de internet.");
        plano = input.next();

        if(plano.equals("B")){
            System.out.println("BASIC: 100 minutos de ligação");
        } else if (plano.equals("M")) {
            System.out.println("MIDIA: 100 minutos de ligação + whats e instagram grátis");
        }else if(plano.equals("T")){
            System.out.println("TURBO: 100 minutos de ligação + whats e Instagram grátis + 5Gb Youtube");
        }

        //Agora refatorando nosso algoritmo para controle de fluxo Switch-Case.
        System.out.println("Olá! Escolha o seu plano de internet.");
        plano = input.next();

        switch (plano){
            case "B":
                System.out.println("BASIC: 100 minutos de ligação");

                break;
            case "M":
                System.out.println("MIDIA: 100 minutos de ligação + whats e instagram grátis");

                break;
            case "T":
                System.out.println("TURBO: 100 minutos de ligação + whats e Instagram grátis + 5Gb Youtube");

                break;
        }

    }
}
