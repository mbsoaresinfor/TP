package aula4;

import java.math.BigDecimal;

public class CalculaladoraSalarioUsuario {

	public BigDecimal calcular(Usuario usuario) {
		return usuario.calculoSalarioUsuario.calcular(usuario);
	}
}
