package aula17;

public class EnviarMensagemThread extends Thread {

    
    public void run() {
	for(int i=0; i < 5; i++) {
	    try {
		Thread.sleep(3000);
		System.out.println("“Enviando mensagem");
	    } catch (InterruptedException e) {
		e.printStackTrace();
	    }
	}
    }
}
