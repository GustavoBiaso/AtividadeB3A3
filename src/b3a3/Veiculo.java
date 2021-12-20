package b3a3;

public class Veiculo {
	private String marca;
	private int rodas;
	private String modelo;
	private int velocidade = 0;
	
	public Veiculo(int velocidade, int rodas, String modelo, String marca) { 
	      this.velocidade = velocidade;
	      this.rodas = rodas;
	      this.modelo = modelo;
	      this.marca = marca;
	}
	
	public void acelerar(int valor) {
		this.velocidade += valor;
	}
	
	public void frear(int valor) {
		this.velocidade -= valor;
	}
	
	public int GetVelocidade() {
		return(this.velocidade);
	}
	
	public int GetRodas() {
		return(this.rodas);
	}
	
	public String GetMarca() {
		return(this.marca);
	}
	
	public String GetModelo() {
		return(this.modelo);
	}
	
	public void SetVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	
	public void SetRodas(int rodas) {
		this.rodas = rodas;
	}
	
	public void SetMarca(String marca) {
		this.marca = marca;
	}
	
	public void SetModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public void ImprimirInformacoes() {
		System.out.println(this.velocidade);
		System.out.println(this.rodas);
		System.out.println(this.modelo);
		System.out.println(this.marca);
	}
}
