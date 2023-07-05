
public class Distribuidora
{
    private final String nit;
    private String nombreDistribuidora;
    private String direccion;
    private ClientePresencial[] CliP;
    private ClienteVirtual[] CliV;    
    private int numClientesV;
    private int numClientesP;   
    
    public Distribuidora(String nit,String nombreColegio,String direccion){
        if(nit != null) this.nit = nit;
        else this.nit = ""; 
        setNombreDistribuidora(nombreDistribuidora);
        setDireccion(direccion);        
        CliP = new ClientePresencial[50];
        CliV = new ClienteVirtual[50];      
        numClientesV = 0;
        numClientesP = 0;        
    }
    
    public String getNit(){
        return nit;
    }
    
    public String getNombreDistribuidora(){
        return nombreDistribuidora;
    }
    public void setNombreDistribuidora(String nombreColegio){
        if(nombreDistribuidora != null){
            this.nombreDistribuidora = nombreDistribuidora;
        }else{
            this.nombreDistribuidora = "";
        }        
    }
    
    public String getDireccion(){
        return direccion;
    }
    public void setDireccion(String direccion){
        if(direccion != null){
            this.direccion = direccion;
        }else{
            this.direccion = "";
        }        
    }
    
    public int getNumClientesV(){
        return numClientesV;
    }
    
    public int getNumClientesP(){
        return numClientesP;
    }
    
    public double calcularPromedioGeneral(){
        double promedio = 0;
        for(int i = 0; i < numClientesV; i++){
            promedio = promedio + CliV[i].calcularPromedio() / numClientesV;
        }
        for(int i = 0; i < numClientesP; i++){
            promedio = promedio + CliP[i].calcularPromedio() / numClientesP;
        }
        return promedio / 2;
    }
    public void nuevoClienteVirtual(String identificacion, String nombre, double venta){
        CliV[numClientesV] = new ClienteVirtual(identificacion, nombre, venta);
        numClientesV++;
    }
    
    public void nuevoClientePresencial(String identificacion, String nombre, double venta){
        CliP[numClientesP] = new ClientePresencial(identificacion, nombre, venta);
        numClientesP++;
    }

}
