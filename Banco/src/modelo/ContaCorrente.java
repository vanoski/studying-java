package modelo;

public class ContaCorrente {
	private Double saldo;
	private Cliente cliente;
	
	public ContaCorrente() {
		
	}
	
	public ContaCorrente(Double saldo, Cliente cliente) {
		this.saldo = saldo;
		this.cliente = cliente;
	}
	
	public Double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public String getAll() {
		return this.saldo+", "+this.cliente.getAll();
	}
	
	public void setAll(Double saldo, Cliente cliente) {
		this.saldo = saldo;
		this.cliente = cliente;
	}

}
