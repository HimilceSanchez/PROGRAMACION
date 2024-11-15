
import java.util.Scanner;

public class europeseta {
    public static void main(String[] arg) throws Exception{
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la cantidad de euros");
        double euros = sc.nextDouble();
        
        
        double pesetas = (euros * 166.386);

        System.out.println("En total son " + pesetas + " pesetas");
}
}
