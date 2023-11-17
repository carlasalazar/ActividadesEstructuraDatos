public class ArbolB {

    int grado; // grado del árbol B
    NodoArbolB raiz; // raíz del árbol B

    public ArbolB(int grado) {
        this.grado = grado;
        raiz = new NodoArbolB(grado, null);
    }

    // Método para buscar un dato en el árbol B
    public NodoArbolB buscar(NodoArbolB nodo, int dato) {
        int i = 0; // índice de búsqueda

        while (i < nodo.getCantidad() && dato > nodo.getDato(i)) {
            i++;
        }
        if (i < nodo.getCantidad() && dato == nodo.getDato(i)) {
            return nodo;
        }
        if (nodo.esHoja()) {
            return null;
        } else {
            return buscar(nodo.getHijo(i), dato);
        }
    }

    // Método para dividir un nodo lleno
    public void dividir(NodoArbolB x, int i, NodoArbolB y) {
        NodoArbolB z = new NodoArbolB(grado, null);

        z.setHoja(y.esHoja());
        z.setCantidad(grado - 1);

        for (int j = 0; j < grado - 1; j++) {
            z.setDato(j, y.getDato(j + grado));
        }
        if (!y.esHoja()) {
            for (int k = 0; k < grado; k++) {
                z.setHijo(k, y.getHijo(k + grado));
            }
        }

        y.setCantidad(grado - 1);

        for (int j = x.getCantidad(); j > i; j--) {
            x.setHijo(j + 1, x.getHijo(j));
        }
        x.setHijo(i + 1, z);

        for (int j = x.getCantidad(); j > i; j--) {
            x.setDato(j, x.getDato(j - 1));
        }
        x.setDato(i, y.getDato(grado - 1));

        y.setDato(grado - 1, 0);

        for (int j = 0; j < grado - 1; j++) {
            y.setDato(j + grado, 0);
        }
        x.setCantidad(x.getCantidad() + 1);
    }

    // Método para la inserción cuando el nodo no está lleno
    public void insercionNoLlena(NodoArbolB x, int dato) {
        int i = x.getCantidad();

        if (x.esHoja()) {
            while (i >= 1 && dato < x.getDato(i - 1)) {
                x.setDato(i, x.getDato(i - 1));
                i--;
            }

            x.setDato(i, dato);
            x.setCantidad(x.getCantidad() + 1);
        } else {
            int j = 0;
            while (j < x.getCantidad() && dato > x.getDato(j)) {
                j++;
            }

            if (x.getHijo(j).getCantidad() == grado * 2 - 1) {
                dividir(x, j, x.getHijo(j));

                if (dato > x.getDato(j)) {
                    j++;
                }
            }

            insercionNoLlena(x.getHijo(j), dato);
        }
    }

    // Método para insertar un dato en el árbol B
    public void insertar(ArbolB arbolB, int dato) {
        NodoArbolB r = arbolB.raiz;
        if (r.getCantidad() == 2 * grado - 1) {
            NodoArbolB s = new NodoArbolB(grado, null);
            arbolB.raiz = s;
            s.setHoja(false);
            s.setCantidad(0);
            s.setHijo(0, r);
            dividir(s, 0, r);
            insercionNoLlena(s, dato);
        } else {
            insercionNoLlena(r, dato);
        }
    }

    // Método para imprimir el árbol B
    public void imprimir(NodoArbolB nodo) {
        for (int i = 0; i < nodo.getCantidad(); i++) {
            System.out.print(nodo.getDato(i) + " ");
        }

        if (!nodo.esHoja()) {
            for (int j = 0; j <= nodo.getCantidad(); j++) {
                if (nodo.getHijo(j) != null) {
                    System.out.println();
                    imprimir(nodo.getHijo(j));
                }
            }
        }
    }

    // Método para imprimir un nodo específico del árbol B
    public void imprimirNodoEspecifico(ArbolB arbolB, int x) {
        NodoArbolB temp = new NodoArbolB(grado, null);

        temp = buscar(arbolB.raiz, x);

        if (temp == null) {
            System.out.println("Dato no existente");
        } else {
            imprimir(temp);
        }
    }

    // Método para eliminar un dato en el árbol B
    public void eliminarDato(ArbolB arbolB, int dato) {
        NodoArbolB temp = new NodoArbolB(grado, null);

        temp = buscar(arbolB.raiz, dato);

        if (temp.esHoja() && temp.getCantidad() > grado - 1) {
            int i = 0;

            while (dato > temp.getDato(i)) {
                i++;
            }
            for (int j = i; j < 2 * grado - 2; j++) {
                temp.setDato(j, temp.getDato(j + 1));
            }
            temp.setCantidad(temp.getCantidad() - 1);
        } else {
            System.out.println("Error: No es hoja o la cantidad es insuficiente");
        }
    }
}
