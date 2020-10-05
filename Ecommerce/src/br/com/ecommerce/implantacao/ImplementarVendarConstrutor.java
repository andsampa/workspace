package br.com.ecommerce.implantacao;

import br.com.ecommerce.modelo.Cliente;
import br.com.ecommerce.modelo.Endereco;
import br.com.ecommerce.modelo.Produto;
import br.com.ecommerce.modelo.Venda;
import br.com.ecommerce.tela.Magica;

public class ImplementarVendarConstrutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Venda objeto = new Venda(
				Magica.i("Nota Fiscal"),
				Magica.s("Data"),
				Magica.f("Total"),
				new Produto (
						Magica.i("ID"),
						Magica.s("Descricao"),
						Magica.i("Qtde"),
						Magica.f("ValorCompra"),
						Magica.f("Valor Venda")
						),
				new Cliente(
						Magica.i("ID do Cliente"),
						Magica.s("Nome"),
				new Endereco(
						Magica.s("Logradouro"),
						Magica.s("Bairro"),
						Magica.s("Cidade"),
						Magica.s("Estado"),
						Magica.s("CEP"),
						Magica.s("Numero"),
						Magica.s("Complemento")								

								)

						)
				);
		
		System.out.println(objeto.getAll());


	}

}
