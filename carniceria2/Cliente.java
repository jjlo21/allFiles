import java.util.Scanner;
public class Cliente
{
    public static void main(String[] args){
       Scanner sc= new Scanner(System.in);
        int numeroClientes = 0, opcionMenu =0;
        Ventas[] cliente =new Ventas[50];
        String identificacion,nombre;
        double venta;
        double promedio = 0;
        while(opcionMenu !=3 ){
         System.out.println("\n Menu de Opciones");
         System.out.println("1. Nuevo cliente");
         System.out.println("2. Calcular Promedio de ventas");
         System.out.println("3. Salir");
         System.out.println("Elija una de las Opciones");
         opcionMenu = sc.nextInt();
         
             if(opcionMenu ==1 ){
              System.out.println("Digite la identificacion del cliente: ");
              identificacion = sc.next();
              System.out.println("Digite el nombre del cliente: ");
              nombre = sc.next();
              System.out.println("Digite el valor de la compra del cliente: ");
              venta = sc.nextDouble();
              Ventas nuevoCliente =new Ventas(identificacion,nombre,venta);
              cliente[numeroClientes] = nuevoCliente;
              numeroClientes++;
            }
            else if(opcionMenu ==2){
                for(int i=0; i<numeroClientes; i++){
                    promedio = promedio + cliente[i].calcularPromedio()/numeroClientes;
                }
                System.out.println("\n El promedio de ventas es: " + promedio );
            }
        }
    }
}
