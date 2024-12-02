package poo.Biblioteca;
public class Autor {
    private static int id=0;
    private String nombre1;
    private String apellido1;
    private String apellido2;
    public Autor(String nombre1, String apellido1, String apellido2){
        this.setNombre(nombre1);
        this.setApellido1(apellido1);
        this.setApellido2(apellido2);
    }
    
    public void setId(int id){
        int digito1=(int)(Math.random()*1000);
        id=digito1;
    }
    public void setNombre(String nombre1){
        this.nombre1 = nombre1.toUpperCase();
    }
    public void setApellido1(String apellido1){
        this.apellido1 = apellido1.toUpperCase();
    }
    public void setApellido2(String apellido2){
        this.apellido2 = apellido2.toUpperCase();
    }

    public String getNombre(){
        return this.nombre1.toUpperCase();
    }
    public String getApellido1(){
        return this.apellido2.toUpperCase();
    }
    public String getApellido2(){
        return this.apellido2.toUpperCase();
    }
    public int getId(){
        return this.id;
    }

   
        
    
        
    
}
