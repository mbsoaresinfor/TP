package aula5;

public class MainAula5 {

    public static void main(String[] args) {

	Telefone telefone;
	TelefoneInternet telefoneInternet;
	TelefoneMensagem telefoneMensagem;
	
	Nokia6120 nokia6120 = new Nokia6120();
	Nokia6120I nokia6120i = new Nokia6120I();
	IPhone13 iPhone13 = new IPhone13();
	
	telefone = nokia6120;
	telefone.ligar();
	telefone= nokia6120i;
	telefone.ligar();
	telefone = iPhone13;
	telefone.ligar();
	
	telefoneInternet = iPhone13;
	telefoneInternet.conectarInternet();
	iPhone13.enviarMensagem("olá");
	iPhone13.receberMensagem("teste");

    }

}
