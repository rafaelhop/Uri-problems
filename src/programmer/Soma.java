package programmer;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Soma {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		DecimalFormat formact = new DecimalFormat("0.0");
		double A,B,C, media;
		
		A = scanner.nextDouble();
		B = scanner.nextDouble();
		C = scanner.nextDouble();
		media = (A*2 + B*3 + C*5)/10;
		System.out.println("MEDIA = " + formact.format(media));
		scanner.close();
	}

}
