package aula7;

public class PagamentoAVista 
		implements Pagamento{

    @Override
    public void realizarPagamento(Double valor) {
	System.out.println("pagando à vista: " + valor);
	
    }

}
