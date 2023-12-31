/**
 * 
 * @author Alumno
 */
public class Main {
    public static void main (String[] args){
        //Arbol binario
        Arbol <String> arbol= new Arbol <> ("A", false);
        
        NodoArbol <String> nodoB = new NodoArbol ("B");
        NodoArbol <String> nodoC = new NodoArbol ("C");
        NodoArbol <String> nodoD = new NodoArbol ("D");
        NodoArbol <String> nodoE = new NodoArbol ("E");
        NodoArbol <String> nodoF = new NodoArbol ("F");
        NodoArbol <String> nodoG = new NodoArbol ("G");
        NodoArbol <String> nodoH = new NodoArbol ("H");
        NodoArbol <String> nodoI = new NodoArbol ("I");
        NodoArbol <String> nodoJ = new NodoArbol ("J");
        NodoArbol <String> nodoK = new NodoArbol ("K");
        NodoArbol <String> nodoL = new NodoArbol ("L");
        NodoArbol <String> nodoM = new NodoArbol ("M");
        NodoArbol <String> nodoN = new NodoArbol ("N");
        NodoArbol <String> nodoO = new NodoArbol ("O");
        NodoArbol <String> nodoP = new NodoArbol ("P");
        NodoArbol <String> nodoQ = new NodoArbol ("Q");
        
        
        arbol.agregarNodoArbol(arbol.obtenerRaiz(),nodoB);
        arbol.agregarNodoArbol(arbol.obtenerRaiz(),nodoC);
        arbol.agregarNodoArbol(arbol.obtenerRaiz(),nodoD);
        
        arbol.agregarNodoArbol(nodoB, nodoE);
        arbol.agregarNodoArbol(nodoB, nodoF);
        
        arbol.agregarNodoArbol(nodoF, nodoJ);
        arbol.agregarNodoArbol(nodoF, nodoK);
        arbol.agregarNodoArbol(nodoF, nodoL);
        
        arbol.agregarNodoArbol(nodoD, nodoG);
        arbol.agregarNodoArbol(nodoD, nodoH);
        arbol.agregarNodoArbol(nodoD, nodoI);
        
        arbol.agregarNodoArbol(nodoG, nodoM);
        
        arbol.agregarNodoArbol(nodoM, nodoP);
        arbol.agregarNodoArbol(nodoM, nodoQ);
        
        arbol.agregarNodoArbol(nodoI, nodoN);
        arbol.agregarNodoArbol(nodoI, nodoO);
        
        System.out.println("¿El árbol está vacío? " + arbol.estaVacio());
        System.out.println("Altura del árbol: " + arbol.obtenerAltura());

        System.out.println("\nImprimir subárbol:");
        arbol.imprimirSubArbol(arbol.obtenerRaiz().obtenerPrimerHijo());
        
        arbol.imprimirArbol(Recorrido.PREFIJO);
        
       
        arbol.imprimirArbol(Recorrido.INFIJO);
        
        
        arbol.imprimirArbol(Recorrido.POSFIJO);
        
        
    }
    
}
