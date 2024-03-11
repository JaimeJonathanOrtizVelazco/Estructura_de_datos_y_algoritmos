package Algoritmos_De_Ordenamiento;

import java.util.Arrays;

public class InsertionSort {
    public static void sort(int[] values){
        int temp = 0;
        int size = values.length;
        for (int i = 1; i< size; i++){
            temp = values[i];
            int j;
            for (j = i -1; j >=0 && values[j] > temp; j--){
                values[j + 1] = values[j];
            }
            values[j+1] = temp;
        }
    }

    public static void main(String[] args) {
        int[] values = {2,7,1,4,3,5,0,8,2,-1,2};
        sort(values);
        System.out.println(Arrays.toString(values));
    }
}