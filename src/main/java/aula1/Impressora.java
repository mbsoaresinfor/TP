package aula1;

public abstract class Impressora {

	int idade;
	
	public void mostrarIdadeEMaioridade() {
		mostrarIdade();
		mostrarMaioridade();
	}

	private void mostrarIdade() {
		System.out.println(idade);
	}

	private void mostrarMaioridade() {
		if(idade >= 18) {
			System.out.println("maior idade");
		}else {
			System.out.println("menor idade");
		}
	}
}
