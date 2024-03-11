package Algoritmos_Basicos;

public class MultiplicacionDeDosNumeroConRecursividad {
    public static int multiplicar(int a, int b){
        if(a > 1){
            return b + multiplicar(a - 1,b);
        }
        return b;
    }
    public static void main(String[] args) {
        System.out.println(multiplicar(10,6));
    }
}