package apresentacao;

import javax.swing.JOptionPane;

import modelos.OperacaoModelo;
import negocio.CalculadoraServico;

public class CalculadoraUI {

    CalculadoraServico servico = new CalculadoraServico();
    
    public  static void main(String[] args) throws Exception {
	new CalculadoraUI().iniciar();
    }
    
    public void iniciar() throws Exception {
	
	while(true) {
	    String op =JOptionPane.
		   showInputDialog("Digite a operaçao [+,-]");
	    String v1 =JOptionPane.
			   showInputDialog("Digite o valor 1");
	    String v2 =JOptionPane.
			   showInputDialog("Digite o valor 2");
	    
	    OperacaoModelo operacao = new OperacaoModelo();
	    operacao.valor1 = Double.parseDouble(v1);
	    operacao.valor2 = Double.parseDouble(v2);
	    operacao.operacao  = op;
	    double resultado =
		  servico.executarOperacao(operacao);
	    JOptionPane.showMessageDialog(null,
		    resultado);
	    
	}
    }
}
