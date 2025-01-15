package poo.Herencia;

public class Moto extends Vehiculo {
    private String Tipo;

    Moto(){ 
        System.out.println("---Datos Moto---");
        super.pedirDatos();
        this.pedirDatos();
    }

    Moto(String marca, String modelo, int ruedas, int velocidad, int potencia, String tipo){
        super(marca, modelo, ruedas, velocidad, potencia);
        setTipo(tipo);
}
    @Override
    public void pedirDatos(){
    System.out.print("Tipo: ");
    String tipo = entrada.nextLine();
    setTipo(tipo);
}

    public String getTipo(){
        return Tipo;
    }

    public void setTipo(String tipo){
        this.Tipo = tipo;
    }

    @Override
    public int getKmTotales() {
        return 10 + super.getKmTotales();
    }

    public String toString(){
       
        String info = super.toString();
        info = info + "\tTipo: " + this.getTipo()+ "\n";
        info = info + "\tKmTotales: " + this.getKmTotales() + "\n";
        return info ;
    }
}
