package br.com.lojauati.teste;

import br.com.lojauati.modelo.Formula2;

public class TesteFormula2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// "\" = quebra linha
		
		Formula2 objeto = new Formula2();
		objeto.peencherTudo("mclaren",(float)150000.50, 1000);
		System.out.println(objeto.exibirTudo());
		System.out.println(objeto.exibirTudo());
		System.out.println(objeto.exibirPromocao());
		System.out.println(objeto.exibirPromocao(50));
		
		

	}

}
