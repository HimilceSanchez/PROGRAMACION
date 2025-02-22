package Arrays;

import java.util.Scanner;

public class NotasClase {
    public static Scanner entrada = new Scanner(System.in);
    static int ALUMNOS = 5;
    static int MODULOS = 4;
    static String[] alumnos = { "Jose", "Ana", "Maria", "Luis", "Noelia" };
    static String[] modulos = { "Programacion", "Redes", "BDatos", "DWebServidor" };
    static double[][] notas = new double[ALUMNOS][MODULOS];
    // i --> filas
    // j --> columnas

    public static void main(String[] args)
    {
        // Notas.LecturaNotas();
        // Notas.ImprimirNotas();

        NotasClase.GenerarNotas();
        NotasClase.ImprimirNotasTabla();
        //3- Quien aprueba un modulo
        // System.out.print("Modulo ? : ");
        // String modulo = NotasClase.entrada.nextLine(); 
        //imprimirDatos(quienAprueba("Redes"));
        
        //4-. modulosAprueba(persona) ---> array Módulos que aprueban
        //imprimirDatos(modulosAprueba("Maria"));
        
        //5-. Promociona(persona) --> array Personas
        // if (promociona("Maria")){
        //     System.out.println("maria promociona");
        // }else{
        //     System.out.println("maria NO promociona");
        // }
        // // for (int j=0; j<ALUMNOS; j++){
        // //     if (promociona(alumnos[j])){
        // //         System.out.println(alumnos[j] + "promociona");
        // //     }else{
        // //         System.out.println(alumnos[j] + " NO promociona");
        // //     }   
        // // }
        //6-. listadoModSuspensos()
        // int[] nSuspensos = listarModSuspensos();
        // for (int j=0; j<ALUMNOS; j++){
        //     System.out.print(nSuspensos[j] + " ");
        // }
        //7,8,9 estadistica(persona) --> [max, min, media]
        // estadistica("Maria");
        // 10 ModuloMasSuspende(modulo)
        
        // System.out.println("El módulo con más suspensos es: " + moduloMasSuspende());
        // System.out.println("El módulo con más aprobados es: " + moduloMasAprueba());
        System.out.print("Introduce el nombre de la persona: ");
        String persona = entrada.nextLine();

        System.out.print("Introduce el nombre del módulo: ");
        String modulo = entrada.nextLine();

        int resultado = numPersonasConMasNota(persona, modulo);

        if (resultado != -1) {
            System.out.println("El número de personas con más nota que " + persona + " en " + modulo + " es: " + resultado);
        }
    }
    public static int numPersonasConMasNota(String persona, String modulo) {
        int Iper = getIndexPersona(persona);
        int Jmod = getIndexModulo(modulo);

        if (Iper == -1 || Jmod == -1) {
            System.out.println("Persona o módulo no encontrados.");
            return -1;
        }

        double notaPersona = notas[Iper][Jmod]; // Nota de la persona en el módulo
        int contador = 0;

        for (int i = 0; i < ALUMNOS; i++) {
            if (i != Iper && notas[i][Jmod] > notaPersona) { // Comparar con otros estudiantes
                contador++;
            }
        }

        return contador;
    }

    public static String moduloMasAprueba() {
        int[] aprobadosPorModulo = new int[MODULOS]; // Array para almacenar los aprobados de cada módulo

        // Contar suspensos por módulo
        for (int j = 0; j < MODULOS; j++) {
            int aprobados = 0;
            for (int i = 0; i < ALUMNOS; i++) {
                if (NotasClase.notas[i][j] >= 5) {
                    aprobados++;
                }
            }
            aprobadosPorModulo[j] = aprobados; // Guardar número de suspensos para el módulo
        }

        // Encontrar el módulo con más suspensos
        int maxAprobados = aprobadosPorModulo[0];
        int indexModuloMax = 0;
        for (int j = 1; j < MODULOS; j++) {
            if (aprobadosPorModulo[j] > maxAprobados) {
                maxAprobados = aprobadosPorModulo[j];
                indexModuloMax = j;
            }
        }

        // Retornar el nombre del módulo con más suspensos
        return NotasClase.modulos[indexModuloMax];
    }

    public static String moduloMasSuspende() {
        int[] suspensosPorModulo = new int[MODULOS]; // Array para almacenar los suspensos de cada módulo

        // Contar suspensos por módulo
        for (int j = 0; j < MODULOS; j++) {
            int suspensos = 0;
            for (int i = 0; i < ALUMNOS; i++) {
                if (NotasClase.notas[i][j] < 5) {
                    suspensos++;
                }
            }
            suspensosPorModulo[j] = suspensos; // Guardar número de suspensos para el módulo
        }

        // Encontrar el módulo con más suspensos
        int maxSuspensos = suspensosPorModulo[0];
        int indexModuloMax = 0;
        for (int j = 1; j < MODULOS; j++) {
            if (suspensosPorModulo[j] > maxSuspensos) {
                maxSuspensos = suspensosPorModulo[j];
                indexModuloMax = j;
            }
        }

        // Retornar el nombre del módulo con más suspensos
        return NotasClase.modulos[indexModuloMax];
    }

