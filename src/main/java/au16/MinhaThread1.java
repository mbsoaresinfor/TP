package au16;

public class MinhaThread1 extends Thread{

    public MinhaThread1(String nome) {
	setName(nome);
    }
    
    public void run() {
	for(;;) {
	    System.out.println("Ola, sou a thread " +
		this.getName());
	}
	
	
    }
}
