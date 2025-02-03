# Suma Acumulada de un Arreglo
## Descripción del Problema
Dado un arreglo de números enteros, se requiere calcular la suma acumulada de cada elemento. La suma acumulada en un índice i es la suma de todos los elementos desde el índice 0 hasta i, incluyendo a i.

### Solución
Se ha implementado un algoritmo eficiente para calcular la suma acumulada de un arreglo. El algoritmo itera sobre el arreglo, acumulando la suma en cada paso y almacenando el resultado en un nuevo arreglo.

Código
```Java

class Solution {
public int[] runningSum(int[] nums) {
int n = nums.length;
int[] runningSum = new int[n];

        runningSum[0] = nums[0];
        for (int i = 1; i < n; i++) {
            runningSum[i] = runningSum[i - 1] + nums[i];
        }

        return runningSum;
    }
}
```
## Explicación del Código
Creación del arreglo de sumas acumuladas: Se crea un nuevo arreglo runningSum del mismo tamaño que el arreglo de entrada nums para almacenar las sumas acumuladas.
Inicialización: El primer elemento de runningSum se inicializa con el primer elemento de nums.
Cálculo de sumas acumuladas: Se itera sobre el arreglo nums a partir del segundo elemento. Para cada elemento, se suma el valor actual al valor acumulado del elemento anterior y se almacena en el arreglo runningSum.
Complejidad
Tiempo: O(n), donde n es el tamaño del arreglo. Se realiza una sola pasada por el arreglo.
Espacio: O(n), se utiliza un arreglo adicional para almacenar las sumas acumuladas.
Ejemplo de Uso
``` Java

public class Main {
public static void main(String[] args) {
Solution solution = new Solution();
int[] nums = {1, 2, 3, 4};
int[] runningSum = solution.runningSum(nums);
System.out.println("Suma acumulada: " + Arrays.toString(runningSum));
}
}
``` 
## Consideraciones adicionales
1. Optimizaciones: Para este problema, el algoritmo presentado es bastante eficiente. Sin embargo, en casos donde se requiera una mayor eficiencia, se podrían explorar técnicas de programación dinámica más avanzadas.
2. Aplicaciones: La suma acumulada tiene diversas aplicaciones en el procesamiento de datos, como en el cálculo de promedios móviles, detección de patrones y análisis de series de tiempo.
3. Variantes: Se podrían considerar variaciones del problema, como calcular la suma acumulada en sentido inverso o encontrar la subsecuencia con la mayor suma.