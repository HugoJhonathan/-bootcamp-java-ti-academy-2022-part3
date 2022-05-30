//O programa deve receber um valor inteiro de
//entrada entre 1 e 7, onde 1 � domingo e 7 �
//s�bado, referente aos dias da semana. O
//retorno deve ser o dia da semana.
package condicional;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nomeDoDia;
		
		System.out.printf("Informe um valor entre 1 e 7: ");
		int numeroDoDia = sc.nextInt();

		switch (numeroDoDia) {
		case 1:
			nomeDoDia = "Domingo";
			break;
		case 2:
			nomeDoDia = "Segunda-feira";
			break;
		case 3:
			nomeDoDia = "Ter�a-feira";
			break;
		case 4:
			nomeDoDia = "Quarta-feira";
			break;
		case 5:
			nomeDoDia = "Quinta-feira";
			break;
		case 6:
			nomeDoDia = "Sexta-feira";
			break;
		case 7:
			nomeDoDia = "S�bado";
			break;
		default:
			nomeDoDia = "Op��o Inv�lida!";
		}
		
		System.out.println(nomeDoDia);
		sc.close();
	}

}
