
import java.util.ArrayList;
public class Distribuidora
{
    private final String nit;
    private String nombreDistribuidora;
    private String direccion;
    private ArrayList cliente;
   
    public Distribuidora(String nit,String nombreDistribuidora,String direccion){
        if(nit != null) this.nit = nit;
        else this.nit = "";
        setnombreDistribuidora(nombreDistribuidora);
        setDireccion(direccion);        
        cliente = cliente = new ArrayList();
    }
   
    public String getNit(){
        return nit;
    }
   
    public String getnombreDistribuidora(){
        return nombreDistribuidora;
    }
    public void setnombreDistribuidora(String nombreDistribuidora){
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
       
    public double calcularPromedioGeneral(){
        double promedio = 0;
        for(int i = 0; i < cliente.size(); i++){
            promedio += ((Cliente)cliente.get(i)).calcularPromedio();
        }

        return promedio / 2;
    }
   
    public void adicionarCliente(String identificacion, String nombre, double venta)throws Exception{
        cliente.add(new ClienteVirtual(identificacion, nombre, venta));
    }
   
    public void adicionarcliente(String identificacion, String nombre, double venta)throws Exception{
        cliente.add(new ClientePresencial(identificacion, nombre, venta));
    }
   
}    