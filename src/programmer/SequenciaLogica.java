package programmer;

import java.util.Scanner;

public class SequenciaLogica {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a,b,c,d;
		int n = scanner.nextInt();
		if (n > 0) {
			for (int i = 1; i <=n; i++) {
				a= i*i;
				b = i*i*i;
				System.out.println(i +" "+ a +" "+ b);
				c = a+1;
				d = b+1;
				System.out.println(i+" "+c+" "+d);
			}
			scanner.close();
		}
	}

}
