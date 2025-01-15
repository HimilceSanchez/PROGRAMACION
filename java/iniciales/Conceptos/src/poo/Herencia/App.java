package poo.Herencia;
import poo.Herencia.*;



public class App {
    

    public static void main (String[] args){

       Coche c1 = new Coche("Audi","A3",4,230,180, 2);
       Coche c2 = new Coche("Mercedes","CLA200",4,250,200, 4);
       c1.recorre(100);
       c2.recorre(200);
       c1.recorre(300);
       c2.recorre(50);
       c2.recorre(200);
    //    Coche c3 = new Coche();
    //    Camion c4 = new Camion();
       Moto c5 = new Moto();
       /*System.out.println(c3);
       System.out.println("Datos del Camion: ");
       System.out.println(c4);*/
       System.out.println("Datos de la moto: ");
       System.out.println(c5);

    }

   
}