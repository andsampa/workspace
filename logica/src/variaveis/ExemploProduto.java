package variaveis;

import javax.swing.JOptionPane;

public class ExemploProduto {

	public static void main(String[] args) {
		// 
		
		String produto = "";
		int quantidade=0;
		double valor=0;
		
		produto =JOptionPane.showInputDialog("Digite o nome do Produto");
		quantidade =Integer.parseInt(JOptionPane.showInputDialog("Digite a Quantidade"));
		valor=Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do Produto"));
		
		double total = quantidade * valor;
		double desconto = (quantidade * valor) * 0.90;
		
		System.out.println("produto......: " + produto);
		System.out.println("quantidade...: " + quantidade);
		System.out.println("valor........: " + valor);
		System.out.println("total........: " + total);
		System.out.println("Com desconto.: " + desconto);
				
		
				
				

	}

}
