/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entities;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Alexandra
 */
@Entity
@Table(name = "contratos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Contratos.findAll", query = "SELECT c FROM Contratos c"),
    @NamedQuery(name = "Contratos.findByIdContratos", query = "SELECT c FROM Contratos c WHERE c.idContratos = :idContratos"),
    @NamedQuery(name = "Contratos.findByNumeroContrato", query = "SELECT c FROM Contratos c WHERE c.numeroContrato = :numeroContrato"),
    @NamedQuery(name = "Contratos.findByFecinicioContrato", query = "SELECT c FROM Contratos c WHERE c.fecinicioContrato = :fecinicioContrato"),
    @NamedQuery(name = "Contratos.findByFecfinContrato", query = "SELECT c FROM Contratos c WHERE c.fecfinContrato = :fecfinContrato"),
    @NamedQuery(name = "Contratos.findByEstadoContrato", query = "SELECT c FROM Contratos c WHERE c.estadoContrato = :estadoContrato"),
    @NamedQuery(name = "Contratos.findByDescripcionContrato", query = "SELECT c FROM Contratos c WHERE c.descripcionContrato = :descripcionContrato")})
public class Contratos implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idContratos")
    private Integer idContratos;
    @Basic(optional = false)
    @NotNull
    @Column(name = "numero_contrato")
    private int numeroContrato;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecinicio_contrato")
    @Temporal(TemporalType.DATE)
    private Date fecinicioContrato;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecfin_contrato")
    @Temporal(TemporalType.DATE)
    private Date fecfinContrato;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 8)
    @Column(name = "estado_contrato")
    private String estadoContrato;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "descripcion_contrato")
    private String descripcionContrato;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fkidContratos")
    private List<Servicioscontrato> servicioscontratoList;
    @JoinColumn(name = "Fk_idEmpresas", referencedColumnName = "idEmpresas")
    @ManyToOne(optional = false)
    private Empresas fkidEmpresas;

    public Contratos() {
    }

    public Contratos(Integer idContratos) {
        this.idContratos = idContratos;
    }

    public Contratos(Integer idContratos, int numeroContrato, Date fecinicioContrato, Date fecfinContrato, String estadoContrato, String descripcionContrato) {
        this.idContratos = idContratos;
        this.numeroContrato = numeroContrato;
        this.fecinicioContrato = fecinicioContrato;
        this.fecfinContrato = fecfinContrato;
        this.estadoContrato = estadoContrato;
        this.descripcionContrato = descripcionContrato;
    }

    public Integer getIdContratos() {
        return idContratos;
    }

    public void setIdContratos(Integer idContratos) {
        this.idContratos = idContratos;
    }

    public int getNumeroContrato() {
        return numeroContrato;
    }

    public void setNumeroContrato(int numeroContrato) {
        this.numeroContrato = numeroContrato;
    }

    public Date getFecinicioContrato() {
        return fecinicioContrato;
    }

    public void setFecinicioContrato(Date fecinicioContrato) {
        this.fecinicioContrato = fecinicioContrato;
    }

    public Date getFecfinContrato() {
        return fecfinContrato;
    }

    public void setFecfinContrato(Date fecfinContrato) {
        this.fecfinContrato = fecfinContrato;
    }

    public String getEstadoContrato() {
        return estadoContrato;
    }

    public void setEstadoContrato(String estadoContrato) {
        this.estadoContrato = estadoContrato;
    }

    public String getDescripcionContrato() {
        return descripcionContrato;
    }

    public void setDescripcionContrato(String descripcionContrato) {
        this.descripcionContrato = descripcionContrato;
    }

    @XmlTransient
    public List<Servicioscontrato> getServicioscontratoList() {
        return servicioscontratoList;
    }

    public void setServicioscontratoList(List<Servicioscontrato> servicioscontratoList) {
        this.servicioscontratoList = servicioscontratoList;
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
        hash += (idContratos != null ? idContratos.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Contratos)) {
            return false;
        }
        Contratos other = (Contratos) object;
        if ((this.idContratos == null && other.idContratos != null) || (this.idContratos != null && !this.idContratos.equals(other.idContratos))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Contratos[ idContratos=" + idContratos + " ]";
    }
    
}
