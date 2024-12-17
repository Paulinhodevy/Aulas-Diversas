//* Criar um metodo chamado - "Encontrar maior".
//* O método deve interar pelo array e comparar os elementos.
//* O valor inicial do maior número pode ser o primeiro elemento do array.

import java.util.Scanner;

public class Maiornumero {
   public static void main (String[]args) {
      Scanner scanner = new Scanner(System.in);

      System.out.println("Quantos números voce deseja inserir ");
   int n = scanner.nextInt();
int[] numeros = new int[n];  


System.out.println("Digite os números:");
for (int i = 0; i < n; i++) {
   numeros[i] = scanner.nextInt();
}


int maior = encontrarMaior(numeros);
System.out.println("O maior numero é:" + maior);
}


public static int encontrarMaior(int[] array) {
   int Maior = array[0]; //Inicia com o primeuri elemento
   for (int i = 1; i < array.length; i++) {
      if (array[i] > Maior) {
         Maior = array[i];

      }
   }
   return Maior;
}
}
