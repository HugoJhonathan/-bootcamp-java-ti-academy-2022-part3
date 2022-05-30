/*Veja a tabela do aumento do salário mínimo de
2015 até 2021.
------------
2015 8,80%
2016 11,67%
2017 6,47%
2018 1,81%
2019 4,61%
2020 4,68%
2021 5,26%
2022 10,18%
-----------
Um funcionário foi admitido
em 2016 recebendo um
salário inicial de R$ 1.000,00,
que será reajustado
anualmente com base no
percentual de aumento do
salário mínimo.
Calcule o salário do
funcionário no ano atual.
*/

package repeticao;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.printf("Ano de admissão: ");
		int anoAdmissao = sc.nextInt();

		System.out.printf("Salário: R$ ");
		double salario = sc.nextDouble();

		double acrescimo = 0;

		System.out.println("\nAno    %       Acrescimo    Final");
		System.out.printf("%d ------ ADMITIDO ------ R$ %.2f\n", anoAdmissao, salario);

		for (int i = anoAdmissao + 1; i <= 2022; i++) {
			acrescimo = salario;
			switch (i) {
			case 2015:
				salario += (salario * (8.80 / 100));
				System.out.printf("2015  8,80     R$ %.2f     R$ %.2f\n", salario - acrescimo, salario);
				break;
			case 2016:
				salario += (salario * (11.67 / 100));
				System.out.printf("2016  11,67     R$ %.2f     R$ %.2f\n", salario - acrescimo, salario);
				break;
			case 2017:
				salario += (salario * (6.47 / 100));
				System.out.printf("2017  6,47     R$ %.2f     R$ %.2f\n", salario - acrescimo, salario);
				break;
			case 2018:
				salario += (salario * (1.81 / 100));
				System.out.printf("2018  1,81     R$ %.2f     R$ %.2f\n", salario - acrescimo, salario);
				break;
			case 2019:
				salario += (salario * (4.61 / 100));
				System.out.printf("2019  4,61     R$ %.2f     R$ %.2f\n", salario - acrescimo, salario);
				break;
			case 2020:
				salario += (salario * (4.68 / 100));
				System.out.printf("2020  4,68     R$ %.2f     R$ %.2f\n", salario - acrescimo, salario);
				break;
			case 2021:
				salario += (salario * (5.26 / 100));
				System.out.printf("2021  5,26     R$ %.2f     R$ %.2f\n", salario - acrescimo, salario);
				break;
			case 2022:
				salario += (salario * (10.18 / 100));
				System.out.printf("2022  10,18    R$ %.2f    R$ %.2f\n", salario - acrescimo, salario);
				break;
			}
		}

		System.out.printf("\nSalario deste funcionário em 2022: R$ %.2f", salario);
		sc.close();
	}
}