package br.com.lojauati.modelo;

public class Formula2 {
	// Crie um m�todo para preencher todos os atributos - preencherTudo()
	// Crie um m�todo para exibir todos os atributos - exibirTudo()
	// Crie um m�todo para exibir o valor com um desconto de 10% - exibirPromocao()
	// Crie um m�todo para exibir o valor com um desconto que ser�
	// recebido por par�metro - exibirPromocao()

	private String escuderia;
	private float valor;
	private int rpm;
	
	public float exibirPromocao(float porc) {
		return valor - valor * (porc/100);
		
	}
	
	public float exibirPromocao( ) {
		return valor * (float) 0.9;
	}
	
	public String exibirTudo () {
		return escuderia + "\n" + valor + "\n" + rpm;
			}
	
	public void peencherTudo(String p1, float p2 , int p3) {
		escuderia=p1;
		valor=p2;
		rpm=p3;
			
	}
	
	

}

