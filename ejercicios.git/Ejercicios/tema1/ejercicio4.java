
public class ejercicio4 {
  public static void main(String[] args) {
    
    String rojo = "\033[31m";
    String verde = "\033[32m";
    String naranja = "\033[33m";
    String azul = "\033[34m";
    String morado = "\033[35m";
    String celeste = "\033[36m";
    System.out.println("Lunes\tMartes\tMiérc.\tJueves.\tViernes");
    System.out.println("======\t=======\t======\t======\t======");
    System.out.println(rojo + "SIS\tPRO\tSIS\tPRO\tPRO");
    System.out.println(verde + "SIS\tPRO\tSIS\tPRO\tPRO");
    System.out.println(naranja + "SIS\tPRO\tSIS\tPRO\tENTOR");
    System.out.println(azul + "FOL\tBBDD\tENTOR\tBBDD\tLM");
    System.out.println(morado + "FOL\tBBDD\tLM\tBBDD\tLM");
    System.out.println(celeste + "FOL\tBBDD\tLM\tBBDD\tLM");
  }
}
