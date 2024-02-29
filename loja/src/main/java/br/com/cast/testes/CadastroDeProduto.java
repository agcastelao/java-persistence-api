package br.com.cast.testes;

import javax.persistence.EntityManager;

import br.com.cast.dao.CategoriaDao;
import br.com.cast.dao.ProdutoDao;
import br.com.cast.modelo.Categoria;
import br.com.cast.modelo.Produto;
import br.com.cast.util.JPAUtil;

public class CadastroDeProduto {
    
    public static void main(String[] args) {
        EntityManager em = JPAUtil.getEntityManager();
        
        Categoria celulares = new Categoria("CELULARES");

        Produto celular = new Produto("iPhone 13", "Descrição IPhone 13", 100, celulares);

        ProdutoDao produtoDao = new ProdutoDao(em);
        CategoriaDao categoriaDao = new CategoriaDao(em);

        em.getTransaction().begin();

        categoriaDao.cadastrar(celulares);
        produtoDao.cadastrar(celular);

        em.getTransaction().commit();
        em.close();

    }
}
