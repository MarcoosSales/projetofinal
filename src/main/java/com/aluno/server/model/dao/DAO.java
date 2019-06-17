
package com.aluno.server.model.dao;

import com.aluno.server.model.Cadastro;

    public interface DAO<T extends Cadastro> {
    T findById(long id);
    T findByField(String fieldName, Object value);
    boolean remove(T entity);
    void save(T entity);
    
}