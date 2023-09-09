package aula7;

public class ConfigSystem {

    private String nomeSistema;
    private String caminhoImagens;
    // 2 etapa: criar uma variavel static do tipo da classe
    private static ConfigSystem instancia;
    
    // 1 etapa: colocar construtor como privado
    private ConfigSystem() {
	System.out.println("Criando: " 
    + this.getClass().getSimpleName());
    }
    
    // 3 etapa final.
    public static ConfigSystem getInstancia() {
	if(instancia == null) {
	    instancia = new ConfigSystem();
	}
	return instancia;
    }
    
    public String getNomeSistema() {
        return nomeSistema;
    }
    public void setNomeSistema(String nomeSistema) {
        this.nomeSistema = nomeSistema;
    }
    public String getCaminhoImagens() {
        return caminhoImagens;
    }
    public void setCaminhoImagens(String caminhoImagens) {
        this.caminhoImagens = caminhoImagens;
    }
    
    
}
