package aula9;

public class MainAula9 {

    public static void main(String[] args) {

	double valorImpoto = 50;
	CalculoImpostoContext context = 
		new CalculoImpostoContext();
	
	System.out.println(context
		.calcular("icms", valorImpoto));
	
	System.out.println(context
		.calcular("ipi", valorImpoto));
	
	System.out.println(context
		.calcular("st", valorImpoto));
	
	ViewContext viewContext = new ViewContext();
	System.out.println(viewContext
				.drawView("mobile"));
	System.out.println(viewContext
		.drawView("web"));
	
	System.out.println(viewContext
		.drawView("desktop"));
	
	// OBSERVER
	Telefone telefone = new Telefone();
	Secretaria secretaria = new Secretaria();
	Secretaria secretaria2 = new Secretaria();
	telefone.adicionarOuvinte(secretaria);
	telefone.adicionarOuvinte(secretaria2);
	telefone.recebendoLigacao("123465");

    }

}
