
public class Fila {
	private int inicio = -1;;
	private int fim = -1;
	private int vetor[];
	private int total;
	
	public Fila() {
		vetor = new int[10];
	}
	
	public Fila(int tamanho) {
		vetor = new int[tamanho];
	}
	
	public boolean vazio(){
		return total == 0;
	}
	
	public boolean cheio() {
		return total == 9;
	}
	
	public void inserir(int valor) {
		if(!cheio()) {
			fim++;
			vetor[fim] = valor;
			total++;
		}
	}
	
	public int atender() {
		if(!vazio()) {
			inicio++;
			int valor = vetor[inicio];
			total--;
			return valor;
		}
		return -1;
	}
}
