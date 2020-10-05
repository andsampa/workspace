package br.com.universidade.modelo;

import br.com.universidade.padroes.PadraoFormacao;

/*
 * implements pode ser mais que uma sepadaras por virgula
 * extends (pai) pode ter somente uma.
 * Aparece erro no nome da classe (ex. Medio) clicar com direito e ADD, no final vai aparecer os padroes;
 */

public class Medio extends Formacao implements PadraoFormacao {
	
	private int tipo;
	
	public String getAll () {
		return
				super.getAll() + "\n" +
				"Tipo: " + tipo;
		
	}
	
	public void setAll(float valor, String descricao, int duracao, int tipo) {
		super.setAll(valor, descricao, duracao);
		this.tipo = tipo;
	}

	public Medio() {
		super();
	}

	public Medio(float valor, String descricao, int duracao, int tipo) {
		super(valor, descricao, duracao);
		this.tipo = tipo;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	@Override
	public double calcularMensalidade(float fator) {
			return getValor()/36 * fator;
	}

	@Override
	public void definirDuracao() {
		setDuracao (36);
		
	}
	
	
	

}
