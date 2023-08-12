package aula3;

import java.util.Optional;

public class PessoaServico {

	private Pessoa pessoa;
	
	public void adicionaPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
	public Pessoa buscaPessoaPeloNome(String nome) {
		if(nome.equals(pessoa.nome)) {
			return pessoa;
		}else {
			return new PessoaNaoEncontrada();
		}
	}
	
	public Optional<Pessoa> buscaPessoaPeloNome2(String nome) {
		if(nome.equals(pessoa.nome)) {
			return Optional.of(pessoa);
		}else {
			return Optional.empty();
		}
	}
	
}
