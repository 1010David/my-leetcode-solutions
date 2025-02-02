package com.project.leetcode_solutions.easy.algorithms.addTwoIntegers;


public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Ejemplo 1
        int num1_1 = 12;
        int num2_1 = 5;
        int result1 = solution.sum(num1_1, num2_1);
        System.out.println("Ejemplo 1:");
        System.out.println("Entrada: num1 = " + num1_1 + ", num2 = " + num2_1);
        System.out.println("Salida: " + result1);
        System.out.println("Explicación: num1 is 12, num2 is 5, and their sum is 12 + 5 = 17, so 17 is returned.\n");

        // Ejemplo 2
        int num1_2 = -10;
        int num2_2 = 4;
        int result2 = solution.sum(num1_2, num2_2);
        System.out.println("Ejemplo 2:");
        System.out.println("Entrada: num1 = " + num1_2 + ", num2 = " + num2_2);
        System.out.println("Salida: " + result2);
        System.out.println("Explicación: num1 + num2 = -6, so -6 is returned.\n");
    }
}