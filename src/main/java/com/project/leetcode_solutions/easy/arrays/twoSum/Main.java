package com.project.leetcode_solutions.easy.arrays.twoSum;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solucion = new Solution();

        // Ejemplo 1
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        int[] resultado1 = solucion.twoSum(nums1, target1);
        System.out.println("Ejemplo 1:");
        System.out.println("Entrada: nums = " + Arrays.toString(nums1) + ", objetivo = " + target1);
        System.out.println(" Salida: " + Arrays.toString(resultado1));
        System.out.println(" Explicación: Como nums[0] + nums[1] == 9, devolvemos [0, 1].");

        // Ejemplo 2
        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        int[] resultado2 = solucion.twoSum(nums2, target2);
        System.out.println("Ejemplo 2:");
        System.out.println("Entrada: nums = " + Arrays.toString(nums2) + ", objetivo = " + target2);
        System.out.println(" Salida: " + Arrays.toString(resultado2));

        // Ejemplo 3
        int[] nums3 = {3, 3};
        int target3 = 6;
        int[] resultado3 = solucion.twoSum(nums3, target3);
        System.out.println("Ejemplo 3:");
        System.out.println("Entrada: nums = " + Arrays.toString(nums3) + ", objetivo = " + target3);
        System.out.println(" Salida: " + Arrays.toString(resultado3));
    }
}