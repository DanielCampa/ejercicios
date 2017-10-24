/**
 * horas
 *
 * @author Daniel Campaña Luque
 */

public class Ejercicio13 {
  public static void main(String[] args) {
    int aux; 
    System.out.println("Introduce una primer numero");
    int a = Integer.parseInt(System.console() .readLine());
    
    System.out.println("Introduce un segundo numero");
    int b = Integer.parseInt(System.console() .readLine());
    
    
    System.out.println("Introduce un tercer numero");
    int c = Integer.parseInt(System.console() .readLine());
    
     if (a > b) {
      aux = a;
      a = b;
      b = aux;
    }
    
    
    if (b > c) {
      aux = b;
      b = c;
      c = aux;
    }
    
    
    if (a > b) {
      aux = a;
      a = b;
      b = aux;
    }
        
    System.out.println("Los números introducidos ordenados de menor a mayor son " + a + ", " + b + " y " + c + "."); 
    
    
    
  
       
    
   
  }
}
