package aula7;

public class PagamentoPIX implements Pagamento {

    @Override
    public void realizarPagamento(Double valor) {

     System.out.println("pagando via PIX: " + valor);

    }

}
