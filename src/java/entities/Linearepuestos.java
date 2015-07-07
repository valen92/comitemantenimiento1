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
@Table(name = "linearepuestos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Linearepuestos.findAll", query = "SELECT l FROM Linearepuestos l"),
    @NamedQuery(name = "Linearepuestos.findByIdLineaRepuestos", query = "SELECT l FROM Linearepuestos l WHERE l.idLineaRepuestos = :idLineaRepuestos"),
    @NamedQuery(name = "Linearepuestos.findByCodigoLinearepuesto", query = "SELECT l FROM Linearepuestos l WHERE l.codigoLinearepuesto = :codigoLinearepuesto"),
    @NamedQuery(name = "Linearepuestos.findByNombreLinearepuesto", query = "SELECT l FROM Linearepuestos l WHERE l.nombreLinearepuesto = :nombreLinearepuesto")})
public class Linearepuestos implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idLineaRepuestos")
    private Integer idLineaRepuestos;
    @Basic(optional = false)
    @NotNull
    @Column(name = "codigo_linearepuesto")
    private int codigoLinearepuesto;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "nombre_linearepuesto")
    private String nombreLinearepuesto;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fkidLineaRepuestos")
    private List<Repuestos> repuestosList;

    public Linearepuestos() {
    }

    public Linearepuestos(Integer idLineaRepuestos) {
        this.idLineaRepuestos = idLineaRepuestos;
    }

    public Linearepuestos(Integer idLineaRepuestos, int codigoLinearepuesto, String nombreLinearepuesto) {
        this.idLineaRepuestos = idLineaRepuestos;
        this.codigoLinearepuesto = codigoLinearepuesto;
        this.nombreLinearepuesto = nombreLinearepuesto;
    }

    public Integer getIdLineaRepuestos() {
        return idLineaRepuestos;
    }

    public void setIdLineaRepuestos(Integer idLineaRepuestos) {
        this.idLineaRepuestos = idLineaRepuestos;
    }

    public int getCodigoLinearepuesto() {
        return codigoLinearepuesto;
    }

    public void setCodigoLinearepuesto(int codigoLinearepuesto) {
        this.codigoLinearepuesto = codigoLinearepuesto;
    }

    public String getNombreLinearepuesto() {
        return nombreLinearepuesto;
    }

    public void setNombreLinearepuesto(String nombreLinearepuesto) {
        this.nombreLinearepuesto = nombreLinearepuesto;
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
        hash += (idLineaRepuestos != null ? idLineaRepuestos.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Linearepuestos)) {
            return false;
        }
        Linearepuestos other = (Linearepuestos) object;
        if ((this.idLineaRepuestos == null && other.idLineaRepuestos != null) || (this.idLineaRepuestos != null && !this.idLineaRepuestos.equals(other.idLineaRepuestos))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Linearepuestos[ idLineaRepuestos=" + idLineaRepuestos + " ]";
    }
    
}
