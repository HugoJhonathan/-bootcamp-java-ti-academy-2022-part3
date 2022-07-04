package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entidades.Funcionario;

public class FuncionarioMain {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);

		Funcionario funcionario;
		String continuar;
		int id = 1;
	
		do {
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Data admissão (dd/mm/aaaa): ");
			Date dataAdmissao = sdf.parse(sc.next());
			System.out.print("Salário: R$ ");
			float salario = sc.nextFloat();
			System.out.print("Este funcionário ainda trabalha na empresa? (s/n): ");
			String aindaTrabalha = sc.next();
			
			if(aindaTrabalha.equalsIgnoreCase("n")) {
				System.out.print("Data demissão (dd/mm/aaaa): ");
				Date dataDemissao = sdf.parse(sc.next());
				funcionario = new Funcionario(id, nome, dataAdmissao, salario, dataDemissao);
			}else {
				funcionario = new Funcionario(id, nome, dataAdmissao, salario);
			}
			
			System.out.println(funcionario);
			id++;
			System.out.print("Cadastrar mais um funcionário? (s/n): ");
			continuar = sc.next();
			sc.nextLine();

		}while(continuar.equalsIgnoreCase("s"));

		System.out.println("\nFinalizado!");
		sc.close();
	}

}
