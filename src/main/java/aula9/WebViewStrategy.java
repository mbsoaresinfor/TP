package aula9;

public class WebViewStrategy implements DrawView {

    @Override
    public String draw() {
	StringBuilder view = new StringBuilder();
	view.append("*******************\n");
	view.append(" VERSÃO WEB        \n");
	view.append(" como vai cliente fulano..\n");
	view.append("*******************\n");
	return view.toString();
	
    }

}
