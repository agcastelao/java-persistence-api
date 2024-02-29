package br.com.cast.dao;

import javax.persistence.EntityManager;

import br.com.cast.modelo.Produto;

public class ProdutoDao {
    
    private EntityManager em;

    public ProdutoDao(EntityManager em) {
        this.em = em;
    }

    public void cadastrar(Produto produto) {
        this.em.persist(produto);
    }

}
