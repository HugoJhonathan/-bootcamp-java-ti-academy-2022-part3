package aplicacao;

import java.util.Scanner;

import entidades.Aluno;

public class Aluno1Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Data nascimento (dd/mm/aaaa): ");
		String nascimento = sc.next();
		sc.nextLine();
		System.out.print("Turma: ");
		String turma = sc.nextLine();
		System.out.print("Data de matrícula (dd/mm/aaaa): ");
		String matricula= sc.next();
		
		Aluno aluno = new Aluno(nome, nascimento, turma, matricula);
		System.out.println(aluno);
		
		sc.close();

	}

}
