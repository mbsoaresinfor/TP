package aula9;

class ImpostoSTStrategy implements CalcularImposto {

    @Override
    public Double calcular(Double valor) {	
	return valor + 20;
    }

}
