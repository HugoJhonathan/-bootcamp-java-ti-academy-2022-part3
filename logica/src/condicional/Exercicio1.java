//Faça um programa que receba como entradas
//o nome da disciplina e a quantidade de aulas
//dadas. Além disso o programa deve solicitar
//as notas de um aluno nos 4 bimestres,
//calcular a média e mostrar o total de faltas no
//ano letivo. O programa deve retornar a média
//do aluno, indicar se o aluno foi aprovado
//considerando a média superior a 6,0 e as
//presenças superior ou igual a 75% das aulas
//dadas.

package condicional;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String resultadoFinal;
		char p = '%';

		System.out.printf("Nome da disciplina: ");
		String nomeDisciplina = sc.next();
		System.out.printf("Quantidade de aulas dadas: ");
		int qtdAulasDada = sc.nextInt();
		System.out.println("-------------------------");
		System.out.printf("Nota do Aluno do 1º Bimestre: ");
		double nota1 = sc.nextDouble();
		System.out.printf("Nota do Aluno do 2º Bimestre: ");
		double nota2 = sc.nextDouble();
		System.out.printf("Nota do Aluno do 3º Bimestre: ");
		double nota3 = sc.nextDouble();
		System.out.printf("Nota do Aluno do 4º Bimestre: ");
		double nota4 = sc.nextDouble();
		System.out.printf("Quantidade de faltas deste aluno: ");
		int qtdFaltas = sc.nextInt();
		System.out.println("-------------------------");

		double media = (nota1 + nota2 + nota3 + nota4) / 4;
		double porcentagemDeFaltas = (qtdAulasDada - qtdFaltas) * 100 / qtdAulasDada;

		if (media > 6.0 && porcentagemDeFaltas >= 75.0) {
			resultadoFinal = "APROVADO";
		} else {
			resultadoFinal = "REPROVADO";
		}
		System.out.printf("RESULTADO: \nDisciplina de %s\n\n", nomeDisciplina);
		System.out.printf("O aluno foi %s. Média: %.2f e %.1f%c de presença.", resultadoFinal, media,porcentagemDeFaltas, p);

		sc.close();

	}

}
