import java.util.Scanner;

public class calculadora {
    
    public static void main(String[] arg) throws Exception{
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce dos numeros");
        double numero1 = sc.nextDouble();
        double numero2 = sc.nextDouble();
        
        double Suma = (numero1 + numero2);
        double Multiplicacion = (numero1 * numero2);
        double Resta = (numero1 - numero2);
        double Division = (numero1 / numero2);

        System.out.println("El resultado de la suma es" + Suma);
        System.out.println("El resultado de la resta es" + Resta);
        System.out.println("El resultado de la multiplicación es" + Multiplicacion);
        System.out.println("El resultado de la división es" + Division);
    }
}
