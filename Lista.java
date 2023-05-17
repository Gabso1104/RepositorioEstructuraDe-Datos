import java.util.List;
import java.util.ArrayList;

public class Lista{
    public static void main(String[] args) {
        // Crear una lista de enteros
        List<Integer> numeros = new ArrayList<>();

        // Agregar elementos a la lista
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);

        // Acceder a elementos por índice
        System.out.println("Elemento en el índice 0: " + numeros.get(0));
        System.out.println("Elemento en el índice 1: " + numeros.get(1));
        System.out.println("Elemento en el índice 2: " + numeros.get(2));

        // Tamaño de la lista
        System.out.println("Tamaño de la lista: " + numeros.size());

        // Verificar si la lista está vacía
        System.out.println("¿La lista está vacía? " + numeros.isEmpty());

        // Eliminar un elemento por valor
        numeros.remove(Integer.valueOf(20));

        // Iterar sobre la lista e imprimir los elementos
        System.out.println("Elementos de la lista:");
        for (int numero : numeros) {
            System.out.println(numero);
        }

        // Eliminar todos los elementos de la lista
        numeros.clear();

        // Verificar nuevamente si la lista está vacía
        System.out.println("¿La lista está vacía ahora? " + numeros.isEmpty());
     }
}