package tp1.ejercicio7;

import java.util.ArrayList;
import java.util.List;

public class TestRecursion {
    public static void calcularSucesion(int n, List<Integer> lista){
        lista.add(n);
        if (n == 1){
            return;
        } else if (n % 2 == 0){
            calcularSucesion(n/2,lista);
        } else {
            calcularSucesion((3 * n) + 1, lista);
        }
    }
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        int n = 56; // Podés cambiar este número por el que quieras probar
        
        calcularSucesion(n, lista);
        
        System.out.println("Sucesión de Collatz para n = " + n + ":");
        System.out.println(lista);
    }
}
