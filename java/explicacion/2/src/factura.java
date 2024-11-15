import java.util.Scanner;

public class factura {
     public static void main(String[] arg) throws Exception{
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la base imponible de la factura");
        double base = sc.nextDouble();
        System.out.print("Introduce el porcentaje de IVA");
        double iva = sc.nextDouble();
        
        double Importe_total = (base * (1 + (iva/100)));

        System.out.println("El total de la factura es " + Importe_total + ("euros"));
     }
}
