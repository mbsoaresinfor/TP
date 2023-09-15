package aula8;

public class MainAula8 {

    public static void main(String[] args) {

	Pedido pedido = new Pedido();
	pedido.idPedido = 50;
	pedido.valorPedido = 80;
	
	PedidoFacadeProxy proxyFacade =
			new PedidoFacadeProxy();
	proxyFacade.realizarPedido(pedido);
	

    }

}
