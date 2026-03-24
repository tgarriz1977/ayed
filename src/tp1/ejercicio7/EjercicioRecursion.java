package tp1.ejercicio7;

import java.util.ArrayList;
import java.util.List;

public class EjercicioRecursion {
    public List<Integer> calcularSucesion(int n){
        List<Integer> lista= new ArrayList<>();
        lista.add(n);
        if (n == 1){
            return lista;
        } else if (n % 2 == 0){
            List<Integer> siguiente = calcularSucesion(n/2);
            lista.addAll(siguiente);
        } else {
            List<Integer> siguiente = calcularSucesion((3 * n) + 1);
            lista.addAll(siguiente);
        }
        return lista;
    }
    public void invertirArrayList(ArrayList<Integer> lista){
        if (lista.size() <= 1){
            return;
        }
        Integer aux = lista.get(0);
        lista.remove(0);
        invertirArrayList(lista);
        lista.add(aux);
    }
    public int sumarLinkedList(ArrayList<Integer> lista){
        if (lista.size() <= 1) {
            return (int) lista.get(0);
        } else {
            int suma = lista.get(0);
            lista.remove(0);
            return suma + sumarLinkedList(lista);
        }
    }
}
