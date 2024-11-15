import java.util.Scanner;

public class pesetaeuro {
    public static void main(String[] arg) throws Exception{
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la cantidad de pesetas");
        double pesetas = sc.nextDouble();
        
        
        double euros = (pesetas / 166.386);

        System.out.println("En total son " + euros + " euros");
}
}
