package sequencial;

public class Variaveis {

	public static void main(String[] args) {
		// float tem menos preci��o de casas decimais (at� 7 digitos).
		// enquanto o double pode armazenar at� 15 d�gitos.
		float valorMercadoria = 750.28f;
		double peso = 78.3;
		int quantidade = 1500;
		char genero = 'F';
		// char precisa ser em aspas simples
		
		System.out.printf("A quantidade de itens em estoque �: %d\n", quantidade);
		System.out.printf("O valor da parcela �: R$ %.2f\n", valorMercadoria);
		System.out.printf("O Erinaldo pesa %f quilos\n", peso);
		System.out.printf("Do g�nero %c tem matriculados %d alunas", genero, quantidade);
		// %d inteiro (int)
		// %f numero real (double e float)
		// %c caracter

	}

}
