package teste;

import modelo.Endereco;
import modelo.Professor;

public class TesteConstrutorCheio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Professor professor = new Professor("Madruga", "Madruguinha", "Filosofia", new Endereco("Rua X", "34", "Itaim Pta", "Sao Paulo", "SP", "08111160"));
		System.out.println(professor.getAll());
		
	}

}
