package teste;

import modelo.Cliente;
import modelo.ContaCorrente;
import modelo.Endereco;

public class TesteSetAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cliente cliente = new Cliente();
		Endereco endereco = new Endereco();
		ContaCorrente conta = new ContaCorrente();
		
		endereco.setAll("Rua X", "234", "B", "Itaim Paulista", "08122-050");
		cliente.setAll("Vanessa", "08122-050", endereco);
		conta.setAll(50000.00, cliente);
		
		System.out.println(cliente.getAll());
		System.out.println(conta.getAll());
		System.out.println(endereco.getAll());
	}

}
