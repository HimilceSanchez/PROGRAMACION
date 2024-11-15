package bucles;
import java.util.Scanner;

public class Multiplosde5 {
    public static Scanner entrada= new Scanner(System.in);
    public static void main(String[] args) {
        // Usar un bucle for para mostrar los múltiplos de 5
        for (int i = 0; i <= 100; i += 5) {
            System.out.println(i);
        }
        Buclewhile();
    }



    public static void Buclewhile() {
        System.out.println("el multiplo: ");
        int Multiplo = Multiplosde5.entrada.nextInt(); // Inicializar contadorel 
        int i=0;
        // Usar un bucle while para mostrar los múltiplos de 5
       
        while (i <= 100) {
            if(i % Multiplo==0)
            System.out.println(i + ", ");
            i++;
        }
    }
}
