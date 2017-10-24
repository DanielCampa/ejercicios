/**
 * conversor
 *
 * @author Daniel Campaña Luque
 */

public class Ejercicio10 {
  public static void main(String[] args) {
    String linea;
    System.out.print("Introduce tu cantidad en Mb para saber sus Kb ");
    double primerNumero = Double.parseDouble(System.console().readLine());
    
    double total= primerNumero*1024;
    
    System.out.println(primerNumero+" Mb" + " son " +total+ " Kb" );
    
   
  }
}
