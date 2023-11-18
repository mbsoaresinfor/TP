package aula17;

import javax.swing.JOptionPane;

public class MainExercicio4 {

    public static void main(String[] args) {

	while(true) {
	    String op = JOptionPane.showInputDialog(menuMensagem());
	    if("1".equals(op)) {
		 new EnviarEmailThread().start();
	    }
	    else if("2".equals(op)) {
		 new EnviarMensagemThread().start();
	    }
	    else if("3".equals(op)) {
		String mensagem = JOptionPane.showInputDialog("Digite a mensagem para o whats");
		 new WhatsThread(mensagem).start();
	    }else {
		JOptionPane.showMessageDialog(null, "opção invalida");
	    }
	}
	

    }

    private static String menuMensagem() {

	return "1.Enviar email\n"
		+ "2.Enviar Mensagem\n"
		+ "3.Enviar Whatz";
    }

}
