package collection_framework;

import java.util.HashSet;
import java.util.Set;

public class TesteSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set lista = new HashSet();
		lista.add("Vanessa");
		lista.add("Solteira");
		lista.add("XPTO");
		lista.add("Vanessa");
		
		// tipo Set não pode ser ordenado
		System.out.println(lista);
	}

}
