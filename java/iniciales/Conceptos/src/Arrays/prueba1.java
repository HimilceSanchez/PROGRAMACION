package Arrays;
import java.util.Scanner;

public class prueba1 {
    public static Scanner entrada = new Scanner(System.in); 
    static int ALUMNOS = 5;
    static int ASIGNATURAS = 4;
    static int TRIMESTRES = 2;
    public static String[] alumnos=new String[ALUMNOS];
    // static String[] alumnos = {"Jose", "Ana", "Marta", "Alejandro", "Noelia"};
    

    public static void main(String[] args) {
    //    prueba1.notasTeclado();
        
        prueba1.pedirNombres();
        prueba1.generarNotas();
    }
    public static void pedirNombres(){
        for (int i=0; i<prueba1.ALUMNOS; i++){
            System.out.println("Nombre Alumno "+ i + ": ");
            prueba1.alumnos[i] = prueba1.entrada.next();
        }
    }

    public static void generarNotas(){
        double notas[] = new double[ALUMNOS];
         double temp = 0.0;
        double max = 0; int pmax = 0; int pmin = 0;
        double min = 0;
        double media=0;
        System.out.println("-----Generacion de notas-----");
        for(int i = 0; i < ALUMNOS; i++){
            temp=Math.random()*10;
            temp=Math.round(temp*100.00)/100.00;
            notas [i]=temp;
        }
       
        System.out.println("-----Impresion de Notas-----");
        for(int i = 0; i < ALUMNOS; i++){
            System.out.println("nota de " + alumnos[i] + ": " + notas[i]);
        }
        System.out.println("-----Informes de resultados");
        max = notas[0];
        min = notas[0];
        //sup que se alcanzan en posicion 0
        pmax = 0;
        pmin = 0;
        for (int i=0; i<ALUMNOS; i++){
            media = media + notas[i];
              if (notas[i]>max){
                max = notas[i];
                pmax = i;
            }
            if (notas[i]<min){
                min = notas [i];
                pmin = i;
            }
        }
          
        
        System.out.println("La nota maxima es de " + prueba1.alumnos[pmax] + " y ha sacado " + max);
        System.out.println("La nota minima es de " + prueba1.alumnos[pmin] + " y ha sacado " + min);
        media = media / ALUMNOS;
        System.out.println("Media: " + media);
    }
    

    public static void notasTeclado(){
        int[] notas = new int[5];
        System.out.println("----- Lectura de Notas -----");
        for (int i = 0; i<5; i++) {
         System.out.print("Introduce nota " + i + ": ");
        notas[i] = prueba1.entrada.nextInt();
        }
        System.out.println("----- Impresion de Notas -----");
        for (int i = 0; i<5; i++) {
         System.out.print(" nota " + i + ": " + notas[i]);
        }
     }

    public static void Explicacion(){
         //almacenar array notas (enteros) de 10 alumnos
         int nota = 9; //v. monovaluada (2bytes)
         // notas --> (array [] --> v. multivaluada)
         //se usa el operador new[] --> RESERVA EN T.COMPILACION(ESTATICA) 10 POSICIONES
         //ENTERAS de memoria RAM int -->2 bytes --> notas ocupa 20 bytes
         //------DECLARACION DEL ARRAY (nO INICIALIZO)
         int[] notas = new int[10]; //notas[0] ... notas [9]{0, ......, 0}
         // int[] notas1 = {2,5,7,1,6,8,9,10,0,4};
 
     //     notas[0] = 3;
     //     notas[1] = 5;
     //     notas[2] = 6;
     //     notas[3] = 8;
     //     notas[9] = 10;
        
     //     System.out.println("Nota 1 alumno "+notas[0]);
     //     System.out.println("Nota 4 alumno "+notas[3]);
     //     System.out.println("Nota 10 alumno "+notas[9]);
     //     System.out.println("Nota 3 alumno "+notas[2]);
 
     //array 2D Bidimensional (alumnos/asignaturas)
     int[][] notas2 = new int [4][5];
     notas2 [0][0] = 3;
     //...
     notas2 [0][4] = 7;
     notas2 [1][0] = 6;
     //...
     notas2 [1][4] = 7;
     //...
     notas2 [3][4] = 7;
     notas2 [3][0] = 3;
 
     //array 3D Tridimensional (cubo) (alumnos/asignaturas/trimestres)
     int[][][] notas3 = new int [4][5][2]; //4f 5c 2prof
     notas3[2][1][2] = 5;
    }
}
