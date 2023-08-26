package aula5;

public class Nokia6120I
		implements Telefone,
		TelefoneMensagem{

    public void enviarMensagem(String mensagem) {
	System.out.println("Nokia6120I: "
		+ "enviando mensagem " + mensagem);
	
    }

    public void receberMensagem(String mensagem) {
	System.out.println("Nokia6120I: "
		+ "recebendo mensagem " + mensagem);
	
    }

    public void ligar() {
	System.out.println("Nokia6120I: "
		+ " ligando");	
    }

}
