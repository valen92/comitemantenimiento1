/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entities;

import java.io.Serializable;
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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Alexandra
 */
@Entity
@Table(name = "normas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Normas.findAll", query = "SELECT n FROM Normas n"),
    @NamedQuery(name = "Normas.findByIdNormas", query = "SELECT n FROM Normas n WHERE n.idNormas = :idNormas"),
    @NamedQuery(name = "Normas.findByNombreNorma", query = "SELECT n FROM Normas n WHERE n.nombreNorma = :nombreNorma"),
    @NamedQuery(name = "Normas.findByCodigoNorma", query = "SELECT n FROM Normas n WHERE n.codigoNorma = :codigoNorma"),
    @NamedQuery(name = "Normas.findByEntidadreguladoraNorma", query = "SELECT n FROM Normas n WHERE n.entidadreguladoraNorma = :entidadreguladoraNorma"),
    @NamedQuery(name = "Normas.findByDescripcionNorma", query = "SELECT n FROM Normas n WHERE n.descripcionNorma = :descripcionNorma")})
public class Normas implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idNormas")
    private Integer idNormas;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "nombre_norma")
    private String nombreNorma;
    @Basic(optional = false)
    @NotNull
    @Column(name = "codigo_norma")
    private int codigoNorma;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "entidadreguladora_norma")
    private String entidadreguladoraNorma;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "descripcion_norma")
    private String descripcionNorma;
    @JoinColumn(name = "Fk_idUsuarios", referencedColumnName = "idUsuarios")
    @ManyToOne(optional = false)
    private Usuarios fkidUsuarios;

    public Normas() {
    }

    public Normas(Integer idNormas) {
        this.idNormas = idNormas;
    }

    public Normas(Integer idNormas, String nombreNorma, int codigoNorma, String entidadreguladoraNorma, String descripcionNorma) {
        this.idNormas = idNormas;
        this.nombreNorma = nombreNorma;
        this.codigoNorma = codigoNorma;
        this.entidadreguladoraNorma = entidadreguladoraNorma;
        this.descripcionNorma = descripcionNorma;
    }

    public Integer getIdNormas() {
        return idNormas;
    }

    public void setIdNormas(Integer idNormas) {
        this.idNormas = idNormas;
    }

    public String getNombreNorma() {
        return nombreNorma;
    }

    public void setNombreNorma(String nombreNorma) {
        this.nombreNorma = nombreNorma;
    }

    public int getCodigoNorma() {
        return codigoNorma;
    }

    public void setCodigoNorma(int codigoNorma) {
        this.codigoNorma = codigoNorma;
    }

    public String getEntidadreguladoraNorma() {
        return entidadreguladoraNorma;
    }

    public void setEntidadreguladoraNorma(String entidadreguladoraNorma) {
        this.entidadreguladoraNorma = entidadreguladoraNorma;
    }

    public String getDescripcionNorma() {
        return descripcionNorma;
    }

    public void setDescripcionNorma(String descripcionNorma) {
        this.descripcionNorma = descripcionNorma;
    }

    public Usuarios getFkidUsuarios() {
        return fkidUsuarios;
    }

    public void setFkidUsuarios(Usuarios fkidUsuarios) {
        this.fkidUsuarios = fkidUsuarios;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idNormas != null ? idNormas.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Normas)) {
            return false;
        }
        Normas other = (Normas) object;
        if ((this.idNormas == null && other.idNormas != null) || (this.idNormas != null && !this.idNormas.equals(other.idNormas))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Normas[ idNormas=" + idNormas + " ]";
    }
    
}
