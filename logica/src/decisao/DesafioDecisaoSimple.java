package decisao;

import javax.swing.JOptionPane;

public class DesafioDecisaoSimple {

	public static void main(String[] args) {
		/*
		* Solicitar: nome e a idade da pessoa e ir�o exibir:
		*
		* "� obrigado a votar" => maior ou igual a 18 e menor que 70
		* "Voto facultativo" => 16, 17 ou mais que 70
		* "N�o pode votar" => menores de 16 anos
		*/
		
		String nome = JOptionPane.showInputDialog("Digite seu Nome").toUpperCase();
		short idade = Short.parseShort(JOptionPane.showInputDialog("Digite a sua Idade"));
		
		if (idade<16) {
			System.out.println("N�o pode votar");}
		
		if(idade>=18 && idade<=70) {
			System.out.println("Obrigado a votar");	}
		
		if (idade==16 || idade==17 || idade>70) {
			System.out.println("N�o � Obrigado a votar");}
				
		
		

	}

}
