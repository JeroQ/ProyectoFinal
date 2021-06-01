
package modelo;

/**
 *
 * @author Jeronimo
 */
public class Nodo<E> {
    private E elemento; // elemento o dato dentro del nodo
    private Nodo siguiente; // apunta al seguiente nodo

    public Nodo(E element, Nodo<E> siguiente) {
        this.elemento = element;
        this.siguiente = siguiente;
    }

    public E getElemento() {
        return elemento;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

  
    
    
    
    
}
