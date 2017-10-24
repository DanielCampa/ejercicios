/**
 * dias de la semana
 *
 * @author Daniel Campaña Luque
 */

public class Ejercicio3 {
  public static void main(String[] args) {
        System.out.println("introduce un dia de la semana");
    int dia= Integer.parseInt(System.console() .readLine());
    
    
    
    
    switch (dia){
      case 1:
        System.out.println("es Lunes ");
        break;
      case 2:
        System.out.println("es Martes");
        break;
      case 3:
        System.out.println("es Miercoles ");
        break;
      case 4:
        System.out.println("es Jueves ");
        break;
      case 5:
        System.out.println("es Viernes ");
        break;
      case 6:
        System.out.println("es Sabado ");
        break;
      case 7:
        System.out.println("es Domingo ");
        break;
        
      default:
          System.out.println("ese dia de semana no existe");
      
          
          
    }
   
       
    
   
  }
}
