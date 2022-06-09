package application;

import java.util.Scanner;

import entities.Veiculo;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int qtdPassageiros;
		double tanque, consumo, km, valor;
		
		System.out.print("\nQuantidade de passageiros: ");
		qtdPassageiros = sc.nextInt();
		System.out.print("Capacidade do tanque: ");
		tanque = sc.nextDouble();
		System.out.print("Consumo por litro: ");
		consumo = sc.nextDouble();  
		System.out.print("Dist�ncia em KM: ");
		km = sc.nextDouble();
		System.out.print("Valor do combust�vel: ");
		valor = sc.nextDouble();
		
		Veiculo gourgel = new Veiculo(qtdPassageiros, tanque, consumo);
		System.out.println("\n"+gourgel);
		
		double tanques = gourgel.tanqueViagem(km);
		double rateio = gourgel.dividirDespesas(km, valor);
		
		System.out.printf("\nPara a viagem vamos precisar de %.2f tanques!", tanques);
		System.out.printf("\nCada passageiro contrubuir� com R$ %.2f.", rateio);
		System.out.printf("\nPara a viagem, ser� necess�rio %.2f L de combust�vel!", km/consumo);
		
		sc.close();

	}

}
