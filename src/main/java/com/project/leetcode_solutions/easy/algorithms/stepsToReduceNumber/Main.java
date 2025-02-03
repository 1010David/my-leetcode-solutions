package com.project.leetcode_solutions.easy.algorithms.stepsToReduceNumber;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Ejemplo 1
        int num1 = 14;
        int steps1 = solution.numberOfSteps(num1);
        System.out.println("Ejemplo 1: Número de pasos para " + num1 + " = " + steps1);

        // Ejemplo 2
        int num2 = 8;
        int steps2 = solution.numberOfSteps(num2);
        System.out.println("Ejemplo 2: Número de pasos para " + num2 + " = " + steps2);

        // Ejemplo 3
        int num3 = 123;
        int steps3 = solution.numberOfSteps(num3);
        System.out.println("Ejemplo 3: Número de pasos para " + num3 + " = " + steps3);

    }
}