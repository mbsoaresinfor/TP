package aula9;

class ImpostoIPIStrategy implements CalcularImposto {

    @Override
    public Double calcular(Double valor) {
	return valor + 5;
    }

}
