package beans;

import interfaces.PadraoFormacao;

public class Medio extends Formacao implements PadraoFormacao{
	private String tipo;
	
	public Medio() {
		super();
	}
	
	public Medio(String descricao, int periodo, Double mensalidade, int duracao, String tipo) {
		super(descricao, periodo, mensalidade, duracao);
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public String getAll() {
		return this.tipo+"\n"+super.getAll();
	}
	
	public void setAll(String descricao, int periodo, Double mensalidade, int duracao, String tipo) {
		super.setAll(descricao, periodo, mensalidade, duracao);
		this.tipo = tipo;
	}
	
	// polimorfismo overriding
	public void calcularMensalidade(Double fator) {
		super.setMensalidade(super.getDuracao() * fator * 500);
	}

}
