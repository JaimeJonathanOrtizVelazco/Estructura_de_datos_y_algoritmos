package Algoritmos_Basicos;

public class FactorialDeUnNumero {

    public static int factorial(int number) {
        if (number > 1) {
            number = number * factorial(number - 1);
        }
        return number;
    }

    public static void main(String[] args) {
        int numFact = 5;
        int factor = factorial(numFact);
        System.out.println("El factor del numero " + numFact + " es: " + factor);
    }
}