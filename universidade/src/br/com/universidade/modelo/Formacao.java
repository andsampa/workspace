package br.com.universidade.modelo;

import br.com.universidade.padroes.PadraoFormacao;

public class Formacao implements PadraoFormacao {

	/*
	 * class protecter permite que os filhos compartilhe os a classe;( ex.: (#)protecter float valor;
	 * package sem atribuito de modificador na classe , libera permissão para as classes do mesmo pacote. 
	 */
	
	private float valor;
	private String descricao;
	private int duracao;
	
	public String getAll() {
		return
				"Valor : " + valor +"\n" +
				"Descricao: " + descricao + "\n" +
				"Duracao: " + duracao;
		
		
	}
	
	public void setAll (float valor,String descricao, int duracao) {
		this.valor=valor;
		this.descricao=descricao;
		this.duracao=duracao;
		
	}
	
	
	public Formacao(float valor, String descricao, int duracao) {
		super();
		this.valor = valor;
		this.descricao = descricao;
		this.duracao = duracao;
		
		
	}
	public Formacao() {
		super();
		
		
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getDuracao() {
		return duracao;
	}
	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

	@Override
	public double calcularMensalidade(float fator) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void definirDuracao() {
		// TODO Auto-generated method stub
		
	}
	
	

}
