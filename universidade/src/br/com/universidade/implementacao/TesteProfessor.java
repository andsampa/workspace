package br.com.universidade.implementacao;

import javax.swing.JOptionPane;

import br.com.universidade.modelo.Endereco;
import br.com.universidade.modelo.Professor;

public class TesteProfessor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Endereco endereco = new Endereco();
		endereco.setLogradouro(JOptionPane.showInputDialog("Logradouro"));
		endereco.setBairro(JOptionPane.showInputDialog("Bairro"));
		endereco.setCidade(JOptionPane.showInputDialog("Cidade"));
		
		
	// n�o preenchemos todos, mais h� necessidade de fazer
		
		Professor professor= new Professor ();
				
		professor.setAll(
				Integer.parseInt(JOptionPane.showInputDialog("ID")),
				JOptionPane.showInputDialog("NOME").toUpperCase(),
				Float.parseFloat(JOptionPane.showInputDialog("valor hora")),
				JOptionPane.showInputDialog("FORMA��O").toUpperCase(),
				professor.setEndereco(endereco);
		
		
		System.out.println(professor.getAll());
		
	}
	
	
	

	
}