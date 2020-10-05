package repeticao;

import javax.swing.JOptionPane;

public class ExemploWhileTeste {

	public static void main(String[] args) {
		/*
		 * 
		 */
		String nome = JOptionPane.showInputDialog("Digite seu nome");
		while (nome.length()<5 || nome.length()>15) {
			nome = JOptionPane.showInputDialog("Digite Novamente");
		
			
		}
		
		 System.out.println("Nome Correto..:" + nome);
	
		}

}
