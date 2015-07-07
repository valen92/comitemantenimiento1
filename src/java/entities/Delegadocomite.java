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
@Table(name = "delegadocomite")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Delegadocomite.findAll", query = "SELECT d FROM Delegadocomite d"),
    @NamedQuery(name = "Delegadocomite.findByIdDelegadoComite", query = "SELECT d FROM Delegadocomite d WHERE d.idDelegadoComite = :idDelegadoComite"),
    @NamedQuery(name = "Delegadocomite.findByEstadoDelegadocomite", query = "SELECT d FROM Delegadocomite d WHERE d.estadoDelegadocomite = :estadoDelegadocomite"),
    @NamedQuery(name = "Delegadocomite.findByNombreDelegadocomite", query = "SELECT d FROM Delegadocomite d WHERE d.nombreDelegadocomite = :nombreDelegadocomite"),
    @NamedQuery(name = "Delegadocomite.findByTelefonoDelegadocomite", query = "SELECT d FROM Delegadocomite d WHERE d.telefonoDelegadocomite = :telefonoDelegadocomite"),
    @NamedQuery(name = "Delegadocomite.findByEmailDelegadocomite", query = "SELECT d FROM Delegadocomite d WHERE d.emailDelegadocomite = :emailDelegadocomite"),
    @NamedQuery(name = "Delegadocomite.findByMovilDelegadocomite", query = "SELECT d FROM Delegadocomite d WHERE d.movilDelegadocomite = :movilDelegadocomite")})
public class Delegadocomite implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idDelegadoComite")
    private Integer idDelegadoComite;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 8)
    @Column(name = "estado_delegadocomite")
    private String estadoDelegadocomite;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "nombre_delegadocomite")
    private String nombreDelegadocomite;
    @Basic(optional = false)
    @NotNull
    @Column(name = "telefono_delegadocomite")
    private int telefonoDelegadocomite;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "email_delegadocomite")
    private String emailDelegadocomite;
    @Column(name = "movil_delegadocomite")
    private Integer movilDelegadocomite;
    @JoinColumn(name = "Fk_idEmpresas", referencedColumnName = "idEmpresas")
    @ManyToOne(optional = false)
    private Empresas fkidEmpresas;

    public Delegadocomite() {
    }

    public Delegadocomite(Integer idDelegadoComite) {
        this.idDelegadoComite = idDelegadoComite;
    }

    public Delegadocomite(Integer idDelegadoComite, String estadoDelegadocomite, String nombreDelegadocomite, int telefonoDelegadocomite, String emailDelegadocomite) {
        this.idDelegadoComite = idDelegadoComite;
        this.estadoDelegadocomite = estadoDelegadocomite;
        this.nombreDelegadocomite = nombreDelegadocomite;
        this.telefonoDelegadocomite = telefonoDelegadocomite;
        this.emailDelegadocomite = emailDelegadocomite;
    }

    public Integer getIdDelegadoComite() {
        return idDelegadoComite;
    }

    public void setIdDelegadoComite(Integer idDelegadoComite) {
        this.idDelegadoComite = idDelegadoComite;
    }

    public String getEstadoDelegadocomite() {
        return estadoDelegadocomite;
    }

    public void setEstadoDelegadocomite(String estadoDelegadocomite) {
        this.estadoDelegadocomite = estadoDelegadocomite;
    }

    public String getNombreDelegadocomite() {
        return nombreDelegadocomite;
    }

    public void setNombreDelegadocomite(String nombreDelegadocomite) {
        this.nombreDelegadocomite = nombreDelegadocomite;
    }

    public int getTelefonoDelegadocomite() {
        return telefonoDelegadocomite;
    }

    public void setTelefonoDelegadocomite(int telefonoDelegadocomite) {
        this.telefonoDelegadocomite = telefonoDelegadocomite;
    }

    public String getEmailDelegadocomite() {
        return emailDelegadocomite;
    }

    public void setEmailDelegadocomite(String emailDelegadocomite) {
        this.emailDelegadocomite = emailDelegadocomite;
    }

    public Integer getMovilDelegadocomite() {
        return movilDelegadocomite;
    }

    public void setMovilDelegadocomite(Integer movilDelegadocomite) {
        this.movilDelegadocomite = movilDelegadocomite;
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
        hash += (idDelegadoComite != null ? idDelegadoComite.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Delegadocomite)) {
            return false;
        }
        Delegadocomite other = (Delegadocomite) object;
        if ((this.idDelegadoComite == null && other.idDelegadoComite != null) || (this.idDelegadoComite != null && !this.idDelegadoComite.equals(other.idDelegadoComite))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Delegadocomite[ idDelegadoComite=" + idDelegadoComite + " ]";
    }
    
}
