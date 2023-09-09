package aula7;

public class FabricaPagamento {

    public enum TipoPagamento{
	Pix,
	Vista,
	CartaoCredito
    }
    
    public Pagamento criar(TipoPagamento tipo) {
	if(TipoPagamento.Pix == tipo) {
	    return new PagamentoPIX();
	}
	if(TipoPagamento.Vista == tipo) {
	    return new PagamentoAVista();
	}
	if(TipoPagamento.CartaoCredito == tipo) {
	    return new PagamentoCartaoCredito();
	}
	
	throw new IllegalArgumentException
	("Tipo de pagamento inválido");
    }
    
}
