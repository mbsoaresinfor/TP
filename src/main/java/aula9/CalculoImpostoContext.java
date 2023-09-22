package aula9;

import java.util.HashMap;

public class CalculoImpostoContext {

    private HashMap<String,CalcularImposto>
    	mapa = new HashMap<>();
    
    public CalculoImpostoContext() {
	mapa.put("icms", new ImpostoICMSStrategy());
	mapa.put("ipi", new ImpostoIPIStrategy());
	mapa.put("st", new ImpostoSTStrategy());	
    }
    
    public double calcular(String nomeImposto, 
	    		double valor) {
	return mapa.get(nomeImposto).calcular(valor);
    }
    
}
