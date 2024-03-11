package Algoritmos_Basicos;

public class EsNumeroPerfecto {
    public static void Perfecto(int a){
        int val = 0;
        for (int i = a/2; i >=1 ; i--){
            if(a % i == 0){
                val += i;
            }
            if (val > a) break;
        }
        if (val != a){
            System.out.println("No es perfecto");
        }else {
            System.out.println("Es perfecto");
        }
    }
}