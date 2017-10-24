/**
 * par
 *
 * @author Daniel Campaña Luque
 */

public class Ejercicio14 {
  public static void main(String[] args) {
    System.out.println("Introduce un numero");
    int a = Integer.parseInt(System.console() .readLine());
    
    if(a%2==0) {
      System.out.println("el numero " + a + " es par");
    }
    
    if (a%5==0)
    { 
      System.out.println("el numero " + a + " es divisor de 5");
    }
    else if((a%2==0) && (a%5==0))
    {
      System.out.println("el numero " + a + "  es par y divisible entre 5");
    }
      
    else if((a%2!=0) && (a%5!=0)){
      System.out.println("el numero " + a + "  es impar y no es divisible entre 5");
    }
    else{
      System.out.println("el numero " + a + " no es divisor de 5");
    }
      
      
      
    
    
  
       
    
   
  }
}
