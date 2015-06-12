package com.mandi.rbs.daoImpl;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.mandi.rbs.dao.LoginDAO;
import com.mandi.rbs.dto.UserDetails;

@Repository("loginDAOImpl")
public class LoginDAOImpl implements LoginDAO {

    @PersistenceContext
    EntityManager entityManager;

    public EntityManager getEntityManager() {
        return entityManager;
    }

    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public UserDetails getUserById(String userId) {
        try {
            String qlString = "SELECT userDetails FROM UserDetails userDetails WHERE userDetails.userId = ?1";
            Query query = entityManager.createQuery(qlString);
            query.setParameter(1, userId);
            return (UserDetails) query.getSingleResult();
        } catch (NoResultException e) {
            return null;
        }
    }

}
