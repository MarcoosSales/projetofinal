package com.aluno.server.model.dao;

import com.aluno.server.model.Cadastro;
import javax.persistence.EntityManager;

public class JpaDAO<T extends Cadastro> implements DAO<T> {

    private final EntityManager em;
    private final Class<T> classe;

    public JpaDAO(EntityManager em, Class<T> classe) {
        this.em = em;
        this.classe = classe;
    }

    @Override
    public T findById(Long id) {
        return getEm().find(classe, id);
    }

    @Override
    public boolean delete(T entity) {
        em.remove(entity);
        return true;
    }

    @Override
    public long save(T entity) {
        if (entity.getId() > 0) {
            em.merge(entity);
        } else {
            em.persist(entity);
        }

        return entity.getId();
    }

    /**
     * @return the em
     */
    public EntityManager getEm() {
        return em;
    }

    @Override
    public void savePost(T entity) {
        getEm().persist(entity);
    }

}
