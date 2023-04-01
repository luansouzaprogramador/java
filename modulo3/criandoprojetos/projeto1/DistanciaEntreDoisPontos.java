package faculdade.pratica.modulo3.criandoprojetos.projeto1;

import javax.swing.JOptionPane;

public class DistanciaEntreDoisPontos {
	public static void CalculaDistanciaEntreDoisPontos() {
		String x1Str, y1Str, x2Str, y2Str;
		double x1, y1, x2, y2, distancia;
		
		JOptionPane.showMessageDialog(null, "Informe as coordenadas X e Y de dois pontos no plano cartesiano e saiba a distancia entre eles.", "Plano Cartesiano", JOptionPane.INFORMATION_MESSAGE);
		
		x1Str = JOptionPane.showInputDialog(null, "X: ", "1o ponto", JOptionPane.QUESTION_MESSAGE);
		y1Str = JOptionPane.showInputDialog(null, "Y: ", "1o ponto", JOptionPane.QUESTION_MESSAGE);
		x2Str = JOptionPane.showInputDialog(null, "X: ", "2o ponto", JOptionPane.QUESTION_MESSAGE);
		y2Str = JOptionPane.showInputDialog(null, "Y: ", "2o ponto", JOptionPane.QUESTION_MESSAGE);
		
		x1 = Double.valueOf(x1Str);
		y1 = Double.valueOf(y1Str);
		x2 = Double.valueOf(x2Str);
		y2 = Double.valueOf(y2Str);
		distancia = Math.sqrt(Math.pow((x1-x2),2) + Math.pow((y1-y2),2));
		
		JOptionPane.showMessageDialog(null, String.format("A distancia entre os pontos informados e %.2f", distancia), "Plano Cartesiano", JOptionPane.INFORMATION_MESSAGE);
	}
}
