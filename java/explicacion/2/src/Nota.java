import java.util.Scanner;

public class Nota {
    public static void main(String[] arg) throws Exception{
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce tu primera nota y la nota deseada");
        double nota1 = sc.nextDouble();
        double deseada = sc.nextDouble();
        
        double nota2 = ((deseada - (nota1 * 0.4) )/0.6);

        System.out.println("El resultado de la multiplicación es" + nota2);
    }
}