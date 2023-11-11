package au16;

import javax.swing.JOptionPane;

public class MenuThread 
	extends Thread{
    private MostraDataConsoleThread 
	mostraDataConsoleThread;
    
    public MenuThread(MostraDataConsoleThread 
	    	mostraDataConsoleThread) {
	this.mostraDataConsoleThread= mostraDataConsoleThread;
    }
    
    public void run() {
	while(true) {
	    String nome = JOptionPane
		    .showInputDialog("digite seu nome");
	    JOptionPane
	    .showMessageDialog(null, "seu nome é:" + nome);
	    mostraDataConsoleThread.setName(nome);
	}
    }

}
