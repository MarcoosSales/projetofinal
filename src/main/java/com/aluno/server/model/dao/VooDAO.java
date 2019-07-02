
package com.aluno.server.model.dao;

import com.aluno.server.model.Voo;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

/**
 *
 * @author aluno
 */
public class VooDAO extends JpaDAO<Voo> {

    public VooDAO(EntityManager em) {
        super(em, Voo.class);
    }

    public Voo findByOrigemDestino(long idCidadeOrigem, long idCidadeDestino) {
        String jpql = "select v from Voo v where cidadeOrigem.id = :cidadeOrigem and cidadeDestino.id = :cidadeDestino";
        TypedQuery<Voo> query = getEm().createQuery(jpql, Voo.class);
        query.setParameter("cidadeOrigem", idCidadeOrigem);
        query.setParameter("cidadeDestino", idCidadeDestino);
        return query.getSingleResult();
    }
    public Voo findByOrigemDestinoDataPartida(long idCidadeOrigem, long idCidadeDestino, String dataPartida) {
        String jpql = "select v from Voo v where cidadeOrigem.id = :cidadeOrigem and cidadeDestino.id = :cidadeDestino and horadataPartida = :horadataPartida";
        TypedQuery<Voo> query = getEm().createQuery(jpql, Voo.class);
        query.setParameter("cidadeOrigem", idCidadeOrigem);
        query.setParameter("cidadeDestino", idCidadeDestino);
        query.setParameter("horadataPartida", dataPartida);
        return query.getSingleResult();
    }

    public Voo findByOrigemDestinoFaixaPreco(long idCidadeOrigem, long idCidadeDestino, 
            String dataPartida,  long preco) {
        String jpql = "select v from Voo v where cidadeOrigem.id = :cidadeOrigem "
                + "and cidadeDestino.id = :cidadeDestino "
                + "and horadataPartida = :horadataPartida "
                + "and precoPassagem = :precoPassagem";
               // + "and precoPacagem <= :atePreco";
        TypedQuery<Voo> query = getEm().createQuery(jpql, Voo.class);
        query.setParameter("cidadeOrigem", idCidadeOrigem);
        query.setParameter("cidadeDestino", idCidadeDestino);
        query.setParameter("horadataPartida", dataPartida);
        query.setParameter("precoPassagem", preco);
        return query.getSingleResult();
    }

    @Override
    public void savePost(Voo entity) {
        getEm().persist(entity);
    }
    
    @Override
    public long save(Voo entity) {
        if(entity.getId() > 0)
            getEm().merge(entity);
        else getEm().persist(entity);

        return entity.getId();
    }


}
