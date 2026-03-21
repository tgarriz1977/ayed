package tp1.ejercicio5;

import java.util.ArrayList;
import java.util.Scanner;

public class CalcularValores {
    static int maxGlobal, minGlobal;
    static double promGlobal;

    public static double[] calcular(int[] valores) {
        int suma = 0;
        int max = valores[0];
        int min = valores[0];

        for (int elem : valores) {
            suma = suma + elem;
            if (max < elem) {
                max = elem;
            }
            if (min > elem) {
                min = elem;
            }
        }

        // Crear el arreglo de retorno (promedio, maximo, minimo)
        double[] resultados = new double[3];
        
        // Calcular promedio convirtiendo a double para evitar división entera
        resultados[0] = (double) suma / valores.length;
        resultados[1] = max;
        resultados[2] = min;

        return resultados;
    }

    public static double[] calcularInteractuando() {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> temporal = new ArrayList<>();
        System.out.println("Ingresa los números del arreglo y finaliza ingresando una letra");
        while (s.hasNextInt()) {
            temporal.add(s.nextInt());
        }
        s.close();

        if (temporal.isEmpty()) {
            return new double[]{0, 0, 0};
        }

        int suma = 0;
        int max = temporal.get(0);
        int min = temporal.get(0);

        for (int elem : temporal) {
            suma = suma + elem;
            if (max < elem) {
                max = elem;
            }
            if (min > elem) {
                min = elem;
            }
        }
        // Crear el arreglo de retorno (promedio, maximo, minimo)
        double[] resultados = new double[3];
        
        // Calcular promedio convirtiendo a double para evitar división entera
        resultados[0] = (double) suma / temporal.size();
        resultados[1] = max;
        resultados[2] = min;

        return resultados;
    }

    public static void calcularGlobal(){
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> temporal = new ArrayList<>();
        System.out.println("Ingrese los valores del arreglo y finelice presionando una letra");
        while(s.hasNextInt()){
            temporal.add(s.nextInt());
        }
        s.close();
        int suma = 0;
        int max = temporal.get(0);
        int min = temporal.get(0);
        for (int elem : temporal) {
            suma = suma + elem;
            if (max < elem) {
                max = elem;
            }
            if (min > elem) {
                min = elem;
            }
        }
        minGlobal = min;
        maxGlobal = max;
        promGlobal = (double) suma / temporal.size();
    }
}
