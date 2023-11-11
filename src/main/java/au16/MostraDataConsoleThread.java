package au16;

import java.util.Date;

public class MostraDataConsoleThread 
		extends Thread{
    private String nome;
    
    public void setNome(String nome) {
	this.nome = nome;
    }
    
    public void run() {
	while(true) {
	    System.out.println("‘Executando a thread "
		+ new Date()  );
	    System.out.println("Nome digitado: " 
		+ nome );
	}
    }

}
