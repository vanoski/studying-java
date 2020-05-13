
public class Pilha {
	private int topo;
	private int vetor[];
	
	public Pilha() {
		vetor = new int[10];
		topo = -1;
	}
	
	public Pilha(int tamanho) {
		vetor = new int[tamanho];
		topo = -1;
	}
	
	public boolean vazio() {
		return (topo == -1);
	}
	
	public boolean cheio() {
		return (topo == 9);
	}
	
	public void insert(int valor) {
		
		if (!cheio()) {
			topo++;
			vetor[topo]=valor;
		} else {
			System.out.println("Pilha cheia!");
		}
		
	}
	
	public int retirar() {
		if(!vazio()) {
			int valor = vetor[topo];
			topo--;
			return valor;
		}
		return -1;
	}
	
	
	
}
