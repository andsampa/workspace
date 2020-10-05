package br.com.universidade.implementacao;


import br.com.universidade.modelo.Bacharelado;
import br.com.universidade.modelo.Formacao;
import br.com.universidade.modelo.Medio;
import br.com.universidade.modelo.Pos;
import br.com.universidade.tela.Magica;

public class TesteFormacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char opcao = Magica.s("Digite\n<1> Medio\n<2> Bacharelado\n<3> POS").toUpperCase().charAt(0);
		Formacao formacao=null;
		
		if (opcao == '1' ) {
			formacao = new Medio(
					Magica.f("Valor Medio"),
					Magica.s("Descricao"),
					Magica.i("Duracao"),
					Magica.i("Tipo")
					);
		} else if (opcao == '2') {
			formacao = new Bacharelado(
					Magica.f("Valor Bacharelado"),
					Magica.s("Descricao"),
					Magica.i("Duracao"),
					Magica.s ("Projeto Conclusao"),
					Magica.i("Carga Estagio")
					);
					
		} else if (opcao == '3') {
						formacao = new Pos(
								Magica.f("Valor POS"),
								Magica.s("Descricao"),
								Magica.i("Duracao"),
								Magica.s("Nivel"),
								Magica.b("Plano Estendido?")
								);
		}else {
			System.out.println("Opção Invalida");
		}
		
		System.out.println(formacao.getAll());
		
		}
		
	}


