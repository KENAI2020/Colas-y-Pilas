package pc;

import lcde.Nodo;
import lde.ListaSimplementeEnlazada;
import lde.NodoLde;

public class Cola extends ListaSimplementeEnlazada {
    @Override
    public void insertar(Object dato) {
        if(estaVacia()){
            NodoLde nuevo = new NodoLde(dato,  null);
            primero = nuevo;
        }else {
            NodoLde ultimo = primero;
            while (ultimo.getSiguiente() != null){
                ultimo = ultimo.getSiguiente();
            }

            NodoLde nuevo = new NodoLde(dato, null);
            ultimo.setSiguiente(nuevo);
        }
    }
}
