package br.com.fiap.implementacao;

import javax.swing.JOptionPane;

import br.com.fiap.heranca.CompactDisc;
import br.com.fiap.heranca.Livro;

public class TesteGeral {
	
	public static String texto(String msg) {
		return JOptionPane.showInputDialog(msg).toUpperCase();
	}
	
	public static int inteiro(String msg) {
		return Integer.parseInt(texto(msg));
	}
	
	public static Double decimal(String msg) {
		return Double.parseDouble(texto(msg));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Livro livro = new Livro();
		CompactDisc cd = new CompactDisc();
		
		String resposta = JOptionPane.showInputDialog("Digite <L> para livro e <C> para CD:").toUpperCase();
		if (resposta.contentEquals("L")) {
			livro.setAll(
					inteiro("Digite o codigo:"), 
					decimal("Digite o valor:"), 
					texto("Digite a descricao:"),
					texto("Digite o isbn:"),
					texto("Digite o autor:"));
			System.out.println(livro.getAll());
		} else {
			cd.setAll(
					inteiro("Digite o codigo:"), 
					decimal("Digite o valor:"),
					texto("Digite a descricao:"),
					texto("Digite a gravadora:"),
					texto("Digite o artista:"));
			System.out.println(cd.getAll());
		}
		
		

	}

}
