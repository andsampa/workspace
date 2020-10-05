package br.com.universidade.modelo;

import br.com.universidade.padroes.PadraoFormacao;

public class Bacharelado extends Formacao implements PadraoFormacao {
	
	private String projetoConclusao;
	private int cargaEstagio;
	
	public String getAll() {
		return
				super.getAll() + "\n" +
				"ProjetoConclusao: " + projetoConclusao + "\n" +
				"CargaEstagio " + cargaEstagio;
		
	}
	
	public void setAll (float valor, String descricao, int duracao, String projetoConclusao, int cargaEstagio) {
		super.setAll(valor, descricao, duracao);
		this.projetoConclusao = projetoConclusao;
		this.cargaEstagio = cargaEstagio;
	}
	
	
	
	public Bacharelado() {
		super();
	}
	public Bacharelado(float valor, String descricao, int duracao, String projetoConclusao, int cargaEstagio) {
		super(valor, descricao, duracao);
		this.projetoConclusao = projetoConclusao;
		this.cargaEstagio = cargaEstagio;
	}
	public String getProjetoConclusao() {
		return projetoConclusao;
	}
	public void setProjetoConclusao(String projetoConclusao) {
		this.projetoConclusao = projetoConclusao;
	}
	public int getCargaEstagio() {
		return cargaEstagio;
	}
	public void setCargaEstagio(int cargaEstagio) {
		this.cargaEstagio = cargaEstagio;
	}

	@Override
	public double calcularMensalidade(float fator) {
		// TODO Auto-generated method stub
		return getValor()/48 * fator;
	}

	@Override
	public void definirDuracao() {
		// TODO Auto-generated method stub
		setDuracao(48);
		
	}
	
	

}
