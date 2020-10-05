package br.com.lojauati.modelo;

public class Formula1 {

	/*
	 * sinal "-" no grafico padr�o visibilidade UML (astah) representa o private no java, podendo ser
	 * alterada (public....)
	 * private seguran�a do produto
	 * Sintaxe para cria��o de metodos do java
	 * - <modificador> <tipo do retorno> <nome do metodo> (<tipo do param> <nome do parametro>) {....}
	 */

	private String escuderia;
	private float valor;
	private int rpm;

	public String exibirEscuderia() {
		return escuderia; 
	}

	public float exibirValor() {
		return valor;
	}
	public void preencherValor(float parametro) {
		if (parametro >0) {
			valor=parametro;
		};
	}
	public void preencherRpm (int parametro) {
		rpm=parametro ;
	}

	public int exibirRpm () {
		return rpm;
	}

	public void preencherEscuderia(String parametro) {
		escuderia = parametro.toUpperCase();
	}

}

