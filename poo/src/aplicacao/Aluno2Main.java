package aplicacao;

import java.util.Scanner;

import entidades.Aluno;

public class Aluno2Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Data nascimento (dd/mm/aaaa): ");
		String nascimento = sc.next();
		System.out.print("Data de matrícula (dd/mm/aaaa): ");
		String matricula= sc.next();
		
		Aluno aluno = new Aluno(nome, nascimento, matricula);
		System.out.println(aluno);
		
		sc.close();

	}

}
