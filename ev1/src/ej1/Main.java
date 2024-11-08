package ej1;


public class Main {
    public static void main(String[] args) { // Hacemos la prueba con más tipos de hilos D,E,F y vemos que funciona intercaladamente
        Thread hiloA = new Hilo1("Hilo A");
        Thread hiloB = new Hilo2("Hilo B");
        Thread hiloC = new Hilo3("Hilo C");
        Thread hiloD = new Hilo1("Hilo D");
        Thread hiloE = new Hilo2("Hilo E");
        Thread hiloF = new Hilo3("Hilo F");

        hiloA.start();
        hiloB.start();
        hiloC.start();
        hiloD.start();
        hiloE.start();
        hiloF.start();


    }
}