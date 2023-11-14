/**
 * Nuestro nodo raiz del arbol forma parte de un dato generico
 * Nos indica si nuestro arbol es binario
 * @author Alumno-68
 * @param <T> 
 */
public class Arbol <T> {
  private NodoArbol <T> raiz; 
  private boolean esBinario = false;

  /**
   * Se crea un constructor llamado Raiz y este se especifica si es binario o no
   * @param dato
   * @param esBinario 
   */
  public Arbol (T dato, boolean esBinario) {
    raiz = new NodoArbol <T> (dato);
    raiz.setEsBinario(esBinario);
    this.esBinario = esBinario;
  }  
  
  /**
   * Devuelve la raiz del arbol
   * @return 
   */
  public NodoArbol <T> obtenerRaiz() {
    return raiz;
  }

  /**
   * Devuelve si el arbol es binario o no
   * @return 
   */
  public boolean esBinario() {
    return esBinario;
  }

  /**
   * Agrega un nodo especificando el nodo raiz y el nodo a agregar, teniendo en cuenta si el arbol es binario o no
   * @param nodoRaiz
   * @param nodoAgregado 
   */
  public void agregarNodoArbol(NodoArbol <T> nodoRaiz, NodoArbol <T> nodoAgregado) {
    if (esBinario) {
      nodoAgregado.setEsBinario(esBinario);
    }

    nodoRaiz.agregarHijo(nodoAgregado);
  }

  /**
   * Se imprime el arbol dependiendo su tipo de recorrido
   * @param recorrido 
   */
  public void imprimirArbol(Recorrido recorrido) {
    switch (recorrido.ordinal()) {
      case 0:
        System.out.println("Prefijo: ");
        raiz.imprimirEnPrefijo();
        break;

      case 1:
        System.out.println("\nInfijo: ");
        raiz.imprimirEnInfijo();
        break;

      case 2:
        System.out.println("\nPosfijo: ");
        raiz.imprimirEnPosfijo();
        break;
    
      default:
        break;
    }
  }
  /**
   * 
   * @return 
   */
  public boolean estaVacio() {
        return raiz == null;
    }
  /**
 * 
 * @return 
 */
    public int obtenerAltura() {
        return obtenerAltura(raiz);
    }
/**
 * 
 * @param nodo
 * @return 
 */
    private int obtenerAltura(NodoArbol<T> nodo) {
        if (nodo == null) {
            return 0;
        } else {
            int alturaMaxima = 0;
            NodoArbol<T> hijo = nodo.obtenerPrimerHijo();
            while (hijo != null) {
                alturaMaxima = Math.max(alturaMaxima, obtenerAltura(hijo));
                hijo = hijo.obtenerSiguienteHermano();
            }
            return 1 + alturaMaxima;
        }
    }
/**
 * 
 * @param nodo 
 */
    public void imprimirSubArbol(NodoArbol<T> nodo) {
    if (nodo != null) {
      System.out.println("Subárbol a partir del nodo con dato: " + nodo.getDato());
      imprimirSubArbolRecursivo(nodo, 0);
    } else {
      System.out.println("El nodo proporcionado es nulo. No se puede imprimir el subárbol");
    }
  }
/**
 * 
 * @param nodo
 * @param nivel 
 */
  private void imprimirSubArbolRecursivo(NodoArbol<T> nodo, int nivel) {
    if (nodo != null) {
      System.out.println("Nivel " + nivel + ": " + nodo.getDato());

      NodoArbol<T> hijo = nodo.obtenerPrimerHijo();
      while (hijo != null) {
        imprimirSubArbolRecursivo(hijo, nivel + 1);
        hijo = hijo.obtenerSiguienteHermano();
      }
    }
  }
}
