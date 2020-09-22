package atividade02;

public class EcercicioD {
	public static void main(String[] args) {
		double celsius;
		double fahrenheit;

		for (fahrenheit = 50; fahrenheit <= 150; fahrenheit++) {
			System.out.println("Os graus em Fahrenheit são: " + fahrenheit);
			celsius = 5.0 / 9.0 * (fahrenheit - 32.0);
			System.out.println("Os graus em Celsius são: " + celsius);
		}
	}

}
