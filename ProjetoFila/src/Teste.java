
public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fila objeto = new Fila();
		System.out.println("Cheio? "+objeto.cheio());
		System.out.println("Vazio? "+objeto.vazio());
		
		objeto.inserir(8);
		objeto.inserir(15);
		objeto.inserir(20);
		objeto.inserir(35);
		
		System.out.println(objeto.atender());
		System.out.println(objeto.atender());
		System.out.println(objeto.atender());
	}

}
