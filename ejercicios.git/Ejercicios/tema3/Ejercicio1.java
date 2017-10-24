/**
 * Pide dos numeros y muestra su multipicacion
 *
 * @author Daniel Campaña Luque
 */

public class Ejercicio1 {
  public static void main(String[] args) {
    String linea;
    System.out.print("Introduce un primer número ");
    int primerNumero = Integer.parseInt(System.console().readLine());
    System.out.print("Introduce un segundo número ");
    int segundoNumero = Integer.parseInt(System.console().readLine());
    
    System.out.println("la multiplicación de " + primerNumero +" por "+ segundoNumero +" es " + (primerNumero*segundoNumero));
    
   
  }
}

