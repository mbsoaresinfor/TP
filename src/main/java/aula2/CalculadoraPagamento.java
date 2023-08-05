package aula2;
// alterar pacote se necessario



public class CalculadoraPagamento {
    
    float salarioFinal = 0; 
    
    public CalculadoraPagamento(String nome, int idade,
            String dataNascimento,float salario) {
        Funcionario funcionario = new Funcionario();
        funcionario.dataNascimento = dataNascimento;
        funcionario.idade = idade;
        funcionario.nome = nome;
        funcionario.salario = salario;    
		
        try {
        	processarSalarioFuncionario(funcionario);
        }catch(Exception e) {
        	System.out.println(e.getMessage());
        }
		
    }

	private void processarSalarioFuncionario(Funcionario funcionario) throws Exception {
		validarFuncionario(funcionario);
		salarioFinal = calcularSalario(funcionario);
	}
    
	private int validarFuncionario(Funcionario funcionario) throws Exception {
		boolean eFuncionarioParamInvalidos = funcionario.nome.equals("") || funcionario.idade ==0;
		if(eFuncionarioParamInvalidos){
			throw new Exception("Erros nos parametros do funcionario");
		}else{
			return 1;
		}
	}
	
    public float retornarCalculoSalarioFuncionario(){
        return salarioFinal;
    }

    private float calcularSalario(Funcionario funcionario){
		
		
        float resultado = 0;
        boolean EsalarioBaixo = funcionario.salario < 1000;
		if(EsalarioBaixo){
            float extraSalarioBaixo = 0.1f;
			resultado = (funcionario.salario * extraSalarioBaixo) + funcionario.salario;
        }
        boolean eSalarioAlto = funcionario.salario > 1000;
		if(eSalarioAlto){
            float extraSalarioAlto = 0.2f;
			resultado = (funcionario.salario * extraSalarioAlto) + funcionario.salario;
        }
        
        return resultado;        
    }

	
    
}




       



