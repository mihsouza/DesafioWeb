/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.desafio.desafioweb.controler;

import com.desafio.desafioweb.entity.Funcionalidade;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Michele
 */
@Stateless
public class FuncionalidadeFacade extends AbstractFacade<Funcionalidade> {
    @PersistenceContext(unitName = "com.desafio_DesafioWeb_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public FuncionalidadeFacade() {
        super(Funcionalidade.class);
    }
    
}
