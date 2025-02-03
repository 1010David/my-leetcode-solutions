# FizzBuzz

## Descripción del Problema

### Dado un número entero n, se debe generar una lista de cadenas de caracteres de tamaño n. Cada elemento de la lista debe cumplir las siguientes condiciones:

Si el índice es divisible por 3 y 5, el elemento debe ser "FizzBuzz".
Si el índice es divisible por 3, el elemento debe ser "Fizz".
Si el índice es divisible por 5, el elemento debe ser "Buzz".
Si el índice no es divisible ni por 3 ni por 5, el elemento debe ser la representación en cadena del índice.
Solución
Se utiliza un bucle for para iterar desde 1 hasta n. En cada iteración, se verifica si el índice actual es divisible por 3 o 5 y se agrega la cadena correspondiente a la lista de resultados.

``` Java

class Solution {
public List<String> fizzBuzz(int n) {
List<String> result = new ArrayList<>();
for (int i = 1; i <= n; i++) {
if (i % 3 == 0 && i % 5 == 0) {
result.add("FizzBuzz");
} else if (i % 3 == 0) {
result.add("Fizz");
} else if (i % 5 == 0) {
result.add("Buzz");
} else {
result.add(Integer.toString(i));
}
}
return result;
}
}
```
Complejidad
Tiempo: O(n), ya que se itera sobre cada número del 1 al n.
Espacio: O(n), ya que se crea una lista de tamaño n para almacenar los resultados.

