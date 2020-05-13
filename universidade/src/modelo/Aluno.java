package modelo;

public class Aluno {
	private String nome = "";
	private int numeroMatricula;
	private String email = "";
	private Endereco endereco;
	
	public void setAll(String nome, int matricula, String email, Endereco endereco) {
		this.nome = nome;
		this.numeroMatricula = matricula;
		this.email = email;
		this.endereco = endereco;
	}
	
	public String getAll() {
		return this.numeroMatricula + "\n" + this.nome + "\n" + this.email + "\n";
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setMatricula(int matricula) {
		this.numeroMatricula = matricula;
	}
	
	public int getMatricula() {
		return this.numeroMatricula;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public void efetuarLogin(int matricula, String senha) {
		
	}
	

}
