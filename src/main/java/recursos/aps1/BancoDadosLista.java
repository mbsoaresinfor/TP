package recursos.aps1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


// DICA: essa classe salva pessoa em uma lista. Esta funcionando corretamente.
public class BancoDadosLista implements BancoDados {

	
	private List<Pessoa> l = new ArrayList<Pessoa>();
	
	public void salvar(Pessoa p) {
		l.add(p);

	}

	public void remover(Integer idPessoa) {
		Iterator<Pessoa> it = l.iterator();
		
		while(it.hasNext()) {
			Pessoa p = it.next();
			if(p.getId().equals(idPessoa)) {
				it.remove();
				break;
			}
		}

	}
	

	public Pessoa buscar(Pessoa pe) {
		Iterator<Pessoa> it = l.iterator();
		
		while(it.hasNext()) {
			Pessoa p = it.next();
			if(p.getId().equals(pe.getId())) {
				return p;				
			}
		}
		return null;
	}

	public List<Pessoa> buscar() {
	
		return l;
	}

}
