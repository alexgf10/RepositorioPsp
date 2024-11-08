package ej2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Jugador extends Thread {
    private final String nombre;
    private final List<Integer> resultados; // Lista de resultados
    private final Random random = new Random();
    private int lanzamientos = 0;

    public Jugador(String nombre) { // Constructor
        this.nombre = nombre;
        this.resultados = new ArrayList<>();
    }

    @Override
    public void run() {
        if (lanzamientos < 5) {
            int lanzamiento = random.nextInt(6) + 1; // Generacion de lanzamientos
            resultados.add(lanzamiento); // Añadimos los lanzamientos a resultado
            lanzamientos++;
            System.out.println(nombre + " lanzó: " + lanzamiento);
        } else {
            int total = resultados.stream().mapToInt(Integer::intValue).sum(); // Añadimos el total acumulado de los resultados con un mapa
            System.out.println(nombre + " total acumulado: " + total);
        }
    }
}
