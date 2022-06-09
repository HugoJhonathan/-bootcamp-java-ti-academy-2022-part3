package triangulo;

import java.util.Scanner;

import geometria.Triangulo;

public class TrianguloExec {

	public static void main(String[] args) {
		Triangulo a = new Triangulo();
		Triangulo b = new Triangulo();

		entrada(a);
		entrada(b);

		if (a.validar() == true) {
			System.out.println(a);
		} else {
			System.out.println("Os lados informados não são de um triângulo!\n\n");
		}
		if (b.validar() == true) {
			System.out.println(b);
		} else {
			System.out.println("Os lados informados não são de um triângulo!\n\n");
		}

	}
	public static void entrada(Triangulo lado) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite os valores: ");
		lado.x = sc.nextDouble();
		lado.y = sc.nextDouble();
		lado.z = sc.nextDouble();
	}
}
