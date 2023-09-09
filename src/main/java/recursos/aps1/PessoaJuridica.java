package recursos.aps1;

public class PessoaJuridica extends Pessoa {

	public PessoaJuridica(int id) {
	super(id);
	// TODO Auto-generated constructor stub
    }

	private String cnpj;

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	
}
