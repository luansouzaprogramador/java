/*
package faculdade.pratica.modulo1.expressoesbooleanas;

import java.util.Scanner;

public class C06ex13 {
	// Autor: Luan Marcelino de Souza
	public static void main(String[] args) {
		int horaInicial, minutoInicial, horaFinal, minutoFinal, totalMinutos, totalHoras;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Duração de um jogo");
		System.out.print("\nHora inicial: ");
		horaInicial = teclado.nextInt();
		System.out.print("Minuto inicial: ");
		minutoInicial = teclado.nextInt();
		System.out.print("\nHora final: ");
		horaFinal = teclado.nextInt();
		System.out.print("Minuto final: ");
		minutoFinal = teclado.nextInt();
		
		if (minutoFinal-minutoInicial < 0) {
			minutoFinal += 60;
			horaFinal--;
		}
		totalMinutos = minutoFinal-minutoInicial;
		totalHoras = horaFinal-horaInicial;
		
		System.out.println("-----------------------------------------------");
		System.out.println("O jogo durou "+totalHoras+" hora(s) e "+totalMinutos+" minuto(s).");
	}
}
*/
package faculdade.pratica.modulo1.expressoesbooleanas;

import javax.swing.JOptionPane;

public class C06ex13 {
	// Autor: Luan Marcelino de Souza
	public static void main(String[] args) {
		String horaInicialStr, minutoInicialStr, horaFinalStr, minutoFinalStr;
		int horaInicial, minutoInicial, horaFinal, minutoFinal, totalMinutos, totalHoras;
		
		horaInicialStr = JOptionPane.showInputDialog(null, "Hora inicial:", "Duração de um jogo", JOptionPane.QUESTION_MESSAGE);
		minutoInicialStr = JOptionPane.showInputDialog(null, "Minuto inicial:", "Duração de um jogo", JOptionPane.QUESTION_MESSAGE);
		horaFinalStr = JOptionPane.showInputDialog(null, "Hora final:", "Duração de um jogo", JOptionPane.QUESTION_MESSAGE);
		minutoFinalStr = JOptionPane.showInputDialog(null, "Minuto final:", "Duração de um jogo", JOptionPane.QUESTION_MESSAGE);
		
		horaInicial = Integer.valueOf(horaInicialStr);
		minutoInicial = Integer.valueOf(minutoInicialStr);
		horaFinal = Integer.valueOf(horaFinalStr);
		minutoFinal = Integer.valueOf(minutoFinalStr);
		
		if (minutoFinal-minutoInicial < 0) {
			minutoFinal += 60;
			horaFinal--;
		}
		totalMinutos = minutoFinal-minutoInicial;
		totalHoras = horaFinal-horaInicial;
		if (totalHoras<0) {
			totalHoras = 24 + totalHoras;
		}
		
		JOptionPane.showMessageDialog(null, "O jogo durou "+totalHoras+" hora(s) e "+totalMinutos+" minuto(s).", "Duração de um jogo", JOptionPane.INFORMATION_MESSAGE);
	}
}