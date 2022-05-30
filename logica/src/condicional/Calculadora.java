//O programa solicita dois números para o usuário. Na sequencia, mostra um menu de opões:
//	1. Soma
//	2. Subtração 
//	3. Multiplicação
//	4. Divisão
//Caso o usuário escolha uma opção diferente, uma mensagem de erro deve ser apresentada.
package condicional;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcao;
		double num1, num2;
		
		System.out.printf("Informe o primeiro valor: ");
		num1 = sc.nextDouble();
		System.out.printf("Informe o segundo valor: ");
		num2 = sc.nextDouble();
		System.out.println("\n\nCalculadora\n");
		System.out.println("\n1. Soma"
				+ "\n2. Subtração"
				+ "\n3. Multiplicação"
				+ "\n4. Divisão");
		System.out.printf("\nEscolha uma opção: ");
		opcao = sc.nextInt();
		
		switch(opcao) {
		case 1:
			System.out.printf("%.2f + %.2f = %.2f", num1, num2, num1+num2);
			break;
		case 2:
			System.out.printf("%.2f - %.2f = %.2f", num1, num2, num1-num2);
			break;
		case 3:
			System.out.printf("%.2f * %.2f = %.2f", num1, num2, num1*num2);
			break;
		case 4:
			System.out.printf("%.2f / %.2f = %.2f", num1, num2, num1/num2);
			break;
		
		default:
			System.out.println("Opção Inválida!");
		}
		
		sc.close();

	}

}
