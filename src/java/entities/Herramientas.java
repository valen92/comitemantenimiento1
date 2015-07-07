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
@Table(name = "herramientas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Herramientas.findAll", query = "SELECT h FROM Herramientas h"),
    @NamedQuery(name = "Herramientas.findByIdHerramientas", query = "SELECT h FROM Herramientas h WHERE h.idHerramientas = :idHerramientas"),
    @NamedQuery(name = "Herramientas.findByNombreHerramienta", query = "SELECT h FROM Herramientas h WHERE h.nombreHerramienta = :nombreHerramienta")})
public class Herramientas implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idHerramientas")
    private Integer idHerramientas;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "nombre_herramienta")
    private String nombreHerramienta;
    @JoinColumn(name = "Fk_idTipoHerramientas", referencedColumnName = "idTipoHerramientas")
    @ManyToOne(optional = false)
    private Tipoherramientas fkidTipoHerramientas;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fkidHerramientas")
    private List<Herramientasxempcomite> herramientasxempcomiteList;

    public Herramientas() {
    }

    public Herramientas(Integer idHerramientas) {
        this.idHerramientas = idHerramientas;
    }

    public Herramientas(Integer idHerramientas, String nombreHerramienta) {
        this.idHerramientas = idHerramientas;
        this.nombreHerramienta = nombreHerramienta;
    }

    public Integer getIdHerramientas() {
        return idHerramientas;
    }

    public void setIdHerramientas(Integer idHerramientas) {
        this.idHerramientas = idHerramientas;
    }

    public String getNombreHerramienta() {
        return nombreHerramienta;
    }

    public void setNombreHerramienta(String nombreHerramienta) {
        this.nombreHerramienta = nombreHerramienta;
    }

    public Tipoherramientas getFkidTipoHerramientas() {
        return fkidTipoHerramientas;
    }

    public void setFkidTipoHerramientas(Tipoherramientas fkidTipoHerramientas) {
        this.fkidTipoHerramientas = fkidTipoHerramientas;
    }

    @XmlTransient
    public List<Herramientasxempcomite> getHerramientasxempcomiteList() {
        return herramientasxempcomiteList;
    }

    public void setHerramientasxempcomiteList(List<Herramientasxempcomite> herramientasxempcomiteList) {
        this.herramientasxempcomiteList = herramientasxempcomiteList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idHerramientas != null ? idHerramientas.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Herramientas)) {
            return false;
        }
        Herramientas other = (Herramientas) object;
        if ((this.idHerramientas == null && other.idHerramientas != null) || (this.idHerramientas != null && !this.idHerramientas.equals(other.idHerramientas))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Herramientas[ idHerramientas=" + idHerramientas + " ]";
    }
    
}
