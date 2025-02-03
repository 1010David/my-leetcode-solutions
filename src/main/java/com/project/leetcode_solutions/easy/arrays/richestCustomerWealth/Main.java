package com.project.leetcode_solutions.easy.arrays.richestCustomerWealth;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Ejemplo 1
        int[][] accounts1 = {{1, 2, 3}, {3, 2, 1}};
        int maxWealth1 = solution.maximumWealth(accounts1);
        System.out.println("Ejemplo 1: Máxima riqueza = " + maxWealth1);

        // Ejemplo 2
        int[][] accounts2 = {{1, 5}, {7, 3}, {3, 5}};
        int maxWealth2 = solution.maximumWealth(accounts2);
        System.out.println("Ejemplo 2: Máxima riqueza = " + maxWealth2);

        // Ejemplo 3
        int[][] accounts3 = {{2, 8, 7}, {7, 1, 3}, {1, 9, 5}};
        int maxWealth3 = solution.maximumWealth(accounts3);
        System.out.println("Ejemplo 3: Máxima riqueza = " + maxWealth3);
    }
}