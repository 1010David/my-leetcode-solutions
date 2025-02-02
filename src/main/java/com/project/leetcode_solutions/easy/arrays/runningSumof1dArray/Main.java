package com.project.leetcode_solutions.easy.arrays.runningSumof1dArray;


public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Ejemplo 1
        int[] nums1 = {1, 2, 3, 4};
        int[] runningSum1 = solution.runningSum(nums1);
        System.out.println("Ejemplo 1:");
        System.out.println("Entrada: nums = " + java.util.Arrays.toString(nums1));
        System.out.println("Salida: " + java.util.Arrays.toString(runningSum1));
        System.out.println("Explicación: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].\n");

        // Ejemplo 2
        int[] nums2 = {1, 1, 1, 1, 1};
        int[] runningSum2 = solution.runningSum(nums2);
        System.out.println("Ejemplo 2:");
        System.out.println("Entrada: nums = " + java.util.Arrays.toString(nums2));
        System.out.println("Salida: " + java.util.Arrays.toString(runningSum2));
        System.out.println("Explicación: Running sum is obtained as follows: [1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1].\n");

        // Ejemplo 3
        int[] nums3 = {3, 1, 2, 10, 1};
        int[] runningSum3 = solution.runningSum(nums3);
        System.out.println("Ejemplo 3:");
        System.out.println("Entrada: nums = " + java.util.Arrays.toString(nums3));
        System.out.println("Salida: " + java.util.Arrays.toString(runningSum3));
        System.out.println("Explicación: Running sum is obtained as follows: [3, 4, 6, 16, 17].\n");
    }
}