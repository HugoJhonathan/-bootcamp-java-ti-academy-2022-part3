/*De forma geral, a área de um triângulo consiste
na metade da multiplicação da base pela altura.
Faça um programa que calcule a área de um
triângulo, porém, não permite que as entradas
de dados (base e altura) sejam menores ou
iguais a zero.
*/
package repeticao;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double base, altura;

		System.out.printf("Informe o valor da base: ");
		base = sc.nextDouble();
		System.out.printf("Informe o valor da altura: ");
		altura = sc.nextDouble();

		while (base <= 0 || altura <= 0) {
			System.out.println("\nA base e a altura precisam ser maiores que 0!");

			System.out.printf("\nInforme o valor da base: ");
			base = sc.nextDouble();
			System.out.printf("Informe o valor da altura: ");
			altura = sc.nextDouble();
		}
		double area = base * altura / 2;

		System.out.printf("\nArea: %.2f", area);

		sc.close();
	}

}
