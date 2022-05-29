// Calcular a média de três números

package sequencial;

import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		double n1, n2, n3;
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o valor de N1: ");
		n1 = sc.nextDouble();
		System.out.println("Informe o valor de N2: ");
		n2 = sc.nextDouble();
		System.out.println("Informe o valor de N3: ");
		n3 = sc.nextDouble();
		
		double media = (n1+n2+n3)/3;
		
		System.out.printf("A média de %.2f, %.2f e %.2f é %.2f", n1, n2, n3, media);
		
		sc.close();
	}

}
