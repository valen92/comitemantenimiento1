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
@Table(name = "certificacionprov")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Certificacionprov.findAll", query = "SELECT c FROM Certificacionprov c"),
    @NamedQuery(name = "Certificacionprov.findByIdCertificacionProv", query = "SELECT c FROM Certificacionprov c WHERE c.idCertificacionProv = :idCertificacionProv"),
    @NamedQuery(name = "Certificacionprov.findByNombreCertificacionprov", query = "SELECT c FROM Certificacionprov c WHERE c.nombreCertificacionprov = :nombreCertificacionprov")})
public class Certificacionprov implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idCertificacionProv")
    private Integer idCertificacionProv;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "nombre_certificacionprov")
    private String nombreCertificacionprov;
    @JoinColumn(name = "Fk_idEmpresas", referencedColumnName = "idEmpresas")
    @ManyToOne(optional = false)
    private Empresas fkidEmpresas;

    public Certificacionprov() {
    }

    public Certificacionprov(Integer idCertificacionProv) {
        this.idCertificacionProv = idCertificacionProv;
    }

    public Certificacionprov(Integer idCertificacionProv, String nombreCertificacionprov) {
        this.idCertificacionProv = idCertificacionProv;
        this.nombreCertificacionprov = nombreCertificacionprov;
    }

    public Integer getIdCertificacionProv() {
        return idCertificacionProv;
    }

    public void setIdCertificacionProv(Integer idCertificacionProv) {
        this.idCertificacionProv = idCertificacionProv;
    }

    public String getNombreCertificacionprov() {
        return nombreCertificacionprov;
    }

    public void setNombreCertificacionprov(String nombreCertificacionprov) {
        this.nombreCertificacionprov = nombreCertificacionprov;
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
        hash += (idCertificacionProv != null ? idCertificacionProv.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Certificacionprov)) {
            return false;
        }
        Certificacionprov other = (Certificacionprov) object;
        if ((this.idCertificacionProv == null && other.idCertificacionProv != null) || (this.idCertificacionProv != null && !this.idCertificacionProv.equals(other.idCertificacionProv))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Certificacionprov[ idCertificacionProv=" + idCertificacionProv + " ]";
    }
    
}
