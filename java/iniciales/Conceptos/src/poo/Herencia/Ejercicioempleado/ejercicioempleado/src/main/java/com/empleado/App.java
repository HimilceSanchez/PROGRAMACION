package com.empleado;
import java.io.FileWriter;
import java.util.ArrayList;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;
import javax.swing.text.AbstractDocument.LeafElement;
public class App {
    public static ArrayList<Empleado> LEmpleados = new ArrayList<>();

    public static void main (String[] args){
        Empleado e1 = new Empleado("001", "Ana", "ana@gamil.com", 5);
        Contable c1 = new Contable("002", "Juan", "juan@gamil.com", 5);
        Director d1 = new Director("003", "Maria", "maria@gamil.com", 5, 1);
        LEmpleados.add(e1);
        LEmpleados.add(c1);
        LEmpleados.add(d1);
        // LEmpleados.add(new Director("003", "Maria", "maria@gamil.com", 5, 1));
        App.guardarEmpleados();
        for (Empleado e: LEmpleados){
            e.setHorasExtra(10);
            System.out.println(e);
        }
    }

    public static void main1 (){
        Empleado e1 = new Empleado("001", "Ana", "ana@gamil.com", 5);
        System.out.println(e1);
        Contable c1 = new Contable("002", "Juan", "juan@gamil.com", 5);
        System.out.println(c1);
        c1.contabilizar();
        Director d1 = new Director("003", "Maria", "maria@gamil.com", 5, 1);
        System.out.println(d1);
        d1.analizar();
    }
    public static void guardarEmpleados(){
        try (FileWriter writer = new FileWriter("empleados.json")){
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            //writer es un puntero a empleado.json
            gson.toJson(LEmpleados, writer);
        }
        catch (IOException e){
            System.out.println("No se ha podido escribir el archivo");
        }
    }
}