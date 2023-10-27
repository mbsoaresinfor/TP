package com.example.demo.view;

import java.math.BigDecimal;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.entidades.Produto;
import com.example.demo.servicos.ProdutoServico;

@Component
public class ProdutoView implements CommandLineRunner {

    @Autowired
    private ProdutoServico produtoServico;

    @Override
    public void run(String... args) throws Exception {

	Scanner teclado = new Scanner(System.in);

	while (true) {
	    Produto produto = new Produto();
	    System.out.println("Digite o nome do produto: ");
	    produto.setNome(teclado.nextLine());
	    System.out.println("Digite o preço do produto : ");
	    produto.setPreco(teclado.nextBigDecimal());
	    produtoServico.salvar(produto);

	    System.out.println("LISTAGEM");

	    for (Produto p : produtoServico.listar()) {
		System.out.println("Nome: " + p.getNome());
		System.out.println("Preço: " + p.getPreco());
		System.out.println("-----------------");
	    }
	}

    }

}
