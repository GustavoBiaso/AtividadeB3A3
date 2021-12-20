package b3a3;

public class Pessoa {
	private String nome;
	private String pai;
	private String mae;
	
	public Pessoa(String nome, String pai, String mae) { 
	      this.nome = nome;
	      this.pai = pai;
	      this.mae = mae;
	   }
	public Pessoa(String nome) { 
		 this.nome = nome; 
	   }
	
	public void SetNome(String nome) {
		this.nome = nome;
	}

	public void SetPai(String nome) {
		this.pai = nome;
	}

	public void SetMae(String nome) {
		this.mae = nome;
	}
	
	public String GetNome() {
		return (this.nome);
	}

	public String GetPai() {
		return (this.pai);
	}
	
	public String GetMae() {
		return (this.mae);
	}
	
	public void Verify(Pessoa alguem) {
		if(this.pai == alguem.pai || this.mae == alguem.mae){
			System.out.println("Eles são irmãos!");
		} else {
			System.out.println("Eles não são irmãos!");
		}
	}
	
	public void VerifyAncestor(Pessoa alguem) {
		if(alguem.nome == this.pai || alguem.nome == this.mae) {
			System.out.println("A pessoa passada no parâmetro é parente dessa daqui!");
		} else {
			System.out.println("A pessoa passada no parâmetro não é parente dessa daqui!");
		}
	}
}
