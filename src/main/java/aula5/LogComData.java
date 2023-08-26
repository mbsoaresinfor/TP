package aula5;

import java.util.Date;

public class LogComData 
		implements Log{

    public void log(String texto) {
	System.out.println(new Date() + ":: " + texto);
	
    }

}
