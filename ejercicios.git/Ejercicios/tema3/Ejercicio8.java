/**
 * Calcular salario semanal
 *
 * @author Daniel Campaña Luque
 */

public class Ejercicio8 {
  public static void main(String[] args) {
    String linea;
    System.out.print("Introduce las horas trabajadas por dia ");
    int primerNumero = Integer.parseInt(System.console().readLine());
    int total= (primerNumero*12)*5;
    
    
    System.out.println("el salario semanal es " + total);
 
    
   
  }
}
