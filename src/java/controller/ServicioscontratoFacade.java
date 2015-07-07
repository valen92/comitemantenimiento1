/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import entities.Servicioscontrato;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Alexandra
 */
@Stateless
public class ServicioscontratoFacade extends AbstractFacade<Servicioscontrato> {
    @PersistenceContext(unitName = "comitemantenimientoPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ServicioscontratoFacade() {
        super(Servicioscontrato.class);
    }
    
    public List<Servicioscontrato>obtenerTodosLosServicios(){
    EntityManager em = getEntityManager();
    Query q = em.createNamedQuery("Servicios.findAllDesc");
    return q.getResultList();
    }
    
}
