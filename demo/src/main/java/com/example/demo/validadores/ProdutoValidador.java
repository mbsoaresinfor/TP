package com.example.demo.validadores;


import java.util.Objects;

import org.springframework.stereotype.Component;

import com.example.demo.entidades.Produto;

@Component
public class ProdutoValidador {

    public void validar(Produto produto) throws Exception {

	if (Objects.isNull(produto)) {
	    throw new Exception("Produto null");
	}

	if (Objects.isNull(produto.getNome())) {
	    throw new Exception("Nome do Produto null");
	}

	if (Objects.isNull(produto.getPreco())) {
	    throw new Exception("Preço do Produto null");
	}

	if (produto.getNome().isEmpty()) {
	    throw new Exception("Nome do Produto está vazio");
	}

	int limiteMaximo = 20;
	boolean limiteMaxCaracteres = produto.getNome().length() > limiteMaximo;
	if (limiteMaxCaracteres) {
	    throw new Exception("Nome do Produto tem mais de " + limiteMaximo + " " + " caracteres");
	}

	boolean ePrecoNegativo = produto.getPreco().longValue() < 0;
	if (ePrecoNegativo) {
	    throw new Exception("Preço do produto é negativo");
	}
    }
}
