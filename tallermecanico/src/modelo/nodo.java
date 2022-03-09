
package modelo;

import registros.Registros;

public class nodo {
    public Registros dato;
    public nodo siguiente;
    public nodo(Registros p){
        dato = p;
        siguiente = null;
    }

    public nodo() {
    }

    public Registros getDato() {
        return dato;
    }

    public nodo getSiguiente() {
        return siguiente;
    }

    public void setDato(Registros dato) {
        this.dato = dato;
    }

    public void setSiguiente(nodo siguiente) {
        this.siguiente = siguiente;
    }
    
}
