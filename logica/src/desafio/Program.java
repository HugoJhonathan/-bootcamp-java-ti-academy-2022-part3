package desafio;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		 		
		Scanner sc = new Scanner(System.in);
				
		final float impostoC = 0.3741f;
		final float impostoE = 0.4314f;
		final float impostoV = 0.3842f;
		final float lucroC   = 0.30f;
		final float lucroE   = 0.35f;
		final float lucroV   = 0.50f;
		
		int categoriaC = 0, categoriaE = 0, categoriaV = 0;
		double totalC = 0, totalE = 0, totalV = 0;
		double imposto, lucro, precoProdutoFinal;
		
		System.out.print("Quantos produtos deseja adicionar? ");
		int qtdProdutos = sc.nextInt();
		sc.nextLine();
			
		for(int i = 1; i < 1+qtdProdutos; i++) {
			
			System.out.printf("\nCadastre o %d� item abaixo\n", i);
			
			System.out.print("Nome do produto: ");
			String nomeProduto = sc.nextLine();
			
			System.out.print("Pre�o: ");
			double precoProduto = sc.nextDouble();
			System.out.print("Quantidade: ");
			int quantidadeProduto = sc.nextInt();
			
			System.out.print("\nC-cama, mesa e banho\nE-eletrodom�stico\nV-vestu�rio\nCategoria (C, E ou V):");
			char categoriaProduto = Character.toUpperCase(sc.next().charAt(0));
			sc.nextLine();
			
			while(categoriaProduto != 'C' && categoriaProduto != 'E' && categoriaProduto != 'V') {
				System.out.print("\nCaracter inv�lido! Preencha novamente:\nCategoria (C, E ou V): ");
				categoriaProduto = Character.toUpperCase(sc.next().charAt(0));
			}
			
			if(categoriaProduto == 'C') {
				precoProdutoFinal = precoProduto/(1-(lucroC + impostoC));
				categoriaC+=quantidadeProduto;
				totalC+=precoProdutoFinal*quantidadeProduto;
				imposto = precoProdutoFinal*(impostoC);
				lucro = precoProdutoFinal*(lucroC);
			}else if(categoriaProduto == 'E') {
				precoProdutoFinal = precoProduto/(1-(lucroE + impostoE));
				categoriaE+=quantidadeProduto;
				totalE+=precoProdutoFinal*quantidadeProduto;
				imposto = precoProdutoFinal*(impostoE);
				lucro = precoProdutoFinal*(lucroE);
			}else {
				precoProdutoFinal = precoProduto/(1-(lucroV + impostoV));
				categoriaV+=quantidadeProduto;
				totalV+=precoProdutoFinal*quantidadeProduto;
				imposto = precoProdutoFinal*(impostoV);
				lucro = precoProdutoFinal*(lucroV);
			}
			System.out.printf("\n%dº Produto adicionado!\n", i);
			System.out.printf("Nome: %s, Pre�o: R$ %.2f, Qtd: %d, Categoria: %s, Imposto: R$ %.2f, Lucro: R$ %.2f, Pre�o final: R$ %.2f\n",
					nomeProduto, precoProduto, quantidadeProduto, categoriaProduto, imposto, lucro, precoProdutoFinal
					);		
		}
		
		System.out.println("\nCadastros conclu�dos!\n");
		System.out.printf("%20s   %-10s   %-20s %-25s %-25s %-15s\n", "Categoria", "Qtd Total", "Total Investido", "Total Imposto", "Total Lucro", "Total");
		System.out.println("----------------------------------------------------------------------------------------------------------------------------------");
		System.out.printf("%20s   %-10d   R$ %-17.2f (%.2f%%) R$ %-13.2f (%.0f%%) R$ %-16.2f R$ %-12.2f \n", 
							"Cama, mesa e banho", 
							categoriaC, 
							totalC*(1-(impostoC+lucroC)), 
							impostoC*100,
							totalC*impostoC, 
							lucroC*100,
							totalC*lucroC, 
							totalC
						);
		System.out.printf("%20s   %-10d   R$ %-17.2f (%.2f%%) R$ %-13.2f (%.0f%%) R$ %-16.2f R$ %-12.2f \n",  
							"Eletrodom�stico", 
							categoriaE, 
							totalE*(1-(impostoE+lucroE)), 
							impostoE*100,
							totalE*impostoE,
							lucroE*100,
							totalE*lucroE,
							totalE
						);
		System.out.printf("%20s   %-10d   R$ %-17.2f (%.2f%%) R$ %-13.2f (%.0f%%) R$ %-16.2f R$ %-12.2f \n", 
							"Vestu�rio", 
							categoriaV, 
							totalV*(1-(impostoV+lucroV)), 
							impostoV*100,
							totalV*impostoV, 
							lucroV*100,
							totalV*lucroV, 
							totalV
						);
		System.out.println("----------------------------------------------------------------------------------------------------------------------------------");
		System.out.printf("%20s   %-10d   R$ %-17.2f R$ %-22.2f R$ %-22.2f R$ %-12.2f \n", 
							"TOTAL", 
							categoriaC+categoriaE+categoriaV, 
							totalC*(1-(impostoC+lucroC))+totalE*(1-(impostoE+lucroE))+totalV*(1-(impostoV+lucroV)), 
							totalC*impostoC+totalE*impostoE+totalV*impostoV, 
							totalC*lucroC+totalE*lucroE+totalV*lucroV, 
							totalC+totalE+totalV
						);
		sc.close();
	}

}
