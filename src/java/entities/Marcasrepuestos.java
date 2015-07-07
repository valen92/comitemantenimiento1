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
@Table(name = "marcasrepuestos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Marcasrepuestos.findAll", query = "SELECT m FROM Marcasrepuestos m"),
    @NamedQuery(name = "Marcasrepuestos.findByIdMarcasRepuestos", query = "SELECT m FROM Marcasrepuestos m WHERE m.idMarcasRepuestos = :idMarcasRepuestos"),
    @NamedQuery(name = "Marcasrepuestos.findByCodigoMarcarepuesto", query = "SELECT m FROM Marcasrepuestos m WHERE m.codigoMarcarepuesto = :codigoMarcarepuesto"),
    @NamedQuery(name = "Marcasrepuestos.findByNombreMarcarepuesto", query = "SELECT m FROM Marcasrepuestos m WHERE m.nombreMarcarepuesto = :nombreMarcarepuesto")})
public class Marcasrepuestos implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idMarcasRepuestos")
    private Integer idMarcasRepuestos;
    @Basic(optional = false)
    @NotNull
    @Column(name = "codigo_marcarepuesto")
    private int codigoMarcarepuesto;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "nombre_marcarepuesto")
    private String nombreMarcarepuesto;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fkidMarcasRepuestos")
    private List<Repuestosxempresas> repuestosxempresasList;

    public Marcasrepuestos() {
    }

    public Marcasrepuestos(Integer idMarcasRepuestos) {
        this.idMarcasRepuestos = idMarcasRepuestos;
    }

    public Marcasrepuestos(Integer idMarcasRepuestos, int codigoMarcarepuesto, String nombreMarcarepuesto) {
        this.idMarcasRepuestos = idMarcasRepuestos;
        this.codigoMarcarepuesto = codigoMarcarepuesto;
        this.nombreMarcarepuesto = nombreMarcarepuesto;
    }

    public Integer getIdMarcasRepuestos() {
        return idMarcasRepuestos;
    }

    public void setIdMarcasRepuestos(Integer idMarcasRepuestos) {
        this.idMarcasRepuestos = idMarcasRepuestos;
    }

    public int getCodigoMarcarepuesto() {
        return codigoMarcarepuesto;
    }

    public void setCodigoMarcarepuesto(int codigoMarcarepuesto) {
        this.codigoMarcarepuesto = codigoMarcarepuesto;
    }

    public String getNombreMarcarepuesto() {
        return nombreMarcarepuesto;
    }

    public void setNombreMarcarepuesto(String nombreMarcarepuesto) {
        this.nombreMarcarepuesto = nombreMarcarepuesto;
    }

    @XmlTransient
    public List<Repuestosxempresas> getRepuestosxempresasList() {
        return repuestosxempresasList;
    }

    public void setRepuestosxempresasList(List<Repuestosxempresas> repuestosxempresasList) {
        this.repuestosxempresasList = repuestosxempresasList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMarcasRepuestos != null ? idMarcasRepuestos.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Marcasrepuestos)) {
            return false;
        }
        Marcasrepuestos other = (Marcasrepuestos) object;
        if ((this.idMarcasRepuestos == null && other.idMarcasRepuestos != null) || (this.idMarcasRepuestos != null && !this.idMarcasRepuestos.equals(other.idMarcasRepuestos))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Marcasrepuestos[ idMarcasRepuestos=" + idMarcasRepuestos + " ]";
    }
    
}
