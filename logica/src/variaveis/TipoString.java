package variaveis;

public class TipoString {

	public static void main(String[] args) {
		
		String email = "LEaNdro.coRSo@GmaiL.com";
		System.out.println("Original: " + email);
		System.out.println("Minusculas: " + email.toLowerCase());
		System.out.println("Maiusc�las: " + email.toUpperCase());
		System.out.println("Tamanho: " + email.length());
		System.out.println("Terceiro Caracter:" + email.charAt(2));
		System.out.println("Tem @? " + email.contains("@"));
		System.out.println("Posi��o do @: " + email.indexOf("@"));
		System.out.println("Do 3� ao 5�: " + email.substring(2,5));
		System.out.println("Primeira metade: " + email.substring(0, email.length()/2));
		System.out.println("Segunda metade: " + email.substring(email.length()/2));
		System.out.println("Usu�rio: " + email.substring(0, email.indexOf("@")) );
		System.out.println("Servidor: " +email.substring(email.indexOf("@")+1));
		System.out.println("� igual leandro@itau? " + email.equals("leandro@itau"));
		
		
		
		
		
	}

}