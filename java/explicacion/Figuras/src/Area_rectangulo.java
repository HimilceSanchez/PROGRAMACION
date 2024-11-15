import java.util.Scanner;

public class Area_rectangulo {
    // public static void main(String[] arg) throws Exception{
        
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Introduce el largo del rectangulo en cm");
    //     double largo = sc.nextDouble();
    //     System.out.print("Introduce el ancho del rectangulo en cm");
    //     double ancho = sc.nextDouble();
        
    //     double Area = (largo * ancho);

    //     System.out.println("El area del rectangulo es " + Area + " cm");
    // }
    public static final double PI = 3.1416;

    public static Scanner entrada = new Scanner(System.in);
    public static double area;
    public static void main(String[] args) 
    { 
        Figuras.area = Figuras.AreaRectangulo();
        System.out.println("El area del rectangulo es = " + Figuras.area + " m2");
    }
    
    public static double AreaRectangulo() 
    {
        System.out.print("Lado1 del rectangulo: ");
        double lado1 = Figuras.entrada.nextDouble();
        System.out.print("Lado2 del rectangulo: ");
        double lado2 = Figuras.entrada.nextDouble();
        return lado1 * lado2 ;
    }

}