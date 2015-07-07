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
@Table(name = "marcasherramientas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Marcasherramientas.findAll", query = "SELECT m FROM Marcasherramientas m"),
    @NamedQuery(name = "Marcasherramientas.findByIdMarcasHerramientas", query = "SELECT m FROM Marcasherramientas m WHERE m.idMarcasHerramientas = :idMarcasHerramientas"),
    @NamedQuery(name = "Marcasherramientas.findByNombreMarcaherramienta", query = "SELECT m FROM Marcasherramientas m WHERE m.nombreMarcaherramienta = :nombreMarcaherramienta")})
public class Marcasherramientas implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idMarcasHerramientas")
    private Integer idMarcasHerramientas;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "nombre_marcaherramienta")
    private String nombreMarcaherramienta;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fkidMarcasHerramientas")
    private List<Herramientasxempcomite> herramientasxempcomiteList;

    public Marcasherramientas() {
    }

    public Marcasherramientas(Integer idMarcasHerramientas) {
        this.idMarcasHerramientas = idMarcasHerramientas;
    }

    public Marcasherramientas(Integer idMarcasHerramientas, String nombreMarcaherramienta) {
        this.idMarcasHerramientas = idMarcasHerramientas;
        this.nombreMarcaherramienta = nombreMarcaherramienta;
    }

    public Integer getIdMarcasHerramientas() {
        return idMarcasHerramientas;
    }

    public void setIdMarcasHerramientas(Integer idMarcasHerramientas) {
        this.idMarcasHerramientas = idMarcasHerramientas;
    }

    public String getNombreMarcaherramienta() {
        return nombreMarcaherramienta;
    }

    public void setNombreMarcaherramienta(String nombreMarcaherramienta) {
        this.nombreMarcaherramienta = nombreMarcaherramienta;
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
        hash += (idMarcasHerramientas != null ? idMarcasHerramientas.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Marcasherramientas)) {
            return false;
        }
        Marcasherramientas other = (Marcasherramientas) object;
        if ((this.idMarcasHerramientas == null && other.idMarcasHerramientas != null) || (this.idMarcasHerramientas != null && !this.idMarcasHerramientas.equals(other.idMarcasHerramientas))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Marcasherramientas[ idMarcasHerramientas=" + idMarcasHerramientas + " ]";
    }
    
}
