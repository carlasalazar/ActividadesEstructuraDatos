package Pila_StructureData;

/**
 *
 * @author carel
 */
public class Pila {
    private Nodo cima;
    private int tamanio;
  
   
   public boolean estaVacia(){
       return cima== null;
   }
   
   public void insertar(int dato){
       Nodo nodoNuevo = new Nodo();
       nodoNuevo.setDato(dato);
       if(cima==null){
           cima=nodoNuevo;
       }else{
           nodoNuevo.setNodo(cima);
           cima=nodoNuevo;
       }
       tamanio++;
   }
   
   public Integer quitar(){
       if(cima == null){
           System.out.println("La pila esta vacia");
           return null;
       }else{
           Integer datoCima = cima.getDato();
           cima = cima.getNodo();
           tamanio--;
           return datoCima;
       }
   }
   
   public int getTamanio(){
       return tamanio;
   }
   
   public void vaciar(){
       cima=null;
       tamanio=0;
   }
   
   public Integer obtenerCima(){
       if(cima == null){
           System.out.println("La pila se encuentra vacia");
           return null;
       }else{
           return cima.getDato();
       }
       
       
   }
   
   
}

