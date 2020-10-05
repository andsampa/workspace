package br.com.universidade.implementacao;

import br.com.universidade.modelo.Formacao;
import br.com.universidade.modelo.Medio;

/*
 * Polimorfismo / Encapsulamento / Herença,
 * Polimorfismo - Encapsulamento, : metodos com o mesmo nomes e ações diferente
 * Tipos 2
 * Overload (sobrecarga)= qdo os metodos estão na mesma classe ( mesmo nome e com ações diferentes).
 * Override (sobescrita) qdo os metodos estão em classe diferentes.
 */

public class TesteFinal {

	public static void main(String[] args) {
		Formacao f=new Medio();
		f.setValor(5000);
		f.definirDuracao();
		System.out.println(f.calcularMensalidade((float)0.05));
		System.out.print(f.getDuracao());
		
		

	}

}
