import java.util.Scanner;

public class Area_piramide {
    public static void main(String[] arg) throws Exception{
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un lado de la base ");
        double ladoB = sc.nextDouble();
        double AreaB = (ladoB * ladoB);

        System.out.print("Introduce la atura de la piramide ");
        double altura = sc.nextDouble();
        double AreaCL = (((ladoB * altura)/2)*4);
        double Area= (AreaB+AreaCL);

        System.out.println("El area de la piramide es " + Area + " cm2");
    }
}
