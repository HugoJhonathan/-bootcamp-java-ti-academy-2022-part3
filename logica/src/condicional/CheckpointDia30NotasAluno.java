package condicional;

import java.util.Scanner;

public class CheckpointDia30NotasAluno {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String disciplina, resultado;
		int quantidade, faltas;
		double n1, n2, n3, n4, media;
		
		System.out.println("Digite a disciplina: ");
		disciplina = sc.next();
		System.out.println("Digite a quantidade de aulas: ");
		quantidade = sc.nextInt();
		System.out.println("Informe as 4 notas: ");
		n1 = sc.nextDouble();
		n2 = sc.nextDouble();
		n3 = sc.nextDouble();
		n4 = sc.nextDouble();
		System.out.println("Informe a quantidade de faltas: ");
		faltas = sc.nextInt();
		
		media = (n1+n2+n3+n4)/4;
		
		if((media >= 6.0) && (faltas < quantidade*0.25)) {
			resultado = "APROVADO";
		}else {
			resultado = "REPROVADO";
		}
		
		System.out.printf("\nA disciplina de %s teve %d aulas dadas.\n", disciplina, quantidade);
		System.out.printf("O aluno tirou %.1f, %.1f, %.1f e %.1f. E obteve a média %.1f.\n", n1, n2, n3, n4, media);
		System.out.printf("O aluno faltou %d vezes.\n", faltas);
		System.out.printf("O aluno está: %s.", resultado);
		
		sc.close();

	}

}
