package aula17;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class MainAula17 {

    public static void main(String[] args) {
//	MonitoraComputadorThread monitora = 
//	new MonitoraComputadorThread();
//	monitora.start();
//	monitora.setName("Monitamento de computador");
//	while(true) {
//	    String ip = JOptionPane
//		    .showInputDialog("digite o ip para monitorar");
//	    monitora.ip = ip;
//	}
	
	ArrayList<Produto> listaProduto 
	= new ArrayList<>();
	
	MonitoraProdutosThreads monitora = new 
		MonitoraProdutosThreads(listaProduto);
	monitora.start();
	monitora.setName("Monitor de produtos");
	
	TelaPrincipalThead tela =
		new TelaPrincipalThead(listaProduto);
	tela.start();
	tela.setName("Tela de cadastro");
	
	
	
	

    }

}
