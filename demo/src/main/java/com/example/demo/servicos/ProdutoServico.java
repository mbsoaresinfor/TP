package com.example.demo.servicos;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entidades.Produto;
import com.example.demo.repositorio.ProdutoRepositorio;
import com.example.demo.validadores.ProdutoValidador;

@Service
public class ProdutoServico {

    @Autowired
    private ProdutoRepositorio produtoRepositorio;
    
    @Autowired
    private ProdutoValidador produtoValidador;
    
    public void salvar(Produto produto) 
	    	throws Exception{
	produtoValidador.validar(produto);
	produtoRepositorio.adicionar(produto);
    }
    
    public ArrayList<Produto> listar(){
	return produtoRepositorio.listar();
    }
    
}
