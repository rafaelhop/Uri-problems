package programmer;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Media {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		DecimalFormat format = new DecimalFormat("0.0");
		
		double n1 = scanner.nextDouble();
		double n2 = scanner.nextDouble();
		double n3 = scanner.nextDouble();
		double n4 = scanner.nextDouble();
		
		double media = (n1*2 +n2*3 +n3*4 +n4*1)/10;
		System.out.println("Media: "+format.format(media));
		
		if (media >=7.0) {
			System.out.println("Aluno aprovado.");
		}
		else if (media< 5.0) {
			System.out.println("Aluno reprovado.");
		}
		else if (media>=5.0 && media <=6.9) {
			System.out.println("Aluno em exame.");
			double exame = scanner.nextDouble();
			System.out.println("Nota do exame: " +format.format(exame));
			media = (exame+media)/2; 
			if(media>= 5.0) {
				System.out.println("Aluno aprovado.");
				System.out.println("Media final: "+format.format(media));
			} else {
				System.out.println("Aluno reprovado.");
				System.out.println("Media final: "+format.format(media));
			}
		}
		scanner.close();
	}

}
