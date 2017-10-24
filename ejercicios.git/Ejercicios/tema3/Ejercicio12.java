/**
 * nota
 *
 * @author Daniel Campaña Luque
 */

public class Ejercicio12 {
  public static void main(String[] args) {
    String linea;
    System.out.print("Introduce tu nota del primer examen ");
    double notaInicial = Double.parseDouble(System.console().readLine());
    System.out.print("Introduce la nota que quieres sacar ");
    double notaFinal = Double.parseDouble(System.console().readLine());
    
    double nota2= ((notaFinal*100)-(notaInicial*40))/60;
    System.out.println("para sacar un " + notaFinal + " necesitas un " + nota2);
     
   
  }
}
