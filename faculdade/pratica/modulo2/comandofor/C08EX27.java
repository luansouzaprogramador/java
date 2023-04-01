package faculdade.pratica.modulo2.comandofor;

public class C08EX27 {
	// Autor: Luan Marcelino de Souza
	public static void main(String[] args) {
		for (int aux3=1; aux3<=10; aux3++) {
			for (int aux2=0; aux2<=7; aux2++) {
				for (int aux=1; aux<=Math.pow(2, aux2); aux++)
					System.out.print("*");
				System.out.println();
			}
			
			for (int aux2=6; aux2>=0; aux2--) {
				for (int aux=1; aux<=Math.pow(2, aux2); aux++)
					System.out.print("*");
				System.out.println();
			}
		}
	}
}