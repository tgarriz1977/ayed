package tp2.ejercicio1;
import java.lang.Math;
import tp1.ejercicio8.Queue;


public class BinaryTree <T> {
	
	private T data;
	private BinaryTree<T> leftChild;   
	private BinaryTree<T> rightChild; 

	
	public BinaryTree() {
		super();
	}

	public BinaryTree(T data) {
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	/**
	 * Preguntar antes de invocar si hasLeftChild()
	 * @return
	 */
	public BinaryTree<T> getLeftChild() {
		return leftChild;
	}
	/**
	 * Preguntar antes de invocar si hasRightChild()
	 * @return
	 */
	public BinaryTree<T> getRightChild() {
		return this.rightChild;
	}

	public void addLeftChild(BinaryTree<T> child) {
		this.leftChild = child;
	}

	public void addRightChild(BinaryTree<T> child) {
		this.rightChild = child;
	}

	public void removeLeftChild() {
		this.leftChild = null;
	}

	public void removeRightChild() {
		this.rightChild = null;
	}

	public boolean isEmpty(){
		return (this.isLeaf() && this.getData() == null);
	}

	public boolean isLeaf() {
		return (!this.hasLeftChild() && !this.hasRightChild());

	}
		
	public boolean hasLeftChild() {
		return this.leftChild!=null;
	}

	public boolean hasRightChild() {
		return this.rightChild!=null;
	}
	@Override
	public String toString() {
		return this.getData().toString();
	}
	public int getAltura(){
		if (this.isLeaf()) { return 0;}
		int leftHeight = (this.hasLeftChild()) ? this.getLeftChild().getAltura() : 0;
		int rightHeight = (this.hasRightChild()) ? this.getRightChild().getAltura() : 0;
		return java.lang.Math.max(leftHeight,rightHeight) + 1 ;
	}

	public  int contarHojas() {
		if (this.isEmpty()) { return 0;}
		if (this.isLeaf()){
			return 1;
		}
		int cont = 0;
		if (this.hasLeftChild()) {
			cont = this.getLeftChild().contarHojas();
		}
		if (this.hasRightChild()){
			cont = cont + this.getRightChild().contarHojas();
		}
		return cont;
	}

    public BinaryTree<T> espejo(){
		BinaryTree<T> mirror = new BinaryTree<>(this.getData());
		if (this.hasLeftChild()) {
			mirror.addRightChild(this.getLeftChild().espejo());
		}
		if (this.hasRightChild()) {
			mirror.addLeftChild(this.getRightChild().espejo());
		}
		return mirror;
	}

	// 0<=n<=m
	public void entreNiveles(int n, int m){
		if ( this.isEmpty() || n > m ) {
			System.out.println("Error");
			return;
		}
		int nivelActual = 0;
		Queue<BinaryTree<T>> cola = new Queue<>();
		cola.enqueue(this);
		cola.enqueue(null);
		while ( !cola.isEmpty() && nivelActual <= m ) {
				BinaryTree<T> nodo = cola.dequeue();
				if (nodo != null) {
					System.out.println(nodo.getData());
					if (nodo.hasLeftChild()) {
						cola.enqueue(nodo.getLeftChild());
					}
					if (nodo.hasRightChild()) {
						cola.enqueue(nodo.getRightChild());
					}
				} else {
					nivelActual++;
					if (!cola.isEmpty() && nivelActual <= m){
						cola.enqueue(null);
					}
			    }
		}
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
		hijoIzq.addRightChild(new BinaryTree<>(7));

		BinaryTree<Integer> hijoDer = new BinaryTree<>(15);
		hijoDer.addRightChild(new BinaryTree<>(20));

		arbol.addLeftChild(hijoIzq);
		arbol.addRightChild(hijoDer);

		// 2. Pruebas de los métodos
		System.out.println("--- Pruebas de Árbol Binario ---");

		System.out.println("Altura del árbol (esperado 2): " + arbol.getAltura());

		System.out.println("Cantidad de hojas (esperado 3: el 3, 7 y 20): " + arbol.contarHojas());

		System.out.println("\n--- Recorrido entre niveles 1 y 2 ---");
		// Debería imprimir: 5, 15, 3, 7, 20 (en ese orden por niveles)
		arbol.entreNiveles(1, 2);

		System.out.println("\n--- Prueba de Espejo ---");
		BinaryTree<Integer> espejo = arbol.espejo();
		System.out.println("Raíz del espejo: " + espejo.getData());
		System.out.println("Hijo izquierdo del espejo (esperado 15): " + espejo.getLeftChild().getData());
		System.out.println("Hijo derecho del espejo (esperado 5): " + espejo.getRightChild().getData());
	}

}

