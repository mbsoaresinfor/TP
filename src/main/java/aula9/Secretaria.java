package aula9;

public class Secretaria 
		implements TocouTelefone{

    @Override
    public void tocou(String numero) {
	System.out.println("Secretaria: Opa, telefone com "
		+ " n. " + numero
		+ " tocou, vou atender :)");
	
    }

}
