package tp1.ejercicio8;
import java.util.List;
import java.util.ArrayList;

public class Queue<T> {
    protected List<T> data;

    public Queue(){
        this.data = new ArrayList<T>();
    }
    public void enqueue(T dato){
        this.data.add(dato);
    }
    public T dequeue() {
        if (this.data.isEmpty()) {
            throw new RuntimeException("La cola está vacía");
        }
        return this.data.remove(0);
    }
    public T head() {
        if (this.data.isEmpty()) {
            throw new RuntimeException("La cola está vacía");
        }
        return this.data.get(0);
    }
    public int size(){
        return this.data.size();
    }
    public boolean isEmpty(){
        return this.data.isEmpty();
    }
    @Override
    public String toString(){
        String res="";
        for (T elem : this.data){
            res = res + elem + " ";
        }
        return res;
    }
}
