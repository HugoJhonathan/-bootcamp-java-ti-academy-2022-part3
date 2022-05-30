package condicional;

import java.util.Scanner;

public class Genero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char genero;
		
		System.out.printf("Informe o gênero (F ou M): ");
		genero = sc.next().charAt(0);
		genero = Character.toUpperCase(genero);
		
		System.out.println((genero == 'F') ? "Feminino" : (genero == 'M') ? "Masculino" : "Valor Inválido");
		
		sc.close();

	}

}

