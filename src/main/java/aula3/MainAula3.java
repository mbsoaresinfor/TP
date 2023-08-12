package aula3;

import java.util.Optional;

public class MainAula3 {

	public static void main(String[] args) {

		Pessoa pessoa = new Pessoa();
		pessoa.nome = "maria";
		
		PessoaServico pessoaServico = new PessoaServico();
		pessoaServico.adicionaPessoa(pessoa);
		Pessoa pessoaBuscada = pessoaServico.buscaPessoaPeloNome("joao");		
		System.out.println(pessoaBuscada.nome);
		
		Optional<Pessoa> optPessoaBuscada = pessoaServico.buscaPessoaPeloNome2("joão");
		if(optPessoaBuscada.isPresent()) {
			Pessoa pessoa2 = optPessoaBuscada.get();
			System.out.println(pessoa2.nome);
		}
		
		Pessoa pessoaA = new Pessoa();
		StatusOk statusOk = validarPessoa(pessoaA);
		salvarPessoa(pessoaA,statusOk);
		
	}
	
	public static StatusOk validarPessoa(Pessoa pessoa) {	    
	    System.out.println("validar: " + pessoa);
	    return StatusOk.OK;
	}
	
	public static void 
		salvarPessoa(Pessoa pessoa,
				StatusOk statusok) {    
	    
	    System.out.println("salvar: " + pessoa);
	}

}
