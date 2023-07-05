
public class ClientePresencial extends Cliente{
    private double venta;
   
    ClientePresencial(String identificacion, String nombre, double venta)throws Exception{
        super(identificacion, nombre);
        setVenta(venta);
    }

    public double calcularPromedio(){
        return venta;
    }
   
    public double getVenta(){
        return venta;
    }
    public void setVenta(double venta){
        if(venta >= 0) this.venta = venta;
        else this.venta = 0;
    }   
}