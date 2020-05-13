package br.com.universidade.modelo;

public class Pessoa {
	protected String nome;
	protected String email;
	protected String fone;

	public Pessoa() {
        super();
    }
    
	public Pessoa(String nome, String email, String fone) {
        super();
        this.nome = nome;
        this.email = email;
        this.fone = fone;
    }
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getFone() {
		return fone;
	}
	
	public void setFone(String fone) {
		this.fone = fone;
	}
	
	public String getAll() {
		return this.nome+"\n"+this.email+"\n"+this.fone;
	}
	
	public void setAll(String nome, String email, String fone) {
		this.nome = nome;
		this.email = email;
		this.fone = fone;
	}
	
	
	
}
