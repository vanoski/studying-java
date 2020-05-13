package testes;

import beans.Bacharelado;
import beans.Formacao;

public class TesteFormacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Formacao bacharel = new Bacharelado();
		bacharel.setDescricao("SISTEMA DE INFORMACAO");
		bacharel.definirDuracao();
		System.out.println(bacharel.getDuracao());

	}

}
