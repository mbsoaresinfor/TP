package aula8;

public class BancoDados {

    public void abrirTransacao() {
	System.out.println("aberto transacao");
    }
    
    public void comitarTransacao() {
	System.out.println("commit transacao");
    }
    
    public void rolbackTransacao() {
	System.out.println("rolback transacao");
    }
}
