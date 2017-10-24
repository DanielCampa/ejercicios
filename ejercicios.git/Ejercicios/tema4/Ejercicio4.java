/**
 * calcular salario
 *
 * @author Daniel Campaña Luque
 */

public class Ejercicio4 {
  public static void main(String[] args) {
    System.out.println("Introduce las horas trabajadas para saber salario");
    int hora = Integer.parseInt(System.console() .readLine());
    int salario = hora*12;
  
    
    if(hora<=40){
      System.out.println("tu salario es de: "+ salario);
      
    }
    
    else{
       salario= (40*12) + ((hora-40)*16);
       System.out.println("tu salario es de: "+ salario);
    }
    
    
   
  }
}
