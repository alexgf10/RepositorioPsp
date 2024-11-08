package ej2;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(3); // Creamos el ScheduledExecutorService

        // Creación de jugadores hechos con executorService
        executorService.scheduleAtFixedRate(new Jugador("Jugador 1"), 0, 1, TimeUnit.SECONDS);
        executorService.scheduleAtFixedRate(new Jugador("Jugador 2"), 0, 1, TimeUnit.SECONDS);
        executorService.scheduleAtFixedRate(new Jugador("Jugador 3"), 0, 1, TimeUnit.SECONDS);
        executorService.scheduleAtFixedRate(new Jugador("Jugador 4"), 0, 1, TimeUnit.SECONDS);
        executorService.scheduleAtFixedRate(new Jugador("Jugador 5"), 0, 1, TimeUnit.SECONDS);

        // Termina el ExecutorService después de 6 segundos
        executorService.schedule(() -> {
            executorService.shutdown();
            System.out.println("Finalizando lanzamientos...");
        }, 6, TimeUnit.SECONDS);
    }
}
