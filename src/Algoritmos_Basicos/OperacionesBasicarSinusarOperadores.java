package Algoritmos_Basicos;

public class OperacionesBasicarSinusarOperadores {
    // Como restar un numero de otro sin usar el operador de resta
    public static void restaSinOperador() {
        int a = 5;
        int b = 1;

        int c = 0;
        System.out.print(a + " - " + b + " = ");
        for (; a > b; b++) {
            c++;
        }
        System.out.print(c);
        System.out.println();
    }

    // Como multiplicar sin utilizar la operacion de multiplicar
    public static void multiplicarSinOperador() {
        int a = 5;
        int b = 3;
        int min = a < b ? a : b;
        int max = a > b ? a : b;
        int c = 0;
        System.out.print(a + " * " + b + " = ");
        for (int i = 0; i < min; i++) {
            c += max;
        }
        System.out.print(c);
        System.out.println();
    }

    // Como dividir sin tener que usar el operador de divison
    public static void dividirSinOperador() {
        // dividendo
        int a = 100;
        // divisor
        int b = 5;
        int c = 0;
        System.out.print(a + " / " + b + " = ");
        while (a > 0) {
            a -= b;
            c ++;
        }
        System.out.print(c);
        System.out.println();
    }

    // Como obtener la potencia de un numero sin utilizat el operador de potencia
    public static int potenciaSinOperador(int a, int b){
        int c = a;
        System.out.print(a + " ^ " + b + " = ");
        for(int i = 1; i<b;i++){
            c *= a;
        }
        System.out.print(c);
        System.out.println();
        return c;
    }

    // Como obtener el factorial de un numero
    public static void factorial(){
        int b = 5;
        int c = 1;
        for (int i = 2; i <= b; i++) {
            c *= i;
        }
        System.out.println("Factorial de " + b + " = " + c);
    }
}