package programmer;

import java.util.Scanner;

public class Positivos {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] vector  = new int[100];
		int posicao = 0;
		int maior = 0;
		for (int i = 0 ; i<vector.length ; i++) {
			vector[i] = scanner.nextInt();
			if(vector[i] > maior) {
				maior = vector[i];
				posicao = i+1;
			}
		}
		System.out.println(maior);
		System.out.println(posicao);
		scanner.close();
	}

}
