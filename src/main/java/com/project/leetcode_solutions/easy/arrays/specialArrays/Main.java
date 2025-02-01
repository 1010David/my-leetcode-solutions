package com.project.leetcode_solutions.easy.arrays.specialArrays;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Ejemplo 1
        int[] nums1 = {1};
        System.out.println("Ejemplo 1:");
        System.out.println("Entrada: nums = " + Arrays.toString(nums1));
        System.out.println("Salida: " + solution.isArraySpecial(nums1));
        System.out.println("Explicación: Solo hay un elemento, por lo que la respuesta es true.\n");

        // Ejemplo 2
        int[] nums2 = {2, 1, 4};
        System.out.println("Ejemplo 2:");
        System.out.println("Entrada: nums = " + Arrays.toString(nums2));
        System.out.println("Salida: " + solution.isArraySpecial(nums2));
        System.out.println("Explicación: Los pares (2,1) y (1,4) tienen paridad diferente, por lo que la respuesta es true.\n");

        // Ejemplo 3
        int[] nums3 = {4, 3, 1, 6};
        System.out.println("Ejemplo 3:");
        System.out.println("Entrada: nums = " + Arrays.toString(nums3));
        System.out.println("Salida: " + solution.isArraySpecial(nums3));
        System.out.println("Explicación: Los elementos nums[1] y nums[2] son impares, por lo que la respuesta es false.\n");
    }
}

