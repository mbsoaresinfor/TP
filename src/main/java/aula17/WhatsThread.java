package aula17;

public class WhatsThread extends Thread{

    private String mensagem;
    public WhatsThread(String mensagem) {
	this.mensagem = mensagem;
    }
    
    public void run() {
	for(int i=0; i < 3; i++) {
	    try {
		Thread.sleep(1000);
		System.out.println("“Enviando whats " + mensagem);
	    } catch (InterruptedException e) {
		e.printStackTrace();
	    }
	}
    }
}
