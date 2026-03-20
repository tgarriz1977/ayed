package tp1.ejercicio1;

public class MiClase {
    public static void imprimeFor(int a, int b){
        for(i=a; i=b; i++){
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
}