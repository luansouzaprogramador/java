package faculdade.pratica.modulo1.scannereprint;

import javax.swing.JOptionPane;

public class C04ex04 {
	// Autor: Luan Marcelino de Souza
	public static void main(String[] args) {
		String primeiroNome, nomeMeio, sobrenome, idadeSrt;
		int idade;
		
		primeiroNome = JOptionPane.showInputDialog(null, "Digite seu primeiro nome: ", "Informações Pessoais", JOptionPane.QUESTION_MESSAGE);
		nomeMeio = JOptionPane.showInputDialog(null, "Digite seu nome do meio: ", "Informações Pessoais", JOptionPane.QUESTION_MESSAGE);
		sobrenome = JOptionPane.showInputDialog(null, "Digite seu sobrenome: ", "Informações Pessoais", JOptionPane.QUESTION_MESSAGE);
		idadeSrt = JOptionPane.showInputDialog(null, "Digite sua idade", "Informações Pessoais", JOptionPane.QUESTION_MESSAGE);
		idade = Integer.valueOf(idadeSrt).intValue();
		JOptionPane.showMessageDialog(null, sobrenome+", "+primeiroNome+" "+nomeMeio+"\nIdade: "+idade+" anos.", "Informações Pessoais", JOptionPane.INFORMATION_MESSAGE);
   }
}