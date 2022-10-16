package faculdade.pratica.modelosdecodigos;

public class MetodosStrings {
	public static void main(String[] args) {
		String texto = "Ricardo Luiz de Freitas", texto2;
		
		System.out.println("Quantidade de caracteres = " + texto.length()); // 23
		
		System.out.println("Pegar 'Luiz' no texto = " + texto.substring(8, 12)); // "Luiz"
		
		System.out.println("Posi��o de 'Luiz' = " + texto.indexOf("Luiz")); // 8
		
		System.out.println("Tudo mai�sculo = " + texto.toUpperCase()); // "RICARDO LUIZ DE FREITAS"
		
		System.out.println("Tudo min�sculo = " + texto.toLowerCase()); // "ricardo luiz de freitas"
		
		System.out.println(texto.substring(9, 14)); // "uiz d" coloca-se 14, mas na verdade s� vai at� a posi��o 13
		
		System.out.println(texto.substring(13, 19)); // "de Fre"
		
		texto2 = "Dr. " + texto + " Filho";
		
		System.out.println(texto2); // "Dr. Ricardo Luiz de Freitas Filho"
	}
}
