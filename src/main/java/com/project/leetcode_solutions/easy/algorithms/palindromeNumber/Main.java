package com.project.leetcode_solutions.easy.algorithms.palindromeNumber;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Ejemplo 1
        int x1 = 121;
        System.out.println("Ejemplo 1:");
        System.out.println("Entrada: x = " + x1);
        System.out.println("Salida: " + solution.isPalindrome(x1));
        System.out.println("Explicación: 121 se lee como 121 de izquierda a derecha y de derecha a izquierda.");
        System.out.println("**************************************");

        // Ejemplo 2
        int x2 = -121;
        System.out.println("Ejemplo 2:");
        System.out.println("Entrada: x = " + x2);
        System.out.println("Salida: " + solution.isPalindrome(x2));
        System.out.println("Explicación: De izquierda a derecha, se lee -121. De derecha a izquierda, se convierte en 121-. Por lo tanto, no es un palíndromo.");
        System.out.println("**************************************");

        // Ejemplo 3
        int x3 = 10;
        System.out.println("Ejemplo 3:");
        System.out.println("Entrada: x = " + x3);
        System.out.println("Salida: " + solution.isPalindrome(x3));
        System.out.println("Explicación: Lee 01 de derecha a izquierda. Por lo tanto, no es un palíndromo.");
    }
}