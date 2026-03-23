package tp1.ejercicio7;
import java.util.ArrayList;
import java.util.List;

public class TestArrayList {
    public static void main(String[] args){
        List<Integer> lista = new ArrayList<>();
        for (String arg : args){
            try {
                int numero = Integer.parseInt(arg);
                lista.add(numero);
            }
            catch (NumberFormatException e) {
                System.err.println("El argumento " + arg + "no es un numero");
            }
        }
        System.out.println("lista de numeros:");
        for (Integer num : lista){
            System.out.println(num);
        }
    }
}
