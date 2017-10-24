/**
 * minicuestionario
 *
 * @author Daniel Campaña Luque
 */

public class Ejercicio12 {
  public static void main(String[] args) {
    String a,b,c,d,e,f,g,h,i,j;
    int contador = 0;
    System.out.println("Test de infidelidad conteste v o f las siguientes preguntas ");
  
    System.out.println("1.Tu pareja parece estar más inquieta de lo normal sin ningún motio aparente.");
    a =(System.console() .readLine());
    System.out.println("2. Ha aumentado sus gastos de estuario");
    b =(System.console() .readLine());
    System.out.println("3. Ha perdido el interés que mostraba anteriormente por ti");
    c =(System.console() .readLine());
    System.out.println("4. Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se arregla el pelo y se asea con más frecuencia (si es mujer)");
    d =(System.console() .readLine());
    System.out.println("5. No te deja que mires la agenda de su teléfono móil");
    e =(System.console() .readLine());
    System.out.println("6. A eces tiene llamadas que dice no querer contestar cuando estás tú delante.");
    f =(System.console() .readLine());
    System.out.println("7. Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a");
    g =(System.console() .readLine());
    System.out.println("8. Muchos días iene tarde después de trabajar porque dice tener mucho más trabajo");
    h =(System.console() .readLine());
    System.out.println("9. Has notado que últimamente se perfuma más");
    i =(System.console() .readLine());
    System.out.println("10. Se confunde y te dice que ha estado en sitios donde no ha ido contigo");
    j =(System.console() .readLine());
    
    
    if(a.equals("v")){
      contador=contador+3;
    }
    if(b.equals("v")){
      contador=contador+3;
    }
    if(c.equals("v")){
      contador=contador+3;
    }
    if(d.equals("v")){
      contador=contador+3;
    }
    if(e.equals("v")){
      contador=contador+3;
    }
    if(f.equals("v")){
      contador=contador+3;
    }
    if(g.equals("v")){
      contador=contador+3;
    }
    if(h.equals("v")){
      contador=contador+3;
    }
    if(i.equals("v")){
      contador=contador+3;
    }
    if(j.equals("v")){
      contador=contador+3;
    }
    
    
    
    if((contador>=0)&&(contador<=10)){
      System.out.println("¡Enhorabuena! tu pareja parece ser totalmente fiel.");
      
    }
    
    else if((contador>10)&&(contador<=22)){
      System.out.println("Quizás exista el peligro de otra persona en su vida o en su mente, aunque seguramente será algo sin importancia. No bajes la guardia.");
      
    }
    
    else{
      System.out.println("Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona. Te aconsejamos que indagues un poco más y averigües que es lo que está pasando por su cabeza.");
      
    }
    
    
    
    
    
    
  
       
    
   
  }
}
