package tp1.ejercicio1;

public class Ejercicio1 {
    public static void imprimeFor(int a, int b){
        for(int i=a; i<=b; i++){
            System.out.println("valor: " + $i + "\n")
        }
    }
    public static void imprimeWhile(int a, int b){
        while (a <= b){
            System.out.println("valor: " + $a + "\n");
            a++;
        }
    }
    public static void imprimeRecursivo(int a, int b){
        if (a > b) return;
        System.out.println("valor: " + $a + "\n");
        imprimeRecursivo(a++,b);
    }
    public static void main(String[] args) {
        System.out.println("Con for:");
        imprimirFor(3, 7);

        System.out.println("Con while:");
        imprimirWhile(3, 7);

        System.out.println("Con recursión:");
        imprimirRecursivo(3, 7);
    }
}