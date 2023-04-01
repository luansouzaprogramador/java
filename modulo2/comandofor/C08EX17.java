package faculdade.pratica.modulo2.comandofor;

public class C08EX17 {
	// Autor: Luan Marcelino de Souza
	public static void main(String[] args) {
		double y;
		
		for (int x=3; x<=12; x++) {
			y = Math.sqrt(Math.pow(x, 2)-3);
			System.out.println(String.format("x = "+x+"       f(x) = %1.4f",  y));
		}
	}
}