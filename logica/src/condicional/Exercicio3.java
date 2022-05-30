//O programa deve receber um valor inteiro de
//entrada entre 1 e 7, onde 1 é domingo e 7 é
//sábado, referente aos dias da semana. O
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
			nomeDoDia = "Terça-feira";
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
			nomeDoDia = "Sábado";
			break;
		default:
			nomeDoDia = "Opção Inválida!";
		}
		
		System.out.println(nomeDoDia);
		sc.close();
	}

}
