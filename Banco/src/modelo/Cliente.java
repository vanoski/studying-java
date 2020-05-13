package modelo;

public class Cliente {
	private String nome;
	private String cpf;
	private Endereco endereco;
	
	public Cliente() {
		
	}
	
	public Cliente(String nome, String cpf, Endereco endereco) {
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	public String getAll() {
		return this.nome+", "+this.cpf+", "+this.endereco.getAll();
	}
	
	public void setAll(String nome, String cpf, Endereco endereco) {
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
	}
	
}
