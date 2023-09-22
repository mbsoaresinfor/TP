package aula9;

import java.util.ArrayList;

public class Telefone {

    private ArrayList<TocouTelefone> lista =
	    new ArrayList<>();
    
    public void recebendoLigacao(String numero) {
	System.out.println("Recebendo ligação do"
		+ " numero: " + numero);
	notifyOuvintes(numero);
	
    }

    private void notifyOuvintes(String numero) {
	lista.forEach((ouvinte) 
		-> ouvinte.tocou(numero));
    }
    
    public void adicionarOuvinte(
	    TocouTelefone tocouTelefone) {
	this.lista.add(tocouTelefone);
    }
    
    public void removerOuvinte() {
	
    }
}
