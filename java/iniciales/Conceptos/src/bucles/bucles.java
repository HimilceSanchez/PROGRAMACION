package bucles;
import java.util.Scanner;

public class bucles {
public static Scanner entrada= new Scanner(System.in);
    

public static void main(String[] args) {
        System.out.println("Ejercicios de Bucles");
        // bucles.mostrar10();
        // bucles.clear();
        // bucles.mostrarN();
        // bucles.clear();
        
        System.out.println("Introduce el valor de n: ");
        int n = bucles.entrada.nextInt();
        System.out.println("La suma es: "+ bucles.sumarN(n));
        System.out.println("el factorial es: "+ bucles.factorialN(n));
    }
    public static void clear(){
        System.out.println("");
        System.out.println("Desea continuar? s/n: ");
        char n = bucles.entrada.next().toLowerCase().charAt(0);
        
    }
    public static void mostrar10(){
        for (int i=1; i<11; i++){
            System.out.println("i= " + i);
        }
    }
    public static void mostrarN(){
        System.out.println("introduce el valor de n: ");
        int n= bucles.entrada.nextInt();
        for (int i=0; i<n; i++ ){
            System.out.println("i= " + i);
        }
    }

    public static int sumarN(int n){
        int suma = 0;
        for (int i=1; i<=n; i++){
            suma = suma + i;
        }
        
        return suma;
    }
    public static int factorialN(int n){
        int factorial = 1;
        for (int i=1; i<=n; i++){
            factorial = factorial * i;
        }
        
        return factorial;
        }
}