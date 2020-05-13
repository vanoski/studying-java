package teste;

import javax.swing.JOptionPane;

import modelo.Aluno;
import modelo.Endereco;

public class Teste {
	
	// private => restricao máxima
	// public => publica para todos os lugares
	// package => apenas se estiver no mesmo pacote

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Aluno aluno = new Aluno();
		aluno.setNome(JOptionPane.showInputDialog("Digite o nome do aluno para cadastrado: "));
		aluno.setEmail(JOptionPane.showInputDialog("Digite o email do aluno para cadastro: "));
		aluno.setMatricula(Integer.parseInt(JOptionPane.showInputDialog("Digite o número de matricula para cadastro: ")));
		
		Endereco endereco = new Endereco();
		endereco.setAll("Rua X", "444", "Itaim Pta", "Sao Paulo", "SP", "08111-160");
		
		aluno.setAll("Vanessa", 123, "vanessa.nunes-p@itau-unibanco.com.br", endereco);
		
		//System.out.printf("Matricula: %s", aluno.getMatricula());
		//System.out.printf("Nome: %s...", aluno.getNome());
		//System.out.printf("Email: %s", aluno.getEmail());
		System.out.printf("Aluno: %s", aluno.getAll());
		System.out.printf("Endereco: %s", endereco.getAll());
	}

}
