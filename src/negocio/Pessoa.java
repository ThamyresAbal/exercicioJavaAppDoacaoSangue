package negocio;

public class Pessoa {
	private String nome;
	private String sobrenome;
	private float peso;
	private int idade;
	private Endereco endereco;
	
	@Override
	public String toString() {
		if(this.doadorDeSangue()) {
			return String.format(
					"%s. %s",
					this.obterNomeCompleto(),
					//o metodo imprimir não tinha retorno (sendo void)
					// a solução foi colocar como String e utiluzar o return
					//return String.format( o que existia no sout )
					this.getEndereco().imprimir()
					);
		}else {
			return String.format(
					"%s não pode doar sangue",
					this.obterNomeCompleto()
					);
		}
	}
	
	public Pessoa(String nome, String sobrenome, float peso, int idade) {
		this.setNome(nome);
		this.setSobrenome(sobrenome);
		this.setPeso(peso);
		this.setIdade(idade);
	}
	
	public void exibirDestinatario() {
		//criou o toString pq o exibir destinatario é void
		
		System.out.println(this.toString());
		
	}
	
	public String obterNomeCompleto() {

		return String.format("%s %s", 
				this.getNome(),	this.getSobrenome()
			);
	}
	private boolean doadorDeSangue() {
		
		if(this.getPeso() >= 50 && 
		   this.getIdade() >= 18 && 
		   this.getIdade() <= 69){
			return true;
		}
		
		return false;
	}
		
	public Pessoa(String nome, String sobrenome,Endereco endereco) {
		this.setNome(nome);
		this.setSobrenome(sobrenome);
		this.setEndereco(endereco);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
}
