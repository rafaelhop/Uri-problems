package programmer;

import java.text.DecimalFormat;
import java.util.Scanner;

public class BonusSalary {
	public static void main(String[] args) {
		DecimalFormat format = new DecimalFormat("0.00");
		Scanner scanner = new Scanner(System.in);
		
		int codPeca1 = scanner.nextInt();
		int nunPeca1 = scanner.nextInt();
		double valor1 = scanner.nextDouble();
		int codPeca2 = scanner.nextInt();
		int nunPeca2 = scanner.nextInt();
		double valor2 = scanner.nextDouble();
		double total= nunPeca1*valor1 + nunPeca2*valor2;
		
		System.out.println("VALOR A PAGAR: R$ "+format.format(total));
		scanner.close();
	}

}
