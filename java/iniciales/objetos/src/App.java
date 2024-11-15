// clase principal de un proyecto java, por convenio
public class App 
{
    int valor = 10;
     //Una clase contiene propiedades y métodos
     //propiedades --> variables de una clase
     //metodos --> funciones de la clase
     /* metodo o funcion main() y es el punto de entrada a nuestro proyecto.
     En el metodo main comienza la ejecucion de la clase */

    public static void main(String[] args) throws Exception 
    {
        //creacion de variables dentro de un metodo
        int valor=5 ;
        double comision = 15.5;
        String nombre = "Himilce";
        String apellidos = "Sanchez Guevara "; //Clase String de java --> metodos
        String ciudad = "Almeria"; //tipo cadena de caracteres no es clase no tiene metodo
        String nombreCompleto;
        nombreCompleto = nombre + " " + apellidos ;
        nombreCompleto.concat(nombre).concat(" ").concat(apellidos);
        System.out.println("Nombre " + nombreCompleto.concat("Y eres de"));
        System.out.println(nombreCompleto.length());
        System.out.println(("Vives en ").concat(ciudad));

        //mensaje de bienvenida por pantalla
        // System.out.printf("%20s %10s %10s%n", "Producto", "Cantidad", "Precio"  );
        // System.out.printf("%20s %10d %10.2f%n", "Portatil", 10, 1300.5);
        // System.out.printf("%20s %10d %10.2f%n","Ipad Pro", 5, 2400.3);
        // System.out.printf("%20s %10d %10.2f%n","Iphone 14",30, 1500.5);
        // System.out.printf("%20s %10d %10.2f%n", "Samsung A55", 25, 450.2);
        // System.out.printf("%20s %10d %10.2f%n","Lenovo Tab11", 18, 277.7);
        //De las clases normales vamos a crear objetos con el operador new
        
    }

    


}

