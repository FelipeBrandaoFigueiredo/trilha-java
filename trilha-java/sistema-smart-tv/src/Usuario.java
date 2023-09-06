public class Usuario {

    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();/*Criamos um objeto da nossa classe SmartTv*/
        /*Neste primeiro momento, o usuário visualiza o estado de tv
         * Se está ligada
         * O canal atual
         * O volume atual
         */
        System.out.println("TV ligada ? " + smartTv.ligada);
        System.out.println("Canal Atual: " + smartTv.canal);
        System.out.println("Volume Atual: " + smartTv.volume + "\n");


        /*Diminuindo e aumentando volume
         *Aqui chamamos os métodos diminuirVolume e aumentarVolume
         * Diminuimos o volume 3 vezes
         * E aumentamos o volume apenas uma vez.
         */
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        /*Verificando o volume atual da TV.*/
        System.out.println("Volume Atual: " + smartTv.volume + "\n");

        /*Aqui confirmamos em qual canal está no momento*/
        System.out.println("Canal Atual: " + smartTv.canal);


        /*Mudando canal
         *Aqui chamamos os método mudarCanal
         * Mudamos o canal 3 vezes
         */
        smartTv.mudarCanal();
        smartTv.mudarCanal();
        smartTv.mudarCanal();


        /*Atráves do método mudarCanal, o usuário escolhe o canal diretamente, sem precisar ficar mudando de 1 em 1. */
        smartTv.mudarCanal(13);
        System.out.println("Canal Escolhido: " + smartTv.canal);

        


        
        /*Aqui verificamos se a TV ainda está ligada, para podermos desligar ela.*/
        smartTv.ligar();
        System.out.println("TV ligada? " + smartTv.ligada);

        /*verificando novamente, para ver se foi executado o desligamento da TV.*/
        smartTv.desligada();
        System.out.println("Novo Status -> TV Desligada? " + smartTv.ligada);
    }

}