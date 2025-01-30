package com.project.leetcode_solutions.easy.arrays;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    /**
     * 1. Dos sumas
     * Dado un array de enteros nums y un entero target,
     * devuelve los índices de los dos números que suman target.
     * Puedes asumir que cada entrada tendrá exactamente una solución,
     * y no puedes usar el mismo elemento dos veces.
     * Puedes devolver la respuesta en cualquier orden.
     *
     * Ejemplos:
     *
     * <pre>
     * Ejemplo 1:
     * Entrada: nums = [2,7,11,15], target = 9
     * Salida: [0,1]
     * Explicación: Como nums[0] + nums[1] == 9, devolvemos [0, 1].
     * </pre>
     *
     * <pre>
     * Ejemplo 2:
     * Entrada: nums = [3,2,4], target = 6
     * Salida: [1,2]
     * </pre>
     *
     * <pre>
     * Ejemplo 3:
     * Entrada: nums = [3,3], target = 6
     * Salida: [0,1]
     * </pre>
     *
     * @param nums   El array de números enteros.
     * @param target El entero objetivo.
     * @return Un array de dos índices que suman target.
     */

    public int[] twoSum(int[] nums, int target) {
        // Creamos un HashMap para almacenar los números y sus índices.
        // La clave será el número y el valor será su índice en el array nums.
        Map<Integer, Integer> map = new HashMap<>();

        // Iteramos sobre el array nums.
        for (int i = 0; i < nums.length; i++) {
            // Calculamos el complemento: el número que necesitamos para llegar al target.
            int complement = target - nums[i];

            // Verificamos si el complemento ya está en el mapa.
            // Si está, significa que ya encontramos los dos números que suman el target.
            if (map.containsKey(complement)) {
                // Devolvemos un nuevo array con los índices del complemento y el número actual.
                return new int[]{map.get(complement), i};
            }

            // Si el complemento no está en el mapa, agregamos el número actual y su índice al mapa.
            // Esto nos permite verificar rápidamente en futuras iteraciones si ya hemos visto el complemento.
            map.put(nums[i], i);
        }

        // Si llegamos hasta aquí sin encontrar una solución, lanzamos una excepción.
        // Esto indica que no hay dos números en el array que sumen el target.
        throw new IllegalArgumentException("No solution found");
    }
}