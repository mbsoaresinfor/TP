package aula17;

import javax.swing.JOptionPane;

public class MainThread {

    public static void main(String[] args) {

	String quant =JOptionPane.showInputDialog("digite quantidade de thread");
	for(int i=0; i< Integer.parseInt(quant); i++) {
	    new ThreadTestMemory().start();
	}
	JOptionPane.showMessageDialog(null, "bloqueado");

    }

}
