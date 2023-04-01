/*
package faculdade.pratica.modulo1.expressoesaritmeticas;

import java.util.Scanner;

public class C05ex12 {
	// Autor: Luan Marcelino de Souza
	public static void main(String[] args) {
		long duracaoEvento;
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("Informe o tempo de duração do evento, em segundos: ");
		duracaoEvento = teclado.nextLong();
		System.out.println("\nO evento teve duração total de "+duracaoEvento/3600+" hora(s) "+Math.abs(duracaoEvento-3600*(duracaoEvento/3600))/60+" minuto(s) e "+Math.abs(duracaoEvento-3600*(duracaoEvento/3600))%60+" segundo(s).");
		teclado.close();
	}
}
*/
package faculdade.pratica.modulo1.expressoesaritmeticas;

import javax.swing.JOptionPane;

public class C05ex12 {
	// Autor: Luan Marcelino de Souza
	public static void main(String[] args) {
		String duracaoEventoStr;
		long duracaoEvento, horas, minutos, segundos;
		
		duracaoEventoStr = JOptionPane.showInputDialog(null, "Informe o tempo de duração do evento, em segundos:", "Duração Evento", JOptionPane.QUESTION_MESSAGE);
		duracaoEvento = Long.valueOf(duracaoEventoStr);
		horas = duracaoEvento/3600;
		minutos = Math.abs(duracaoEvento-3600*(duracaoEvento/3600))/60;
		segundos = Math.abs(duracaoEvento-3600*(duracaoEvento/3600))%60;
		
		JOptionPane.showMessageDialog(null, "O evento teve duração total de "+horas+" hora(s), "+minutos+" minuto(s) e "+segundos+" segundo(s).", "Duração Evento", JOptionPane.INFORMATION_MESSAGE);
	}
}