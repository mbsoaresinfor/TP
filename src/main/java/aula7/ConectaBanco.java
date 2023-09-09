package aula7;

public class ConectaBanco {

    private static ConectaBanco instancia;
    
    private ConectaBanco () {	
    }
    
    public static ConectaBanco getInstancia() {
	if(instancia == null) {
	    instancia = new ConectaBanco();
	}
	return instancia;
    }
    
    public void conecta() {
	System.out.println("conectando banco de dados");
    }

}
