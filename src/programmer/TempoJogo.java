package programmer;

import java.util.Scanner;

public class TempoJogo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int duracaoHora=0, duracaoMinutos=0;
		
		int horaInicial = scanner.nextInt();
		int minInicial  = scanner.nextInt();
		int horaFinal = scanner.nextInt();
		int minFinal = scanner.nextInt();
		
		if(horaInicial< horaFinal && minFinal > minInicial) {
			duracaoHora = horaFinal - horaInicial;
			duracaoMinutos = minFinal - minInicial;
		}
		else if (horaFinal == horaInicial && minFinal == minInicial) {
			duracaoHora =  horaFinal - horaInicial +24;
			duracaoMinutos = minFinal - minInicial;
		}
		else if (horaInicial< horaFinal && minInicial> minFinal) {
			duracaoHora = horaInicial - horaFinal;
			if(duracaoHora<= 0) {
				duracaoHora = 0;
				duracaoMinutos = minFinal - minInicial + 60;
			}
			
		}
		else if(horaInicial > horaFinal) {
				duracaoHora =24 -(horaInicial - horaFinal);
				if(minInicial> minFinal) {
					duracaoMinutos =60 -( minInicial - minFinal);
				}else {
					duracaoMinutos = minFinal - minInicial;
				}
			}
		scanner.close();
		System.out.println("O JOGO DUROU "+duracaoHora+" HORA(S) E "+duracaoMinutos+" MINUTO(S)");
	}

}
