/*
Faça um programa que receba a nota de 10
alunos. Para cada nota recebida, se a nota for
maior ou igual a 6.0 o aluno está aprovado,
caso contrário o aluno está reprovado. No
final da execução o programa deve apresentar
a quantidade de alunos aprovados e
reprovados, além da média da turma.
*/
package repeticao;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int contAprovados = 0;
		int contReprovados = 0;
		double total = 0;
		
		for(int i = 0; i <= 9; i++) {
			System.out.printf("Informe a nota do %dº aluno: ", i+1);
			double nota = sc.nextDouble();
			total+=nota;
			if(nota >= 6.0) {
				contAprovados++;
			}else {
				contReprovados++;
			}
		}
		double media = total / 10;
		System.out.printf("\nQuantidade de alunos APROVADOS: %d\n", contAprovados);
		System.out.printf("Quantidade de alunos REPROVADOS: %d\n", contReprovados);
		System.out.printf("Média da Classe: %.2f", media);
		sc.close();
	}

}
