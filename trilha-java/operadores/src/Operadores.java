public class Operadores {
    public static void main(String[] args)  {

        System.out.println("Aula 2: operadores = Atribuição");

        // operadores -> 2
        /* sinal de =: atribuição */
        /* Temos os operadores aritméticos, em java, representados abaixo. */
        // Classe Operadores.java
        double soma = 10.5 + 15.7;
        System.out.println(soma);
        int subtracao = 113 - 25;
        System.out.println(subtracao);
        int multiplicacao = 20 * 7;
        System.out.println(multiplicacao);
        int divisao = 15 / 3;
        System.out.println(divisao);
        int modulo = 18 % 3;
        System.out.println(modulo);
        double resultado = (10 * 7) + (20 / 4);
        System.out.println(resultado);


        String nomeCompleto = "LINGUAGEM" + "JAVA";/*
                                                    * Aqui, o sinal de + acaba invertendo, ao invés de somar ele tem
                                                    * a função de concatenação
                                                    */
        System.out.println(nomeCompleto);

        // operadores ⇾ 3
        // exemplo de concatenação
        String concatenacao = "?";

        concatenacao = 1 + 1 + 1 + "1";

        System.out.println(concatenacao);

        concatenacao = 1 + "1" + 1 + 1;

        System.out.println(concatenacao);

        concatenacao = 1 + "1" + 1 + "1";

        System.out.println(concatenacao);

        concatenacao = "1" + 1 + 1 + 1;

        System.out.println(concatenacao);

        concatenacao = "1" + (1 + 1 + 1);

        System.out.println(concatenacao);

        System.out.println("\n-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");

        

        System.out.println("\nAula 3: operadores = Unário");

        // operadores únarios

        int numero3 = 5;

        numero3 = -numero3;

        System.out.println(numero3);

        numero3 = +numero3;

        // tornando o valor 5 positivo da maneira correta

        numero3 = numero3 * -1;

        System.out.println(numero3);

        System.out.println("\n-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");

        // operadores - 4
        System.out.println("\nAula 4: operadores = incremento");
        int numero4 = 5, numeroIncrementado4 = 5;
        // xrepetição
        numero4 = numero4 + 1;

        System.out.println(numero4);

        numeroIncrementado4++;// é igual estar fazendo a soma de número4 + 1, sendo chamado de INCREMENTAÇÂO

        System.out.println(numeroIncrementado4);

        numeroIncrementado4 = 5;

        System.out.println(numeroIncrementado4++);// INCREMENTAÇÃO APÓS EXECUÇÃO
        // quando utilizamos esse incremento, temos que ter uma regra de quando vamos
        // utilizar o incremento
        // sendo essa impressão uma abreviação de, quero imprimir o valor e depois
        // incrementar este valor.

        /*-----------------------------------------------------------------------------------------------------------------*/

        numeroIncrementado4 = 5;

        System.out.println(++numeroIncrementado4);/* PRECEDENCIA */
        // Aqui pegamos a variável, primeiro somamos ela + 1 e depois o número passa a
        // ter o novo valor

        System.out.println(numeroIncrementado4);// Aqui, irá ser impresso o número incrementado no print acima.

        /*----------------------------------------------------------------------------------------------------------------- */

        // esta mesma regra é usada quando queremos decrementar ou diminuir em -1 o
        // valor de uma variável
        numeroIncrementado4 = 5;
        System.out.println(--numeroIncrementado4);/* PRECEDENCIA */

        numeroIncrementado4 = 5;

        System.out.println(numeroIncrementado4--);/* PÓS PRECEDENCIA */
        System.out.println(numeroIncrementado4);

        /*--------------------------------------------------------------------------------------------------- */
        System.out.println("Valores Booleandos");
        boolean variavel = true;
        System.out.println(!variavel); /*
                                        * Este sinal unário lógico, significa
                                        * negação. Então, irá transformar está variável em false.
                                        */

        System.out.println(variavel);/* Aqui ela retorna seu valor original. */

        variavel = !variavel;/*
                              * Aqui estamos modificando a variável memória
                              * isto é, estamos invertendo, convertendo o valor dela de true para false,
                              * fazendo com que ela mesmo se negue.
                              */
        System.out.println(variavel);

        /*----------------------------------------------------------------------------------------------------- */

        System.out.println("\n-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");

        /* Aula 5: Operador ternário */
        System.out.println("\nAula 5: Operadores = ternário");

        int a, b;

        a = 5;
        b = 6;

        String resultado1 = "";

        /*
         * Aqui estamos fazendo uma representação de um controle de fluxo de decisão
         * utilizando o if e else, para tratar
         * a condição referida.
         */
        if (a == b) {
            System.out.println("Verdadeiro");
        } else {
            System.out.println("Falso");
        }

        /*---------------------------------------------------- */

        /*
         * Agora, iremos abreviar este código com uso dos operadores ternários, sendo
         * os ? e :
         */
        a = 5;
        b = 6;

        resultado1 = a == b ? "Verdadeiro" : "Falso";

        System.out.println(resultado);

        /* Outro exemplo */
        int resultado2;

        a = 6;
        b = 6;

        resultado2 = a == b ? 1 : 0;

        System.out.println(resultado2);
        /*-------------------------------------------------------- */

        System.out.println("\n-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-\n");

        /* Operadores - 6 */
        System.out.println("Aula 6 operadores = relacionais");
        // exemplo 1
        int numero6_1 = 1;
        int numero6_2 = 2;

        boolean simNao = numero6_1 == numero6_2;

        System.out.println("Número 1 é igual a número 2? " + simNao);

        // exemplo2
        simNao = numero6_1 != numero6_2;
        System.out.println("Número 1 é diferente a número 2? " + simNao);

        // exemplo3
        simNao = numero6_1 > numero6_2;
        System.out.println("Número 1 é maior que número 2? " + simNao);

        // exemplo4
        if (numero6_1 < numero6_2) {
            System.out.println("A nossa condição é verdadeira");
        }

        // exemplo5
        if (numero6_1 == numero6_2) {
            System.out.println("A nossa condição é falsa");
        }

        // exemplo com textos/objetos
        String nomeUm = "Felipe";
        String nomeDois = "Felipe";

        System.out.println(nomeUm == nomeDois);

        nomeDois = new String("Felipe");
        System.out.println(nomeUm == nomeDois);// quando se trata de objetos, utilizamos um método chamado equals

        nomeDois = new String("Felipe");
        System.out.println(nomeUm.equals(nomeDois));
        /*
         * Para números podemos utilizar os operadores relacionais, mas para objetos
         * utilizamos o equals
         */

        System.out.println("\n-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-\n");

        // *Operadores - 7 */
        System.out.println("Aula 7: Operadores = lógicos");

        // exemplo1
        boolean condicao1 = true;

        boolean condicao2 = false;

        if (condicao1 && condicao2) {
            System.out.println("As duas condições são verdadeiras");
        }
        System.out.println("Fim");
        /*
         * Neste exemplo 1, o operador lógico && vai verificar SE a condicao1 E a
         * condicao2
         * são verdadeiras, se sim irá imprimir a mensagem, se não irá pular o bloco de
         * código.
         */

        condicao1 = true;

        condicao2 = true;

        if (condicao1 && condicao2) {
            System.out.println("As duas condições são verdadeiras");
        }
        System.out.println("Fim");
        /*
         * Aqui, a mensagem será impressa, pois condicao1 E condicao2
         * São verdadeiras.
         */

        if (condicao1 && 7 > 4) {
            System.out.println("As duas condições são verdadeiras!");
        }

        // exemplo2
        condicao1 = true;

        condicao2 = false;

        if (condicao1 || condicao2) {
            System.out.println("As duas condições são verdadeiras");
        } /*
           * Neste exemplo 2, o operador lógico || (OU) vai verificar junto da estrutura
           * de controle condicional
           * Se a condicao1 OU a condicao2 é verdadeira, se sim, irá
           */
        System.out.println("Fim");

    }

}
