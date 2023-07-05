public class Distribuidora
{
    private final String nit;
    private String nombreCarniceria;
    private String direccion;
    private Ventas[] cli;
    private int numClientes;
    
    public Distribuidora(String nit,String nombreCarniceria,String direccion){
        if(nit != null) this.nit = nit;
        else this.nit = ""; 
        setNombreCarniceria(nombreCarniceria);
        setDireccion(direccion);   
        cli = new Ventas[50];
        numClientes = 0;
    }
    
    public String getNit(){
        return nit;
    }
    
    public String getNombreCarniceria(){
        return nombreCarniceria;
    }
    public void setNombreCarniceria(String nombreCarniceria){
        if(nombreCarniceria != null){
            this.nombreCarniceria = nombreCarniceria;
        }else{
            this.nombreCarniceria = "";
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
    
        public int getNumclientes(){
        return numClientes;
    }
    
    public double calcularPromedioGeneral(){
        double promedio = 0;
        for(int i = 0; i < numClientes; i++){
            promedio = promedio + cli[i].calcularPromedio() / numClientes;
        }
        return promedio;
    }
    
    public void nuevoCliente(String identificacion, String nombre, double venta){
        Ventas nuevo = new Ventas(identificacion, nombre, venta);
        cli[numClientes] = nuevo;
        numClientes++;
    }

}
