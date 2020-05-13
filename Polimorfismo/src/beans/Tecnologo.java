package beans;

import interfaces.PadraoFormacao;

public class Tecnologo extends Formacao implements PadraoFormacao {
	private boolean planoEstendido;
	
	public Tecnologo() {
		super();
	}
	
	public Tecnologo(String descricao, int periodo, Double mensalidade, int duracao, boolean planoEstendido) {
		super(descricao, periodo, mensalidade, duracao);
		this.planoEstendido = planoEstendido;
	}

	public boolean isPlanoEstendido() {
		return planoEstendido;
	}

	public void setPlanoEstendido(boolean planoEstendido) {
		this.planoEstendido = planoEstendido;
	}
	
	// polimorfismo com overriding 
	public void calcularMensalidade(Double fator) {
		super.setMensalidade(super.getDuracao() + fator + 600);
	}

}
