package bucles;

public class Calculadora {
    public static void main(String[] args) {
        // Calculadora.pruebas1();
        // Calculadora.aleatorios();
        // Calculadora.maxminNotas();
        Calculadora.maxminTemperatura();
    
    }

    public static void maxminTemperatura(){
        double temp = 0;
        double maximo = 0;
        double minima = 0;
        for (int i=0; i<10; i++){
            temp = Math.random()*10;
            temp = Math.round(temp*100.00)/100.00; 
            System.out.print(temp + " - ");
            if (i==0){ // ya no hay incertidumbre en la suposicion
                maximo = temp ;
                minima = temp ;
            }else {
                 if (temp>maximo){
                    maximo = temp;
                 }
                 if (temp<minima){
                    minima = temp;
                 }
            }
        }
        System.out.println();
        System.out.println("Temp maxima = " + maximo + "ºC ");
        System.out.println("Temp minima = " + minima + "ºC ");
    }
   

    public static void maxminNotas(){
        double nota = 0;
        double maximo = 0;
        double minima = 10;
        for (int i=0; i<10; i++){
            nota = Math.random()*10;
            nota = Math.round(nota*100.00)/100.00; 
            System.out.print(nota + " - ");
            if (nota > maximo){
                maximo = nota;
            }
            if (nota < minima){
                minima = nota;
            }
        }
        System.out.println();
        System.out.println("Nota maxima = " + maximo);
        System.out.println("Nota minima = " + minima);
    }

    public static void aleatorios(){
        double numero = 0;
        for (int i=0; i<5; i++){
        //numeros entre 0 y 6 
        // numero = Math.random()*6 + 1; // 1 y 6
        // System.out.print(numero + " -> "); 
        // System.out.print(Math.round(numero) + " - ");
        // numero = Math.random()*7; // 0 y 6
        //30 y 90
        // numero= Math.random()*60+1; //entre 1 y 30.99999
        // System.out.print((int)numero + 30); // 1...60 + 90
        // System.out.println();
        // //60 y 90
        // numero= Math.random()*30+1; //entre 1 y 60.99999
        // System.out.print((int)numero + 60); // 1...30 + 60
        // System.out.println();
        double nota = Math.random()*10;
        nota= Math.round(nota*100.00)/100.00;
        //  Math.round(nota*10.0)/10.0 --> 5.6
        // Math.round(nota*100.00)/100.00 --> 5.57
        // System.out.println("nota = " + Math.round(nota*10.0)/10.0);
        System.out.println(nota);
       
        }
        
    }

    public static void pruebas1(){
        //Metodos trigonometricos
        double valor = Math.sin(90);
        // System.out.println(valor);
        // System.out.println(Math.toRadians(valor));
        System.out.println(Math.sqrt(4));
        System.out.println(Math.pow(3, 2));
        System.out.println(Math.abs(-10));
        System.out.println(Math.round(10.6));
        System.out.println(Math.max(40.5, 40.61));
        
    }
}
