package programmer;

import java.util.Scanner;

public class TempoEvento {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String diaInicio = scanner.nextLine();
		String horaInicial = scanner.nextLine();
		String diaFinal = scanner.nextLine();
		String horaFinal = scanner.nextLine();
		
		diaInicio = diaInicio.replaceAll(" ", "");
		diaFinal = diaFinal.replaceAll(" ", "");
		int diaI = Integer.parseInt(diaInicio.substring(3));
		int diaF = Integer.parseInt(diaFinal.substring(3));
		
		horaInicial = horaInicial.replaceAll(" ", "");
		horaFinal = horaFinal.replaceAll(" ", "");
		
		int horaIni = Integer.parseInt(horaInicial.substring(0,2));
		int minIni = Integer.parseInt(horaInicial.substring(3,5));
		int segIni = Integer.parseInt(horaInicial.substring(6,7));
		
		int horaFin = Integer.parseInt(horaFinal.substring(0,2));
		int minFin = Integer.parseInt(horaFinal.substring(3,5));
		int segFin = Integer.parseInt(horaFinal.substring(6,7));
		
		int dias = diaF - diaI;
		int horas  = horaFin - horaIni;
		int minutos =  minFin - minIni;
		int segundos = segFin - segIni;
		
		if (segundos < 0) {
			segundos += 60;
			minutos--;
		}
		
		if (minutos < 0) {
			minutos += 60;
			horas--;
		}
		
		if (horas < 0) {
			horas += 24;
			dias--;
		}
		System.out.println(dias + " dia(s)");
		System.out.println(horas + " hora(s)");
		System.out.println(minutos + " minuto(s)");
		System.out.println(segundos + " segundo(s)");
		scanner.close();
	}

}
