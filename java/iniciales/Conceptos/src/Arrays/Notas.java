package Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class Notas {
    public static Scanner entrada = new Scanner(System.in);
    static int ALUMNOS = 5;
    static int MODULOS = 4;
    static String[] alumnos = { "Jose", "Ana", "María", "Luis", "Noelia" };
    static String[] modulos = { "BDatos", "Programación", "Redes", "Informáticos" };
    static int[][] notas = new int[ALUMNOS][MODULOS];
    static String persona;
    
    
    public static void main(String[] args) {
        Notas.GenerarNotas();
        Notas.ImprimirNotasTabla();
        Notas.OrdenarMenor();
        // Notas.quienAprueba();

        imprimirDatos(quienAprueba("Redes"));
        imprimirDatos(ModulosAprueba("Jose"));

    }
    public static String[] ModulosAprueba(String persona){
        int Jper = getIndexPersona(persona);
        String[] modulos = new String[MODULOS]; // respuesta
        if (Jper != -1){ //si esta la persona
            for (int i=0; i<MODULOS; i++){
                if (Notas.notas[i][Jper]> 5){
                    modulos[i] = Notas.modulos[i];
                }
            }
        }
        System.out.println(persona + " aprueba los modulos: ");
        return modulos;
    }
    public static int getIndexPersona(String persona){
        int index=-1;
        for(int i=0; (i<ALUMNOS && index==-1); i++){
            if (Notas.alumnos[i]==persona){
                index=i;
            }
        }
        System.out.println(persona + " es " + index);
        return index;
    }

    public static void imprimirDatos(String[] nombres){
        for (int i=0; i<nombres.length; i++){
            if (nombres[i] != null)
                 System.out.print(nombres[i] + ", ");
        }
    }

    public static int getIndexModulo(String modulo){
        int index = -1; //sup que no se encuentra
        for (int i=0; (i<MODULOS) && (index == -1); i++){
            if (Notas.modulos[i] == modulo){
                index=i;
            }
        }
        return index;
    }

    public static void LecturaNotas() {
        // recorrido de alumnos
        for (int i = 0; i < ALUMNOS; i++) {
            System.out.println("Nota de " + alumnos[i] + " : "); // 1
            for (int j = 0; j < MODULOS; j++) {
                System.out.print("   - " + modulos[j] + " : "); // 1
                // System.out.println("Nota de "+ alumnos[i] + " - " + modulos[j] + " : "); //2
                // lectura por teclado
                Notas.notas[i][j] = Notas.entrada.nextInt();
            }
        }
    }

    public static void GenerarNotas() {
        // Se recorre ALUMNOS.
        for (int i = 0; i < ALUMNOS; i++) {
            for (int j = 0; j < MODULOS; j++) {
                // Se generan 4 notas aleatorias
                // para cada fila, con un total de 5 filas y 4 numeros en ellas.
                Notas.notas[i][j] = (int) (Math.random() * 10);
            }
        }
    }

    public static void OrdenarMenor() {
        int temp = 0;
        for (int i = 0; i < ALUMNOS; i++) { // Recorre cada fila de notas[i]
            // dentro de su rango que es 5, es decir, hay 5 filas de 4 numeros.
            for (int j = 0; j < MODULOS - 1; j++) { // Aplicamos método burbuja.
                // el - 1 es para evitar que se pase del rango que es 4.
                for (int k = 0; k < MODULOS - j - 1; k++) { // j y k se comparan con notas[i]
                    if (notas[i][k] > notas[i][k + 1]) { // En caso de que k > que k +1 se cambian.
                        temp = notas[i][k]; // se guarda temporalmente el valor de notas[i][k].
                        notas[i][k] = notas[i][k + 1];
                        notas[i][k + 1] = temp;
                    }
                }
            }
        }
        System.out.println();
        System.out.println("------ Notas ordenadas de menor a mayor --------------");
        System.out.println();
        System.out.printf("%-20s", "");
        for (int i = 0; i < MODULOS; i++) {
            System.out.printf("%-20s", modulos[i] + "  ");
        }
        System.out.println();
        for (int i = 0; i < ALUMNOS; i++) {
            System.out.printf("%-22s", alumnos[i] + "   ");
            for (int j = 0; j < MODULOS; j++) {
                System.out.printf("%-20s", notas[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void ImprimirNotasTabla() {
        System.out.println("------ LISTADO DE NOTAS --------------");
        System.out.printf("%20s", "");
        for (int i = 0; i < ALUMNOS; i++) {
            System.out.printf("%10s", alumnos[i] + "  ");
        }
        System.out.println();
        for (int i = 0; i < MODULOS; i++) {
            System.out.printf("%20s", modulos[i] + "   ");
            for (int j = 0; j < ALUMNOS; j++) {
                System.out.printf("%10.2s", notas[j][i] + "        ");
            }
            System.out.println();
        }
    }


    public static String[] quienAprueba(String modulo) {

        String[] personas = new String[ALUMNOS]; 
        int Imod = getIndexModulo(modulo);

        for (int i=0; i<ALUMNOS; i++){
            if (Notas.notas[i][Imod] > 5){
                personas[i] = alumnos[i];
            }
        }   
        System.out.println("Quien aprueba " + modulo + " : ");
        return personas;
    }

}