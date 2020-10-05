package br.com.universidade.modelo;

public class Curso {
	
	private String sigla;
	private String dataLancamento;
	private Formacao formacao;
	
	
	
	public String getAll() {
		return
				"Sigla: " + sigla + "\n" +
				"DataLancamento: " + dataLancamento + "\n" +
				formacao.getAll();
		
	}
	
	public void SetAll(String sigla, String dataLancamento, Formacao formacao) {
		this.sigla = sigla;
		this.dataLancamento = dataLancamento;
		this.formacao = formacao;
	}
	
	
	
	
	public Curso() {
		super();
	}
	public Curso(String sigla, String dataLancamento, Formacao formacao) {
		super();
		this.sigla = sigla;
		this.dataLancamento = dataLancamento;
		this.formacao = formacao;
	}
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	public String getDataLancamento() {
		return dataLancamento;
	}
	public void setDataLancamento(String dataLancamento) {
		this.dataLancamento = dataLancamento;
	}
	public Formacao getFormacao() {
		return formacao;
	}
	public void setFormacao(Formacao formacao) {
		this.formacao = formacao;
	}
}
		
	