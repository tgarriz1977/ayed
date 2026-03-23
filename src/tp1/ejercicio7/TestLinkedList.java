//En el ArrayList los números están guardados en un bloque contiguo de memoria, cuando
//se llena el compilador crea un nuevo array duplicando el tamano y y copia el contenido del 
//array inicial
//En el linkedList el un elemento con el dato y dos punteros al elemento anterior y al elemento posterior
//Característica	ArrayList	LinkedList
//Memoria	Usa menos (solo guarda los números).	Usa más (guarda el número + punteros).
//Velocidad de Lectura	Ultra rápida (O(1)).	Lenta (O(n)), tiene que saltar de nodo en nodo.
//Insertar al inicio	Muy lenta (tiene que correr todos).	Ultra rápida (solo cambia punteros).
package tp1.ejercicio7;
import java.util.LinkedList;
import java.util.List;
public class TestLinkedList {
    public static void main(String[] args){
        List<Integer> lista = new LinkedList<>();
        for (String arg : args){
            try {
                int numero = Integer.parseInt(arg);
                lista.add(numero);
            }
            catch (NumberFormatException e) {
                System.err.println("El argumento " + arg + " no es un numero");
            }
        }
        System.out.println("Los numeros ingresados son:");
        for (Integer num : lista){
            System.out.println(num);
        }
    }

}
