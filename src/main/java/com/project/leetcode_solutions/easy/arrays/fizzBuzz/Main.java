package com.project.leetcode_solutions.easy.arrays.fizzBuzz;


import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Ejemplo 1
        int n = 3;
        List<String> result = solution.fizzBuzz(n);
        System.out.println("Resultado para n = " + n + ": " + result);

        // Ejemplo 2
        n = 5;
        result = solution.fizzBuzz(n);
        System.out.println("Resultado para n = " + n + ": " + result);

        // Ejemplo 3
        n = 15;
        result = solution.fizzBuzz(n);
        System.out.println("Resultado para n = " + n + ": " + result);
    }
}
