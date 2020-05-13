package br.com.universidade.modelo;

public class Professor extends Pessoa{
	private String apelido;
	private String materia;
	
	public Professor() {
		super();
	}
	
	public Professor(String nome, String email, String fone, String apelido, String materia) {
		super(nome, email, fone);
		this.apelido = apelido;
		this.materia = materia;
	}

	public String getApelido() {
		return apelido;
	}

	public void setApelido(String apelido) {
		this.apelido = apelido;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}
	
	public String getAll() {
		return this.apelido+"\n"+this.materia+"\n"+super.getAll();
	}
	
	public void setAll(String apelido, String materia, String nome, String email, String fone) {
		super.setAll(nome, email, fone);
		this.apelido = apelido;
		this.materia = materia;
	}
	
}
