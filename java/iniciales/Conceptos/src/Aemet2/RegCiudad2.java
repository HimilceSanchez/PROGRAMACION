public class RegCiudad2 {
    public final int NDIAS=7;
    public final int NTEMP=3;
    private String[] dias = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
    private int[][] temperatura = new int[NDIAS][NTEMP];

    private String nombre;
    private int vmax;
    private int vmin;
    public RegCiudad2(String nombre){
        //(Granada)---> por defecto vmin=-1 y vmax=40
        this.setNombre(nombre);
        this.setVmax(40);
        this.setVmin(-1);
    }
    public RegCiudad2(String nombre, int vmax, int vmin){
        //nombre de la ciudad y valores vmax, vmin entre los que osilan las temperaturas
        //Almeria, 40, 20
        this.setNombre(nombre);
        this.setVmax(vmax);
        this.setVmin(vmin);
        this.GenerarTemperaturas();
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setVmax(int vmax){
        this.vmax=vmax;
    }
    public void setVmin(int vmin){
        this.vmin=vmin;
    }
    public String getNombre(){
        
    }
    public void getVmax(){}
    public void getVmin(){}
    public void GenerarTemperaturas(){
        for(int i=0;i<NDIAS;i++){
            for(int j=0;j<NTEMP;j++){
                int temperatura=(int)(Math.random()*(this.vmax - this.vmin + 1));
                this.temperatura[i][j]=temperatura;
            }
        }
    }
    public void mostrarTabla(){
        
            String temp="";
            System.out.printf("%20s", this.getNombre());
            for (int i = 0; i < 7; i++) {
                System.out.printf("%15s", this.dias[i] + "  ");
                
            }
            System.out.println();
            System.out.printf("10%s", "");

            for (int i = 0; i < NDIAS; i++) {
                temp="";
                for (int j = 0; j < NTEMP; j++) {
                    temp= temp + this.temperatura[i][j] + ", ";
                    
                }
                System.out.printf("%15s", temp);
            }
            System.out.println();
         }
    }

