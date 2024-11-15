import java.util.Scanner;

public class Area_circulo {
    // public static void main(String[] arg) throws Exception{
        
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Introduce el radio del circulo cm ");
    //     double radio = sc.nextDouble();
    //     double pi= 3.14;
    //     double radio2= (radio*radio);
    //     double Area = (pi * radio2);

    //     System.out.println("El area del circulo es " + Area + " cm");


    public static final double PI = 3.1416;

    public static Scanner entrada = new Scanner(System.in);
    public static double area;
    public static void main(String[] args) {
        Figuras.area = Figuras.AreaCirculo();
        System.out.println("El area del circulo es = " + Figuras.area + " m2");
    }
    public static double AreaCirculo()
    {
        System.out.println("Radio del circulo: ");
        double radio = Figuras.entrada.nextDouble();
        return Math.PI *Math.pow(radio, 2);
    }

}