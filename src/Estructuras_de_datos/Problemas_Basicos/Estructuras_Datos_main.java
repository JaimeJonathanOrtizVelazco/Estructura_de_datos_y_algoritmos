package Estructuras_de_datos.Problemas_Basicos;

public class Estructuras_Datos_main {
    public static void main(String[] args) {
        System.out.println(11/2);
        System.out.println(Palindromo.isPalindrome("asdfafdsa"));
    }

    public static void function(int[] values){
        int max  = values[0];
        int min  = values[0];
        int total = 0;
        for (int i = 1 ; i < values.length ; i++){
            if (values[i] > max){
                max = values[i];
            }else if(values[i] < min){
                min = values[i];
            }
            total+= values[i];
        }
        System.out.println("El valor maximo es: "+ max);
        System.out.println("El valor minimo es: "+ min);
        System.out.println("El valor promedio es: "+ total/values.length);

    }
}