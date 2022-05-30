//O programa solicita dois n�meros para o usu�rio. Na sequencia, mostra um menu de op�es:
//	1. Soma
//	2. Subtra��o 
//	3. Multiplica��o
//	4. Divis�o
//Caso o usu�rio escolha uma op��o diferente, uma mensagem de erro deve ser apresentada.
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
				+ "\n2. Subtra��o"
				+ "\n3. Multiplica��o"
				+ "\n4. Divis�o");
		System.out.printf("\nEscolha uma op��o: ");
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
			System.out.println("Op��o Inv�lida!");
		}
		
		sc.close();

	}

}
