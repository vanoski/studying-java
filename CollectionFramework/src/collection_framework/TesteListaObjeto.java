package collection_framework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TesteListaObjeto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Cargo> lista = new ArrayList<>();
		
		lista.add(new Cargo("Allysson", "Junior", 5000));
		lista.add(new Cargo("Vanessa" , "Pleno", 10000));
		lista.add(new Cargo("Thiago", "Senior", 20000));
		
		Collections.sort(lista);

		for (Cargo objeto : lista) {
			System.out.println(objeto.getAll());
		}

	}

}
