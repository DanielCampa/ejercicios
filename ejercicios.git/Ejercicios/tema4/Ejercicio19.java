/**
 * ultima cifra
 *
 * @author Daniel Campaña Luque
 */

public class Ejercicio19 {
  public static void main(String[] args) {
    System.out.println("Introduce un numero entero para saber su cantidad de digitos");
    int a = Integer.parseInt(System.console() .readLine());
    int contador=0;
    
    if(a<10){
      contador++;
    }
    else if((a>=10)&&(a<=99)){
      contador=2;
    }
    else if((a>=100)&&(a<=999)){
      contador=3;
    }
    else if((a>=1000)&&(a<=9999)){
      contador=4;
    }
    else if((a>=10000)&&(a<=99999)){
      contador=5;
    }
    System.out.println(contador);
    
    
    
    
    
      
      
      
    
    
  
       
    
   
  }
}
