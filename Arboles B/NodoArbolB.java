public class NodoArbolB {
    int grado; // grado del árbol B
    int cantidad; // cantidad de datos en un nodo
    int datos[]; // array de datos
    NodoArbolB hijos[]; // array de hijos
    boolean esHoja; // booleano que indica si es hoja o no
    NodoArbolB padre; // nodo padre

    public NodoArbolB(int grado, NodoArbolB padre) {
        this.grado = grado;
        this.padre = padre;
        datos = new int[2 * grado - 1];
        hijos = new NodoArbolB[2 * grado];
        esHoja = true;
        cantidad = 0;
    }

    public int getDato(int index) {
        return datos[index];
    }

    public NodoArbolB getHijo(int index) {
        return hijos[index];
    }

    public void setDato(int index, int dato) {
        datos[index] = dato;
    }

    public void setHijo(int index, NodoArbolB nodo) {
        hijos[index] = nodo;
    }

    public void setPadre(NodoArbolB padre) {
        this.padre = padre;
    }

    public boolean esHoja() {
        return esHoja;
    }

    public int getCantidad() {
        return cantidad;
    }

    public int getGrado() {
        return grado;
    }

    public NodoArbolB getPadre() {
        return padre;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setHoja(boolean esHoja) {
        this.esHoja = esHoja;
    }

    public void setGrado(int grado) {
        this.grado = grado;
    }
}
