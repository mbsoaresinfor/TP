package aula7;

public class PizzaBuilder {

    private Pizza pizza;
    
    public PizzaBuilder() {
	pizza = new Pizza();
    }
    
    public static PizzaBuilder builder() {
        return new PizzaBuilder();
    }
    
    public PizzaBuilder tamanhoGrande() {
	pizza.setTamanho(50);
	return this;
    }
    
    public PizzaBuilder tamanhoPequeno() {
	pizza.setTamanho(25);
	return this;
    }
    
    public PizzaBuilder comSaborMuzzarela() {
	pizza.setSabor("muzzarela");
	return this;
    }
    
    public PizzaBuilder comSaborCalabreza() {
	pizza.setSabor("calabreza");
	return this;
    }
    
    public PizzaBuilder comBorda() {
	pizza.setComBorda(true);
	return this;
    }
    
    public PizzaBuilder semBorda() {
	pizza.setComBorda(false);
	return this;
    }
    
    public Pizza fazerPizza() {
	return pizza;
    }
    
    
}
