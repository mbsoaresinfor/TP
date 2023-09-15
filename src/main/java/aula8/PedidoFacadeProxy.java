package aula8;

public class PedidoFacadeProxy 
	implements PedidoFacadeAbstract{

    private PedidoFacade pedidoFacade = new
	    PedidoFacade();
    
    private BancoDados bancoDados = new BancoDados();
    
    @Override
    public void realizarPedido(Pedido pedido) {
	bancoDados.abrirTransacao();
	pedidoFacade.realizarPedido(pedido);
	bancoDados.comitarTransacao();	
    }

}
