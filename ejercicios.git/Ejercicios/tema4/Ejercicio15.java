/**
 * par
 *
 * @author Daniel Campaña Luque
 */

public class Ejercicio15 {
  public static void main(String[] args) {
    System.out.println("Introduce la posicion del vertice de la piramide(arriba,abajo,derecha,izquierda)");
    String a = (System.console() .readLine());
    
    if(a.equals("arriba")){
      System.out.println("  *");
      System.out.println(" ***");
      System.out.println("*****");
    }
    
    else if(a.equals("abajo")){
      System.out.println("  *****");
      System.out.println("   ***");
      System.out.println("    *");
    }
      
    else if(a.equals("derecha")){
      System.out.println("*");
      System.out.println("**");
      System.out.println("***");
      System.out.println("**");
      System.out.println("*");
    }
      else if(a.equals("izquierda")){
      System.out.println("  *");
      System.out.println(" **");
      System.out.println("***");
      System.out.println(" **");
      System.out.println("  *");
    }
     else {
       System.out.println("introduce una cadena correcta");
      
    }
      
    
    
  
       
    
   
  }
}
