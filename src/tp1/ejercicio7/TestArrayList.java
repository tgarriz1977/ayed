package tp1.ejercicio7;
import java.util.ArrayList;
import java.util.List;

public class TestArrayList {
    //7.f
    public static boolean esCapicua(List<Integer> lista){
        List<Integer> aux= new ArrayList<>();
        for (int i=lista.size()-1;i>=0;i--){
            aux.add(lista.get(i));
        }
        return lista.equals(aux);
    }
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

        if ( esCapicua(lista) ) {
            System.out.println("la lista es capicua");
        } else {
            System.out.println("la lista NO es capicua");
        }
    }
}
