package br.com.ecommerce.implantacao;

import br.com.ecommerce.modelo.Cliente;
import br.com.ecommerce.modelo.Endereco;
import br.com.ecommerce.modelo.Produto;
import br.com.ecommerce.modelo.Venda;
import br.com.ecommerce.tela.Magica;

public class VendaTeste {
	
	
		
	

	public static void main(String[] args) {
		/*
		 * metodo static = 
		 */
			
		Venda venda = new Venda();
		Produto produto = new Produto();
		Cliente cliente =new Cliente ();
		Endereco endereco = new Endereco();
		
		cliente.setEndereco(endereco);
		venda.setCliente(cliente);
		venda.setProduto(produto);
		
		endereco.setLogradouro(Magica.s("Logradouro"));
		endereco.setNumero(Magica.s("Numero"));	
		endereco.setCidade(Magica.s("Cidade"));
		
		//preencheria todos de endereco
		
		
		produto.setValorVenda(Magica.f("ValorVenda"));
		produto.setDescricao(Magica.s("Descri��o"));
		produto.setQtde(Magica.i("Quantidade"));
		//preencheria todos os de produto
		
		venda.setTotal(Magica.f(Magica.s("Total")));
		venda.setNotafiscal(Magica.i(Magica.s("NotaFiscal")));
		venda.setData(Magica.s("Data"));
		//preencheria todos de venda
		
		System.out.println(venda.getAll());
		
		
		
		
		
		
		
	}
}

