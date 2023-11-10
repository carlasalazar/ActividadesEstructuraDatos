public class NodoArbol <T> {

    private T dato;//Dato generico almacenado en el nodo
  private boolean esBinario = false;//Indica si el nodo es binario
  private NodoArbol <T> primerHijo;//Primer hijo del arbol
  private NodoArbol <T> siguienteHermano;//Siguiente hermano del arbol

  //El contructor crea un nuevo nodo con un dato, tanto el hijo como el hermano son nulos
  public NodoArbol (T dato) {
    this.dato = dato;
    primerHijo = null;
    siguienteHermano = null;
  }

  //Se agrega un hijo al nodo actual
  public void agregarHijo (NodoArbol <T> hijo) {
    if (primerHijo == null) {//Si el nodo actual no tiene un hijo, el nodo nuevo ahora es el primer hijo
      primerHijo = hijo;
    } else {
      NodoArbol<T> hermano = this.primerHijo;
   //Si el arbol es binario, se tiene que comprobar si este ya tiene un hijo
      if (esBinario) {
        if (hermano.siguienteHermano != null) {
          System.err.println("El nodo ya tiene un hijo, no se debe agregar " + hijo.getDato());	
        } else {
          hermano.siguienteHermano = hijo;
        }
      } else {//Si el arbol no es binario, se busca el ultimo hermano y se agrega el nuevo nodo como su siguiente hermano
        while (hermano.siguienteHermano != null) {
          hermano = hermano.siguienteHermano;
        }
        hermano.siguienteHermano = hijo;
      }      
    }
  }

  public NodoArbol<T> obtenerPrimerHijo () {
    return primerHijo;
  }

  public NodoArbol<T> obtenerSiguienteHermano () {
    return siguienteHermano;
  }

  public T getDato () {
    return dato;
  }

  public boolean esBinario () {
    return esBinario;
  }

  public void setEsBinario (boolean esBinario) {
    this.esBinario = esBinario;
  }
//Todos estos metodos nos sirven para imprimir el arbol en los tres tipos de recorridos
  public void imprimirEnPrefijo() {
    System.out.print(dato + "\t");
    NodoArbol<T> hijo = primerHijo;

    while (hijo != null) {
      hijo.imprimirEnPrefijo();
      hijo = hijo.siguienteHermano;
    }
  }

  public void imprimirEnInfijo() {
    NodoArbol<T> hijo = primerHijo;

    if (hijo != null) {
      hijo.imprimirEnInfijo();
    }

    System.out.print(dato + "\t");
    while (hijo != null) {
      hijo = hijo.siguienteHermano;
      if (hijo != null) {
        hijo.imprimirEnInfijo();
      }
    }
  }

  public void imprimirEnPosfijo() {
    NodoArbol<T> hijo = primerHijo;

    while (hijo != null) {
      hijo.imprimirEnPosfijo();
      hijo = hijo.siguienteHermano;
    }

    System.out.print(dato + "\t");
  }
}
