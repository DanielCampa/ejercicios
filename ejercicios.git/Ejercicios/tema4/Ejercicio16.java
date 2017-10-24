
public class Ejercicio16 {
  public static void main(String[] args) {
    
  int puntos=0;
  String opcion;
  System.out.println("responde al siguiente cuestionario");
  System.out.println("¿Cómo se llama el profesor de programación?");
  System.out.println("a)Luis b)Pepe c)Mozart");
  opcion=(System.console() .readLine());
  if(opcion.equals("a")){
    puntos++;
  }
    System.out.println("¿Cómo se llama el profesor de Sistemas?");
  System.out.println("a)Antonio b)Pepe c)Luis");
  opcion=(System.console() .readLine());
  if(opcion.equals("a")){
    puntos++;
  }
    System.out.println("¿Cómo se llama la asignatura de ana?");
  System.out.println("a)programacion b)musica c)no nos da");
  opcion=(System.console() .readLine());
  if(opcion.equals("c")){
    puntos++;
  }
    System.out.println("tu puntuacion es de " + puntos);
  
  
    
    
  
  
     
   
  }
}
