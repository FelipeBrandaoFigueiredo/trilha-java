public class TiposVariaveis{

    public static void main(String[] args) {
        //Tipos primitivos 
        //Classe String que representa texto

        String meuNome = "Felipe Brandão";
        
        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        int numero = 2;

        numero = 5;

        numero = 10;

        System.out.println(numero);
        
        final double VALOR_DE_PI = 3.14; //-> Constante

        // exercicio para praticar a constante 
        double valorRaio = 2.00;

        double area = VALOR_DE_PI*(valorRaio*valorRaio);

        System.out.println("O valor daárea do círculo é: " + area);
    }


}