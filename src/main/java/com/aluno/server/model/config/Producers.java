
package com.aluno.server.model.config;

import com.aluno.server.model.dao.DAO;
import com.aluno.server.model.dao.JpaDAO;
import com.aluno.server.model.Cadastro;
import java.lang.reflect.ParameterizedType;
import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author aluno
 */
public class Producers {
    
    @Produces
    @PersistenceContext
    private EntityManager em;

@Produces
public <T extends Cadastro> DAO <T> getDao(InjectionPoint ip){
    ParameterizedType t = (ParameterizedType) ip.getType();
    Class classe = (Class) t.getActualTypeArguments()[0];
    return new JpaDAO(em, classe);
    }
}
