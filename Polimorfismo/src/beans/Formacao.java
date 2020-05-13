package beans;

public class Formacao {
	protected String descricao;
	protected int periodo;
	protected Double mensalidade;
	protected int duracao;
	
	public Formacao() {
		
	}
	
	public Formacao(String descricao, int periodo, Double mensalidade, int duracao) {
		this.descricao = descricao;
		this.periodo = periodo;
		this.mensalidade = mensalidade;
		this.duracao = duracao;
		
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public int getPeriodo() {
		return periodo;
	}
	
	public void setPeriodo(int periodo) {
		this.periodo = periodo;
	}
	
	public Double getMensalidade() {
		return mensalidade;
	}
	
	public void setMensalidade(Double mensalidade) {
		this.mensalidade = mensalidade;
	}
	
	public int getDuracao() {
		return duracao;
	}
	
	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}
	
	public String getAll() {
		return this.descricao+"\n"+this.periodo+"\n"+this.mensalidade+"\n"+this.duracao;
	}
	
	public void setAll(String descricao, int periodo, Double mensalidade, int duracao) {
		this.descricao = descricao;
		this.periodo = periodo;
		this.mensalidade = mensalidade;
		this.duracao = duracao;
	}
	
	public void definirDuracao() {
		if (this instanceof Medio) {
			this.duracao = 36;
		} else if (this instanceof Tecnologo) {
			this.duracao = 24;
		} else if (this instanceof Bacharelado) {
			if (descricao.toUpperCase().indexOf("ENGENHARIA") >= 0) {
				duracao = 60;
			} else {
				duracao = 48;
			}
		} else {
			this.duracao = 0;
		}

	}
	
	public Double exibirMedia(Double ps1, Double ps2) {
		return (ps1+ps2)/2;
	}
	
	public Double exibirMedia(Double ps1, Double ps2, Double nac1, Double nac2) {
		return (ps1*0.8 + nac1*0.2+ps2*0.8+nac2*0.2)/2;
	}
	
	public Double exibirMedia(Double ps1, Double ps2, Double nac1, Double nac2, Double am1, Double am2) {
		return (ps1*0.8 + nac1*0.2 + am1*0.3 + ps2*0.8+nac2*0.2 + am2*0.3)/2;
	}
	
	
	

}
