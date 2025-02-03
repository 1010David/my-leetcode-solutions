# La Riqueza del Cliente Más Rico

## Descripción del Problema

Dado un arreglo bidimensional `accounts` donde `accounts[i][j]` representa la cantidad de dinero que el cliente `i` tiene en el banco `j`, se requiere determinar la riqueza del cliente más rico.

La riqueza de un cliente se define como la suma de dinero que posee en todas sus cuentas bancarias.

**Ejemplo:**

* **Entrada:** `accounts = [[1,2,3],[3,2,1]]`
* **Salida:** 6
* **Explicación:**
    * El primer cliente tiene una riqueza de 1 + 2 + 3 = 6
    * El segundo cliente tiene una riqueza de 3 + 2 + 1 = 6
    * Ambos clientes son los más ricos con una riqueza de 6.

## Solución

La solución itera sobre cada fila (cliente) del arreglo `accounts`. Para cada cliente, se calcula la suma de dinero en todas sus cuentas. Se mantiene un seguimiento de la máxima riqueza encontrada hasta el momento. Al finalizar la iteración, se retorna la máxima riqueza encontrada.

**Código:**

```java
class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        for (int[] account : accounts) {
            int wealth = 0;
            for (int balance : account) {
                wealth += balance;
            }
            maxWealth = Math.max(maxWealth, wealth);
        }
        return maxWealth;
    }
}