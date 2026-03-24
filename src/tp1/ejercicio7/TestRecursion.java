package tp1.ejercicio7;
import java.util.ArrayList;
import java.util.List;

public class TestRecursion {
    public static void main(String[] args) {
        // prueba ej 7g
        //EjercicioRecursion ej = new EjercicioRecursion();
        //List<Integer> lista = ej.calcularSucesion(56);
        //lista.forEach(el -> System.out.println(el));

        //Prueba ej 7h
        EjercicioRecursion ej = new EjercicioRecursion();
        ArrayList<Integer> lista = new ArrayList<>();
        for(int i=0;i<=9;i++){
            lista.add(i);
        }
        ej.invertirArrayList(lista);
        lista.forEach(a -> System.out.println(a));
    }
}
