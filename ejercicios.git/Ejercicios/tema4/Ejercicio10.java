/**
 * horoscopo
 *
 * @author Daniel Campaña Luque
 */

public class Ejercicio10 {
  public static void main(String[] args) {
    
    System.out.println("introduce un mes  para saber horoscopo ");
    int mes= Integer.parseInt(System.console() .readLine());
    
    System.out.println("introduce un dia  para saber horoscopo ");
    int dia= Integer.parseInt(System.console() .readLine());
  
    switch(mes){
      
       case 1:
        if(dia<=19){
          System.out.println("Capricornio");
        }
        else if(dia>=20){
          System.out.println("Acuario");
        }
        break;
       case 2:
        if(dia<=17){
          System.out.println("Acuario");
        }
        else if(dia>=18){
          System.out.println("Piscis");
        }
        break;
       case 3:
        if(dia<=19){
          System.out.println("Piscis");
        }
        else if(dia>=20){
          System.out.println("Aries");
        }
        break;
       case 4:
        if(dia<=19){
          System.out.println("Aries");
        }
        else if(dia>=20){
          System.out.println("Tauro");
        }
        break;
       case 5:
        if(dia<=20){
          System.out.println("Tauro");
        }
        else if(dia>=21){
          System.out.println("Geminis");
        }
        break;
       case 6: 
        if(dia<=20){
          System.out.println("Geminis");
        }
        else if(dia>=21){
          System.out.println("Cancer");
        }
        break;
       case 7:
        if(dia<=22){
          System.out.println("Cancer");
        }
        else if(dia>=23){
          System.out.println("Leo");
        }
        break;
       case 8:
        if(dia<=22){
          System.out.println("Leo");
        }
        else if(dia>=23){
          System.out.println("Virgo");
        }
        break;
       case 9:
        if(dia<=22){
          System.out.println("Virgo");
        }
        else if(dia>=23){
          System.out.println("Libra");
        }
        break;
       case 10:
        if(dia<=22){
          System.out.println("Libra");
        }
        else if(dia>=23){
          System.out.println("Escorpio");
        }
        break;
       case 11:
        if(dia<=21){
          System.out.println("Escorpio");
        }
        else if(dia>=22){
          System.out.println("Sagitario");
        }
        break;
         
       case 12:
        if(dia<=21){
          System.out.println("Sagitario");
        }
        else if(dia>=22){
          System.out.println("Capricornio");
        }
        break;
       default:
     }
   }
 }

               
    
    
  
