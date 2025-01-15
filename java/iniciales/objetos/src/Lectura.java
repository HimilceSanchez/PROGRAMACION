import java.util.Scanner;

public class Lectura {
    

 public static void main(String[] arg) throws Exception{
    /**en la var. cadena almacena la lectura por consola*/
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce tu nombre");
    String nombre = sc.nextLine();

    /** introduce el apellido de la persona */
    System.out.print("Introduce tu apellido");
    String apellido = sc.nextLine();
//TODO crear un metodo para pedir DNI
// TODO Pedir info de la persona segun DNI

    System.out.print("Introduce tu edad");
    String edad = sc.nextLine();

    System.out.print("Introduce tu ciudad");
    String ciudad = sc.nextLine();

    System.out.print("Introduce tu provincia");
    String provincia = sc.nextLine();
   /** imprime el nombre completo y la info*/
    System.out.println("Te llamas " + nombre + " " + apellido + ", tienes " + edad + " años y vives en " + ciudad + ", " + provincia);
 }
}