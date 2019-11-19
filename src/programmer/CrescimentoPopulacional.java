package programmer;

import java.util.Scanner;

public class CrescimentoPopulacional {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int pa, pb, anos = 0;
		double g1, g2;
		int t = scanner.nextInt();
		if (t > 0 && t < 3001) {
			for (int i = 0; i < t; i++) {
				pa = scanner.nextInt();
				pb = scanner.nextInt();
				if (pa > 99 && pa < 1000000 && pa < pb && pb < 1000000) {
					g1 = scanner.nextDouble();
					g2 = scanner.nextDouble();
					if (g1 > 0.0 && g1 < 10.1 && g2 >= 0.0 && g2 < 10.1 && g2 < g1) {
						while (pa <= pb) {
							pa += (int) Math.floor(( g1/100)*pa);
							pb += (int) Math.floor(( g2/100)*pb);
							anos++;
							if (anos > 100) {
								System.out.println("Mais de 1 seculo.");
								break;
							}
						}
						if(anos < 101) {
							System.out.println(anos + " anos.");
						}
						anos = 0;
						pa = 0;
						pb = 0;
						g1 = 0.0;
						g2 = 0.0;
					}
				}

			}
			scanner.close();
		}

	}

}
