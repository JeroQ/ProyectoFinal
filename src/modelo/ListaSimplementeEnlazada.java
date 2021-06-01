package modelo;

/**
 *
 * @author Jeronimo
 */
public class ListaSimplementeEnlazada<E> {

    private Nodo<E> cabeza = null; // primer nodo de la lista head
    private Nodo<E> cola = null; // ultimo nodo de la lista tail
    private int cantidad = 0; // Cantidad de elementos que hay en la lista size

// muestra la cantidad de elementos de la lista 
    public int tamaño() {
        return cantidad;
    }
// muestra si esta o no vacia la lista
    public boolean estaVacia() {
        return cantidad == 0;
    }
// muestra el elemento del primer nodo    
    public E primero(){
        if (estaVacia()){
        return null;
    }
        return cabeza.getElemento();
    }
// muestra el elemento del ultimo nodo    
    public E ultimo(){
        if (estaVacia()){
            return null;
        }
        return cola.getElemento();
    }
// agregar al inicio    
    public void insertarInicio (E e){
        Nodo nodo = new Nodo(e,null);
        nodo.setSiguiente(cabeza);
        cabeza = nodo;
        
        if (cantidad == 0){
            cola = cabeza;
        }
        cantidad ++;
        
    }
// agregar al final    
    public void insertarFinal (E e){
        Nodo nodo = new Nodo (e,null);
        if (estaVacia()){
            cabeza = nodo;
        } else {
            cola.setSiguiente(nodo);
        }
        cola = nodo;
        cantidad++;
    }
    
    public E eliminarPrimero(){
        if (estaVacia()){
            return null;
        }
        E e = cabeza.getElemento();
        cabeza = cabeza.getSiguiente();
        cantidad--;
        if (cantidad == 0){
            cola = null;
        }
        return e;
    }
    
    public void mostrarLista(){
        Nodo recorrer = cabeza;
        
        while(recorrer != null){
            System.out.print("{"+recorrer.getElemento()+"}-->");
            recorrer = recorrer.getSiguiente();
            
        }
        System.out.println();
    }

}
