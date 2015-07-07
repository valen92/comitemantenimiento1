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
@Table(name = "herramientasxempcomite")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Herramientasxempcomite.findAll", query = "SELECT h FROM Herramientasxempcomite h"),
    @NamedQuery(name = "Herramientasxempcomite.findByIdHerramientasxEmpComite", query = "SELECT h FROM Herramientasxempcomite h WHERE h.idHerramientasxEmpComite = :idHerramientasxEmpComite"),
    @NamedQuery(name = "Herramientasxempcomite.findByDescripcionHerramempcomite", query = "SELECT h FROM Herramientasxempcomite h WHERE h.descripcionHerramempcomite = :descripcionHerramempcomite"),
    @NamedQuery(name = "Herramientasxempcomite.findByDisponibilidadHerramempcomite", query = "SELECT h FROM Herramientasxempcomite h WHERE h.disponibilidadHerramempcomite = :disponibilidadHerramempcomite"),
    @NamedQuery(name = "Herramientasxempcomite.findByCodigoHerramempcomite", query = "SELECT h FROM Herramientasxempcomite h WHERE h.codigoHerramempcomite = :codigoHerramempcomite"),
    @NamedQuery(name = "Herramientasxempcomite.findByEstadoHerramempcomite", query = "SELECT h FROM Herramientasxempcomite h WHERE h.estadoHerramempcomite = :estadoHerramempcomite"),
    @NamedQuery(name = "Herramientasxempcomite.findByCantidadHerramempcomite", query = "SELECT h FROM Herramientasxempcomite h WHERE h.cantidadHerramempcomite = :cantidadHerramempcomite"),
    @NamedQuery(name = "Herramientasxempcomite.findByPrecioHerramempcomite", query = "SELECT h FROM Herramientasxempcomite h WHERE h.precioHerramempcomite = :precioHerramempcomite")})
public class Herramientasxempcomite implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idHerramientasxEmpComite")
    private Integer idHerramientasxEmpComite;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "descripcion_herramempcomite")
    private String descripcionHerramempcomite;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 13)
    @Column(name = "disponibilidad_herramempcomite")
    private String disponibilidadHerramempcomite;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "codigo_herramempcomite")
    private String codigoHerramempcomite;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "estado_herramempcomite")
    private String estadoHerramempcomite;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cantidad_herramempcomite")
    private int cantidadHerramempcomite;
    @Basic(optional = false)
    @NotNull
    @Column(name = "precio_Herramempcomite")
    private int precioHerramempcomite;
    @JoinColumn(name = "Fk_idMarcasHerramientas", referencedColumnName = "idMarcasHerramientas")
    @ManyToOne(optional = false)
    private Marcasherramientas fkidMarcasHerramientas;
    @JoinColumn(name = "Fk_idUsuarios", referencedColumnName = "idUsuarios")
    @ManyToOne(optional = false)
    private Usuarios fkidUsuarios;
    @JoinColumn(name = "Fk_idEmpresas", referencedColumnName = "idEmpresas")
    @ManyToOne(optional = false)
    private Empresas fkidEmpresas;
    @JoinColumn(name = "Fk_idHerramientas", referencedColumnName = "idHerramientas")
    @ManyToOne(optional = false)
    private Herramientas fkidHerramientas;

    public Herramientasxempcomite() {
    }

    public Herramientasxempcomite(Integer idHerramientasxEmpComite) {
        this.idHerramientasxEmpComite = idHerramientasxEmpComite;
    }

    public Herramientasxempcomite(Integer idHerramientasxEmpComite, String descripcionHerramempcomite, String disponibilidadHerramempcomite, String codigoHerramempcomite, String estadoHerramempcomite, int cantidadHerramempcomite, int precioHerramempcomite) {
        this.idHerramientasxEmpComite = idHerramientasxEmpComite;
        this.descripcionHerramempcomite = descripcionHerramempcomite;
        this.disponibilidadHerramempcomite = disponibilidadHerramempcomite;
        this.codigoHerramempcomite = codigoHerramempcomite;
        this.estadoHerramempcomite = estadoHerramempcomite;
        this.cantidadHerramempcomite = cantidadHerramempcomite;
        this.precioHerramempcomite = precioHerramempcomite;
    }

    public Integer getIdHerramientasxEmpComite() {
        return idHerramientasxEmpComite;
    }

    public void setIdHerramientasxEmpComite(Integer idHerramientasxEmpComite) {
        this.idHerramientasxEmpComite = idHerramientasxEmpComite;
    }

    public String getDescripcionHerramempcomite() {
        return descripcionHerramempcomite;
    }

    public void setDescripcionHerramempcomite(String descripcionHerramempcomite) {
        this.descripcionHerramempcomite = descripcionHerramempcomite;
    }

    public String getDisponibilidadHerramempcomite() {
        return disponibilidadHerramempcomite;
    }

    public void setDisponibilidadHerramempcomite(String disponibilidadHerramempcomite) {
        this.disponibilidadHerramempcomite = disponibilidadHerramempcomite;
    }

    public String getCodigoHerramempcomite() {
        return codigoHerramempcomite;
    }

    public void setCodigoHerramempcomite(String codigoHerramempcomite) {
        this.codigoHerramempcomite = codigoHerramempcomite;
    }

    public String getEstadoHerramempcomite() {
        return estadoHerramempcomite;
    }

    public void setEstadoHerramempcomite(String estadoHerramempcomite) {
        this.estadoHerramempcomite = estadoHerramempcomite;
    }

    public int getCantidadHerramempcomite() {
        return cantidadHerramempcomite;
    }

    public void setCantidadHerramempcomite(int cantidadHerramempcomite) {
        this.cantidadHerramempcomite = cantidadHerramempcomite;
    }

    public int getPrecioHerramempcomite() {
        return precioHerramempcomite;
    }

    public void setPrecioHerramempcomite(int precioHerramempcomite) {
        this.precioHerramempcomite = precioHerramempcomite;
    }

    public Marcasherramientas getFkidMarcasHerramientas() {
        return fkidMarcasHerramientas;
    }

    public void setFkidMarcasHerramientas(Marcasherramientas fkidMarcasHerramientas) {
        this.fkidMarcasHerramientas = fkidMarcasHerramientas;
    }

    public Usuarios getFkidUsuarios() {
        return fkidUsuarios;
    }

    public void setFkidUsuarios(Usuarios fkidUsuarios) {
        this.fkidUsuarios = fkidUsuarios;
    }

    public Empresas getFkidEmpresas() {
        return fkidEmpresas;
    }

    public void setFkidEmpresas(Empresas fkidEmpresas) {
        this.fkidEmpresas = fkidEmpresas;
    }

    public Herramientas getFkidHerramientas() {
        return fkidHerramientas;
    }

    public void setFkidHerramientas(Herramientas fkidHerramientas) {
        this.fkidHerramientas = fkidHerramientas;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idHerramientasxEmpComite != null ? idHerramientasxEmpComite.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Herramientasxempcomite)) {
            return false;
        }
        Herramientasxempcomite other = (Herramientasxempcomite) object;
        if ((this.idHerramientasxEmpComite == null && other.idHerramientasxEmpComite != null) || (this.idHerramientasxEmpComite != null && !this.idHerramientasxEmpComite.equals(other.idHerramientasxEmpComite))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Herramientasxempcomite[ idHerramientasxEmpComite=" + idHerramientasxEmpComite + " ]";
    }
    
}
