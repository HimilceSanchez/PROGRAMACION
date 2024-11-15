import java.util.Scanner;
import javax.sound.sampled.SourceDataLine;

public class Lectura {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce tu nombre");
        String nombre = entrada.nextLine();
    
        System.out.print("Introduce tu edad");
        int edad = Integer.parseInt(entrada.nextLine());
        System.out.println("Te llamas "+ nombre +" y tienes "+ edad + " años");
        //llamar o invocar al método estatico esMayor();
        //esMayor
        Lectura.esMayor(edad);
        Lectura.GetAnioNac(edad);
       
    }
    

    public static void esMayor(int edad) {
        if (edad >= 18) {
            System.out.println("Con la edad de " + edad + " años eres Mayor de edad");

        }
        else {
            System.out.println("Con la edad de " + edad + " años eres Menor de edad");
        }
  
    }  
    public static void GetAnioNac (int edad) 
    {
        int AnioActual = 2024;
        int Anio = AnioActual - edad ;
        System.out.print("Naciste en el año " + Anio);
        
    }     
}
