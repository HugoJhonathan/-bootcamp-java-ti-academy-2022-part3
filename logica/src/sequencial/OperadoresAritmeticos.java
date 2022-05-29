package sequencial;

public class OperadoresAritmeticos {

	public static void main(String[] args) {
		System.out.println(5 * 6 / 3);
		System.out.println(5 + 2 * 4);
		System.out.println((5 + 2) * 4);
		System.out.println(70 / (5 + 2) * 4);
		System.out.println(70 / ((5 + 2) * 4));
		System.out.println(18 / 4);
		// se dividir um número int, e o resultado for um decimal,
		// só irá mostrar o número inteiro desse número.
		// 18/4 é 4.5, mas como foi dividido por inteiro, mostra apenas o 4
		System.out.println(18.0 / 4.0);
		// dividindo assim por decimais, mostra corretamente
		System.out.println(18 % 4);
	}

}
