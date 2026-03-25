package tp1.ejercicio8;

public class DoubleEndedQueue<T> extends Queue<T> {
    public void enqueueFirst(T dato){
        this.data.addFirst(dato); // o podria ser this.data.add(0,dato)
    }
}
