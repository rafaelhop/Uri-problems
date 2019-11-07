package programmer;

import java.util.Scanner;

public class Notas {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nt100 = 0, nt50 = 0, nt20 = 0, nr10 = 0, nt5 = 0, nt2 = 0, nt1 = 0;
        double cents, valor, m50 = 0, m25 = 0, m10 = 0, m5 = 0, m1 = 0;
        
        valor = scanner.nextDouble();
        cents = valor*100;

        nt100 = valor / 100.0;
        valor %= 100;
        nt50 = valor / 50.0;
        valor %= 50;
        nt20 = valor / 20.0;
        valor %= 20;
        nr10 = valor / 10.0;
        valor %= 10;
        nt5 = valor / 5.0;
        valor %= 5;
        nt2 = valor / 2.0;
        valor %= 2;
        nt1 = valor / 1.0;
        valor %= 1;
        cents = cents % 100;
        m50 = cents / 50;
        cents %= 50;
        m25 = cents / 25;
        cents %= 25;
        m10 = cents / 10;
        cents %= 10;
        m5 = cents / 5;
        cents %= 5;
        m1 = cents;

        System.out.println("NOTAS:");
        System.out.println((int)nt100 + " nota(s) de R$ 100.00");
        System.out.println((int)nt50 + " nota(s) de R$ 50.00");
        System.out.println((int)nt20 + " nota(s) de R$ 20.00");
        System.out.println((int)nr10 + " nota(s) de R$ 10.00");
        System.out.println((int)nt5 + " nota(s) de R$ 5.00");
        System.out.println((int)nt2 + " nota(s) de R$ 2.00");
        System.out.println("MOEDAS:");
        System.out.println((int)nt1 + " moeda(s) de R$ 1.00");
        System.out.println((int)m50 + " moeda(s) de R$ 0.50");
        System.out.println((int)m25 + " moeda(s) de R$ 0.25");
        System.out.println((int)m10 + " moeda(s) de R$ 0.10");
        System.out.println((int)m5 + " moeda(s) de R$ 0.05");
        System.out.println((int)m1 + " moeda(s) de R$ 0.01");
        scanner.close();
	}

}
