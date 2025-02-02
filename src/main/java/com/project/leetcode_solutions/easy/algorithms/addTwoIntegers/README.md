# Suma de Dos Enteros

## Descripción del Problema
Dado dos números enteros, num1 y num2, se requiere calcular y retornar la suma de ambos.

Ejemplo
Entrada: num1 = 12, num2 = 5
Salida: 17
Explicación: 12 + 5 = 17
Solución
Se ha implementado una clase Solution con un método sum que recibe dos enteros como parámetros y retorna su suma. El método simplemente utiliza el operador de suma de Java (+) para realizar la operación.

```Java

class Solution {
public int sum(int num1, int num2) {
return num1 + num2;
}
}
```

Complejidad
1. Tiempo: O(1), ya que la operación de suma es constante.
2. Espacio: O(1), no se utiliza espacio adicional significativo.

## Uso

```Java

public class Main {
public static void main(String[] args) {
Solution solution = new Solution();
int result = solution.sum(12, 5);
System.out.println(result); // Imprime: 17
}
}
```

## Consideraciones
1. Simplicidad: El problema es fundamental y la solución es directa, utilizando la operación de suma básica de Java.
2. Eficiencia: La complejidad temporal y espacial es óptima para este problema sencillo.
3. Extensibilidad: Aunque este problema es básico, la solución puede servir como base para problemas más complejos que involucren operaciones aritméticas.