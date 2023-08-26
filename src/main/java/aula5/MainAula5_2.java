package aula5;

import java.io.Console;
import java.util.Scanner;

public class MainAula5_2 {

    public static void main(String[] args) {

	Scanner teclado = new Scanner(System.in);
	PassagemServico passagemServico = 
		new PassagemServico(new AWSPersistencia());
	
	while(true) {
	    System.out.println("1 - salvar passagem");
	    System.out.println("2 - sair");
	    String op = teclado.nextLine();
	    if(op.equals("1")) {
		System.out.print("digite destino: ");
		String destino = teclado.nextLine();
		System.out.print("digite valor: ");
		String valor = teclado.nextLine();
		Passagem passagem = new Passagem();
		passagem.destino = destino;
		passagem.valor = Float.parseFloat(valor);
			
		
		System.out.println("A - AWS");
		System.out.println("B - LOCAL");
		System.out.println("C - BANCO DE DADOS");
		System.out.print("Selecione a forma de persistencia: ");
		String op2 = teclado.nextLine();
		if(op2.equals("A")) {
		    passagemServico.setPersistaPassagem(new AWSPersistencia());		    
		}
		else if(op2.equals("B")) {
		    passagemServico.setPersistaPassagem(new DiscoLocalPersistencia());		    
		}else if(op2.equals("C")) {
		    passagemServico.setPersistaPassagem(new BancoDadosPersistencia());		    
		}
		passagemServico.persitirPassagem(passagem);
		
	    }
	    if(op.equals("2")) {
		return;
	    }
	}
	

    }

}