    public static double[] estadistica(String persona) {
        double[] datos = new double[3];
        double max;
        double min;
        double media = 0;
        int JPer = getIndexPersona(persona);
        max = NotasClase.notas[JPer][0];
        min = NotasClase.notas[JPer][0];
        for (int i = 1; i < MODULOS; i++) {
            if (NotasClase.notas[JPer][i] > max) {
                max = NotasClase.notas[JPer][i];
            }
            if (NotasClase.notas[JPer][i] < min) {
                min = NotasClase.notas[JPer][i];
            }
            media = media + NotasClase.notas[JPer][i];
        }
        // for (int j=0; j<ALUMNOS; j++){
        // max = NotasClase.notas[0][j];
        // min = NotasClase.notas[0][j];
        // for (int i=1; i<MODULOS; i++){
        // if (NotasClase.notas[i][j] > max){
        // max = NotasClase.notas[i][j];
        // }
        // if (NotasClase.notas[i][j] < min){
        // min = NotasClase.notas[i][j];
        // }
        // }
        datos[0] = max;
        datos[1] = min;
        datos[2] = media / MODULOS;
        System.out.println("nota max: " + datos[0] + " nota min: " + datos[1] + " nota media: " + datos[2]);
        return datos;
    }

    public static int[] listarModSuspensos() {
        int[] numSupensos = new int[ALUMNOS];
        for (int j = 0; j < ALUMNOS; j++) {
            numSupensos[j] = 0; // contados susp del alumno a 0
            for (int i = 0; i < MODULOS; i++) {
                if (NotasClase.notas[j][i] < 5) {
                    numSupensos[j]++;
                }
            }
        }
        return numSupensos;
    }

    public static boolean promociona(String persona) {
        boolean aprueba = true; // sup que aprueba --> bandera
        int Iper = getIndexPersona(persona);
        if (Iper != -1) {
            for (int j = 0; (j < MODULOS && aprueba); j++) {
                if (NotasClase.notas[Iper][j] < 5) {
                    aprueba = false;
                }
            }
        }
        return aprueba;
    }

    public static String[] modulosAprueba(String persona) {
        int Iper = getIndexPersona(persona);
        String[] modulos = new String[MODULOS]; // respuesta
        if (Iper != -1) { // si esta la persona
            for (int i = 0; i < MODULOS; i++) {
                if (NotasClase.notas[Iper][i] < 5) {
                    modulos[i] = NotasClase.modulos[i];
                }
            }
        }
        System.out.print(persona + " aprueba los modulos : ");
        return modulos;
    }

    public static String[] quienAprueba(String modulo) {

        String[] personas = new String[ALUMNOS];
        int Jmod = getIndexModulo(modulo);

        if (Jmod != -1) {
            for (int i = 0; i < ALUMNOS; i++) {
                if (NotasClase.notas[i][Jmod] > 5) {
                    personas[i] = alumnos[i];
                }
            }
        }

        System.out.print("Quien aprueba " + modulo + " : ");
        return personas;
    }

    public static int getIndexPersona(String persona) {
        int index = -1; // sup que no se encuentra
        for (int i = 0; (i < ALUMNOS) && (index == -1); i++) { // ejecuto mientras no se encuentre
            if (NotasClase.alumnos[i] == persona) {
                index = i;
            }
        }
        // System.out.println(persona + " es " + index);
        return index;
    }

    public static int getIndexModulo(String modulo) {
        // dado el nombre de modulo devuelvo su posición (índice)
        int index = -1; // sup que no se encuentra
        for (int i = 0; (i < MODULOS) && (index == -1); i++) {
            if (NotasClase.modulos[i] == modulo) {
                index = i;
            }
        }
        return index;
    }

    public static void imprimirDatos(String[] nombres) {
        for (int i = 0; i < nombres.length; i++) {
            if (nombres[i] != null)
                System.out.print(nombres[i] + ", ");
        }
    }

    public static void GenerarNotas() {
        double temp;
        // recorrido de alumnos
        for (int i = 0; i < ALUMNOS; i++) {
            for (int j = 0; j < MODULOS; j++) {
                temp = Math.random() * 10;
                NotasClase.notas[i][j] = Math.round(temp * 100.00) / 100.00;
                ;
            }
        }
    }

    public static void ImprimirNotasTabla() {
        System.out.println("------ LISTADO DE NOTAS --------------");
        System.out.printf("%20s", " ");
        for (int i = 0; i < ALUMNOS; i++) {
            System.out.printf("%10s", alumnos[i]);
        }
        ;
        System.out.println();
        System.out.println();
        for (int j = 0; j < MODULOS; j++) {
            System.out.printf("%20s", NotasClase.modulos[j]);
            for (int i = 0; i < ALUMNOS; i++) {
                System.out.printf("%10.2f", NotasClase.notas[i][j]);
            }
            System.out.println();
            System.out.println();
        }
    }

}