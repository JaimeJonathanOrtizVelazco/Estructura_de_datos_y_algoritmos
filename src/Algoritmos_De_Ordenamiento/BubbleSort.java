package Algoritmos_De_Ordenamiento;

import java.util.Arrays;

public class BubbleSort {
    // Bubble sort cambia el valor de v[i] por v[i+1] si este ultimo es menor que v[i].
    // Colocando los valores mas grandes hasta el final del arreglo.
    // Con esto podemos evitar iterar hasta el ultimo valor mas alto del arreglo, es decir, como
    // los valores mas grandes estan hasta al final de manera ordenada, ya necesitamos validar esos valores
    public static void sort(int [] values){
        int size = values.length - 1;
        boolean ordered = false;
        int lastIndex = size;
        while(!ordered){
            ordered = true;
            for (int j = 0; j <  lastIndex; j++){
                if (values[j] > values[j+1]){
                    int temp = values[j];
                    values[j] = values[j+1];
                    values[j+1] = temp;
                    ordered = false;
                }
            }
            lastIndex --;
            System.out.println(Arrays.toString(values));
        }
    }

    public static void main(String[] args) {
        int[] values = {2,7,1,4,3,5,0,8,2,-1,2};
        sort(values);
        System.out.println(Arrays.toString(values));
    }
}