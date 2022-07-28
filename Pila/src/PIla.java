
import java.util.Scanner; // Este paquete nos deja meter datos por teclado.

public class PIla {

    Scanner teclado = new Scanner(System.in); // acá creamos el objeto para poder meter datos por teclado.
    int pilaNumerica[] = new int[5];//Acá se crea el tamaño de la pila con un arreglo, en este caso de 5 
    int tope = -1;

    //metodo para ingresar elementos a la pila
    public void push() { //tope inicialmente vale -1, primera ejecucion tope vale 0, segunda ejecucion, tope vale 1 y asi sucesivamente hasta llenarse la pila
        if (tope >= pilaNumerica.length - 1) {// me devuelve el tamaño de la pila (en este caso 5), pilaNumerica.length es 5 pero -1 es 4
            System.out.println("La pila esta llena");
        } else {
            tope += 1;// tope=tope+1. acá tope ya no vale -1 sino 0. primera ejecucion tope vale 1, segunda ejecucion, tope vale 2 y asi sucesivamente hasta llenarse la pila
            System.out.println("Ingrese el dato: ");
            pilaNumerica[tope] = teclado.nextInt();//pedimos un valor y lo almacenamos en pilaNumerica en la posicion tope, es decir en la posicion 0
        }
    }

    public int pop() {
        if (tope == -1) {//cuando la posicion vale -1 significa que aun no hemos ingresado ningun valor a la pila
            System.out.println("La pila esta vacia");
        } else {
            System.out.println("Se ha eliminado un elemento de la pila");
            pilaNumerica[tope] = 0; //cambia el numero que está en el tope por un 0
        }
        return tope--; //esto es para que no se elimine siempre la misma posicion (4 en este caso) y elimine la posicion del tope mas arriba (si llenamos con 2, que elimine el 3)
    }

    public void mostrarPila() {
        for (int tope = 4; tope >= 0; tope--) {//inicialmente tope vale 4, se pone tope-- porque imprime desde la posicion 4 a la 0 (si fuese ++ imprime de la posicion 0 a la 4) 
            System.out.println("Datos de la pila: " + pilaNumerica[tope]);
        }
    }

}
