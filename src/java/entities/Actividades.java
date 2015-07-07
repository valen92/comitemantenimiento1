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
@Table(name = "actividades")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Actividades.findAll", query = "SELECT a FROM Actividades a"),
    @NamedQuery(name = "Actividades.findByIdActividad", query = "SELECT a FROM Actividades a WHERE a.idActividad = :idActividad"),
    @NamedQuery(name = "Actividades.findByNumeroActividad", query = "SELECT a FROM Actividades a WHERE a.numeroActividad = :numeroActividad"),
    @NamedQuery(name = "Actividades.findByTituloActividad", query = "SELECT a FROM Actividades a WHERE a.tituloActividad = :tituloActividad"),
    @NamedQuery(name = "Actividades.findByDescripcionActividad", query = "SELECT a FROM Actividades a WHERE a.descripcionActividad = :descripcionActividad"),
    @NamedQuery(name = "Actividades.findByFecfirmaActividad", query = "SELECT a FROM Actividades a WHERE a.fecfirmaActividad = :fecfirmaActividad"),
    @NamedQuery(name = "Actividades.findByFecinicioActividad", query = "SELECT a FROM Actividades a WHERE a.fecinicioActividad = :fecinicioActividad"),
    @NamedQuery(name = "Actividades.findByFecfinActividad", query = "SELECT a FROM Actividades a WHERE a.fecfinActividad = :fecfinActividad"),
    @NamedQuery(name = "Actividades.findByEstadoActividad", query = "SELECT a FROM Actividades a WHERE a.estadoActividad = :estadoActividad")})
public class Actividades implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_actividad")
    private Integer idActividad;
    @Basic(optional = false)
    @NotNull
    @Column(name = "numero_actividad")
    private int numeroActividad;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "titulo_actividad")
    private String tituloActividad;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "descripcion_actividad")
    private String descripcionActividad;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecfirma_actividad")
    @Temporal(TemporalType.DATE)
    private Date fecfirmaActividad;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecinicio_actividad")
    @Temporal(TemporalType.DATE)
    private Date fecinicioActividad;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecfin_actividad")
    @Temporal(TemporalType.DATE)
    private Date fecfinActividad;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 9)
    @Column(name = "estado_actividad")
    private String estadoActividad;
    @JoinColumn(name = "Fk_idServiciosContrato", referencedColumnName = "idServiciosContrato")
    @ManyToOne(optional = false)
    private Servicioscontrato fkidServiciosContrato;

    public Actividades() {
    }

    public Actividades(Integer idActividad) {
        this.idActividad = idActividad;
    }

    public Actividades(Integer idActividad, int numeroActividad, String tituloActividad, String descripcionActividad, Date fecfirmaActividad, Date fecinicioActividad, Date fecfinActividad, String estadoActividad) {
        this.idActividad = idActividad;
        this.numeroActividad = numeroActividad;
        this.tituloActividad = tituloActividad;
        this.descripcionActividad = descripcionActividad;
        this.fecfirmaActividad = fecfirmaActividad;
        this.fecinicioActividad = fecinicioActividad;
        this.fecfinActividad = fecfinActividad;
        this.estadoActividad = estadoActividad;
    }

    public Integer getIdActividad() {
        return idActividad;
    }

    public void setIdActividad(Integer idActividad) {
        this.idActividad = idActividad;
    }

    public int getNumeroActividad() {
        return numeroActividad;
    }

    public void setNumeroActividad(int numeroActividad) {
        this.numeroActividad = numeroActividad;
    }

    public String getTituloActividad() {
        return tituloActividad;
    }

    public void setTituloActividad(String tituloActividad) {
        this.tituloActividad = tituloActividad;
    }

    public String getDescripcionActividad() {
        return descripcionActividad;
    }

    public void setDescripcionActividad(String descripcionActividad) {
        this.descripcionActividad = descripcionActividad;
    }

    public Date getFecfirmaActividad() {
        return fecfirmaActividad;
    }

    public void setFecfirmaActividad(Date fecfirmaActividad) {
        this.fecfirmaActividad = fecfirmaActividad;
    }

    public Date getFecinicioActividad() {
        return fecinicioActividad;
    }

    public void setFecinicioActividad(Date fecinicioActividad) {
        this.fecinicioActividad = fecinicioActividad;
    }

    public Date getFecfinActividad() {
        return fecfinActividad;
    }

    public void setFecfinActividad(Date fecfinActividad) {
        this.fecfinActividad = fecfinActividad;
    }

    public String getEstadoActividad() {
        return estadoActividad;
    }

    public void setEstadoActividad(String estadoActividad) {
        this.estadoActividad = estadoActividad;
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
        hash += (idActividad != null ? idActividad.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Actividades)) {
            return false;
        }
        Actividades other = (Actividades) object;
        if ((this.idActividad == null && other.idActividad != null) || (this.idActividad != null && !this.idActividad.equals(other.idActividad))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Actividades[ idActividad=" + idActividad + " ]";
    }
    
}
