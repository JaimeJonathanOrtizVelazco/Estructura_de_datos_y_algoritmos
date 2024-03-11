package Estructuras_de_datos.Matrices;

import Algoritmos_Basicos.OperacionesBasicarSinusarOperadores;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Matrices {
    public static void main(String[] args) {
        int [][] array = new int[9][3];

        for (int i = 0; i < 9; i++){
            for (int j = 0; j < 3 ; j++){
                array[i][j] = OperacionesBasicarSinusarOperadores.potenciaSinOperador(i+1, j+1);
            }
        }
        System.out.println(Arrays.toString(array));
    }
}