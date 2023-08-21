package aula4;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class UsuarioServico {

	List<Usuario> lista = new ArrayList<Usuario>();
	ValidacaoUsuario validacaoUsuario = new ValidacaoUsuario();
	CalculaladoraSalarioUsuario calculaladoraSalarioUsuario = new CalculaladoraSalarioUsuario();
	
	public void salvarUsuario(Usuario usuario)  {
		
		validacaoUsuario.validacaoUsuario(usuario);		
		BigDecimal salarioCalculado =  calculaladoraSalarioUsuario.calcular(usuario);
		usuario.salario = salarioCalculado;
		lista.add(usuario);
		System.out.println("usuário " + usuario.nome + ", R$" + usuario.salario  +" salvo com sucesso");
	}

}
