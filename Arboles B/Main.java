/**Esta clase crea un árbol B con un grado de 3
 * Insertar datos en el arbol
 * Imprime el árbol después de las primeras inserciones dadas
 * Busca un nodo específico
 * Elimina un dato del arbol
 * Inserta nuevos datos después de la eliminación
 * Imprime el árbol después de añadir nuevos datos
 * Agrega más datos
 * 
 */
public class Main {
    public static void main(String[] args) {
        
        ArbolB arbolB = new ArbolB(3);

        arbolB.insertar(arbolB, 16);
        arbolB.insertar(arbolB, 19);
        arbolB.insertar(arbolB, 7);
        arbolB.insertar(arbolB, 31);
        arbolB.insertar(arbolB, 24);

        System.out.println("Árbol B con sus primeras inserciones:");
        arbolB.imprimir(arbolB.raiz);
        System.out.println();

        System.out.println("Buscar nodo con el dato 3:");
        NodoArbolB nodoBuscado = arbolB.buscar(arbolB.raiz, 3);
        if (nodoBuscado != null) {
            arbolB.imprimirNodoEspecifico(arbolB, 3);
        } else {
            System.out.println("Dato no existente");
        }
        System.out.println();

        System.out.println("Árbol B antes de eliminar el dato 19:");
        arbolB.imprimir(arbolB.raiz);
        System.out.println("");
        arbolB.eliminarDato(arbolB, 19);
        System.out.println("Árbol B después de eliminar el dato 19:");
        arbolB.imprimir(arbolB.raiz);
        System.out.println();

        arbolB.insertar(arbolB, 15);
        arbolB.insertar(arbolB, 25);
        arbolB.insertar(arbolB, 100);
        arbolB.insertar(arbolB, 2);

        System.out.println("Árbol B después de nuevas inserciones:");
        arbolB.imprimir(arbolB.raiz);
        
        System.out.println("");
        
        arbolB.insertar(arbolB, 150);
        arbolB.insertar(arbolB, 250);
        arbolB.insertar(arbolB, 1005);
        arbolB.insertar(arbolB, 24);
        
        System.out.println("Árbol B después de más inserciones:");
        arbolB.imprimir(arbolB.raiz);
    }
}
