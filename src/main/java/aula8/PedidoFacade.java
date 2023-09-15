package aula8;

public class PedidoFacade implements PedidoFacadeAbstract{

    ModuloEstoque moduloEstoque = new ModuloEstoque();
    ModuloFinanceiro moduloFinanceiro = new ModuloFinanceiro();
    ModuloPosVenda moduloPosVenda = new ModuloPosVenda();

    public void realizarPedido(Pedido pedido) {
	moduloEstoque.enviarPedido(pedido);
	moduloFinanceiro.faturar(pedido);
	moduloPosVenda.agendarContatoCliente(pedido);
    }
    
}
