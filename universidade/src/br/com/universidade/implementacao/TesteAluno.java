package br.com.universidade.implementacao;

import javax.swing.JOptionPane;

import br.com.universidade.modelo.Aluno;
import br.com.universidade.modelo.Endereco;

public class TesteAluno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
 //<criando objeto>   <instanciando>
	Endereco endereco = new Endereco();
	endereco.setLogradouro(JOptionPane.showInputDialog("Logradouro"));
	endereco.setBairro(JOptionPane.showInputDialog("Bairro"));
	endereco.setCidade(JOptionPane.showInputDialog("Cidade"));
	
// n�o preenchemos todos, mais h� necessidade de fazer
	
	Aluno aluno = new Aluno();
// <Aluno esta no Modelo> <aluno estamos criando> <new comando cria��o instanciamento> <Aluno import do modelo> 
	
			aluno.setAll(
			Integer.parseInt(JOptionPane.showInputDialog("RM")),
			JOptionPane.showInputDialog("Nome").toUpperCase(),
			JOptionPane.showInputDialog("Email").toUpperCase(),
			endereco
			);
	
				
	System.out.println(aluno.getAll());
	
	}

}
