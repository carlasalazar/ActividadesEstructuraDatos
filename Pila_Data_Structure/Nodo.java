package Pila_StructureData;
/**
 *
 * @author carel
 */
public class Nodo {
    private Integer dato;
    private Nodo nodo;
    
    public Nodo(){
        this.dato=null;
        this.nodo=null;
    }
    
    public int getDato(){
        return dato;
    }
    
    public void setDato(int dato){
        this.dato=dato;
    }
    
    public Nodo getNodo(){
        return nodo;
    }
    
    public void setNodo(Nodo nodo){
        this.nodo= nodo;
    }
}
