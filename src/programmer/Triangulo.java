package programmer;

import java.util.Scanner;

public class Triangulo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double A, B, C, A2, B2, C2, maior,medio, menor;

		A = input.nextDouble();
		B = input.nextDouble();
		C = input.nextDouble();
		
		maior = A;
		medio = B;
		menor = C;
		
		if(B> A && B> C) {
			maior =B;
			if(A> C) {
				medio = A;
				menor = C;
			} else {
				medio= C;
				menor = A;
			}
		}
		else if (C> A && C > B) {
			maior =C;
			if (A> B) {
				medio = A;
				menor = B;
			} else {
				medio = B;
				menor = A;
			}
		}
		else if (A==B && B> C) {
			maior =A;
			medio =B;
			menor = C;
		}
		else if(A==C && B> A) {
			maior= B;
			medio = A;
			menor = C;
		}else if (A==B && C> A) {
			maior =C;
			medio = A;
			menor = B;
		}
		
		A = maior;	
		B = medio;
		C = menor;

		A2 = A*A;
		B2 = B*B;
		C2 = C*C;

		if (A >= (B + C)) {
			System.out.println("NAO FORMA TRIANGULO");
		}
		else if ((A2) == (B2 + C2)) {
			System.out.println("TRIANGULO RETANGULO");
		}
		else if ((A2) > (B2 + C2)) {
			System.out.println("TRIANGULO OBTUSANGULO");
		}
		else if ((A2) < (B2 + C2)) {
			System.out.println("TRIANGULO ACUTANGULO");
		}
		 if ((A == B) & (B == C)) {
			System.out.println("TRIANGULO EQUILATERO");
		}
		 else if ((B == C)||(A == C)||(A == B)) {
			System.out.println("TRIANGULO ISOSCELES");
		}
		 input.close();
	}

}
