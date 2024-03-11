package Algoritmos_De_Ordenamiento;

import java.util.Arrays;

public class SelectionSort {
    // Este algoritmo lo que hace es ir moviéndose indice por indice e ir colocando en orden el valor
    // mas pequeño que vaya encontrando en el arreglo
    public static void sort(int[] values){
        int temp = 0;
        int size = values.length;
        int minValIndex = 0;
        for (int i = 0; i < size; i++){
            minValIndex = i;
            for (int j = i+1; j < size; j++){
                if(values[j] < values[minValIndex]){
                    minValIndex = j;
                }
            }
            temp = values[i];
            values[i] = values[minValIndex];
            values[minValIndex] = temp;
        }
    }

    public static void main(String[] args) {
        int[] values = {2,7,1,4,3,5,0,8,2,-1,2};
        sort(values);
        System.out.println(Arrays.toString(values));
    }
}