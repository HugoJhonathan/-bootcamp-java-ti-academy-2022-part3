// Do salário bruto de um funcionário é descontado
// 11% para o INSS. Calcule e mostre o salário com
// deconto.
// DescontoINSS = salarioBruto*(1-0.11);

package sequencial;

import java.util.Scanner;

public class Exercicio2DescontoINSS {

	public static void main(String[] args) {
		float taxaINSS = 0.11f;
		char p = '%';
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Informe o valor do salário bruto: R$ ");
		double salarioBruto = sc.nextDouble();
		
		double salarioDescontadoINSS = salarioBruto*(1-taxaINSS);
		double diferenca = salarioBruto - salarioDescontadoINSS;
		
		System.out.printf("O salário bruto de R$ %.2f "
						+ "teve um desconto de %.2f%c (R$ %.2f), "
						+ "ficando assim, R$ %.2f",
						salarioBruto, taxaINSS, p, diferenca, salarioDescontadoINSS);
		sc.close();
	}

}
