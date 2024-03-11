package Estructuras_de_datos.Problemas_Basicos;

public class Recursividad {
    public static void countDown(int number) {
        System.out.println(number);
        if (number > 0) {
            countDown(number - 1);
        } else {
            System.out.println("BOOM");
        }
    }

    public static void main(String[] args) {
        countDown(5);
    }
}