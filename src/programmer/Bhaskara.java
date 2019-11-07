package programmer;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Bhaskara {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		DecimalFormat format = new DecimalFormat("0.00000");
		
		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		double c = scanner.nextDouble();
		scanner.close();

		if ((a == 0) | (b * b - 4 * a * c < 0)) {
			System.out.println("Impossivel calcular");
		} else {
			double r1 = (-b + Math.sqrt((b * b) - 4 * a * c)) / (2 * a);
			double r2 = (-b - Math.sqrt((b * b) - 4 * a * c)) / (2 * a);
			System.out.println("R1 = " + format.format(r1));
			System.out.println("R2 = " + format.format(r2));
		}

	}

}
