package bucles;

public class Aleatorios {
    public static void main(String[] args) 
    {
        // Aleatorios.Ejercicio2();
        // Aleatorios.Ejercicio5();
        Aleatorios.Ejercicio6();
        // Aleatorios.Ejercicio9();

    }
    

    public static void Ejercicio2()
    {
        String palo ="";
        String carta = "";
        int numeroPalo= (int) (Math.random()*4) + 1;
        int As = 0;
        int j = 0;
        int q = 0;
        int k = 0;
        int numeroCarta = (int) (Math.random()*13) + 1;
        for (int i = 0; i < 10; i++) {
        switch(numeroPalo){
            case 1:
                palo = "picas";
                break;
            case 2:
                palo = "corazones";
                break;
            case 3:
                palo = "diamantes";
                break;
            case 4:
                palo ="tréboles";
            default:
        }
        
        
        switch(numeroCarta){
            case 1:
                carta = "As";
                As++;
                break;
            case 11:
                carta = "J";
                j++;
                break;
            case 12:
                carta = "Q";
                q++;
                break;
            case 13:
                carta = "K";
                k++;
                break;
            default:
                carta =String.valueOf(numeroCarta);   
        }
        
    }
    if (numeroCarta==1 || numeroCarta>10){
        System.out.println(carta + " de " + palo);
        System.out.println("El numero de As es de " + As + " veces" );
        System.out.println("El numero de J es de " + j + " veces" );
        System.out.println("El numero de Q es de " + q + " veces" );
        System.out.println("El numero de K es de " + k + " veces" );
        }
}

    public static void Ejercicio5()
    {
        int maximo = 100;
        int minimo = 199;
        int suma = 0;
        int numero;
        double media = 0;
        for (int i = 0; i < 50; i++) 
        {
            numero = (int)(Math.random()*100) + 100;
            System.out.print(numero + " ");
            media = (suma += numero);
            if (numero < minimo) {
            minimo = numero;
            }
            if (numero > maximo) {
            maximo = numero;
            }
        }
        System.out.println();
        System.out.println("Mínimo: " + minimo);
        System.out.println("Máximo: " + maximo);
        System.out.println("Media: " + media / 50);
    }

    public static void Ejercicio6() {
        int oportunidades = 5; 
        int numeroIntroducido; 
        boolean acertado = false;
        int numeroMisterioso = (int)(Math.random() * 101);
        
        
        System.out.println("A ver si logras adivinar un número entre 0 y 100. Tienes 5 oportunidades de ganar.");
    
        // Bucle mientras no se haya acertado y haya oportunidades restantes
        while (!acertado && oportunidades > 0) {
            System.out.print("Introduce un número: ");
            numeroIntroducido = Integer.parseInt(System.console().readLine());
            oportunidades--;
            // Compara el número introducido con el número misterioso
            if (numeroIntroducido > numeroMisterioso && oportunidades > 0) {
                // Si el número introducido es mayor
                System.out.println("El número en el que estoy pensando es menor que " + numeroIntroducido);
                System.out.println("Tienes " + oportunidades + " oportunidades más");
            } else if (numeroIntroducido < numeroMisterioso && oportunidades > 0) {
                // Si el número introducido es menor
                System.out.println("El número en el que estoy pensando es mayor que " + numeroIntroducido);
                System.out.println("Tienes " + oportunidades + " oportunidades más");
            } else if (numeroIntroducido == numeroMisterioso) {
                // Si se adivina el número
                acertado = true; 
                System.out.println("Has acertado :D"); 
            }
        }
    
        // Si no se ha acertado después de agotar las oportunidades
        if (!acertado) {           
            System.out.println("Has fallado, el número que estaba pensando era el " + numeroMisterioso + ". Más suerte la próxima vez ;)");
        }
    }

    public static void Ejercicio9()
    {
    int numero = 0;
    int cuentaNumeros = 0;
    int i = 0;
    while ( numero != 24 ) {
        numero = (int)(Math.random() * 100) + 1 ;
        if (numero % 2 == 0){
             System.out.print(numero + " ");
        }
        else {
            // numero++; 
            // System.out.print(numero + " ");
        }
       cuentaNumeros++;
       i++;
        
        }
    System.out.println();
    System.out.println("Al final se han generado " + cuentaNumeros + " números antes de que saliera el 24");
    }

    public static void Ejercicio11(){
        int suspensos=0;
        int bien=0;
        int aprobados=0;
        int notables=0;
        int sobresalientes=0;
        int mhonor=0;
        double nota = 0;
        for (int i=0; i<=20; i++){
            nota = (int)(Math.random() * 10);
            nota =Math.round(nota*100.00)/100.00;
            System.out.print(nota +" ");

            if (nota < 5){
                suspensos++;
            }
            if (nota > 5 || nota < 6 ){
                aprobados++;
            }
            if (nota > 6 || nota < 8){
                bien++;
            }
            if (nota > 8 || nota < 9 ){
                notables++;
            }
            if (nota > 9 || nota <10){
                sobresalientes++;
            }
            if (nota == 10 ){
                mhonor++;
            }
        }
    }
}
    
        