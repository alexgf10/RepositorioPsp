package ej1;

public class Hilo2 extends Thread {
    private String nombre;

    public Hilo2(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) { // Bucle con las interacciones
            System.out.println(getNombre() + " - Iteración " + i);
            try {

                Thread.sleep(100); // Pausa de 100 milisegundos
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
