package aula9;

import java.util.HashMap;

public class ViewContext {

    private HashMap<String,DrawView>
     mapa = new HashMap<>();
    
    public ViewContext() {
	mapa.put("web",new WebViewStrategy());
	mapa.put("desktop",new DesktopViewStrategy());
	mapa.put("mobile",new MobileViewStrategy());
    }
    
    public String drawView(String tipo) {
	DrawView view = mapa.get(tipo);
	return view.draw();
    }
}
