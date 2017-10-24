/**
 * Calcular volumen de un cono
 *
 * @author Daniel Campaña Luque
 */

public class Ejercicio9 {
  static final double pi=3.141592654;
  public static void main(String[] args) {
    String linea;
    System.out.print("Introduce el radio rectangulo en cm");
    double primerNumero = Double.parseDouble(System.console().readLine());
    System.out.print("Introduce la altura del cono en cm");
    double segundoNumero = Double.parseDouble(System.console().readLine());
    
    double total= (1.0/3.0) * pi * segundoNumero * segundoNumero * primerNumero;
    
    System.out.println("el volumen del cono es " + total +" cm3" );
 
    
   
  }
}
