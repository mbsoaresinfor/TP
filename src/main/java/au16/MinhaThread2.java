package au16;

public class MinhaThread2 extends Thread{

    public void run() {
	for(int i=0; i < 10;i++) {
	   System.out.println(i);
	}
    }
}
