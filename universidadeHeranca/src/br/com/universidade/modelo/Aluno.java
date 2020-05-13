package br.com.universidade.modelo;

public class Aluno extends Pessoa{
	
	private int matricula;
	private String responsavel;
	
	public Aluno() {
		super();
	}
	
	public Aluno(String nome, String email, String fone, int matricula, String responsavel) {
		super(nome, email, fone);
		this.matricula = matricula;
		this.responsavel = responsavel;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}
	
	public String getAll() {
		return matricula+"\n"+responsavel+"\n"+super.getAll();
	}
	
	public void setAll(String nome, String email, String fone, int matricula, String responsavel) {
		super.setAll(nome, email, fone);
		this.matricula = matricula;
		this.responsavel = responsavel;
	}
	
}
