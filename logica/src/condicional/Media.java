package condicional;

import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		
		double n1, n2, n3;
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Informe a primeira nota: ");
		n1 = sc.nextDouble();
		System.out.printf("Informe a segunda nota: ");
		n2 = sc.nextDouble();
		System.out.printf("Informe a terceira nota: ");
		n3 = sc.nextDouble();
		
		double media = (n1+n2+n3)/3;
		String resultado;
		if(media >= 60.0) {
			resultado = "APROVADO";
		}else {
			resultado = "REPROVADO";
		}
		
		System.out.printf("\nO aluno obteve média %.1f e está %s.\n", media, resultado);
		System.out.println("Encerrado.");
		
		sc.close();
	}

}
