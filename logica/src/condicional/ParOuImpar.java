package condicional;

import java.util.Scanner;

public class ParOuImpar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num;
		String resultado;
		
		System.out.println("Informe um n�mero: ");
		num = sc.nextInt();
		
		if(num % 2 == 0) {
			resultado = "PAR";
		}else {
			resultado = "IMPAR";
		}
		System.out.printf("\nO n�mero %d � %s.", num, resultado);
		System.out.println("\nEncerrando a execu��o.");
		
		sc.close();

	}

}
