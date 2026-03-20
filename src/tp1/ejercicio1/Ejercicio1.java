package tp1.ejercicio1;

public class Ejercicio1 {
    public static void imprimeFor(int a, int b){
        for(int i=a; i<=b; i++){
            System.out.println("valor: " + i);
        }
    }
    public static void imprimeWhile(int a, int b){
        while (a <= b){
            System.out.println("valor: " + a);
            a++;
        }
    }
    public static void imprimeRecursivo(int a, int b){
        if (a > b) return;
        System.out.println("valor: " + a);
        imprimeRecursivo(++a,b);
    }
    public static void main(String[] args) {
        System.out.println("Con for:");
        imprimeFor(3, 7);

        System.out.println("Con while:");
        imprimeWhile(3, 7);

        System.out.println("Con recursión:");
        imprimeRecursivo(3, 7);
    }
}