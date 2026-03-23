# Respuestas: Análisis de Estructuras de Listas en Java (API)

### a. ¿En qué casos ArrayList ofrece un mejor rendimiento que LinkedList?
El **ArrayList** es superior cuando la operación predominante es el **acceso aleatorio** o la lectura de datos:
* **Acceso por índice:** Al basarse en un arreglo contiguo en memoria, la operación `get(int index)` es de tiempo constante **O(1)**.
* **Recorrido (Iteración):** Presenta una mejor **localidad de datos**, lo que permite que el procesador aproveche la memoria caché de forma más eficiente que con los nodos dispersos de una lista enlazada.
* **Adición al final:** Siempre que haya capacidad disponible, añadir un elemento al final es **O(1)**.

### b. ¿Cuándo LinkedList puede ser más eficiente que ArrayList?
La **LinkedList** (lista doblemente enlazada en Java) destaca en escenarios de **modificación estructural frecuente** en los extremos:
* **Inserción/Eliminación al inicio:** Operaciones como `addFirst()` o `removeFirst()` son **O(1)**. En un `ArrayList`, estas operaciones requieren desplazar todos los elementos restantes, resultando en un costo **O(n)**.
* **Eliminación durante la iteración:** Si ya se está utilizando un `Iterator` y se está posicionado sobre un nodo, la eliminación de ese nodo es **O(1)**.
* **Sin redimensionamiento:** A diferencia del `ArrayList`, no necesita copiar todos sus elementos a un nuevo arreglo cuando se queda sin espacio, ya que asigna memoria dinámicamente para cada nodo.



### c. ¿Qué diferencia encuentra en el uso de la memoria en ArrayList y LinkedList?
Existe un compromiso (*trade-off*) importante entre ambas estructuras:
* **ArrayList:**
    * **Densidad:** Es más eficiente en términos de espacio por elemento, ya que solo almacena las referencias a los objetos.
    * **Desperdicio:** El "gasto" de memoria se da por la **capacidad no utilizada** (el arreglo interno suele ser más grande que la cantidad de elementos actuales para evitar redimensionamientos constantes).
* **LinkedList:**
    * **Overhead de memoria:** Cada elemento (nodo) requiere significativamente más memoria porque, además del dato, debe almacenar dos referencias adicionales: una al nodo **anterior** y otra al **siguiente**.
    * **Fragmentación:** Los nodos pueden estar dispersos en el montículo (*heap*), lo que aumenta la sobrecarga del recolector de basura (GC).

### d. ¿En qué casos sería preferible usar un ArrayList o un LinkedList?
* **Preferir ArrayList si:**
    * La aplicación requiere realizar muchas consultas por índice o búsquedas.
    * El tamaño de la lista es relativamente estable o las inserciones se realizan mayoritariamente al final.
    * Se busca minimizar el consumo total de memoria en listas con gran cantidad de elementos.
* **Preferir LinkedList si:**
    * Se está implementando una estructura de **Pila (Stack)** o **Cola (Queue)** donde solo se manipulan los extremos.
    * Se realizan inserciones y eliminaciones constantes en el frente de la lista.
    * El acceso aleatorio (`get(i)`) no es una operación requerida por la lógica del negocio.

---

**Tabla Comparativa de Complejidad (Big O):**

| Operación | ArrayList | LinkedList |
| :--- | :--- | :--- |
| Acceso por índice | $O(1)$ | $O(n)$ |
| Insertar al inicio | $O(n)$ | $O(1)$ |
| Insertar al final | $O(1)$* | $O(1)$ |
| Eliminar por índice | $O(n)$ | $O(n)$ |