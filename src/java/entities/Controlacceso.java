/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Alexandra
 */
@Entity
@Table(name = "controlacceso")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Controlacceso.findAll", query = "SELECT c FROM Controlacceso c"),
    @NamedQuery(name = "Controlacceso.findByIdControlAcceso", query = "SELECT c FROM Controlacceso c WHERE c.idControlAcceso = :idControlAcceso"),
    @NamedQuery(name = "Controlacceso.findByFecingControlacceso", query = "SELECT c FROM Controlacceso c WHERE c.fecingControlacceso = :fecingControlacceso"),
    @NamedQuery(name = "Controlacceso.findByFecsalControlacceso", query = "SELECT c FROM Controlacceso c WHERE c.fecsalControlacceso = :fecsalControlacceso"),
    @NamedQuery(name = "Controlacceso.findByModuloControlacceso", query = "SELECT c FROM Controlacceso c WHERE c.moduloControlacceso = :moduloControlacceso")})
public class Controlacceso implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idControlAcceso")
    private Integer idControlAcceso;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecing_controlacceso")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecingControlacceso;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecsal_controlacceso")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecsalControlacceso;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 13)
    @Column(name = "modulo_controlacceso")
    private String moduloControlacceso;
    @JoinColumn(name = "Fk_idEmpresas", referencedColumnName = "idEmpresas")
    @ManyToOne(optional = false)
    private Empresas fkidEmpresas;

    public Controlacceso() {
    }

    public Controlacceso(Integer idControlAcceso) {
        this.idControlAcceso = idControlAcceso;
    }

    public Controlacceso(Integer idControlAcceso, Date fecingControlacceso, Date fecsalControlacceso, String moduloControlacceso) {
        this.idControlAcceso = idControlAcceso;
        this.fecingControlacceso = fecingControlacceso;
        this.fecsalControlacceso = fecsalControlacceso;
        this.moduloControlacceso = moduloControlacceso;
    }

    public Integer getIdControlAcceso() {
        return idControlAcceso;
    }

    public void setIdControlAcceso(Integer idControlAcceso) {
        this.idControlAcceso = idControlAcceso;
    }

    public Date getFecingControlacceso() {
        return fecingControlacceso;
    }

    public void setFecingControlacceso(Date fecingControlacceso) {
        this.fecingControlacceso = fecingControlacceso;
    }

    public Date getFecsalControlacceso() {
        return fecsalControlacceso;
    }

    public void setFecsalControlacceso(Date fecsalControlacceso) {
        this.fecsalControlacceso = fecsalControlacceso;
    }

    public String getModuloControlacceso() {
        return moduloControlacceso;
    }

    public void setModuloControlacceso(String moduloControlacceso) {
        this.moduloControlacceso = moduloControlacceso;
    }

    public Empresas getFkidEmpresas() {
        return fkidEmpresas;
    }

    public void setFkidEmpresas(Empresas fkidEmpresas) {
        this.fkidEmpresas = fkidEmpresas;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idControlAcceso != null ? idControlAcceso.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Controlacceso)) {
            return false;
        }
        Controlacceso other = (Controlacceso) object;
        if ((this.idControlAcceso == null && other.idControlAcceso != null) || (this.idControlAcceso != null && !this.idControlAcceso.equals(other.idControlAcceso))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Controlacceso[ idControlAcceso=" + idControlAcceso + " ]";
    }
    
}
