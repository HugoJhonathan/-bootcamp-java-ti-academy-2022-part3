package geometria;

public class Triangulo {
	public double x;
	public double y;
	public double z;
	public String tipo;
	
	public boolean validar() {
		if (Math.abs(x - y) < z && z < x + y){
			return true;
		}
		return false;
	}
	public String classificar() {
		if (x == y && y == z) {
			tipo = "equilátero";
		} else if (x == y || x == z || y == z) {
			tipo = "isósceles";
		} else {
			tipo = "escaleno";
		}
		return tipo;
	}
	public double perimetro() {
		return (x + y + z) / 2.0;
	}
	public double area() {
		// Formula de Heron
		return Math.sqrt(perimetro() * (perimetro() - x) * (perimetro() - y) * (perimetro() - z));
	}
	public String toString() {
		return "\nOs lados "+x+", "+y+" e "+z+" formam um triângulo "+classificar()+"."
		+"\nO perímetro do triângulo é "+String.format("%.1f", perimetro())+"."
		+"\nA área desse triângulo é "+String.format("%.1f", area())+".\n";
	}
	
	
}
