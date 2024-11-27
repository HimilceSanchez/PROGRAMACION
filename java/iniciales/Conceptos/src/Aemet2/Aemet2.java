import java.util.Scanner;

public class Aemet2 {
public static final int NCIUDADES=8;
private static String[] ciudades = { "Almeria", "Granada", "Cordoba", "Jaen", "Malaga", "Sevilla", "Cadiz" };

public static Scanner entrada= new Scanner(System.in);

public static RegCiudad2

// public static RegCiudad2 ciudad1;
// public static RegCiudad2 ciudad2;
// public static RegCiudad2 ciudad3;



public static void main (String[] args){
    Aemet2.GenerarRegistroTemp();
}

public static void GenerarRegistroTemp(){
    int vmax; int vmin;
    for (int i=0; i<NCIUDADES; i++){
        System.out.println(ciudades[i]+": ");

    }
    // Aemet2.ciudad1= new RegCiudad2(ciudades[0], 30, 10);
    // Aemet2.ciudad2= new RegCiudad2(ciudades[1], 40, -10);
    // Aemet2.ciudad3= new RegCiudad2(ciudades[2], 10, -5);
    // Aemet2.ciudad1.mostrarTabla();
    // Aemet2.ciudad2.mostrarTabla();
    // Aemet2.ciudad3.mostrarTabla();
}
public static void ListarRegistroTemperaturas(){
    for (int i=0; i<NCIUDADES; i++){

    }
}
}