import java.util.Scanner;
public class Ventas
{
    public static void main(String Args[]){
        Scanner sc = new Scanner(System.in);
        int numClientesP;
        int numClientesV;
        Distribuidora carniceria = new Distribuidora("7718902","Pa` tu asado","Kennedy");
        String identificacion, nombre;
        double venta;
        double promedio = 0;
        
        System.out.println("Digite el numero de clientes presenciales: ");
        numClientesP = sc.nextInt();
        
        for(int i = 0; i < numClientesP; i++){
            System.out.println("Digite la Identificacion del cliente: ");
            identificacion = sc.next();
            System.out.println("Digite el nombre del cliente: ");
            nombre = sc.next();
            System.out.println("Digite el valor de la compra del cliente: ");
            venta = sc.nextDouble();
            carniceria.nuevoClientePresencial(identificacion, nombre, venta);
        }
        
        System.out.println("Digite el numero de clientes virtuales: ");
        numClientesV = sc.nextInt();
        
        for(int i = 0; i < numClientesV; i++){
            System.out.println("Digite la Identificacion del cliente: ");
            identificacion = sc.next();
            System.out.println("Digite el nombre del cliente: ");
            nombre = sc.next();
            System.out.println("Digite el valor de la compra del cliente: ");
            venta = sc.nextDouble();
            carniceria.nuevoClientePresencial(identificacion, nombre, venta);
        }
        
        promedio = carniceria.calcularPromedioGeneral();        
        System.out.println("\n El promedio de venta es: " + promedio); 
    }
}
