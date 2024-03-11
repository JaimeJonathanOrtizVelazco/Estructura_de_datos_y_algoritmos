package Algoritmos_Basicos;

public class NumeroEsGuay {
    public static void isNumberGuay(int number){
        int sumNumbers = 0;
        int i = 1;
        while (sumNumbers < number){
            sumNumbers += i++;
        }
        if(sumNumbers == number)
            System.out.println("Guay");
        else
            System.out.println("No Guay");
    }
}