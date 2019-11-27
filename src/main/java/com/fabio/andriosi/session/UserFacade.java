/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fabio.andriosi.session;

import com.fabio.andriosi.entities.User;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author fabio
 */
@Stateless
public class UserFacade extends AbstractFacade<User> {
    @PersistenceContext(unitName = "com.andriosi.fabio_spa_war_1.0-SNAPSHOTPU")
    private EntityManager entityManager;
    public UserFacade(){
        super(User.class);
    }
     
    @Override
    protected EntityManager getEntityManager() {
        return entityManager;
    }

}
