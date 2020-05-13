package br.com.fiap.heranca;

public class CompactDisc extends Produto{
	private String gravadora;
	private String artista;
	
	public CompactDisc() {
		
	}
	
	public CompactDisc(int codigo, Double preco, String descricao, String gravadora, String artista) {
		super(codigo, preco, descricao);
		this.gravadora = gravadora;
		this.artista = artista;
	}
	
	public String getGravadora() {
		return gravadora;
	}
	
	public void setGravadora(String gravadora) {
		this.gravadora = gravadora;
	}
	
	public String getArtista() {
		return artista;
	}
	
	public void setArtista(String artista) {
		this.artista = artista;
	}
	
	public String getAll() {
		return super.getAll()+"\n"+this.gravadora+"\n"+this.artista; 
	}
	
	public void setAll(int codigo, Double preco, String descricao, String gravadora, String artista) {
		super.setAll(codigo, preco, descricao);
		this.gravadora = gravadora;
		this.artista = artista;
	}
	
}
