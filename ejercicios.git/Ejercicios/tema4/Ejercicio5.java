/**
 * ecuacion
 *
 * @author Daniel Campaña Luque
 */

public class Ejercicio5 {
  public static void main(String[] args) {
    System.out.println("Introduce a");
    double a = Double.parseDouble(System.console() .readLine());
    System.out.println("Introduce b");
    double b = Double.parseDouble(System.console() .readLine());
    double total= -b/a;
    
    if(a!=0){
      System.out.println("el resultado de X es " + total);
    }
    
    else if((a==0) && (b==0)){
      System.out.println("el resultado de X es " + 0);
    }
    
    else{
      System.out.println("No existe el resultado");
    }
      
  
  
    
   
  }
}
