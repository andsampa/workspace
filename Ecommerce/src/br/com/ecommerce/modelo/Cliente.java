package br.com.ecommerce.modelo;

/*
 * DTO (Parts)=> Modelo /Beans /JavaBeans.
 * 1 -Todos atributos devem ser privados;
 * 2 -Todos devem ter individualmente o get/set (getter e setter) e setALL
 * 3- Para ser considerado um beans Toda classe deve possuir no minimo dois construtores ( Um vazio e outro cheio - com todos os atributos)
 * Criar construtor pela ferramenta >>Source Generate Constructor
 * 
 */

public class Cliente {
	
	private int id;
	private String nome;
	private Endereco endereco;
	


	
	
	
	public Cliente(int id, String nome, Endereco endereco) {
		super();
		this.id = id;
		this.nome = nome;
		this.endereco = endereco;
	}

	
	
	public Cliente () {
		//construtor vazio
	}
	
	public String getALL() {
		return
				"ID.........: " + id +"\n" +
				"Nome.......: " + nome + "\n"+
				"Endereco...: " + endereco.getAll();
	}
				
	
	
	public void setAll (int id,String nome, Endereco endereco) {
		this.id=id;
		this.nome=nome;
		this.endereco=endereco;
	}
	
	
	
	public Endereco getEndereco() {
		return endereco;
	}




	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}




	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
	
}