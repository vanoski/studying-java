package collection_framework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TesteLista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//List é interface, ArrayLista é o objeto
		List<String> lista = new ArrayList<>();
		lista.add("Vanessa");
		lista.add("Solteira");
		lista.add("XPTO");
		lista.add("Vanessa");
		
		//remove por indice
		lista.remove(2);
		
		//ordenacao 
		Collections.sort(lista);
		System.out.println(lista);
		
		for (int i=0; i<lista.size();i++) {
			System.out.println(lista.get(i));
		}

	}

}
