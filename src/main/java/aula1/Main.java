package aula1;

public class Main {

	public static void main(String[] args) {
		
		Impressora imp[] =  new Impressora[3];
		
		Pessoa pessoa = new Pessoa();
		Pessoa pessoa2 = new Pessoa();
		pessoa.setNome("marcelo");
		
		Endereco endereco = new Endereco();
		endereco.setRua("rua a");
		endereco.setNumero(300);
		
		pessoa.setEndereco(endereco);
		
System.out.println("nome: " + pessoa.getNome());
System.out.println("rua : "+
			pessoa.getEndereco().getRua());	
System.out.println("número: "+
		pessoa.getEndereco().getNumero());

		Aluno aluno = new Aluno();
		aluno.setNome("maria");
		Professor prof = new Professor();
		prof.setNome("jesus");
		
		ContaCorrente cc = new ContaCorrente();
		ContaPoupanca cp = new ContaPoupanca();

		// solucao sem poo, sem polimorfismo
		execDepositoContaCorrente(cc);
		execDepositoContaPoupanca(cp);
		
		// solucao com polimorfismo
		execDepositoConta(cc);
		execDepositoConta(cp);
		
		mostrarNomes(aluno);
		mostrarNomes(prof);
		
		
	}
	
	public static void mostrarNomes(Pessoa p) {
		System.out.println(p.getNome());
	}
	
	public static void execDepositoConta(Conta conta) {
		conta.depositar();
	}
	
	public static void execDepositoContaCorrente
					(ContaCorrente contaCorrete) {
		contaCorrete.depositar();
	}
	
	public static void execDepositoContaPoupanca
	(ContaPoupanca contaPoupanca) {
		contaPoupanca.depositar();
}

}
