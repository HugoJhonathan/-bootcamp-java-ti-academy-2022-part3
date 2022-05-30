/*

O programa recebe a renda de um funcionário.
Calcule e mostre o desconto do imposto de
renda com base na tabela a seguir.

Até R$ 1903,98       Isento     R$ 0,00
R$ 2826,65             7,5%     R$ 142,80
R$ 3751,06              15%     R$ 354,80
R$ 4664,68            22,5%     R$ 636,13
+ de R$ 4664,68       27,5%     R$ 869,36

*/

package condicional;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double imposto = 0;
		char p = '%';
		System.out.printf("Informe a renda do funcionário: R$ ");
		double salario = sc.nextDouble();
		sc.close();
		
		if(salario <= 1903.98) {
			System.out.println("\nIsento!");
			return;
		}
		if(salario <= 2826.65) { // 1903.98 a 2826.65 = 7,5%
			imposto = (salario - 1903.98) * 0.075;
		}
		if(salario <= 3751.06) { // 2826.65 a 3751.06 = 15% + (7,5% de 922,67 = 69,20025) 
			imposto = (salario - 2826.65) * 0.15 + ((2826.65 - 1903.98) * 0.075);
		}
		if(salario <= 4664.68) { // 3751.06 a 4664.68 = 22,5% + (15% de 924,41 = 138,6615) + (7,5% de 922,67 = 69,20025)
			imposto = (salario - 3751.06) * 0.225 + ((2826.65 - 1903.98) * 0.075) + ((3751.06 - 2826.65) * 0.15);
		}
		if(salario > 4664.68) { // acima 4664.68 = 27,5% do salario - 4664.68 + (22,5% de 913,62 = 205,5645) + (15% de 924,41 = 138,6615) + (7,5% de 922,67 = 69,20025)
			imposto = (salario - 4664.68) * 0.275 + ((4664.68 - 3751.06) * 0.225) + ((2826.65 - 1903.98) * 0.075) + ((3751.06 - 2826.65) * 0.15);
		}
		double porcentagem = 100 - ((salario-imposto)*100 / salario);
				
		System.out.printf("\n  Salário bruto: R$ %.2f"
				        + "\n        Imposto: R$ %.2f (-%.1f%c)"
				        + "\nSalário Liquido: R$ %.2f\n", 
				        salario, imposto, porcentagem, p, (salario-imposto));
		System.out.println("\n          Fim da execução.            ");
	
	}

}
