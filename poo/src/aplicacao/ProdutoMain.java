package aplicacao;

import java.util.Scanner;

import entidades.Produto;

public class ProdutoMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe os dados do produto:");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Quantidade: ");
		int quantidade = sc.nextInt();
		System.out.print("Valor Unitário: ");
		double valorUnitario = sc.nextDouble();
		
		Produto celular = new Produto(nome, valorUnitario, quantidade);
		
		System.out.printf("\n%s", celular.nome);
		System.out.print("\nQtd: "+celular.quantidade);
		System.out.printf("\nR$ %.2f", celular.valorUnitario);
		System.out.printf("\nImposto (unitário): R$ %.2f", celular.valorImposto());
		System.out.printf("\nTotal em Estoque: R$ %.2f", celular.valorEstoque());
		
		sc.close();
	
	}

}
