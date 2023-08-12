package aula3;

import aula2.Funcionario;

public class FuncionarioServico {

    Funcionario funcionario;

    public void editarFuncionario(Funcionario funcionario) {
	try {
	    validaFuncionario(funcionario);
	    processaEditarFuncionarario(funcionario);
	} catch (Exception e) {
	    System.out.println(e.getMessage());
	}
    }

    public void processaEditarFuncionarario(Funcionario funcionario) throws Exception {

	boolean sucessoEdicao = true;
	if (!sucessoEdicao) {
	    throw new Exception("error");
	}
    }

    private void validaFuncionario(Funcionario funcionario) throws Exception {
	if (eIdValidoFuncionario(funcionario)) {
	    throw new Exception("Funcionario deve ter um ID");
	}
    }

    private boolean eIdValidoFuncionario(Funcionario funcionario) {
	return funcionario.id == 0;
    }

}
