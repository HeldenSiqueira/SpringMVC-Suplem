package br.com.suplem.loja.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.suplem.loja.daos.ProdutoDAO;
import br.com.suplem.loja.models.Produto;

//@Controller Spring reconhece a classe como controler
@Controller
public class ProdutosController {
	//@Autowired, para que ele seja injetado
	 @Autowired
	    private ProdutoDAO produtoDao;
	 
	 @RequestMapping("/produtos/form")
	    public String form() {
	        return "produtos/form";
	    }
	 
	 @RequestMapping("/produtos")
	 //receber os dados do formulário, então receba-os por parâmetro e imprima-os dentro do método.
	 public String gravar(Produto produto) {
		 System.out.println(produto);
		    return "produtos/ok";
	 }
}

