import java.util.Scanner;

public class Multiplicacion {
    public static void main(String[] arg) throws Exception{
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce dos numeros");
        double numero1 = sc.nextDouble();
        double numero2 = sc.nextDouble();
        
        double Multiplicacion = (numero1 * numero2);

        System.out.println("El resultado de la multiplicación es" + Multiplicacion);
    }
}
