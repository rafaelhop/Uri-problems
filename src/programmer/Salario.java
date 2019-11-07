package programmer;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Salario {
	public static void main(String[] args) {
		DecimalFormat format = new DecimalFormat("0.00");
		Scanner scanner = new Scanner(System.in);
		
		int number, hour;
		double salaryByhour, salary;
		
		number = scanner.nextInt();
		hour = scanner.nextInt();
		salaryByhour = scanner.nextDouble();
		salary = (salaryByhour*hour);
		
		System.out.println("NUMBER = "+number);
		System.out.println("SALARY = U$ "+format.format(salary));
		scanner.close();
		
	}

}
