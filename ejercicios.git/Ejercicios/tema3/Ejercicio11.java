/**
 * conversor
 *
 * @author Daniel Campaña Luque
 */

public class Ejercicio11 {
  public static void main(String[] args) {
    String linea;
    System.out.print("Introduce tu cantidad en Kb para saber sus Mb ");
    double primerNumero = Double.parseDouble(System.console().readLine());
    
    double total= primerNumero/1024;
    
    System.out.println(primerNumero+" Kb" + " son " +total+ " Mb" );
    
   
  }
}
