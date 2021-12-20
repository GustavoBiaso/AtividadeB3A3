package b3a3;

public class Moto {
	private boolean partida;

	public Moto(boolean portas) { 
	      this.partida = portas;
	   }
	
	public void SetPortas(boolean portas) {
		this.partida = portas;
	}
	
	public boolean GetPortas() {
		return (this.partida);
	}
	
	public void ImprimirInformacoes() {
		System.out.println(this.partida);
	}
}
