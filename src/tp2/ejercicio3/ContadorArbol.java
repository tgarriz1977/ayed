package tp2.ejercicio3;
import tp2.ejercicio1.BinaryTree;

import java.util.ArrayList;
import java.util.List;

public class ContadorArbol {
    private BinaryTree<Integer> arbol;

    public ContadorArbol(BinaryTree<Integer> arbol) {
        this.arbol = arbol;
    }

    public BinaryTree<Integer> getArbol() {
        return arbol;
    }

    public void setArbol(BinaryTree<Integer> arbol) {
        this.arbol = arbol;
    }

    private void contarParesRecursivo(BinaryTree<Integer> arbolAuxiliar, List<Integer> pares) {
        if (arbolAuxiliar.getData() % 2 == 0) {
            pares.add(arbolAuxiliar.getData());
        }
        if (arbolAuxiliar.hasLeftChild()) {
            contarParesRecursivo(arbolAuxiliar.getLeftChild(),pares);
        }
        if (arbolAuxiliar.hasRightChild()) {
            contarParesRecursivo(arbolAuxiliar.getRightChild(),pares);
        }
    }

    private void contarParesInOrder(BinaryTree<Integer> arbolAuxiliar, List<Integer> pares) {
        if (arbolAuxiliar.hasLeftChild()) {
            contarParesInOrder(arbolAuxiliar.getLeftChild(),pares);
        }
        if (arbolAuxiliar.getData() % 2 == 0) {
            pares.add(arbolAuxiliar.getData());
        }
        if (arbolAuxiliar.hasRightChild()) {
            contarParesInOrder(arbolAuxiliar.getRightChild(),pares);
        }
    }

    private void contarParesPostOrden(BinaryTree<Integer> arbolAuxiliar, List<Integer> pares) {
        if (arbolAuxiliar.hasLeftChild()) {
            contarParesPostOrden(arbolAuxiliar.getLeftChild(),pares);
        }

        if (arbolAuxiliar.hasRightChild()) {
            contarParesPostOrden(arbolAuxiliar.getRightChild(),pares);
        }
        if (arbolAuxiliar.getData() % 2 == 0) {
            pares.add(arbolAuxiliar.getData());
        }
    }

    public List<Integer> numerosPares() {
        List<Integer> pares = new ArrayList<Integer>();
        if (!this.arbol.isEmpty()) {
            this.contarParesRecursivo(this.arbol, pares);
        }
        return pares;
    }
    public static void main(String[] args) {
        // 1. Construcción del árbol
        // Estructura:
        //        10
        //       /  \
        //      5    15
        //     / \     \
        //    3   7     20

        BinaryTree<Integer> arbol = new BinaryTree<>(10);

        BinaryTree<Integer> hijoIzq = new BinaryTree<>(5);
        hijoIzq.addLeftChild(new BinaryTree<>(3));
        hijoIzq.addRightChild(new BinaryTree<>(8));

        BinaryTree<Integer> hijoDer = new BinaryTree<>(15);
        hijoDer.addRightChild(new BinaryTree<>(20));

        arbol.addLeftChild(hijoIzq);
        arbol.addRightChild(hijoDer);
        ContadorArbol cont = new ContadorArbol(arbol);
        System.out.println(cont.numerosPares());
    }
}
