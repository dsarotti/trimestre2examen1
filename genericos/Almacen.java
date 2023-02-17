package codigo_fuente.genericos;

public class Almacen<T> {
    T dato;

    public Almacen(T dato) {
        this.dato = dato;
    }

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public boolean isEmpty(){
        return dato==null;
    }

}
