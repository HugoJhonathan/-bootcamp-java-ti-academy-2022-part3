/*
Fa�a um programa que receba a nota de 10
alunos. Para cada nota recebida, se a nota for
maior ou igual a 6.0 o aluno est� aprovado,
caso contr�rio o aluno est� reprovado. No
final da execu��o o programa deve apresentar
a quantidade de alunos aprovados e
reprovados, al�m da m�dia da turma.
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
			System.out.printf("Informe a nota do %d� aluno: ", i+1);
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
		System.out.printf("M�dia da Classe: %.2f", media);
		sc.close();
	}

}
