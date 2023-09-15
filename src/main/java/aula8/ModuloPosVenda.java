package aula8;

public class ModuloPosVenda {

    public void agendarContatoCliente
    			(Pedido pedido) {
	System.out.println("# Execuntado modulo ModuloPosVenda");
	System.out.println("Agendando contato"
		+ " cliente do pedido id " + pedido.idPedido );
    }
}
