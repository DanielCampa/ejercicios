/**
 * Pide dos numeros y muestra operaciones
 *
 * @author Daniel Campaña Luque 
 */

public class Ejercicio4 {
  public static void main(String[] args) {
    String linea;
    System.out.print("Introduce un primer número ");
    int primerNumero = Integer.parseInt(System.console().readLine());
    System.out.print("Introduce un segundo número ");
    int segundoNumero = Integer.parseInt(System.console().readLine());
    
    System.out.println("la multiplicación de " + primerNumero +" por "+ segundoNumero +" es " + (primerNumero*segundoNumero));
    System.out.println("la suma de " + primerNumero +" mas "+ segundoNumero +" es " + (primerNumero+segundoNumero));
    System.out.println("la resta de " + primerNumero +" menos "+ segundoNumero +" es " + (primerNumero-segundoNumero));
    System.out.println("la división de " + primerNumero +" entre "+ segundoNumero +" es " + (primerNumero/segundoNumero));
    
   
  }
}
