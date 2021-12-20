package b3a3;

public class Bicicleta {
	private boolean bagageiro;
	private int marchas;

	public Bicicleta(boolean bagageiro, int marchas) { 
	      this.bagageiro = bagageiro;
	      this.marchas = marchas;
	}
	
	public void SetBagageiro(boolean bagageiro) {
		this.bagageiro = bagageiro;
	}
	
	public boolean GetBagageiro() {
		return (this.bagageiro);
	}

	public void SetMarchas(int marchas) {
		this.marchas = marchas;
	}
	
	public int GetMarchas() {
		return (this.marchas);
	}
	
	public void ImprimirInformacoes() {
		System.out.println(this.bagageiro);
		System.out.println(this.marchas);
	}
}
