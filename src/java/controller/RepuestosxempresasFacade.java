/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import entities.Repuestosxempresas;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Alexandra
 */
@Stateless
public class RepuestosxempresasFacade extends AbstractFacade<Repuestosxempresas> {
    @PersistenceContext(unitName = "comitemantenimientoPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public RepuestosxempresasFacade() {
        super(Repuestosxempresas.class);
    }
    
}
