import java.util.Scanner;
public class Ventas
{
    public static void main(String Args[]) throws Exception{
        Scanner sc = new Scanner(System.in);        
        Distribuidora Carniceria = new Distribuidora("123456","IED GonzaloArango","Suba");
        String identificacion, nombre;
        double venta;
        double promedio = 0;
        int opcionMenu = 0;
       
        do{
            System.out.println("\nMenu de Opciones");
            System.out.println("[1]- Adicionar Estudiante de Jardin: ");
            System.out.println("[2]- Adicopnar Estudiante de Colegio: ");
            System.out.println("[3]- Adicionar Estudiante de Tecnico ");
            System.out.println("[4]- Calcular Promedio ");
            System.out.println("[5]- Salir \n");
            System.out.println("Escoja una Opcion: ");
            opcionMenu = sc.nextInt();
            switch(opcionMenu){
                case 1:
                        sc.nextLine();
                        System.out.println("Digite la Identificacion del Estudiante: ");
                        identificacion = sc.next();
                        System.out.println("Digite el nombre del Estudiante: ");
                        nombre = sc.next();
                        System.out.println("Digite primera nota del estudiante: ");
                        venta = sc.nextDouble();
                        try{
                            Carniceria.adicionarCliente(identificacion, nombre, venta);
                        }
                        catch(Exception e){
                            System.out.println(e.getMessage());
                        }
                        System.out.println("********************");
                        break;
                case 2:
                        sc.nextLine();
                        System.out.println("Digite la Identificacion del Estudiante: ");
                        identificacion = sc.next();
                        System.out.println("Digite el nombre del Estudiante: ");
                        nombre = sc.next();
                        System.out.println("Digite el curso del Estudiante: ");
                        venta = sc.nextDouble();
                        try{                        
                        Carniceria.adicionarcliente(identificacion, nombre, venta);
                        }catch(Exception e){
                            System.out.println(e.getMessage());
                        }
                        System.out.println("********************");
                        break;

                case 3:
                        sc.nextLine();
                        promedio = Carniceria.calcularPromedioGeneral();
                        System.out.println("\n El promedio de notas es: " + promedio);
                        break;
                default:
                        System.out.println("Ha Seleccionado Salir");
                       
            }
        }while(opcionMenu != 5);
    }
    
}
