import java.util.Scanner;


public class prueba {
    public static Scanner entrada = new Scanner(System.in);
    public static double nota;
    public static String modulo;
    
    public static void main(String[] args){
        System.out.println("NOTAS DEL ALUMNO");
        System.out.println("-----------------");
        System.out.println("Introduce el nombre del alumno: ");
        String nombre = entrada.nextLine();
        MenuIf();
        
    }

    public static void MenuIf(){
       
        char respuesta;
        boolean continuar = true;
        while (continuar){
           
            Modulo();
            
                nota = Double.parseDouble(entrada.nextLine());
            
            
            
            if (nota >=0 && nota < 5){
                System.out.println("Ana esta suspensa en el modulo " + modulo);
            }
            else if (nota >= 5 && nota < 6)   {
                System.out.println("Ana esta aprobada en el modulo " + modulo);
            }
            else if (nota >= 6 && nota < 7)   {
                System.out.println("Ana tiene un bien en el modulo " + modulo);
            }
            else if (nota >= 7 && nota < 9)   {
                System.out.println("Ana tiene un notable en el modulo " + modulo);
            }
            else if (nota >= 9 && nota < 10)   {
                System.out.println("Ana tiene un sobresaliente en el modulo " + modulo);
            }
            else if (nota == 10)   {
                System.out.println("Ana tiene matricula de honor en  " + modulo);
             }
            else {
                System.out.println("Esa nota no es valida, introduce una nota del 1 al 10");;
                
             }
             System.out.print("¿Deseas consultar otro módulo? S/N: ");
            respuesta = entrada.nextLine().toUpperCase().charAt(0);
            if (respuesta == 'N') {
                continuar = false;
             }
                
         }
           
    }
    public static void Modulo(){
    System.out.println("Introduce el nombre de la materia");
    modulo = entrada.nextLine();
    System.out.println("Introduce la nota obtenida en el modulo " + modulo);  
    } 
    
    
} 
