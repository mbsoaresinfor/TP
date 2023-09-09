package aula7;

import lombok.Builder;


public class Pizza {

    private int tamanho;
    private String sabor;
    private Boolean comBorda;
    public int getTamanho() {
        return tamanho;
    }
    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
    public String getSabor() {
        return sabor;
    }
    public void setSabor(String sabor) {
        this.sabor = sabor;
    }
    public Boolean getComBorda() {
        return comBorda;
    }
    public void setComBorda(Boolean comBorda) {
        this.comBorda = comBorda;
    }
    @Override
    public String toString() {
	return "Pizza [tamanho=" + tamanho + ", sabor=" + sabor + ", comBorda=" + comBorda + "]";
    }
    
    
    
    
}
