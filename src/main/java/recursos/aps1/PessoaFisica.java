package recursos.aps1;

public class PessoaFisica extends Pessoa {

	public PessoaFisica(int id) {
	super(id);
	// TODO Auto-generated constructor stub
    }

	private String cpf;
	private Float salario;

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Float getSalario() {
		return salario;
	}

	public void setSalario(Float salario) {
		this.salario = salario;
	}
	
	
	
	
	
}
