package aula7;

import java.io.Console;
import java.util.Scanner;

import aula7.FabricaPagamento.TipoPagamento;

public class Main7 {

    public static void main(String[] args) {

	ConfigSystem cs1 = ConfigSystem.getInstancia();
	cs1.setCaminhoImagens("caminho1");
	cs1.setNomeSistema("abc");
	System.out.println(cs1.getCaminhoImagens());
	
	ConfigSystem cs2 = ConfigSystem.getInstancia();
	cs2.setCaminhoImagens("caminho1");
	cs2.setNomeSistema("xyz");
	System.out.println(cs2.getCaminhoImagens());
	
	// 
	Scanner teclado = new Scanner(System.in);
	System.out.println("digite o valor para pagamento");
	String valor = teclado.nextLine();
	System.out.println("digite o tipo de pagamento");
	System.out.println("1 - PIX");
	System.out.println("2 - à vista");
	System.out.println("3 - Cartão de crédito");
	String tipoPagamento = teclado.nextLine();
	
	FabricaPagamento fabricaPagamento =
			new FabricaPagamento();
	Pagamento pagamento = null;
	if(tipoPagamento.equals("1")) {
	    pagamento = fabricaPagamento.
		    criar(TipoPagamento.Pix);
	}
	if(tipoPagamento.equals("2")) {
	    pagamento = fabricaPagamento.
		    criar(TipoPagamento.Vista);
	}
	if(tipoPagamento.equals("3")) {
	    pagamento = fabricaPagamento.
		    criar(TipoPagamento.CartaoCredito);
	}
	
	pagamento.
		realizarPagamento(Double.valueOf(valor));
	
	
	ConectaBanco cb = ConectaBanco.getInstancia();
	cb.conecta();
	
	Pizza pizza = PizzaBuilder
		.builder()
		.comBorda()
		.tamanhoGrande()
		.comSaborCalabreza()
		.fazerPizza();
	
	System.out.println(pizza);
		
    }

}
