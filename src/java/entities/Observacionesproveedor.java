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
@Table(name = "observacionesproveedor")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Observacionesproveedor.findAll", query = "SELECT o FROM Observacionesproveedor o"),
    @NamedQuery(name = "Observacionesproveedor.findByIdObservacionesProveedor", query = "SELECT o FROM Observacionesproveedor o WHERE o.idObservacionesProveedor = :idObservacionesProveedor"),
    @NamedQuery(name = "Observacionesproveedor.findByTituloObservacionproveedor", query = "SELECT o FROM Observacionesproveedor o WHERE o.tituloObservacionproveedor = :tituloObservacionproveedor"),
    @NamedQuery(name = "Observacionesproveedor.findByObservacionObservacionproveedor", query = "SELECT o FROM Observacionesproveedor o WHERE o.observacionObservacionproveedor = :observacionObservacionproveedor"),
    @NamedQuery(name = "Observacionesproveedor.findByCalificacionObservacionproveedor", query = "SELECT o FROM Observacionesproveedor o WHERE o.calificacionObservacionproveedor = :calificacionObservacionproveedor"),
    @NamedQuery(name = "Observacionesproveedor.findByFecObservacionproveedor", query = "SELECT o FROM Observacionesproveedor o WHERE o.fecObservacionproveedor = :fecObservacionproveedor")})
public class Observacionesproveedor implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idObservacionesProveedor")
    private Integer idObservacionesProveedor;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "titulo_observacionproveedor")
    private String tituloObservacionproveedor;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "observacion_observacionproveedor")
    private String observacionObservacionproveedor;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "calificacion_observacionproveedor")
    private String calificacionObservacionproveedor;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fec_observacionproveedor")
    @Temporal(TemporalType.DATE)
    private Date fecObservacionproveedor;
    @JoinColumn(name = "Fk_idUsuarios", referencedColumnName = "idUsuarios")
    @ManyToOne(optional = false)
    private Usuarios fkidUsuarios;
    @JoinColumn(name = "Fk_idServiciosContrato", referencedColumnName = "idServiciosContrato")
    @ManyToOne(optional = false)
    private Servicioscontrato fkidServiciosContrato;

    public Observacionesproveedor() {
    }

    public Observacionesproveedor(Integer idObservacionesProveedor) {
        this.idObservacionesProveedor = idObservacionesProveedor;
    }

    public Observacionesproveedor(Integer idObservacionesProveedor, String tituloObservacionproveedor, String observacionObservacionproveedor, String calificacionObservacionproveedor, Date fecObservacionproveedor) {
        this.idObservacionesProveedor = idObservacionesProveedor;
        this.tituloObservacionproveedor = tituloObservacionproveedor;
        this.observacionObservacionproveedor = observacionObservacionproveedor;
        this.calificacionObservacionproveedor = calificacionObservacionproveedor;
        this.fecObservacionproveedor = fecObservacionproveedor;
    }

    public Integer getIdObservacionesProveedor() {
        return idObservacionesProveedor;
    }

    public void setIdObservacionesProveedor(Integer idObservacionesProveedor) {
        this.idObservacionesProveedor = idObservacionesProveedor;
    }

    public String getTituloObservacionproveedor() {
        return tituloObservacionproveedor;
    }

    public void setTituloObservacionproveedor(String tituloObservacionproveedor) {
        this.tituloObservacionproveedor = tituloObservacionproveedor;
    }

    public String getObservacionObservacionproveedor() {
        return observacionObservacionproveedor;
    }

    public void setObservacionObservacionproveedor(String observacionObservacionproveedor) {
        this.observacionObservacionproveedor = observacionObservacionproveedor;
    }

    public String getCalificacionObservacionproveedor() {
        return calificacionObservacionproveedor;
    }

    public void setCalificacionObservacionproveedor(String calificacionObservacionproveedor) {
        this.calificacionObservacionproveedor = calificacionObservacionproveedor;
    }

    public Date getFecObservacionproveedor() {
        return fecObservacionproveedor;
    }

    public void setFecObservacionproveedor(Date fecObservacionproveedor) {
        this.fecObservacionproveedor = fecObservacionproveedor;
    }

    public Usuarios getFkidUsuarios() {
        return fkidUsuarios;
    }

    public void setFkidUsuarios(Usuarios fkidUsuarios) {
        this.fkidUsuarios = fkidUsuarios;
    }

    public Servicioscontrato getFkidServiciosContrato() {
        return fkidServiciosContrato;
    }

    public void setFkidServiciosContrato(Servicioscontrato fkidServiciosContrato) {
        this.fkidServiciosContrato = fkidServiciosContrato;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idObservacionesProveedor != null ? idObservacionesProveedor.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Observacionesproveedor)) {
            return false;
        }
        Observacionesproveedor other = (Observacionesproveedor) object;
        if ((this.idObservacionesProveedor == null && other.idObservacionesProveedor != null) || (this.idObservacionesProveedor != null && !this.idObservacionesProveedor.equals(other.idObservacionesProveedor))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Observacionesproveedor[ idObservacionesProveedor=" + idObservacionesProveedor + " ]";
    }
    
}
