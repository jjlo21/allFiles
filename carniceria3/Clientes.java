import java.util.Scanner;
public class Clientes
{
   public static void main(String Args[]){
        Scanner sc = new Scanner(System.in);
        int numClientes;
        System.out.println("Digite el numero de clientes: ");
        numClientes = sc.nextInt();
        Ventas[] losClientes = new Ventas[numClientes];
        String identificacion, nombre;
        double venta;
        double promedio = 0;
        
        for(int i = 0; i < numClientes; i++){
            System.out.println("Digite la Identificacion del Cliente: ");
            identificacion = sc.next();
            System.out.println("Digite el nombre del Cliente: ");
            nombre = sc.next();
            System.out.println("Digite el total de compras del Cliente: ");
            venta = sc.nextDouble();
            Ventas unCliente = new Ventas(identificacion, nombre, venta);
            losClientes[i] = unCliente;
        }
        for(int i = 0; i < numClientes; i++)
        {
            promedio = promedio + losClientes[i].calcularPromedio() / numClientes; 
        }
        System.out.println("Promedio de vnetas: "+ promedio);
    } 
}
