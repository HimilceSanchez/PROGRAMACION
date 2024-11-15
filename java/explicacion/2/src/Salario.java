import java.util.Scanner;

public class Salario {
    
    public static void main(String[] arg) throws Exception{
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce las horas diarias");
        double horas = sc.nextDouble();
        System.out.print("Introduce el numero de dias a la semana que trabajas");
        double dias = sc.nextDouble();
       
        
    
        double Horas_semanales = (horas + dias);
        double salario = (Horas_semanales * 12);
        

        System.out.println("Cobra " + salario + " euros a la semana");
    }
}
