package com.example.demo.configuracao;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.entidades.Produto;

@Configuration
public class ConfigBeans {

    @Bean
    public ArrayList<Produto> criaListaProduto(){
	return new ArrayList<>();
    }
}
