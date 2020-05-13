
public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pilha idades = new Pilha();
		
		System.out.println("Vazio? "+idades.vazio());
		System.out.println("Cheio? "+idades.cheio());
		
		idades.insert(50);
		idades.insert(51);
		idades.insert(52);
		idades.insert(53);
		idades.insert(54);
		idades.insert(55);
		idades.insert(56);
		idades.insert(57);
		idades.insert(58);
		idades.insert(59);
		
		
		System.out.println(idades.vazio());
		System.out.println(idades.cheio());
		
		idades.retirar();
		idades.retirar();
		idades.retirar();
		idades.retirar();
		idades.retirar();
		
		

	}

}
