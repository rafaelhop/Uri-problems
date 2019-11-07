package programmer;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Esfera {
	public static void main(String[] args) {
		DecimalFormat format = new DecimalFormat("0.000");
		Scanner scanner = new Scanner(System.in);
		double A, B, C, pi;
		double TRIANGULO, CIRCULO, TRAPEZIO, QUADRADO, RETANGULO;

		pi = 3.14159;
		A = scanner.nextDouble();
		B = scanner.nextDouble();
		C = scanner.nextDouble();

		TRIANGULO = A * C * 0.5;
		CIRCULO = pi * C * C;
		TRAPEZIO = (A + B) * C * 0.5;
		QUADRADO = B * B;
		RETANGULO = A * B;
		System.out.println("TRIANGULO: " + format.format(TRIANGULO));
		System.out.println("CIRCULO: " + format.format(CIRCULO));
		System.out.println("TRAPEZIO: " + format.format(TRAPEZIO));
		System.out.println("QUADRADO: " + format.format(QUADRADO));
		System.out.println("RETANGULO: " + format.format(RETANGULO));

		scanner.close();
	}

}
