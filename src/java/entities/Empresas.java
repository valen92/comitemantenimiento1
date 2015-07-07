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
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Alexandra
 */
@Entity
@Table(name = "empresas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Empresas.findAll", query = "SELECT e FROM Empresas e"),
    @NamedQuery(name = "Empresas.findByIdEmpresas", query = "SELECT e FROM Empresas e WHERE e.idEmpresas = :idEmpresas"),
    @NamedQuery(name = "Empresas.findByNitEmpresa", query = "SELECT e FROM Empresas e WHERE e.nitEmpresa = :nitEmpresa"),
    @NamedQuery(name = "Empresas.findByNombreEmpresa", query = "SELECT e FROM Empresas e WHERE e.nombreEmpresa = :nombreEmpresa"),
    @NamedQuery(name = "Empresas.findByDireccionEmpresa", query = "SELECT e FROM Empresas e WHERE e.direccionEmpresa = :direccionEmpresa"),
    @NamedQuery(name = "Empresas.findByFijoEmpresa", query = "SELECT e FROM Empresas e WHERE e.fijoEmpresa = :fijoEmpresa"),
    @NamedQuery(name = "Empresas.findByMovilEmpresa", query = "SELECT e FROM Empresas e WHERE e.movilEmpresa = :movilEmpresa"),
    @NamedQuery(name = "Empresas.findByRepreslegalEmpresa", query = "SELECT e FROM Empresas e WHERE e.represlegalEmpresa = :represlegalEmpresa"),
    @NamedQuery(name = "Empresas.findByFecingEmpresa", query = "SELECT e FROM Empresas e WHERE e.fecingEmpresa = :fecingEmpresa"),
    @NamedQuery(name = "Empresas.findByEstadoEmpresa", query = "SELECT e FROM Empresas e WHERE e.estadoEmpresa = :estadoEmpresa"),
    @NamedQuery(name = "Empresas.findByTipoEmpresa", query = "SELECT e FROM Empresas e WHERE e.tipoEmpresa = :tipoEmpresa")})
