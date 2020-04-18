package testes;

import negocio.Endereco;
import negocio.Pessoa;

public class TestaReferencia {
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
		
		Pessoa p1 = new Pessoa("Donald", "Knuth", e);
			p1.setIdade(40);
			p1.setPeso(95);
			p1.exibirDestinatario();
			p1.setPeso(p1.getPeso()+2);
		// p2 tem as mesmas informaçoes que p1
		//como foi dado somente um new (um espaço de memória)
		// então p1 e p2 compartilham o mesmo espaço
		// logo NESSE CASO onde altera um, altera outro 
		Pessoa p2 = p1;
		System.out.println(p2.getIdade());
		p1.setIdade(p1.getIdade()+1);
		System.out.println(p2.getIdade());
		}
}

