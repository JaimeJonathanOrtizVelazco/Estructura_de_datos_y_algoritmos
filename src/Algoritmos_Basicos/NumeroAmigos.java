package Algoritmos_Basicos;

public class NumeroAmigos {
    // Básicamente un numero amigo es un numero cuya suma de los divisores es igual a la suma de los divisores de otro numero
    public static void Amigos(){
        int a  = 1184;
        int b = 1210;

        int sumA = 0;
        for (int i = 1; i<= a /2; i++){
            if(a%i == 0) sumA+=i;
        }

        int sumB = 0;
        for (int i = 1; i<= b /2; i++){
            if(b%i == 0) sumB+=i;
        }

        if (sumA == b && sumB == a) System.out.println("Son amigos");
        else System.out.println("No son amigos");
    }
}