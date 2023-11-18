package aula17;

import java.util.ArrayList;
import java.util.function.Predicate;

import javax.swing.JOptionPane;

public class TelaPrincipalThead extends Thread{
    
    private ArrayList<Produto> listaProduto ;
    private final String CADASTRAR = "1";
    private final String REMOVER = "2";
    
    public TelaPrincipalThead(ArrayList<Produto> listaProduto ) {
	this.listaProduto = listaProduto;
    }
    
    public void run() {
	for(;;) {
	    String op = JOptionPane
		    .showInputDialog("1. cadastro\n2. Remoção");
	    if(CADASTRAR.equals(op)){
		cadastrar();
	    }
	    else if(REMOVER.equals(op)){
		remover();
	    }else {
		JOptionPane.showMessageDialog(null, "opção invalida");
	    }
	}
    }

    private void remover() {
	String nome = JOptionPane
		    .showInputDialog("Digite o nome do produto, para remover");

	Predicate<Produto> remover = item -> item.nome.equals(nome);
	Boolean resultado = listaProduto
	.removeIf(remover);
	if(resultado) {
	    JOptionPane.showMessageDialog(null, "produto removido com sucesso");
	}else {
	    JOptionPane.showMessageDialog(null, "produto não localizado para remover.");	    
	}
	
    }

    private void cadastrar() {
	String nome = JOptionPane
		    .showInputDialog("Digite o nome para cadastrar");
	
	String preco = JOptionPane
		    .showInputDialog("Digite o preço para cadastrar");
	
	Produto produto = new Produto();
	produto.nome = nome;
	produto.preco = Float.parseFloat(preco);
	listaProduto.add(produto);
	JOptionPane.showMessageDialog(null, "Produto Cadastrado");
	
    }
    

}
