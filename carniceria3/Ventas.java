public class Ventas
{
    private String identificacion;
    private String nombre;
    private double venta;
    
    public String getIdentificacion(){
        return identificacion;
    }

    public void setIdentificacion(String identificacion){
        if(identificacion != null)this.identificacion = identificacion;
        else this.identificacion = "";
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
    
    Ventas(String identificacion, String nombre, double venta){
        setIdentificacion(identificacion);    
        setNombre(nombre);
        setVenta(venta);
    }
    
    double calcularPromedio(){
        return venta;
    }
}

