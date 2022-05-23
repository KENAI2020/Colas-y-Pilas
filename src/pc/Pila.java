package pc;

import lcde.Nodo;
import lde.NodoLde;

public class Pila extends Cola{
    @Override
    public void eliminar() {
        if (!estaVacia()) {
            NodoLde ultimo = primero;
            NodoLde penultimo = null;
            while (ultimo.getSiguiente() !=null){
                penultimo = ultimo;
                ultimo = ultimo.getSiguiente();

            }

            penultimo.setSiguiente(null);

        }
    }
}
