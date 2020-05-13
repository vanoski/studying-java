package beans;

import interfaces.PadraoFormacao;

public class Bacharelado extends Formacao implements PadraoFormacao{
	private String projetoConclusao;
	private int cargaHorariaEstagio;
	
	public Bacharelado() {
		super();
	}
	
	public Bacharelado(String descricao, int periodo, Double mensalidade, int duracao, String projetoConclusao, int cargaHorariaEstagio) {
		super(descricao, periodo, mensalidade, duracao);
		this.projetoConclusao = projetoConclusao;
		this.cargaHorariaEstagio = cargaHorariaEstagio;
	}

	public String getProjetoConclusao() {
		return projetoConclusao;
	}
	
	public void setProjetoConclusao(String projetoConclusao) {
		this.projetoConclusao = projetoConclusao;
	}
	
	public int getCargaHorariaEstagio() {
		return cargaHorariaEstagio;
	}
	
	public void setCargaHorariaEstagio(int cargaHorariaEstagio) {
		this.cargaHorariaEstagio = cargaHorariaEstagio;
	}
	
	public String getAll() {
		return this.descricao+"\n"+this.periodo+"\n"+this.mensalidade+"\n"+this.duracao+"\n"+super.getAll();
	}
	
	public void setAll(String descricao, int periodo, Double mensalidade, int duracao, String projetoConclusao, int cargaHorariaEstagio) {
		super.setAll(descricao, periodo, mensalidade, duracao);
		this.projetoConclusao = projetoConclusao;
		this.cargaHorariaEstagio = cargaHorariaEstagio;
	}
	
	// polimorfismo overriding
	public void calcularMensalidade(Double fator) {
		super.setMensalidade(super.getDuracao() * fator *600 + cargaHorariaEstagio*12);
	}
	

}
