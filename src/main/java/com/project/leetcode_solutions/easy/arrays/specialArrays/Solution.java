package com.project.leetcode_solutions.easy.arrays.specialArrays;

/**
 *Una matriz se considera especial si cada par de sus elementos adyacentes contiene dos números con paridad diferente.
 * Se le proporciona una matriz de números enteros nums. Devuelva truesi numses una matriz especial ; de lo contrario, devuelva false.
 * p
 * Ejemplo 1:
 * Entrada: nums = [1]
 * Salida: verdadero
 * Explicación:
 * Solo hay un elemento, por lo que la respuesta es true.
 * p
 * Ejemplo 2:
 * Entrada: nums = [2,1,4]
 * Salida: verdadero
 * Explicación:
 * Solo hay dos pares: (2,1)y (1,4), y ambos contienen números con diferente paridad. Por lo tanto, la respuesta es true.
 * p
 * Ejemplo 3:
 * Entrada: nums = [4,3,1,6]
 * Salida: falso
 * Explicación:
 * nums[1]y nums[2]ambos son impares. Por lo tanto, la respuesta es false.
 * Restricciones:
 * 1 <= nums.length <= 100
 * 1 <= nums[i] <= 100
 */

class Solution {
    public boolean isArraySpecial(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if ((nums[i] % 2 == 0 && nums[i + 1] % 2 == 0) || (nums[i] % 2 != 0 && nums[i + 1] % 2 != 0)) {
                return false; // Si encontramos dos pares o dos impares seguidos, retornamos false
            }
        }
        return true; // Si no encontramos problemas, retornamos true
    }

}

