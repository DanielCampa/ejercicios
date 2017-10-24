/**
 * horas
 *
 * @author Daniel Campaña Luque
 */

public class Ejercicio11 {
  public static void main(String[] args) {
    System.out.println("Introduce una hora");
    int hora = Integer.parseInt(System.console() .readLine());
    
    System.out.println("Introduce un minuto");
    int minuto = Integer.parseInt(System.console() .readLine());
    
    int tiempoEnSegundos = (hora*3600) + (minuto*60);
    int tiempoTotal=(24*3600) - (tiempoEnSegundos);
    
    System.out.println(tiempoTotal + " segundos quedan para medianoche");
    
    
  
       
    
   
  }
}
