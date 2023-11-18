package aula17;

import java.net.InetAddress;

public class MonitoraComputadorThread extends Thread{

    String ip;
    
    public void run() {
	
	while(true) {
	    
	    try {
		
		InetAddress address =
		InetAddress.getByName(ip);
		boolean ret =address.isReachable(300);
		if(ret) {
		    System.out.println("computador está no ar");
		}else {
		    System.out.println("computador está off");
		}
		
		Thread.sleep(3000);
	    } catch (Throwable e) {
		e.printStackTrace();
	    }	    
	    
	}
    }
}
