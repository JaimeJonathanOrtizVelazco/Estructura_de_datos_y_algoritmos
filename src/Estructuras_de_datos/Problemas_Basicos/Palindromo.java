package Estructuras_de_datos.Problemas_Basicos;

public class Palindromo {
    public static boolean isPalindrome(String word) {
        int size = word.length();
        for (int i = 0; i < size / 2; i++) {
            if (word.charAt(i) != word.charAt(size - 1 -i)) return false;
        }
        return true;
    }
}