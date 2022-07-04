// Calcule e mostre a média ponderada de 4
// valores informados pelo usuário
// Mp = ( n1*2 + n2*2 + n3*3 + n4*3 ) / 10

package sequencial;

import java.util.Scanner;

public class Exercicio1MediaPonderada {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.printf("Valor 1: ");
		double valor1 = sc.nextDouble();
		System.out.printf("Valor 2: ");
		double valor2 = sc.nextDouble();
		System.out.printf("Valor 3: ");
		double valor3 = sc.nextDouble();
		System.out.printf("Valor 4: ");
		double valor4 = sc.nextDouble();

		double mediaPond = (valor1 * 2 + valor2 * 2 + valor3 * 3 + valor4 * 3) / 10;

		System.out.printf("Média Ponderada: %.2f", mediaPond);
		sc.close();
	}

}
