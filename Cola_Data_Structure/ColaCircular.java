/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Nodo;

/**
 *
 * @author carel
 */
public class ColaCircular {
    private Nodo frente;
    private Nodo atras;
    private int longitud;
        
    public ColaCircular() {
        frente = null;
        atras = null;
        longitud = 0;
    }
    
    public void insertar(int dato) {
        Nodo nuevoNodo = new Nodo(dato);
        if (estaVacia()) {
        frente = nuevoNodo;
        atras = nuevoNodo;
        atras.setSiguiente(frente);
        } else {
                atras.setSiguiente(nuevoNodo);
                atras = nuevoNodo;
                atras.setSiguiente(frente);
        }
            longitud++;
    }
    
    public void eliminar() {
        if (!estaVacia()) {
            if (frente == atras) {
            frente = null;
            atras = null;
            } else {
                    frente = frente.getSiguiente();
                    atras.setSiguiente(frente);
            }
                longitud--;
        }
    }
    
    public boolean estaVacia() {
        return frente == null;
    }
    
    public Nodo getFrente() {
        return frente;
    }
    
    public Nodo getAtras() {
        return atras;
    }
    
    public int getLongitud() {
        return longitud;
    }
    
}
