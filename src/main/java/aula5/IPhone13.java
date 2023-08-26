package aula5;

public class IPhone13 
		implements Telefone,
			TelefoneInternet,
			TelefoneMensagem{

    public void enviarMensagem(String mensagem) {
	System.out.println("IPhone13: "
		+ "enviando mensagem " + mensagem);
	
    }

    public void receberMensagem(String mensagem) {
	System.out.println("IPhone13: "
		+ "recebendo mensagem " + mensagem); 
	
    }

    public void conectarInternet() {
	System.out.println("IPhone13: "
		+ "conectando a internet");
	
    }

    public void ligar() {
	System.out.println("IPhone13: "
		+ "ligando ");
	
    }

}
