package tp1.ejercicio8;

public class CircularQueue<T> extends Queue<T> {
    public T shift(){
        if (this.data.isEmpty()) {
            throw new RuntimeException("La cola está vacía");
        }
        T aux = this.dequeue();
        this.enqueue(aux);
        return aux;
    }
}
