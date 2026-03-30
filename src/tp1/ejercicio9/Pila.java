package tp1.ejercicio9;

import java.util.ArrayList;
import java.util.List;

public class Pila<T> {
    protected List<T> data;

    public Pila(){
        this.data = new ArrayList<T>();
    }

    public void push(T dato){
        this.data.add(dato);
    }

    public T pop(){
        if (this.data.isEmpty()) {
            throw new RuntimeException("La pila está vacía");
        }
        return this.data.removeLast();
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
