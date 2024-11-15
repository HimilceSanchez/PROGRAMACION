import java.util.Scanner;

public class Area_triangulo {
    public static final double PI = 3.1416;

    public static Scanner entrada = new Scanner(System.in);
    public static double area;
    public static void main(String[] args) 
    {
    Figuras.area = Figuras.AreaTriangulo();
    System.out.println("El area del triangulo es = " + Figuras.area + " m2");
    }
    public static double AreaTriangulo() 
    {
        System.out.print("Base del triangulo: ");
        double base = Figuras.entrada.nextDouble();
        System.out.print("Altura del triangulo: ");
        double altura = Figuras.entrada.nextDouble();
        return ((base*altura)/2);
    }

    
}
