package repeticao;

import javax.swing.JOptionPane;

public class ExercicioGeral {

	public static void main(String[] args) {
		/*
		 * Monte uma aplica��o que solicite a idade e o nome das pessoas.
		 * Ao terminar (o usu�rio respondeu que n�o quer continuar),
		 * A aplica��o dever� exibir:
		 * - a pessoa mais velha (nome), (3)
		 * - a pessoa mais nova (nome), (4)
		 * - a quantidade de pessoas maiores de idade e (1)
		 * - a m�dia entre as idades que foram digitadas. (2)
		 */

		char resposta=0;
		String nome = "";
		String nomeVelho ="";
		String nomeNovo ="";
		int idade=0;
		int idadeMaior=0;
		int idadeMedia=0;
		int idadeNovo=150;
		int idadeVelho=0;
		int idadeTotal=0;
		int quantidade=0;


		do {
			nome= JOptionPane.showInputDialog("Digite o nome");
			idade= Integer.parseInt(JOptionPane.showInputDialog("Digite a Idade"));

			if (idadeVelho<idade) {
				nomeVelho = nome;
				idadeVelho = idade;
			}

			if (idadeNovo>idade) {
				nomeNovo = nome;
				idadeNovo= idade;
			}

			idadeTotal = idadeTotal +=idade;

			resposta = JOptionPane.showInputDialog("Digite <S> para continuar ou <N) para sair").toUpperCase().charAt(0);


			if (idade>=18) {
				idadeMaior++; }
			quantidade++;
		}

		while (resposta == 'S');

		System.out.println("Nome do mais Velho : " + nomeVelho + ".. Idade mais Velho: " + idadeVelho);
		System.out.println("Nome do mais Novo : " + nomeNovo + ".. Idade mais Novo: " + idadeNovo);	
		System.out.println("Media de Idade : " + idadeTotal/quantidade);
		System.out.println("Maiores de Idade.. : " + idadeMaior);


	}

}
