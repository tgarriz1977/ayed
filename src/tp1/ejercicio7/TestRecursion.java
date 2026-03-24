package tp1.ejercicio7;
import java.util.List;

public class TestRecursion {
    public static void main(String[] args) {
        EjercicioRecursion ej = new EjercicioRecursion();
        List<Integer> lista = ej.calcularSucesion(56);
        lista.forEach(el -> System.out.println(el));
    }
}
