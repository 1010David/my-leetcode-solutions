package com.project.leetcode_solutions.easy.algorithms.palindromeNumber;

/**
 * Determina si un número entero es un palíndromo.
 * <p>
 * Un palíndromo es un número que se lee igual de izquierda a derecha que de derecha a izquierda.
 * Por ejemplo, 121 es un palíndromo, mientras que 123 no lo es.
 * <p>
 * **Ejemplo 1:**
 * Entrada: x = 121
 * Salida: true
 * <p>
 * **Ejemplo 2:**
 * Entrada: x = -121
 * Salida: false
 * Explicación: Los números negativos no son palíndromos.
 * <p>
 * **Ejemplo 3:**
 * Entrada: x = 10
 * Salida: false
 * Explicación: Los números que terminan en 0 (excepto el 0) y no son 0 no son palíndromos.
 *
 */

class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        int reversed = 0;
        int original = x;

        while (x > 0) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x /= 10;
        }

        return original == reversed;
    }
}
