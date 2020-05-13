package modelo;

public class Endereco {
	private String rua;
	private String numero;
	private String complemento;
	private String bairro;
	private String cep;
	
	public Endereco() {
		
	}
	
	public Endereco(String rua, String numero, String complemento, String bairro, String cep) {
		this.rua = rua;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cep = cep;
	}
	
	public String getRua() {
		return rua;
	}
	
	public void setRua(String rua) {
		this.rua = rua;
	}
	
	public String getNumero() {
		return numero;
	}
	
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public String getComplemento() {
		return complemento;
	}
	
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	
	public String getBairro() {
		return bairro;
	}
	
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
	public String getCep() {
		return cep;
	}
	
	public void setCep(String cep) {
		this.cep = cep;
	}
	

	public String getAll() {
		return this.rua+", "+this.numero+", "+this.complemento+", "+this.bairro+", "+this.cep;
	}
	
	public void setAll(String rua, String numero, String complemento, String bairro, String cep) {
		this.rua = rua;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cep = cep;
	}

}
