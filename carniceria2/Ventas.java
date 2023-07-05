public class Ventas
{
    String identificacion;
    String nombre;
    double venta;
    
    Ventas (String identificacion, String nombre, double venta){
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.venta = venta;
    }
    
    double calcularPromedio(){
        return venta;
    }

}
