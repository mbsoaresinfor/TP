package aula4;

import java.math.BigDecimal;

public class AnalistaCalculo implements Calculo {

	public BigDecimal calcular(Funcionario funcionario) {
		return funcionario.salario.add(BigDecimal.valueOf(100));
	}

}
