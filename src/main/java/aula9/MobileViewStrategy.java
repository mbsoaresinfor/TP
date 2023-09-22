package aula9;

public class MobileViewStrategy implements DrawView {

    @Override
    public String draw() {
	StringBuilder view = new StringBuilder();
	view.append("------------------\n");
	view.append(" MOBILE APP        \n");
	view.append(" Bem vindo fulano ...\n");
	view.append(" -----------------\n");
	return view.toString();
    }

}
