package modelo;

import javax.swing.JOptionPane;
import registros.Registros;

public class Colas {

    nodo cabecera;
    nodo cola;

    public Colas() {
        cabecera = new nodo(null);
        cola = new nodo(null);

    }

    public void agregar(Registros registro) {
        if (listavacia()) {
            nodo nuevo = new nodo(registro);
            nuevo.siguiente = null;
            cabecera.siguiente = nuevo;
            cola.siguiente = nuevo;
        } else {
            nodo nuevo = new nodo(registro);
            nuevo.siguiente = cola.siguiente;
            cola.siguiente = nuevo;
        }

    }

    public void pop() {
        nodo borrar = cabecera.siguiente;
        if (cabecera.siguiente == cola.siguiente) {
            cabecera.siguiente = null;
            cola.siguiente = null;
        } else {
            nodo aux = cola;
            while (aux.siguiente != borrar) {
                aux = aux.siguiente;
            }
            aux.siguiente = null;
            cabecera.siguiente = aux;
        }

    }

    

    public void mostraratodos() {
        if (listavacia()) {
            JOptionPane.showMessageDialog(null, "la lista esta vacia");
        } else {
            nodo reco = cola.siguiente;
            while (reco != null) {
                JOptionPane.showConfirmDialog(null, reco.getDato().toString());
                reco = reco.siguiente;
            }
        }
    }




    public boolean listavacia() {
        if (cabecera.siguiente == null) {
            return true;
        } else {
            return false;
        }
    }

}
