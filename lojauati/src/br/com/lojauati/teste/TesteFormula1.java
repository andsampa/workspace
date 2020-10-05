package br.com.lojauati.teste;




import javax.swing.JOptionPane;

import br.com.lojauati.modelo.Formula1;

public class TesteFormula1 {

	public static void main(String[] args) {


		Formula1 objeto; 

		Formula1 carro = new Formula1(); 
		
		 

		carro.preencherRpm(Integer.parseInt(JOptionPane.showInputDialog("RPM")));
		carro.preencherValor(Integer.parseInt(JOptionPane.showInputDialog("Valor")));
		carro.preencherEscuderia(JOptionPane.showInputDialog("Digite a escuderia"));


		System.out.println(carro.exibirEscuderia());
		System.out.println("Valor : " + carro.exibirValor());
		System.out.println("RPM : " + carro.exibirRpm());

	}

}

// objeto (carro) define na memoria (criado para os parametros.
//criando um objeto - ele buscar no projeto o arquivo 
//ex. criar casa somente com as paredes externas
//objeto.preencherEscuderia("ferrari")- Não funciona naçoa foi instanciado

// control+shift+o importar
//Nesse caso instanciando um objeto
// ex. instanciamento: criar todas as paredes interna das casas