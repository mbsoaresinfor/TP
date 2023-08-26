package aula5;

public class PassagemServico {

    private PersistaPassagem persistaPassagem;
    
    public PassagemServico(PersistaPassagem 
	    		persistaPassagem) {
	this.persistaPassagem = persistaPassagem;
    }
    
    public void setPersistaPassagem(PersistaPassagem 
		persistaPassagem) {
	this.persistaPassagem = persistaPassagem;
    }
    
    public void persitirPassagem(Passagem passagem) {
	this.persistaPassagem.persitir(passagem);
    }
}
