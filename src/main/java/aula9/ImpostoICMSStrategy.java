package aula9;

class ImpostoICMSStrategy implements CalcularImposto {

    @Override
    public Double calcular(Double valor) {
	return valor + 10;
    }

}
