/**
 * horario
 *
 * @author Daniel Campaña Luque
 */

public class Ejercicio1 {
  public static void main(String[] args) {
    
    System.out.println("introduce un dia de la semana");
    int dia= Integer.parseInt(System.console() .readLine());
    
    
    
    
    switch (dia){
      case 1:
        System.out.println("es Lunes y toca Sistemas");
        break;
      case 2:
        System.out.println("es Martes y toca Programación");
        break;
      case 3:
        System.out.println("es Miercoles y toca Sistemas");
        break;
      case 4:
        System.out.println("es Jueves y toca Programacion");
        break;
      case 5:
        System.out.println("es Viernes y toca Programacion");
        break;
      default:
        if((dia>5) && (dia<=7)){
          System.out.println("es Fin de semana y no hay clases");
        }
        else{
          System.out.println("ese dia de semana no existe");
        }
          
          
    }
  
     
   
  }
}
