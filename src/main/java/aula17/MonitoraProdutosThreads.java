package aula17;

import java.util.ArrayList;

public class MonitoraProdutosThreads 
			extends Thread{
    
    private ArrayList<Produto> listaProduto;
    
    public MonitoraProdutosThreads
    (ArrayList<Produto> listaProduto) {
	this.listaProduto = listaProduto;
    }
    
    public void run() {
	while(true) {
	    try {
		Thread.sleep(15 * 1000);
		if(listaProduto.isEmpty()) {
		    System.out.println("Lista de"
		    	+ " produto está vazia");;
		}else {
		    System.out.println("Lista de produto "
			    + "tem " + listaProduto.size() + " elementos");
		}
	    } catch (InterruptedException e) {
		e.printStackTrace();
	    }
	}
    }

}
