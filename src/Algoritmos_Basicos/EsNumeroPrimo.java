package Algoritmos_Basicos;

public class EsNumeroPrimo {
    public static void primo(int a){
        boolean prime = true;
        for (int i = 2; i < a/2; i++){
            if (a % i == 0) {
                prime = false;
                break;
            }
        }

        if(prime)
            System.out.println("Es primo");
        else
            System.out.println("No es primo");
    }
}