public class Empresas implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idEmpresas")
    private Integer idEmpresas;
    @Column(name = "nit_empresa")
    private Integer nitEmpresa;
    @Size(max = 45)
    @Column(name = "nombre_empresa")
    private String nombreEmpresa;
    @Size(max = 45)
    @Column(name = "direccion_empresa")
    private String direccionEmpresa;
    @Size(max = 9)
    @Column(name = "fijo_empresa")
    private String fijoEmpresa;
    @Size(max = 11)
    @Column(name = "movil_empresa")
    private String movilEmpresa;
    @Size(max = 45)
    @Column(name = "represlegal_empresa")
    private String represlegalEmpresa;
    @Column(name = "fecing_empresa")
    @Temporal(TemporalType.DATE)
    private Date fecingEmpresa;
    @Size(max = 9)
    @Column(name = "estado_empresa")
    private String estadoEmpresa;
    @Lob
    @Column(name = "logo_empresa")
    private byte[] logoEmpresa;
    @Size(max = 9)
    @Column(name = "tipo_empresa")
    private String tipoEmpresa;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fkidEmpresas")
    private List<Certificacionprov> certificacionprovList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fkidEmpresas")
    private List<Serviciosxempproveedoras> serviciosxempproveedorasList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fkidEmpresas")
    private List<Repuestosxempresas> repuestosxempresasList;
    @JoinColumn(name = "Fk_idCiudad", referencedColumnName = "idCiudad")
    @ManyToOne(optional = false)
    private Ciudad fkidCiudad;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fkidEmpresas")
    private List<Herramientasxempcomite> herramientasxempcomiteList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fkidEmpresas")
    private List<Controlacceso> controlaccesoList;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "fkidEmpresas")
    private Servicioscontrato servicioscontrato;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fkidEmpresas")
    private List<Delegadocomite> delegadocomiteList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fkidEmpresas")
    private List<Contratos> contratosList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fkidEmpresas")
    private List<Usuarios> usuariosList;

    public Empresas() {
    }

    public Empresas(Integer idEmpresas) {
        this.idEmpresas = idEmpresas;
    }

    public Integer getIdEmpresas() {
        return idEmpresas;
    }

    public void setIdEmpresas(Integer idEmpresas) {
        this.idEmpresas = idEmpresas;
    }

    public Integer getNitEmpresa() {
        return nitEmpresa;
    }

    public void setNitEmpresa(Integer nitEmpresa) {
        this.nitEmpresa = nitEmpresa;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getDireccionEmpresa() {
        return direccionEmpresa;
    }

    public void setDireccionEmpresa(String direccionEmpresa) {
        this.direccionEmpresa = direccionEmpresa;
    }

    public String getFijoEmpresa() {
        return fijoEmpresa;
    }

    public void setFijoEmpresa(String fijoEmpresa) {
        this.fijoEmpresa = fijoEmpresa;
    }

    public String getMovilEmpresa() {
        return movilEmpresa;
    }

    public void setMovilEmpresa(String movilEmpresa) {
        this.movilEmpresa = movilEmpresa;
    }

    public String getRepreslegalEmpresa() {
        return represlegalEmpresa;
    }

    public void setRepreslegalEmpresa(String represlegalEmpresa) {
        this.represlegalEmpresa = represlegalEmpresa;
    }

    public Date getFecingEmpresa() {
        return fecingEmpresa;
    }

    public void setFecingEmpresa(Date fecingEmpresa) {
        this.fecingEmpresa = fecingEmpresa;
    }

    public String getEstadoEmpresa() {
        return estadoEmpresa;
    }

    public void setEstadoEmpresa(String estadoEmpresa) {
        this.estadoEmpresa = estadoEmpresa;
    }

    public byte[] getLogoEmpresa() {
        return logoEmpresa;
    }

    public void setLogoEmpresa(byte[] logoEmpresa) {
        this.logoEmpresa = logoEmpresa;
    }

    public String getTipoEmpresa() {
        return tipoEmpresa;
    }

    public void setTipoEmpresa(String tipoEmpresa) {
        this.tipoEmpresa = tipoEmpresa;
    }

    @XmlTransient
    public List<Certificacionprov> getCertificacionprovList() {
        return certificacionprovList;
    }

    public void setCertificacionprovList(List<Certificacionprov> certificacionprovList) {
        this.certificacionprovList = certificacionprovList;
    }

    @XmlTransient
    public List<Serviciosxempproveedoras> getServiciosxempproveedorasList() {
        return serviciosxempproveedorasList;
    }

    public void setServiciosxempproveedorasList(List<Serviciosxempproveedoras> serviciosxempproveedorasList) {
        this.serviciosxempproveedorasList = serviciosxempproveedorasList;
    }

    @XmlTransient
    public List<Repuestosxempresas> getRepuestosxempresasList() {
        return repuestosxempresasList;
    }

    public void setRepuestosxempresasList(List<Repuestosxempresas> repuestosxempresasList) {
        this.repuestosxempresasList = repuestosxempresasList;
    }

    public Ciudad getFkidCiudad() {
        return fkidCiudad;
    }

    public void setFkidCiudad(Ciudad fkidCiudad) {
        this.fkidCiudad = fkidCiudad;
    }

    @XmlTransient
    public List<Herramientasxempcomite> getHerramientasxempcomiteList() {
        return herramientasxempcomiteList;
    }

    public void setHerramientasxempcomiteList(List<Herramientasxempcomite> herramientasxempcomiteList) {
        this.herramientasxempcomiteList = herramientasxempcomiteList;
    }

    @XmlTransient
    public List<Controlacceso> getControlaccesoList() {
        return controlaccesoList;
    }

    public void setControlaccesoList(List<Controlacceso> controlaccesoList) {
        this.controlaccesoList = controlaccesoList;
    }

    public Servicioscontrato getServicioscontrato() {
        return servicioscontrato;
    }

    public void setServicioscontrato(Servicioscontrato servicioscontrato) {
        this.servicioscontrato = servicioscontrato;
    }

    @XmlTransient
    public List<Delegadocomite> getDelegadocomiteList() {
        return delegadocomiteList;
    }

    public void setDelegadocomiteList(List<Delegadocomite> delegadocomiteList) {
        this.delegadocomiteList = delegadocomiteList;
    }

    @XmlTransient
    public List<Contratos> getContratosList() {
        return contratosList;
    }

    public void setContratosList(List<Contratos> contratosList) {
        this.contratosList = contratosList;
    }

    @XmlTransient
    public List<Usuarios> getUsuariosList() {
        return usuariosList;
    }

    public void setUsuariosList(List<Usuarios> usuariosList) {
        this.usuariosList = usuariosList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEmpresas != null ? idEmpresas.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Empresas)) {
            return false;
        }
        Empresas other = (Empresas) object;
        if ((this.idEmpresas == null && other.idEmpresas != null) || (this.idEmpresas != null && !this.idEmpresas.equals(other.idEmpresas))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Empresas[ idEmpresas=" + idEmpresas + " ]";
    }
    
}
