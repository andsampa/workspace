package br.com.lojauati.teste;

import br.com.lojauati.modelo.Elevador;

public class TesteElevador {

	public static void main(String[] args) {
		/*
		 * importar control + shift + O;
		 * 
		 * construtor <Elevador objeto> = Casa sem paredes internas -
		 * construtor - sem retorno
		 * construtor -sempre nome da classe
		 * Instancia segue a configura�ao do construtor, n�o � possivel alterar,
		 * 
		 * 
		 */
		
		Elevador objeto= new Elevador(50, 15);
		
		Elevador outro= new Elevador (); // cria��o de novo construtor com 2 regras no construtor
		
		
		System.out.println(objeto.exibirTudo());
		objeto.preencherCapacidadePessoas(10);
		objeto.preencherMaiorAndar(20);
		objeto.preencherMenorAndar(0);
		System.out.println("=======================");
		System.out.println(objeto.exibirTudo());
		objeto.entrar(5);
		objeto.subir();
		objeto.subir();
		objeto.subir();
		objeto.subir();
		objeto.sair(2);;
		System.out.println("=======================");
		System.out.println(objeto.exibirTudo());
		objeto.descer();
		objeto.descer();
		objeto.descer();
		objeto.descer();
		System.out.println("=======================");
		System.out.println(objeto.exibirTudo());
		
		
	}

}
