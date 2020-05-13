package collection_framework;

import java.util.HashMap;
import java.util.Map;

public class TesteMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Cargo> lista = new HashMap();
		
		lista.put("1", new Cargo("DBA", "Junior", 5000));
		lista.put("2", new Cargo("Dev", "Pleno", 10000));
		lista.put("3", new Cargo("Analista", "Senior", 15000));
		
		// exibe chaves
		System.out.println(lista.keySet());
		
		
	}

}
