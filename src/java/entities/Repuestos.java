/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Alexandra
 */
@Entity
@Table(name = "repuestos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Repuestos.findAll", query = "SELECT r FROM Repuestos r"),
    @NamedQuery(name = "Repuestos.findByIdRepuestos", query = "SELECT r FROM Repuestos r WHERE r.idRepuestos = :idRepuestos"),
    @NamedQuery(name = "Repuestos.findByNombreRepuesto", query = "SELECT r FROM Repuestos r WHERE r.nombreRepuesto = :nombreRepuesto")})
public class Repuestos implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idRepuestos")
    private Integer idRepuestos;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "nombre_repuesto")
    private String nombreRepuesto;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fkidRepuestos")
    private List<Repuestosxempresas> repuestosxempresasList;
    @JoinColumn(name = "Fk_idLineaRepuestos", referencedColumnName = "idLineaRepuestos")
    @ManyToOne(optional = false)
    private Linearepuestos fkidLineaRepuestos;
    @JoinColumn(name = "Fk_idClaseRepuestos", referencedColumnName = "idClaseRepuestos")
    @ManyToOne(optional = false)
    private Claserepuestos fkidClaseRepuestos;

    public Repuestos() {
    }

    public Repuestos(Integer idRepuestos) {
        this.idRepuestos = idRepuestos;
    }

    public Repuestos(Integer idRepuestos, String nombreRepuesto) {
        this.idRepuestos = idRepuestos;
        this.nombreRepuesto = nombreRepuesto;
    }

    public Integer getIdRepuestos() {
        return idRepuestos;
    }

    public void setIdRepuestos(Integer idRepuestos) {
        this.idRepuestos = idRepuestos;
    }

    public String getNombreRepuesto() {
        return nombreRepuesto;
    }

    public void setNombreRepuesto(String nombreRepuesto) {
        this.nombreRepuesto = nombreRepuesto;
    }

    @XmlTransient
    public List<Repuestosxempresas> getRepuestosxempresasList() {
        return repuestosxempresasList;
    }

    public void setRepuestosxempresasList(List<Repuestosxempresas> repuestosxempresasList) {
        this.repuestosxempresasList = repuestosxempresasList;
    }

    public Linearepuestos getFkidLineaRepuestos() {
        return fkidLineaRepuestos;
    }

    public void setFkidLineaRepuestos(Linearepuestos fkidLineaRepuestos) {
        this.fkidLineaRepuestos = fkidLineaRepuestos;
    }

    public Claserepuestos getFkidClaseRepuestos() {
        return fkidClaseRepuestos;
    }

    public void setFkidClaseRepuestos(Claserepuestos fkidClaseRepuestos) {
        this.fkidClaseRepuestos = fkidClaseRepuestos;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idRepuestos != null ? idRepuestos.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Repuestos)) {
            return false;
        }
        Repuestos other = (Repuestos) object;
        if ((this.idRepuestos == null && other.idRepuestos != null) || (this.idRepuestos != null && !this.idRepuestos.equals(other.idRepuestos))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Repuestos[ idRepuestos=" + idRepuestos + " ]";
    }
    
}
