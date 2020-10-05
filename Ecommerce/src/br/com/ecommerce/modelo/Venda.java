package br.com.ecommerce.modelo;

public class Venda {
	
	private int notafiscal;
	private String data;
	private float total;
	private Produto produto;
	private Cliente cliente;
	
	
	
	public Venda(int notafiscal, String data, float total, Produto produto, Cliente cliente) {
		super();
		this.notafiscal = notafiscal;
		this.data = data;
		this.total = total;
		this.produto = produto;
		this.cliente = cliente;
	}
	
	

	public Venda() {
		super();
	}



	public String getAll () {
		return
				"NotaFiscal....: " + notafiscal + "\n" +
				"Data..........: " + data + "\n" +
				"Total.........: " + total + "\n" +
				"Produto.......: " + produto.getAll() + "\n" +
				"Cliente.......: " + cliente.getALL();
	}
	
	public void setAll (int notafiscal, String data, float total, Produto produto, Cliente cliente) {
		this.notafiscal=notafiscal;
		this.data=data;
		this.total=total;
		this.produto=produto;
		this.cliente=cliente;
		
	}
	
	
	
	
	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public int getNotafiscal() {
		return notafiscal;
	}
	public void setNotafiscal(int notafiscal) {
		this.notafiscal = notafiscal;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public float getTotal() {
		return total;
	}
	public void setTotal(float total) {
		this.total = total;
	}
	
	
	
	

}
