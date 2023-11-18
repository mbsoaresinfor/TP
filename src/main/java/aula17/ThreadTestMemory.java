package aula17;

import java.util.ArrayList;

public class ThreadTestMemory extends Thread {

    public void run() {
	System.out.println("executando " + getName());
	for(int i=0;i < 100;i++) {
	    new ArrayList<>();
	}
    }
}
