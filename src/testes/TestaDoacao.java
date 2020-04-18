package testes;

import negocio.Endereco;
import negocio.Pessoa;

public class TestaDoacao {

	public static void main(String[] args) {
		
		Endereco e = new Endereco(
			"Rua São José", 
			"90", 
			"sala 101", 
			"Centro", 
			"Rio de Janeiro", 
			"RJ", 
			"Brasil"
		);
		
		Pessoa pessoa = new Pessoa("Donald", "Knuth", e);
		pessoa.setIdade(40);
		pessoa.setPeso(95);
		pessoa.exibirDestinatario();
		
		Pessoa outraPessoa = new Pessoa("Donald", "Knuth", 95, 40);
		outraPessoa.setEndereco(e);
		outraPessoa.exibirDestinatario();			
	}
}
