package faculdade.pratica.modulo2.comandofor;

public class C08EX26 {
	// Autor: Luan Marcelino de Souza
	public static void main(String[] args) {
		for (int aux3=1; aux3<=10; aux3++) {
			for (int aux2=1; aux2<=10; aux2++) {
				for (int aux=1; aux<=aux2; aux++) {
					if (aux==aux2)
						System.out.print("*");
					else
						System.out.print(" ");
				}
				System.out.println();
			}
			
			for (int aux2=10; aux2>=1; aux2--) {
				for (int aux=1; aux<=aux2; aux++) {
					if (aux==aux2)
						System.out.print("*");
					else
						System.out.print(" ");
				}
				System.out.println();
			}
		}
	}
}