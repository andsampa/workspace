package variaveis;

import javax.swing.JOptionPane;

public class ManipulaString {

	public static void main(String[] args) {
		// == =>> comparativo somente para primitivos
		// equals => comparativo de string
		
		String email = JOptionPane.showInputDialog("Email");
		System.out.println("Original : " + email);
		System.out.println("Minusculo: " + email.toLowerCase());
		System.out.println("Maiusculo: " +email.toUpperCase());
		System.out.println("Posicao do @ : " + email.indexOf("@"));
		System.out.println("Existe @?" + email.contains("@"));
		System.out.println("Qtdade caracteres: " + email.length());
		System.out.println("Do 2 ao 4: " + email.substring(1,4));
		System.out.println("A partir do 2º: " + email.substring(1));
		System.out.println("Usuario: " + email.substring(0,email.indexOf("@")));
		System.out.println("A partir Servidor: " + email.substring(email.indexOf("@")+1));
		System.out.println("Servidor Unico: " + email.substring(email.indexOf("@")+1,email.indexOf(".com")));
		System.out.println("Primeira Metade: " + email.substring(0, email.length()/2));
		System.out.println("Comparação...................: " +(email.equals("ma.guga@globo.com")));
		System.out.println("Comparação Sem Case Sensitive: " + (email.equalsIgnoreCase("ma.guga@globo.com")));
		
		
		
		
		
		
		
		
		//a n d e r s o n @fiap.com.br
		//0 1 2 3 4 5 6 7 8
		
	}
}


