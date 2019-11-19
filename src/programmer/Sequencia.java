package programmer;

import java.util.Scanner;

public class Sequencia {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int m = scanner.nextInt();
		int n = scanner.nextInt();
		int sum = 0;
		while (m > 0 && n > 0) {
			if (m < n) {
				for (int i = m; i <= n; i++) {
					sum += i;
					System.out.print(i+" ");
				}
			} 
			else {
				for (int i = n; i <= m; i++) {
					System.out.print(i+" ");
					sum += i;
				}
			}
			System.out.print("Sum=" + sum);
			sum = 0;
			m = scanner.nextInt();
			n = scanner.nextInt();
		}
		scanner.close();
	}

}
