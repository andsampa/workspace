package repeticao;

import javax.swing.JOptionPane;

public class ExemploDo {

	public static void main(String[] args) {
		/*
		 * char = armazenar 1 caracter ( ''
		 * String - armazenar todo caracter ( "")
		 * Tipos primitivos inicia com letra minuscula
		 * 
		 * 
		 */
		char resposta=0;
		int valor1=0;
		int valor2=0;
		char opcao=0;
		
		do {
		valor1=Integer.parseInt(JOptionPane.showInputDialog("Valor 1"));
		valor2=Integer.parseInt(JOptionPane.showInputDialog("Valor 2"));
		
		opcao = JOptionPane.showInputDialog("Digite o operador aritm�trico").charAt(0);
		
		if (opcao== '+') {
			System.out.println("Soma: " + (valor1+valor2));
		} else if (opcao== '-') {
			System.out.println("Subtra��o : " + (valor1-valor2));
		} else if (opcao== '*') {
			System.out.println("Multiplica��o: " + (valor1*valor2));
		}  else if (opcao== '/') {
				System.out.println("Divis�o: " + (valor1+valor2));
			} else  {
				System.out.println("Opera��o n�o reconhecida");	
				}
		
		resposta = JOptionPane.showInputDialog("Digite <S> para continuar").toUpperCase().charAt(0);
		}
		
		while (resposta=='S');

	}

	}
