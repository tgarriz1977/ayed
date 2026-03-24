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
    //7j
    public ArrayList<Integer> combinarOrdenado(ArrayList<Integer> lista1, ArrayList<Integer> lista2){
        int i=0,j=0;
        ArrayList<Integer> result = new ArrayList<>();
        while (i < lista1.size() && j< lista2.size()) {
            if (lista1.get(i) <= lista2.get(j)) {
                result.add(lista1.get(i));
                i++;
            } else {
                result.add(lista2.get(j));
                j++;
            }
        }
        while (i < lista1.size()){
            result.add(lista1.get(i));
            i++;
        }
        while (j < lista2.size()){
            result.add(lista2.get(j));
            j++;
        }
        return result;
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