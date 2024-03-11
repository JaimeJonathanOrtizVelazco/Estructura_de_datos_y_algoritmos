package Algoritmos_Basicos;

public class TorreDeHanoi {
    public static void play(int n, int source, int destination, int aux) {
        if (n > 0) {
            play(n - 1, source, aux, destination);
            System.out.println("Disk from " + source + " to " + destination);
            play(n - 1, aux, destination, source);
        }
    }

    public static void main(String[] args) {
        play(4, 1,3,2);
    }
}