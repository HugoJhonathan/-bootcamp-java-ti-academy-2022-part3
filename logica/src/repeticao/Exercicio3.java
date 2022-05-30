/*De forma geral, a �rea de um tri�ngulo consiste
na metade da multiplica��o da base pela altura.
Fa�a um programa que calcule a �rea de um
tri�ngulo, por�m, n�o permite que as entradas
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
