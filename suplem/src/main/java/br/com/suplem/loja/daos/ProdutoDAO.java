package br.com.suplem.loja.daos;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.suplem.loja.models.Produto;
//@Repository indica q O ProdutoDAO é um recurso persistente (persiste dados) dentro do sistema,
@Repository
@Transactional
public class ProdutoDAO {

    @PersistenceContext
    private EntityManager manager;

    public void gravar(Produto produto) {
        manager.persist(produto);
    }
}
