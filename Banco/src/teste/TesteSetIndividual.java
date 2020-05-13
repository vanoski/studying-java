package teste;

import modelo.Cliente;
import modelo.ContaCorrente;
import modelo.Endereco;

public class TesteSetIndividual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cliente cliente = new Cliente();
		Endereco endereco = new Endereco();
		ContaCorrente conta = new ContaCorrente();
		
		cliente.setNome("Allysson");
		cliente.setCpf("45654530921");
		endereco.setRua("Rua X");
		endereco.setNumero("987");
		endereco.setComplemento("B");
		endereco.setBairro("Itaim Paulista");
		endereco.setCep("08111-160");
		cliente.setEndereco(endereco);
		conta.setCliente(cliente);
		conta.setSaldo(4000.00);
		
		System.out.println(cliente.getAll());
		System.out.println(conta.getAll());
		System.out.println(endereco.getAll());
		

	}

}
