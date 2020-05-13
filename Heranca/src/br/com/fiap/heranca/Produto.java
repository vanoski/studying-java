package br.com.fiap.heranca;

public class Produto {
	protected int codigo;
	protected Double preco;
	protected String descricao;
	
	public Produto() {
		super();
	}
	
	public Produto(int codigo, Double preco, String descricao) {
		super();
		this.codigo = codigo;
		this.preco = preco;
		this.descricao = descricao;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public String getAll() {
		return this.codigo+"\n"+this.preco+"\n"+this.descricao+"\n";
	}
	
	public void setAll(int codigo, Double preco, String descricao) {
		this.codigo = codigo;
		this.preco = preco;
		this.descricao = descricao;
	}
}
