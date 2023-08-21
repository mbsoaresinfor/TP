package aula4;

import java.math.BigDecimal;

public class CalculoSalarioDiretor implements CalculoSalarioUsuario {

	public BigDecimal calcular(Usuario usuario) {
		return usuario.salario.add(BigDecimal.valueOf(5));

	}

}
