package faculdade.pratica.modelosdecodigos;

import java.util.Locale;

public class MetodosNumericosOuTrigonometricos {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		double numero=4;
		
//		Calcula a pot�ncia de X elevado a Y
		System.out.println(numero+" ^ 2 = "+Math.pow(numero, 2));
		
//		Calcula a raiz quadrada de X
		System.out.println("\nMath.sqrt("+numero+") = "+Math.sqrt(numero));
		
//		Calcula a raiz c�bica de X
		numero = 8;
		System.out.println("\nMath.cbrt("+numero+") = "+Math.cbrt(numero));
		
//		Arredonda o n�mero real X para cima ou para baixo transformando-o num inteiro
		numero = 1.5;
		System.out.println("\nMath.round("+numero+") = "+Math.round(numero));
		
//		Arredonda o n�mero real X para cima
		System.out.println("\nMath.ceil("+numero+") = "+Math.ceil(numero));
		
//		Arredonda o n�mero real X para baixo
		System.out.println("\nMath.floor("+numero+") = "+Math.floor(numero));
		
//		Retorna o valor absoluto de X
		numero = -5.89;
		System.out.println("\nMath.abs("+numero+") = "+Math.abs(numero));
		
//		Retorna o valor de PI
		System.out.println("\nMath.PI = "+Math.PI);
		
//		Obt�m e elevado a X (e � neperiano)
		numero = 100;
		System.out.println("\nMath.exp("+numero+") = "+Math.exp(numero));
		
//		Retorna um n�mero aleat�rio entre 0 e 1
		System.out.println("\nMath.random() = "+Math.random());
		
//		Obt�m o logaritmo natural de X
		System.out.println("\nMath.log("+numero+") = "+Math.log(numero));
		
//		Obt�m o logaritmo na base 10 de X
		System.out.println("\nMath.log10("+numero+") = "+Math.log10(numero));
		
//		Converte a medida de X de graus para radianos 
		numero = 180;
		System.out.println("\nMath.toRadians("+numero+") = "+Math.toRadians(numero));
		
//		Converte a medida de X de radianos para graus
		numero = Math.PI;
		System.out.println("\nMath.toDegrees("+numero+") = "+Math.toDegrees(numero));
		
//		Calcula o seno de X (X deve estar representado em radianos)
		System.out.println("\nMath.sin("+numero/2+") = "+Math.sin(numero/2));
		
//		Calcula o cosseno de X (X deve estar representado em radianos)
		System.out.println("\nMath.cos("+numero+") = "+Math.cos(numero));
		
//		Calcula a tangente de X (X deve estar representado em radianos)
		System.out.println("\nMath.tan("+numero+") = "+Math.tan(numero));
	}
}
