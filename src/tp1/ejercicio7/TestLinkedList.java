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
