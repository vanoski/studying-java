package modelo;

public class Endereco {
	private String lagradouro;
	private String numero;
	private String bairro;
	private String cidade;
	private String uf;
	private String cep;
	
	public Endereco() {
		
	}
	
	public Endereco(String lagradouro, String numero, String bairro, String cidade, String uf, String cep) {
		this.lagradouro = lagradouro;
		this.numero = numero;
		this.bairro = bairro;
		this.cidade = cidade;
		this.uf = uf;
		this.cep = cep;
	}
	
	public String getAll() {
		return this.lagradouro+", "+this.numero+" - "+this.bairro+" - "+this.cidade+", "+this.uf+", "+this.cep;
	}
	
	public void setAll(String lagradouro, String numero, String bairro, String cidade, String uf, String cep) {
		this.lagradouro = lagradouro;
		this.numero = numero;
		this.bairro = bairro;
		this.cidade = cidade;
		this.uf = uf;
		this.cep = cep;
	}
	
	public String getLagradouro() {
		return lagradouro;
	}
	
	public void setLagradouro(String lagradouro) {
		this.lagradouro = lagradouro;
	}
	
	public String getNumero() {
		return numero;
	}
	
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public String getBairro() {
		return bairro;
	}
	
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
	public String getCidade() {
		return cidade;
	}
	
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	public String getUf() {
		return uf;
	}
	
	public void setUf(String uf) {
		if (uf.length()==2) {
		 this.uf = uf;
		} else {
			throw new RuntimeException("UF NÃO VÁLIDO"); 
		}
	}
	
	public String getCep() {
		return cep;
	}
	
	public void setCep(String cep) {
		this.cep = cep;
	}
	

}
