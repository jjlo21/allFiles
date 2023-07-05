import java.util.Scanner;
public class Clientes
{
    public static void main(String Args[]){
        Scanner sc = new Scanner(System.in);
        int numClientes;
        Distribuidora carniceria = new Distribuidora("7718902","Pa` tu asado","Kennedy");
        String identificacion, nombre;
        double venta;
        double promedio = 0;
        
        System.out.println("Digite el numero de clientes: ");
        numClientes = sc.nextInt();
        
        for(int i = 0; i < numClientes; i++){
            System.out.println("Digite la Identificacion del cliente: ");
            identificacion = sc.next();
            System.out.println("Digite el nombre del cliente: ");
            nombre = sc.next();
            System.out.println("Digite el valor de la compra del cliente: ");
            venta = sc.nextDouble();
            carniceria.nuevoCliente(identificacion, nombre, venta);
        }
        
        promedio = carniceria.calcularPromedioGeneral();        
        System.out.println("\n El promedio de venta es: " + promedio); 
    }
}
