package bucles;
import java.util.Scanner;

public class Potencias {
    public static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
       Potencias.ejercicio16();
        // Potencias.ejercicio15();
    }

    // public static void ejercicio15() {
    //     // Solicitar la base
    //     System.out.print("Introduce un número real (base): ");
    //     int base = Potencias.entrada.nextInt();

    //     // Solicitar el exponente
    //     System.out.print("Introduce un número entero positivo (exponente): ");
    //     int exponente = Potencias.entrada.nextInt();

    //     for (int i = 1; i <= exponente; i++) {
    //         long pot = Potencias.potencias(base, i);
    //         System.out.print(pot);
    //         System.out.print(", ");
    //     }
    // }

    // public static long potencias(int base, int exponente) {
    //     long producto = 1;

    //     // Calcular y mostrar las potencias usando un solo bucle for
    //     for (int i = 1; i <= exponente; i++) {
    //         producto = base * producto;
    //     }
    //     return producto;
    // }

    //Ejercicio 16
    public static void ejercicio16(){
        System.out.println("hasta: ");
        int Numero = Potencias.entrada.nextInt();
        for(int i=2; i<= Numero; i++)
        if (esPrimo(i)){
             System.out.println(i+", ");
        }
        
       

    }
    public static boolean esPrimo(int Numero){
    //    int i = 2;
    //    boolean  primo = true;
    //    while ((i< Numero) && primo) {
    //     System.out.println(Numero+" resto "+ i + " = "+ Numero % i);
    //     if (Numero % i == 0){
    //         primo = false;
        // }
    //     i++;
    // }
       
       
       
        return true;
 }
}
