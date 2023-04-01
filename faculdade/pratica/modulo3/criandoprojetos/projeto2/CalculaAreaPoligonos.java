package faculdade.pratica.modulo3.criandoprojetos.projeto2;

public class CalculaAreaPoligonos {
	public static double AreaQuadrado() {
		double lado;
		System.out.print("Informe o valor do lado: ");
		lado = MenuPrincipal.teclado.nextDouble();
		return Math.pow(lado, 2);
	}
	
	public static double AreaRetangulo() {
		double comprimento, largura;
		System.out.print("Informe o valor do comprimento: ");
		comprimento = MenuPrincipal.teclado.nextDouble();
		System.out.print("Informe o valor da largura: ");
		largura = MenuPrincipal.teclado.nextDouble();
		return comprimento*largura;
	}
	
	public static double AreaTrianguloRetangulo() {
		double base, altura;
		System.out.print("Informe o valor da base: ");
		base = MenuPrincipal.teclado.nextDouble();
		System.out.print("Informe o valor da altura: ");
		altura = MenuPrincipal.teclado.nextDouble();
		return base*altura/2;
	}
	
	public static double AreaCirculo() {
		double raio;
		System.out.print("Informe o valor do raio: ");
		raio = MenuPrincipal.teclado.nextDouble();
		return Math.PI*Math.pow(raio, 2);
	}
}
