package aula2;

import aula1.Pessoa;

public class PessoaServico {

	// codigo clean code
	/*
	 * public Pessoa buscar(BuscaPessoaParametro parameterObject ) {
	 * 
	 * return null; }
	 */
	
	public void testeIdade(int idade) {
		boolean eMaiorIdade = idade > 18;
		if(eMAiorIdade(idade)) {
			System.out.println("e maior idade");
		}
	}
	
	public boolean eMAiorIdade(int idade) {
		return idade > 18;
	}
	
	public void mostrarNomeEIdadePessoa() {		
			System.out.println("nome da pessoa");
			System.out.println("idade da pessoa");		
	}
	
	public void mostrarNomePessoa() {		
		System.out.println("nome da pessoa");
	}
	
	
	// trash
	public void mostrarPessoa(boolean mostrarIdade) {
		if(mostrarIdade) {
			System.out.println("nome da pessoa");
			System.out.println("idade da pessoa");
		}else {
			System.out.println("nome da pessoa");
		}
	}
	
	public void testeTryCatch() {
		try {
			processarTalCoisa();
		}catch(Exception e) {
			
		}
	}
	
	private void processarTalCoisa() {
		// cod1
					// cod2
					// cod3
					// cod4
	}
	
	public int salvar() throws Exception {
		// salvar alguma coisa		
		// se der erro, retornar -1
		throw new Exception("error");
	}
	
	
}
