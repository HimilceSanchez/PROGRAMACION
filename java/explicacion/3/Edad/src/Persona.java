import java.util.Scanner;

public class Persona {
    //propiedades a nivel de clase son accesibles a todos los metodos de esta clase
    public static String nombre1;
    public static String nombre2;
    public static int edad1;
    public static int edad2;
    public static void main(String[] args) throws Exception {
    Scanner entrada = new Scanner(System.in);
    System.out.print("Nombre Persona1: ");
    Persona.nombre1 = entrada.nextLine();
    // String nombre1 = entrada.nextLine();


    System.out.print("Introduce la edad de la 1º persona: ");
    int edad1 = Integer.parseInt(entrada.nextLine());

    System.out.print("Introduce el nombre de la 2º persona: ");
    String nombre2 = entrada.nextLine();

    System.out.print("Introduce la edad de la 2º persona: ");
    int edad2 = Integer.parseInt(entrada.nextLine());

    Persona.QuienMayor();
    
} 

public static void QuienMayor() {
    if (edad1 > edad2) {
        System.out.println("Es mayor " + nombre1 );

    }
    else if (edad1==edad2) {
        System.out.println(nombre1 + " tiene la misma edad que " + nombre2);
    }
    else {
        System.out.println("Es mayor " + nombre2 );
    }
}
}
