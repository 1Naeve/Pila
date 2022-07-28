
import java.util.Scanner;

public class ClasePrincipal {

    public static void main(String[] args) {

        PIla obj = new PIla();
        Scanner op = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("Menu Pila");
            System.out.println("1.- Push (Ingresar un elemento) :");
            System.out.println("2.- Pop (Eliminar elemento): ");
            System.out.println("3.- Mostrar la Pila completa: ");
            System.out.println("4.- Salir.");
            System.out.println("Ingrese una opcion");
            opcion = op.nextInt();
            switch (opcion) {
                case 1:
                    obj.push();
                    break;
                case 2:
                    obj.pop();
                    break;
                case 3:
                    obj.mostrarPila();
                case 4:
                    System.out.println("Has salido del programa con exito!");
                    break;
                default:
                    System.out.println("Error!\n Ingrese una opcion valida.");
            }
        } while (opcion != 4);
    }

}
