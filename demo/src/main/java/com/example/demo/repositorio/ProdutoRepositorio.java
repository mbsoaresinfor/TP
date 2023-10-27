package com.example.demo.repositorio;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.entidades.Produto;

@Repository
public class ProdutoRepositorio {

    @Autowired
    private ArrayList<Produto> lista;
    
    public void adicionar(Produto produto) {
	this.lista.add(produto);
    }
    
    public ArrayList<Produto> listar(){
	return lista;
    }
    
}
