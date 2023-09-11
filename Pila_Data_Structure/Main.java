package Pila_StructureData;
/**
 *
 * @author carel
 */
public class Main {

    public static void main(String[] args) {

        Pila miPila = new Pila();

        int[] numeros = {14, 27, 1, 15, 10, 90, 71, 37, 2, 46};

        for (int numero : numeros) {
            miPila.insertar(numero);
        }
        System.out.println("Tamanio de la pila: " + miPila.getTamanio());

        for (int i = 0; i < 4; i++) {
            miPila.quitar();
        }
        System.out.println("Elemento de la cima de la pila: " + miPila.obtenerCima());

        miPila.vaciar();

        System.out.println("La pila esta vacia: " + miPila.estaVacia());
    }
}
