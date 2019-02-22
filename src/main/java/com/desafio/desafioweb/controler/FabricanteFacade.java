/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.desafio.desafioweb.controler;

import com.desafio.desafioweb.entity.Fabricante;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Michele
 */
@Stateless
public class FabricanteFacade extends AbstractFacade<Fabricante> {
    @PersistenceContext(unitName = "com.desafio_DesafioWeb_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public FabricanteFacade() {
        super(Fabricante.class);
    }
    
}
