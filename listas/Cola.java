package codigo_fuente.listas;

import java.util.LinkedList;

// Se puede modificar todo el código de esta clase excepto el nombre de la clase y los métodos
// encolar y desencolar.
// La clase ha de extender LinkedList.
public class Cola<T> extends LinkedList {

    public void encolar(E elemento) {
        this.addLast(elemento);
    }

    public E desencolar() {
        return this.poll();
    }

}
