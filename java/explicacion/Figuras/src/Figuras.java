import java.util.Scanner;


public class Figuras 
{
    public static final double PI = 3.1416;

    public static Scanner entrada = new Scanner(System.in);
    public static double area;
    public static char respuesta;

    public static void main(String[] args) {
        Figuras.MenuIf();
    }

    public static void MenuIf(){
        int opcion;
        boolean continuar = true;
        char respuesta;

        while (continuar) {
            Figuras.pintarMenu();
            opcion = Figuras.entrada.nextInt();

            
            if (opcion == 1) {
                Figuras.area = Figuras.AreaCuadrado();
                System.out.println("El área del cuadrado es = " + Figuras.area + " m2");
            } else if (opcion == 2) {
                Figuras.area = Figuras.AreaTriangulo();
                System.out.println("El área del triángulo es = " + Figuras.area + " m2");
            } else if (opcion == 3) {
                Figuras.area = Figuras.AreaCirculo();
                System.out.println("El área del círculo es = " + Figuras.area + " m2");
            } else if (opcion == 4) {
                Figuras.area = Figuras.AreaRectangulo();
                System.out.println("El área del rectángulo es = " + Figuras.area + " m2");
            } else if (opcion == 5) {
                Figuras.area = Figuras.AreaPrisma();
                System.out.println("El área del prisma es = " + Figuras.area + " m2");
            }

           
            Figuras.entrada.nextLine(); 
            
            System.out.println("¿Desea continuar? S/N");
            respuesta = Figuras.entrada.nextLine().toUpperCase().charAt(0);
            //nextLine lee frase
            //next lee palabra
           
            if ((respuesta == 'N')) 
            {
                continuar = false; // Salimos del bucle
            }
            else {
                
            }
        }
    
    
 } 
    
    public static void pintarMenu()
    {
        System.out.println("Menu principal");
        System.out.println("-----------");
        System.out.println("1- Area del Cuadrado");
        System.out.println("2- Area del Triangulo");
        System.out.println("3- Area del Circulo");
        System.out.println("4- Area del Rectangulo");
        System.out.println("5- Area del Prisma");

    }

       

        
    
    public static double AreaCuadrado() 
        {
            System.out.print("Lado del cuadrado: ");
            double lado = Figuras.entrada.nextDouble();
            return lado * lado ;
        }
    public static double AreaTriangulo() 
    {
        System.out.print("Base del triangulo: ");
        double base = Figuras.entrada.nextDouble();
        System.out.print("Altura del triangulo: ");
        double altura = Figuras.entrada.nextDouble();
        return (base*altura)/2;
    }

    public static double AreaCirculo()
    {
        System.out.println("Radio del circulo: ");
        double radio = Figuras.entrada.nextDouble();
        return PI * (radio*radio);

    }

    public static double AreaRectangulo() 
        {
            System.out.print("Lado1 del rectangulo: ");
            double lado1 = Figuras.entrada.nextDouble();
            System.out.print("Lado2 del rectangulo: ");
            double lado2 = Figuras.entrada.nextDouble();
            return lado1 * lado2 ;
        }

        public static double AreaPrisma() 
        {
            System.out.print("Lado1 de la base: ");
            double lado1 = Figuras.entrada.nextDouble();
            System.out.print("Lado2 de la base: ");
            double lado2 = Figuras.entrada.nextDouble();
            System.out.println("Lado3 de la base");
            double lado3 = Figuras.entrada.nextDouble();
            System.out.println("Altura del prisma");
            double altura = Figuras.entrada.nextDouble();
            double sp= (lado1 + lado2 + lado3)/2;
            double Areab= Math.sqrt(sp * (sp - lado1) * (sp - lado2) * (sp - lado3));
            return altura * (lado1 + lado2 + lado3) + (2 * Areab);
        
        }
    
    
}