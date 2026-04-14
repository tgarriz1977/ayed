package tp2.ejercicio4;

import tp2.ejercicio1.BinaryTree;
import tp1.ejercicio8.Queue;


public class RedBinariaLLena {
    private BinaryTree<Integer> arbol;

    public RedBinariaLLena(BinaryTree<Integer> arbol) {
        this.arbol = arbol;
    }

    public BinaryTree<Integer> getArbol() {
        return arbol;
    }

    public void setArbol(BinaryTree<Integer> arbol) {
        this.arbol = arbol;
    }

    public int retardoReenvio(){
        Queue<BinaryTree<Integer>> cola = new Queue<BinaryTree<Integer>>();
        int maxLevel = 0;
        int retardo = 0;
        if (this.getArbol().isEmpty()) {
            return 0;
        }
        cola.enqueue(this.getArbol());
        cola.enqueue(null);
        while ( !cola.isEmpty()  ) {
            BinaryTree<Integer> nodo = cola.dequeue();
            if (nodo != null) {
                if (nodo.getData() > maxLevel ) { maxLevel = (int) nodo.getData(); }
                if (nodo.hasLeftChild()) {cola.enqueue(nodo.getLeftChild());}
                if (nodo.hasRightChild()) {cola.enqueue(nodo.getRightChild());}
            } else if (!cola.isEmpty()) {
                retardo = +maxLevel;
                maxLevel = 0;
            }
        }
        return retardo;
    }
}
