package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entidade.Contrato;
import entidade.Departamento;
import entidade.Funcionario;
import entidades.enums.Nivel;

public class Sistema {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Departamento: ");
		String depto = sc.nextLine();
		System.out.print("Nome Funcionário: ");
		String func = sc.nextLine();
		System.out.print("Nível (JUNIOR/PLENO/SENIOR): ");
		String nivel = sc.nextLine();
		System.out.print("Salário base: ");
		double salario= sc.nextDouble();
		
		Funcionario funcionario = new Funcionario(func, Nivel.valueOf(nivel), salario, new Departamento(depto));
		
		System.out.print("Quantos contratos associados: ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			System.out.println();
			System.out.printf("Contrato nº %d:\n", i);
			System.out.print("Data (DD/MM/YYYY): ");
			Date data = sdf.parse(sc.next());
			System.out.print("Valor da hora: ");
			double valorHora = sc.nextDouble();
			System.out.print("Quantidade de horas: ");
			int horas = sc.nextInt();
			
			Contrato contrato = new Contrato(data, valorHora, horas);
			funcionario.addContrato(contrato);
		}
		
		System.out.println("\nConsulta salário");
		System.out.println("Informe o mês e ano (MM/YYYY): ");
		String mesEano = sc.next();
		
		int mes = Integer.parseInt(mesEano.substring(0,2));
		int ano = Integer.parseInt(mesEano.substring(3));
	
		System.out.println();
		System.out.println("Funcionario  : "+funcionario.getNome());
		System.out.println("Departamento : "+funcionario.getDepartamento().getNome());
		System.out.printf( "Salário      : R$ %.2f", funcionario.ganho(ano, mes));
			
		sc.close();
	}
}
