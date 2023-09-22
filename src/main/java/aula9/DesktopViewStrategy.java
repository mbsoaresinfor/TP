package aula9;

public class DesktopViewStrategy implements DrawView {

    @Override
    public String draw() {
	StringBuilder view = new StringBuilder();
	view.append("####################\n");
	view.append(" DESKTOP V1        \n");	
	view.append("####################\n");
	return view.toString();
    }

}
