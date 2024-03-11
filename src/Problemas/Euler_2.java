package Problemas;

public class Euler_2 {
    //    Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with  and
//    , the first terms will be: By considering the terms in the Fibonacci sequence whose values do not exceed four million,
//    find the sum of the even-valued terms.
    public static long sum_Even_Fibonnaci(int previous, int actual) {
        System.out.println(actual);
        long sum = 0;
        if(actual < 4000000){
            if(actual % 2 == 0){
                sum = actual + sum_Even_Fibonnaci(actual, previous + actual);
            }else{
                sum = sum_Even_Fibonnaci(actual, previous + actual);
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Final sum:" + sum_Even_Fibonnaci(0,1));
    }
}