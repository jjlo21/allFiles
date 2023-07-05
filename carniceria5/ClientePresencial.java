
public class ClientePresencial
{
    private final String identificacion;
    private String nombre;
    private double venta;
    
    public String getIdentificacion(){
        return identificacion;
    }
    
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        if(nombre != null) this.nombre = nombre;
        else this.nombre = "";
    }
    
    public double getVenta(){
        return venta;
    }
    
    public void setVenta(double venta){
        if(venta >= 0) this.venta = venta;
        else this.venta = 0;
    }
    
    ClientePresencial(String identificacion, String nombre, double venta){
        if(identificacion != null) this.identificacion = identificacion;
        else this.identificacion = "";
        setNombre(nombre);
        setVenta(venta);
    }
    
    double calcularPromedio(){
        return venta;
    }
}
