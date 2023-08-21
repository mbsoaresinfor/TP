package aula4;

import java.math.BigDecimal;

public class Main {

	public static void main(String[] args) {

		Funcionario programador = new Funcionario();
		programador.salario = BigDecimal.valueOf(50);
		
		Funcionario analista = new Funcionario();
		analista.salario = BigDecimal.valueOf(50);
		
		CalculaPagamento calculaPagamento = new CalculaPagamento();
		
		BigDecimal salarioProg = calculaPagamento
							.calcular(new ProgramadorCalculo(), programador);
		
		System.out.println("R$ " + salarioProg + " do programador" );
		
		BigDecimal salarioAnalista = calculaPagamento
				.calcular(new AnalistaCalculo(), analista);
		
		System.out.println("R$ " + salarioAnalista + " do analista" );
		
		BigDecimal salarioTestador = calculaPagamento
								.calcular(new TestadorCalculo(), analista);
		
		System.out.println("R$ " + salarioTestador + " do testador" );
		
		// CORRECAO EXERCICIO
		UsuarioServico usuarioServico  = new UsuarioServico();
		
		Usuario prof = new Usuario();
		prof.salario = BigDecimal.valueOf(500);
		prof.calculoSalarioUsuario = new CalculoSalarioDiretor();
		prof.nome = "marcelo";
		
		usuarioServico.salvarUsuario(prof);
		
		
		

	}

}
