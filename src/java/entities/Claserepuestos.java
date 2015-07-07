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
@Table(name = "claserepuestos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Claserepuestos.findAll", query = "SELECT c FROM Claserepuestos c"),
    @NamedQuery(name = "Claserepuestos.findByIdClaseRepuestos", query = "SELECT c FROM Claserepuestos c WHERE c.idClaseRepuestos = :idClaseRepuestos"),
    @NamedQuery(name = "Claserepuestos.findByNombreClaserepuesto", query = "SELECT c FROM Claserepuestos c WHERE c.nombreClaserepuesto = :nombreClaserepuesto")})
public class Claserepuestos implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idClaseRepuestos")
    private Integer idClaseRepuestos;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "nombre_claserepuesto")
    private String nombreClaserepuesto;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fkidClaseRepuestos")
    private List<Repuestos> repuestosList;

    public Claserepuestos() {
    }

    public Claserepuestos(Integer idClaseRepuestos) {
        this.idClaseRepuestos = idClaseRepuestos;
    }

    public Claserepuestos(Integer idClaseRepuestos, String nombreClaserepuesto) {
        this.idClaseRepuestos = idClaseRepuestos;
        this.nombreClaserepuesto = nombreClaserepuesto;
    }

    public Integer getIdClaseRepuestos() {
        return idClaseRepuestos;
    }

    public void setIdClaseRepuestos(Integer idClaseRepuestos) {
        this.idClaseRepuestos = idClaseRepuestos;
    }

    public String getNombreClaserepuesto() {
        return nombreClaserepuesto;
    }

    public void setNombreClaserepuesto(String nombreClaserepuesto) {
        this.nombreClaserepuesto = nombreClaserepuesto;
    }

    @XmlTransient
    public List<Repuestos> getRepuestosList() {
        return repuestosList;
    }

    public void setRepuestosList(List<Repuestos> repuestosList) {
        this.repuestosList = repuestosList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idClaseRepuestos != null ? idClaseRepuestos.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Claserepuestos)) {
            return false;
        }
        Claserepuestos other = (Claserepuestos) object;
        if ((this.idClaseRepuestos == null && other.idClaseRepuestos != null) || (this.idClaseRepuestos != null && !this.idClaseRepuestos.equals(other.idClaseRepuestos))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Claserepuestos[ idClaseRepuestos=" + idClaseRepuestos + " ]";
    }
    
}
