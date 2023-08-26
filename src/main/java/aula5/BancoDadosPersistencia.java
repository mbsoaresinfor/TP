package aula5;

public class BancoDadosPersistencia 
	implements PersistaPassagem{

    public void persitir(Passagem passagem) {
	System.out.println("BancoDados salvando: "
			+passagem);
    }

}
