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
@Table(name = "tipoherramientas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tipoherramientas.findAll", query = "SELECT t FROM Tipoherramientas t"),
    @NamedQuery(name = "Tipoherramientas.findByIdTipoHerramientas", query = "SELECT t FROM Tipoherramientas t WHERE t.idTipoHerramientas = :idTipoHerramientas"),
    @NamedQuery(name = "Tipoherramientas.findByNombreTipoherramienta", query = "SELECT t FROM Tipoherramientas t WHERE t.nombreTipoherramienta = :nombreTipoherramienta")})
public class Tipoherramientas implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idTipoHerramientas")
    private Integer idTipoHerramientas;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "nombre_tipoherramienta")
    private String nombreTipoherramienta;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fkidTipoHerramientas")
    private List<Herramientas> herramientasList;

    public Tipoherramientas() {
    }

    public Tipoherramientas(Integer idTipoHerramientas) {
        this.idTipoHerramientas = idTipoHerramientas;
    }

    public Tipoherramientas(Integer idTipoHerramientas, String nombreTipoherramienta) {
        this.idTipoHerramientas = idTipoHerramientas;
        this.nombreTipoherramienta = nombreTipoherramienta;
    }

    public Integer getIdTipoHerramientas() {
        return idTipoHerramientas;
    }

    public void setIdTipoHerramientas(Integer idTipoHerramientas) {
        this.idTipoHerramientas = idTipoHerramientas;
    }

    public String getNombreTipoherramienta() {
        return nombreTipoherramienta;
    }

    public void setNombreTipoherramienta(String nombreTipoherramienta) {
        this.nombreTipoherramienta = nombreTipoherramienta;
    }

    @XmlTransient
    public List<Herramientas> getHerramientasList() {
        return herramientasList;
    }

    public void setHerramientasList(List<Herramientas> herramientasList) {
        this.herramientasList = herramientasList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTipoHerramientas != null ? idTipoHerramientas.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tipoherramientas)) {
            return false;
        }
        Tipoherramientas other = (Tipoherramientas) object;
        if ((this.idTipoHerramientas == null && other.idTipoHerramientas != null) || (this.idTipoHerramientas != null && !this.idTipoHerramientas.equals(other.idTipoHerramientas))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Tipoherramientas[ idTipoHerramientas=" + idTipoHerramientas + " ]";
    }
    
}
