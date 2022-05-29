// Informe o percentual de aumento e calcule o novo salário bruto do funcionário

package sequencial;

import java.util.Scanner;

public class Aumento2 {

	public static void main(String[] args) {
		double salarioBruto, percentual;
		Scanner sc = new Scanner(System.in);

		System.out.printf("Informe o salário bruto: ");
		salarioBruto = sc.nextDouble();
		System.out.printf("Informe o percentual de aumento: ");
		percentual = sc.nextDouble();

		double salarioBrutoAtualizado = salarioBruto * (1 + percentual / 100);
		double acrescimo = salarioBrutoAtualizado - salarioBruto;
		char p = '%';

		System.out.printf("O salário bruto de R$ %.2f teve um aumento de %.1f%c (R$ %.2f), totalizando R$ %.2f.", 
		salarioBruto, percentual, p, acrescimo, salarioBrutoAtualizado);

		sc.close();

	}

}
