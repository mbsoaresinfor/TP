package negocio;

import dados.CalculadoraRepositorio;
import modelos.OperacaoModelo;

public class CalculadoraServico {

    CalculadoraRepositorio repositorio 
    	= new CalculadoraRepositorio();
    
    public double executarOperacao
    		(OperacaoModelo operacaoModelo) throws Exception {
	
	if(eUmaOperacaoInvalida(operacaoModelo)) {
	    throw new Exception("Operacao inválida");
	}
	
	if(operacaoModelo.operacao.equals("+")) {
	    double resultado = operacaoModelo.valor1 +
		    operacaoModelo.valor2;
	    repositorio.salvarSoma(operacaoModelo);
	    return resultado;
	}
	else{ // subtrair
	    double resultado = operacaoModelo.valor1 -
		    operacaoModelo.valor2;
	    repositorio.salvarSubtracao(operacaoModelo);
	    return resultado;
	}
	
    }

    private boolean eUmaOperacaoInvalida(OperacaoModelo operacaoModelo) {
	return !(operacaoModelo.operacao.equals("+") ||
		operacaoModelo.operacao.equals("-"));
    }
}
