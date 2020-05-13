package teste;

import modelo.Cliente;
import modelo.ContaCorrente;
import modelo.Endereco;

public class TesteContrutorCheio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContaCorrente conta = new ContaCorrente(
				5000.00, 
				new Cliente(
						"Vanessa", 
						"40160539862", 
						new Endereco(
								"Rua Baltazar Lemos Navarro", 
								"444", 
								"A", 
								"Jardim das Oliveiras", 
								"08122-050"
								)
						)
				);
		
		
		System.out.println(conta.getAll());

	}

}
