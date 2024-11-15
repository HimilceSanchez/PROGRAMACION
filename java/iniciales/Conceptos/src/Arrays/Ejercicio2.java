package Arrays;

import java.util.Scanner;

public class Ejercicio2 {
    public static Scanner entrada = new Scanner(System.in);
    static int NumPersonas = 5;
    static String[] personas = { "Ana", "Juan", "Jose", "Maria", "Noelia" };
    static int[] contador = new int[6];
    static int[] maxmin = new int[2];
    static int[] tiradas = new int[10];
    static final int ntiradas = 10;

    public static void main(String[] args) {
        Ejercicio2.operaciones();
        Ejercicio2.GanadorPerdedor();
        Ejercicio2.Informe();
    }

    public static int GenerarNumeros() {
        int numeroAleatorios;
        numeroAleatorios = (int) (Math.random() * 5);
        return numeroAleatorios;
    }

    public static void operaciones() {
        int tirada; // variable temporal que almacena la posicion generada
        for (int i = 0; i < Ejercicio2.ntiradas; i++) {
            tirada = GenerarNumeros();
            Ejercicio2.tiradas[i] = tirada;
            Ejercicio2.contador[tirada]++;
        }
    }

    public static void GanadorPerdedor(){
        int datos[] = new int [2];
        int pmin=0;
        int pmax = 0;
        int min=contador[0];
        int max = contador[0];
        for (int i = 0; i < NumPersonas; i++) {
            if (contador[i] < max) {
                max = contador[i];
                pmax = i;
            }
            if (contador[i] > min) {
                min = contador[i];
                pmin = i;
            }
        }
        // datos[0]=pmax;
        // datos[1]=pmin;
        // return datos;
        Ejercicio2.maxmin[0]=pmax;
        Ejercicio2.maxmin[1]=pmin;
    }

    public static int ganador() {
        int pmax = 0;
        int max = contador[0];
        for (int i = 0; i < NumPersonas; i++) {
            if (contador[i] < max) {
                max = contador[i];
                pmax = i;
            }
        }
        return pmax;
    }

    public static int perdedor() {
        int pmin = 0;
        int min = contador[0];
        for (int i = 0; i < NumPersonas; i++) {
            if (contador[i] > min) {
                min = contador[i];
                pmin = i;
            }
        }
        return pmin;
    }

    public static void Informe() {
        for (int i = 0; i < Ejercicio2.ntiradas; i++) {
            System.out.println("La tirada " + (i + 1) + " es " + Ejercicio2.personas[tiradas[i]] + " " + tiradas[i]);
            
           
        }
        for (int i = 0; i < Ejercicio2.NumPersonas; i++) {
            System.out.println(contador[i] + " ");

        }
        // System.out.println("Ganador: " + Ejercicio2.personas[GanadorPerdedor()[0]]);
        // System.out.println("Perdedor: " + Ejercicio2.personas[GanadorPerdedor()[1]]);
        GanadorPerdedor();
        System.out.println("Ganador: " + Ejercicio2.personas[Ejercicio2.maxmin[0]]);
        System.out.println("Perdedor: " + Ejercicio2.personas[Ejercicio2.maxmin[1]]);
    }

}
