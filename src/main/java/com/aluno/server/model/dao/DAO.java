
package com.aluno.server.model.dao;

import com.aluno.server.model.Cadastro;

public interface DAO<T extends Cadastro> {

    T findById(Long id);

    void savePost(T entity);

    long save(T entity);
    
    boolean delete(T entity);

}
