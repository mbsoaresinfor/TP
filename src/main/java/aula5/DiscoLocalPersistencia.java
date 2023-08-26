package aula5;

public class DiscoLocalPersistencia 
		implements PersistaPassagem{

    public void persitir(Passagem passagem) {
	System.out.println("DiscoLocal"
		+ " persitir " + passagem);
	
    }

}
