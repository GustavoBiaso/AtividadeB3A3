package b3a3;

public class Carro {
	private int portas;

	public Carro(int portas) { 
	      this.portas = portas;
	   }
	
	public void SetPortas(int portas) {
		this.portas = portas;
	}
	
	public int GetPortas() {
		return (this.portas);
	}
	
	public void ImprimirInformacoes() {
		System.out.println(this.portas);
	}
}
