package condicional;

import java.util.Scanner;

public class Imc {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double peso, altura;
		String classificacao;
		
		System.out.printf("Informe o peso: ");
		peso = sc.nextDouble();
		System.out.printf("Informe a altura: ");
		altura = sc.nextDouble();
		
		double imc = peso / Math.pow(altura, 2.0);
		
		if(imc < 18.5) {
			classificacao = "Abaixo do peso";
		}else if(imc < 25.0) {
			classificacao = "Peso normal";
		}else if(imc < 30.0) {
			classificacao = "Sobrepeso";
		}else if( imc < 35.0) {
			classificacao = "Obesidade n�vel I";
		}else if( imc < 40.0) {
			classificacao = "Obesidade n�vel II";
		}else {
			classificacao = "Obesidade m�rbida";
		}
		
		System.out.printf("\nO seu IMC �: %.2f "
				+ "e est� classificado como %s.", imc, classificacao);
		
		sc.close();
	}

}
