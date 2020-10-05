package br.com.ecommerce.implantacao;

import javax.swing.JOptionPane;

import br.com.ecommerce.modelo.Produto;

public class ProdutoTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Produto produto = new Produto ();

		produto.setAll(
				Integer.parseInt(JOptionPane.showInputDialog("ID")),
				JOptionPane.showInputDialog("Descrição"),
				Integer.parseInt(JOptionPane.showInputDialog("Quntidade")), 
				Float.parseFloat(JOptionPane.showInputDialog("ValorCompra")),
				Float.parseFloat(JOptionPane.showInputDialog("ValorVenda")));

		System.out.println(produto.getAll());


	}

}
