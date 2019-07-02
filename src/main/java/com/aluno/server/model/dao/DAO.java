
package com.aluno.server.model.dao;

import com.aluno.server.model.Cadastro;

public interface DAO<T extends Cadastro> {

    T findById(Long id);

    void saveForPost(T entity);

    boolean delete(T entity);
   // boolean delete(long id);
    
    long save(T entity);

}
