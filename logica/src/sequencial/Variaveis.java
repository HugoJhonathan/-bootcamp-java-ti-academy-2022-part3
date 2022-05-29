package sequencial;

public class Variaveis {

	public static void main(String[] args) {
		// float tem menos precição de casas decimais (até 7 digitos).
		// enquanto o double pode armazenar até 15 dígitos.
		float valorMercadoria = 750.28f;
		double peso = 78.3;
		int quantidade = 1500;
		char genero = 'F';
		// char precisa ser em aspas simples
		
		System.out.printf("A quantidade de itens em estoque é: %d\n", quantidade);
		System.out.printf("O valor da parcela é: R$ %.2f\n", valorMercadoria);
		System.out.printf("O Erinaldo pesa %f quilos\n", peso);
		System.out.printf("Do gênero %c tem matriculados %d alunas", genero, quantidade);
		// %d inteiro (int)
		// %f numero real (double e float)
		// %c caracter

	}

}
