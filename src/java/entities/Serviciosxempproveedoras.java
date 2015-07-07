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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Alexandra
 */
@Entity
@Table(name = "serviciosxempproveedoras")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Serviciosxempproveedoras.findAll", query = "SELECT s FROM Serviciosxempproveedoras s"),
    @NamedQuery(name = "Serviciosxempproveedoras.findByIdServiciosxEmpProveedoras", query = "SELECT s FROM Serviciosxempproveedoras s WHERE s.idServiciosxEmpProveedoras = :idServiciosxEmpProveedoras")})
public class Serviciosxempproveedoras implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idServiciosxEmpProveedoras")
    private Integer idServiciosxEmpProveedoras;
    @JoinColumn(name = "Fk_idEmpresas", referencedColumnName = "idEmpresas")
    @ManyToOne(optional = false)
    private Empresas fkidEmpresas;
    @JoinColumn(name = "Fk_idServicios", referencedColumnName = "idServicios")
    @ManyToOne(optional = false)
    private Servicios fkidServicios;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fkidServiciosxEmpProveedoras")
    private List<Servicioscontrato> servicioscontratoList;

    public Serviciosxempproveedoras() {
    }

    public Serviciosxempproveedoras(Integer idServiciosxEmpProveedoras) {
        this.idServiciosxEmpProveedoras = idServiciosxEmpProveedoras;
    }

    public Integer getIdServiciosxEmpProveedoras() {
        return idServiciosxEmpProveedoras;
    }

    public void setIdServiciosxEmpProveedoras(Integer idServiciosxEmpProveedoras) {
        this.idServiciosxEmpProveedoras = idServiciosxEmpProveedoras;
    }

    public Empresas getFkidEmpresas() {
        return fkidEmpresas;
    }

    public void setFkidEmpresas(Empresas fkidEmpresas) {
        this.fkidEmpresas = fkidEmpresas;
    }

    public Servicios getFkidServicios() {
        return fkidServicios;
    }

    public void setFkidServicios(Servicios fkidServicios) {
        this.fkidServicios = fkidServicios;
    }

    @XmlTransient
    public List<Servicioscontrato> getServicioscontratoList() {
        return servicioscontratoList;
    }

    public void setServicioscontratoList(List<Servicioscontrato> servicioscontratoList) {
        this.servicioscontratoList = servicioscontratoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idServiciosxEmpProveedoras != null ? idServiciosxEmpProveedoras.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Serviciosxempproveedoras)) {
            return false;
        }
        Serviciosxempproveedoras other = (Serviciosxempproveedoras) object;
        if ((this.idServiciosxEmpProveedoras == null && other.idServiciosxEmpProveedoras != null) || (this.idServiciosxEmpProveedoras != null && !this.idServiciosxEmpProveedoras.equals(other.idServiciosxEmpProveedoras))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Serviciosxempproveedoras[ idServiciosxEmpProveedoras=" + idServiciosxEmpProveedoras + " ]";
    }
    
}
