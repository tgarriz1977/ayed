package tp1.ejercicio2;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2 {
    public int[] construyeArray(int n) {
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            res[i] = n * (i+1);
        }
        return res;
    }
    public static void main (String[] args){
        Ejercicio2 ej = new Ejercicio2();
        Scanner s = new Scanner(System.in);
        System.out.println("Ingresar n");
        int n = s.nextInt();
        int[] result = ej.construyeArray(n);
        System.out.println(Arrays.toString(result));
    }

}
