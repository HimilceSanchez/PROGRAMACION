import java.util.Scanner;

public class Area_cuadrado 
{
    public static final double PI = 3.1416;

    public static Scanner entrada = new Scanner(System.in);
    public static double area;
    public static void main(String[] args) 
    {
        Figuras.area = Figuras.AreaCuadrado();
        System.out.println("El area del cuadrado es = " + Figuras.area + " m2");
    }

    public static double AreaCuadrado() 
    {
        System.out.print("Lado del cuadrado: ");
        double lado = Figuras.entrada.nextDouble();
        return (lado * lado) ;

    }
}
