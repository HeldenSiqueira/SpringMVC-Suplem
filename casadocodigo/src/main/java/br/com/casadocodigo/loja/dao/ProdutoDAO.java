package br.com.casadocodigo.loja.daos;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.casadocodigo.loja.models.Produto;

//classe de acesso a dados responsável por manipular os dados dos produtos.
//@Repository definir que o ProdutoDAO será gerenciado pelo Spring.
/*definir que o nosso ProdutoDAO é uma classe Transancional e fazemos isso através 
 * da anotação @Transactional do pacote org.springframework.transaction.annotation.Transactional.*/
@Repository
@Transactional
public class ProdutoDAO {
	/*gerenciador de entidades =EntityManager Para que o ProdutoDAO realize a persistencia ou seja,
	 *  para que ele salve o produto no banco de dados.*/
	@PersistenceContext
    private EntityManager manager;
// método gravar que receberá um objeto produto e o salvará no banco de dados
	public void gravar(Produto produto){
		manager.persist(produto);
    }
}
