package aula17;

public class EnviarEmailThread extends Thread{

    public void run() {
	for(int i=0; i < 10; i++) {
	    try {
		Thread.sleep(1000);
		System.out.println("“Enviando email");
	    } catch (InterruptedException e) {
		e.printStackTrace();
	    }
	}
    }
}
