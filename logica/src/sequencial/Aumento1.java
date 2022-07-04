// Calcular o aumento de 5% sobre o salário bruto de um funcionário

package sequencial;

import java.util.Scanner;

public class Aumento1 {

	public static void main(String[] args) {
		double salarioBruto;
		Scanner sc = new Scanner(System.in);

		System.out.printf("Informe o salário bruto: R$ ");
		salarioBruto = sc.nextDouble();
		salarioBruto = salarioBruto * 1.05;

		System.out.printf("O novo salário bruto é R$ %.2f", salarioBruto);
		sc.close();
	}

}
