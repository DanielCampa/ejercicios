/**
 * ejercicio 7 y 8 notas
 *
 * @author Daniel Campaña Luque
 */

public class Ejercicio7 {
  public static void main(String[] args) {
    String linea;
    System.out.print("Introduce tu nota del primer examen ");
    double nota1 = Double.parseDouble(System.console().readLine());
    System.out.print("Introduce la nota del segundo examen ");
    double nota2 = Double.parseDouble(System.console().readLine());
    System.out.print("Introduce la nota del tercer examen ");
    double nota3 = Double.parseDouble(System.console().readLine());
    
    double media = (nota1+nota2+nota3)/3;
    System.out.println("tu media es de: " + media);
    
    if((media>=0) && (media<=4)){
      System.out.println("tienes un suspenso");
    }
    else if(media==5){
      System.out.println("tienes un suficiente");
    }
      
    else if(media==6){
      System.out.println("tienes un bien");
    }
      
    else if((media>=7) && (media<=8)){
      System.out.println("tienes un notable");
    }
      
    else if((media>=8) && (media<=10)){
      System.out.println("tienes un sobresaliente");
    }
      
    else{
      System.out.println("esa media no existe un nuestro sistema de puntuación");
    }
      
     
   
  }
}
