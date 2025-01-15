package poo.Herencia;

public class Camion extends Vehiculo {
    private int nPuertas;
    private String Remolque;
    private String Cabina;

    Camion(){
        System.out.println("---Datos del camion---");
        super.pedirDatos();
        this.pedirDatos();
    }

    Camion(String marca, String modelo, int ruedas, int velocidad, int potencia, int puertas, String remolque, String cabina){
        //el Constructor del padre
        super(marca, modelo, ruedas, velocidad, potencia);
        setnPuertas(puertas);
        setRemolque(remolque);
        setCabina(cabina);
    }
    @Override
    public void pedirDatos(){
        System.out.print("Puertas: ");
        int puertas = entrada.nextInt();
        this.setnPuertas(puertas);

        System.out.print("Remolque: ");
        String remolque = entrada.nextLine();
        this.setRemolque(remolque);

        System.out.print("Cabina: ");
        String cabina = entrada.nextLine();
        this.setCabina(cabina);
    }
    

    public int getnPuertas(){
        return nPuertas;
    }
    public void setnPuertas(int p){
        this.nPuertas = p;
    }

    public String getRemolque(){
        return Remolque;
    }
    public void setRemolque(String remolque){
        this.Remolque = remolque;
    }

    public String getCabina(){
        return Cabina;
    }
    public void setCabina(String cabina){
        this.Cabina = cabina;
    }
    //redefinir los getKmTotales del padre
    @Override
    public int getKmTotales() {
        return 10 + super.getKmTotales();
    }

    public String toString(){
        String info = super.toString();
        info = info + "\tNPuertas: " + this.getnPuertas()+ "\n";
        info = info + "\tKmTotales: " + this.getKmTotales() + "\n";
        info = info + "\tRemolque: " + this.getRemolque() + "\n";
        info = info + "\tCabina: " + this.getCabina() + "\n";
        return info ;
    }
    
}

