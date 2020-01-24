package br.com.casadocodigo.loja.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.casadocodigo.loja.daos.ProdutoDAO;
import br.com.casadocodigo.loja.models.Produto;

@Controller
public class ProdutosController {
	/*Precisamos fazer com que agora, quando o Controller receba o produto, ele use o ProdutoDAO 
	 * para salvar o produto no banco de dados*/
	//@Autowired serve para que nós não nos preocupemos em criar manualmente o ProdutoDAO no Controller
	//injeção de dependência
	@Autowired
    private ProdutoDAO produtoDao;
//método form que retorna a view com o formulário
		@RequestMapping("/produtos/form")
		public String form() {
			return "produtos/form";
		}
		// mapeando o path /produtos para um método no ProdutosController
		/*recebemos um objeto do tipo produto, imprimimos o produto no console e 
		 * retornamos a view "ok", que deve estar dentro da pasta produtos */
		//caminho de retorno da view /views/produtos/ok
		@RequestMapping("/produtos")
		public String gravar(Produto produto) {
			System.out.println(produto);
			produtoDao.gravar(produto);
			return "/produtos/ok";
}
} 