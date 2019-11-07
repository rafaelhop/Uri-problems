package programmer;

import java.util.Scanner;

public class Maior {
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 int a = scanner.nextInt();
		 int b = scanner.nextInt();
		 int c = scanner.nextInt();
		 
		 int maior = (a + b + Math.abs(a - b)) /2;
		 maior = (maior + c + Math.abs(maior - c)) /2;
		 
		 System.out.println(maior +" eh o maior");
		 scanner.close();
	}

}
