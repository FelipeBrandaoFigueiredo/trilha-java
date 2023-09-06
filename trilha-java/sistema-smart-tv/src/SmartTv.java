public class SmartTv {
   boolean ligada = true;
   int canal = 5, volume = 25;


   public void aumentarVolume(){
    volume++;
    System.out.println("Aumentando o volume para: " + volume);
   }
  
   public void diminuirVolume(){
    volume--;
    System.out.println("Diminuindo o volume para: " + volume);
   }


   public void mudarCanal(int novoCanal){
        canal = novoCanal;
   }

   public void mudarCanal(){
        canal++;
        System.out.println("Aumentando o canal para: " + canal);
   }
   public void dimnuirCanal(){
        canal--;
        System.out.println("Diminuindo o canal para: " + canal);
   }

   

   public void ligar(){
    ligada = true;
   }
   public void desligada(){
    ligada = true;
   }
}
