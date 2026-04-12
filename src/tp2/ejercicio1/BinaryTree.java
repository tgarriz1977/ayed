package tp2.ejercicio1;
import Math;

import java.lang.Math;


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
		int leftHeight = 0;
		int rightHeight = 0;
		if (this.isLeaf()) { return 0;}
		if (this.hasLeftChild()) { leftHeight = this.getLeftChild().getAltura(); }
		if (this.hasRightChild()) { rightHeight = this.getRightChild().getAltura(); }
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
		BinaryTree<T> btmirror = new BinaryTree<>(this.getData());
		if (this.hasLeftChild()) {
			btmirror.addRightChild(this.getLeftChild().espejo());
		}
		if (this.hasRightChild()) {
			btmirror.addLeftChild(this.getRightChild().espejo());
		}
		return btmirror;
	}



	// 0<=n<=m
	public void entreNiveles(int n, int m){

   }

}

