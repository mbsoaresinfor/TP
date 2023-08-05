package aula2;
// alterar pacote se necessario





public class MainAula2 {

	public static void main(String[] args) {
		CalculadoraPagamento calculadoraPagamento 
		= new CalculadoraPagamento("maria",
                        30, "26/06/1990", 500);
                float salarioCalculado = calculadoraPagamento.retornarCalculoSalarioFuncionario();
                System.out.println("salario: " + salarioCalculado);
	}

}
