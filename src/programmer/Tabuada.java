package programmer;

import java.util.Scanner;

public class Tabuada {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		for (int i = 1 ; i <=10 ; i++) {
			System.out.println(i+" x "+num +" = "+ i*num);
		}
		scanner.close();
	}

}
