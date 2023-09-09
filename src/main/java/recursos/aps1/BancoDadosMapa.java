package recursos.aps1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


// DICA: essa classe salva pessoa em um mapa. Esta funcionando corretamente.
public class BancoDadosMapa 
	implements BancoDados {

	
	private Map<Integer,Pessoa> m = new HashMap<Integer,Pessoa>();
	
	public void salvar(Pessoa p) {
		m.put(p.getId(), p);

	}

	public void remover(Integer idPessoa) {
		m.remove(idPessoa);

	}
	
	
	

	public Pessoa buscar(Pessoa pe) {
		
		return m.get(pe.getId());
	}

	public List<Pessoa> buscar() {	
		return new ArrayList<>(m.values());
	}

}
