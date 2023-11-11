package au16;

import javax.swing.JOptionPane;

public class MainAula16 {

    public static void main(String[] args) {

//	MinhaThread1 minhaThread1  = new MinhaThread1("a");	
//	minhaThread1.start();	
//	
//	MinhaThread1 minhaThread2 = new MinhaThread1("b");
//	minhaThread2.start();
//	
//	MinhaThread1 minhaThread3 = new MinhaThread1("c");
//	minhaThread3.start();
	
//	MinhaThread2 t2 = new MinhaThread2();
//	t2.start();
//	
//	Thread t3 = new Thread(new MinhaThread3());
//	t3.start();
//	
//	Runnable r = () -> {
//	    for(int i=0; i < 10;i++) {
//		   System.out.println(i);
//	    }
//	};
//	
//	Thread t4 = new Thread(r);
//	t4.start();	
//	
//	Thread t5 = new Thread(r);
//	t5.start();
//	
//	Thread t6 = new Thread(r);
//	t6.start();
	
	
	MostraDataConsoleThread consoleThread = new
		MostraDataConsoleThread();
	consoleThread.start();
	
	MenuThread menuThread = 
		new MenuThread(consoleThread);
	menuThread.start();
	
	

    }

    
    
}
