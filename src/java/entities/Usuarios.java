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
@Table(name = "usuarios")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Usuarios.findAll", query = "SELECT u FROM Usuarios u"),
    @NamedQuery(name = "Usuarios.findByIdUsuarios", query = "SELECT u FROM Usuarios u WHERE u.idUsuarios = :idUsuarios"),
    @NamedQuery(name = "Usuarios.findByNombreUsuario", query = "SELECT u FROM Usuarios u WHERE u.nombreUsuario = :nombreUsuario"),
    @NamedQuery(name = "Usuarios.findByApellidoUsuario", query = "SELECT u FROM Usuarios u WHERE u.apellidoUsuario = :apellidoUsuario"),
    @NamedQuery(name = "Usuarios.findByCargoUsuario", query = "SELECT u FROM Usuarios u WHERE u.cargoUsuario = :cargoUsuario"),
    @NamedQuery(name = "Usuarios.findByMovilUsuario", query = "SELECT u FROM Usuarios u WHERE u.movilUsuario = :movilUsuario"),
    @NamedQuery(name = "Usuarios.findByFijoUsuario", query = "SELECT u FROM Usuarios u WHERE u.fijoUsuario = :fijoUsuario"),
    @NamedQuery(name = "Usuarios.findByEmailUsuario", query = "SELECT u FROM Usuarios u WHERE u.emailUsuario = :emailUsuario"),
    @NamedQuery(name = "Usuarios.findByUsuarioUsuario", query = "SELECT u FROM Usuarios u WHERE u.usuarioUsuario = :usuarioUsuario"),
    @NamedQuery(name = "Usuarios.findByContrasenaUsuario", query = "SELECT u FROM Usuarios u WHERE u.contrasenaUsuario = :contrasenaUsuario"),
    @NamedQuery(name = "Usuarios.findByEstadoUsuario", query = "SELECT u FROM Usuarios u WHERE u.estadoUsuario = :estadoUsuario"),
    @NamedQuery(name = "Usuarios.findByFecregistroUsuario", query = "SELECT u FROM Usuarios u WHERE u.fecregistroUsuario = :fecregistroUsuario")})
public class Usuarios implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idUsuarios")
    private Integer idUsuarios;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "nombre_usuario")
    private String nombreUsuario;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "apellido_usuario")
    private String apellidoUsuario;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "cargo_usuario")
    private String cargoUsuario;
    @Basic(optional = false)
    @NotNull
    @Column(name = "movil_usuario")
    private int movilUsuario;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fijo_usuario")
    private int fijoUsuario;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "email_usuario")
    private String emailUsuario;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "usuario_usuario")
    private String usuarioUsuario;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "contraseña_usuario")
    private String contrasenaUsuario;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 8)
    @Column(name = "estado_usuario")
    private String estadoUsuario;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecregistro_usuario")
    @Temporal(TemporalType.DATE)
    private Date fecregistroUsuario;
    @Lob
    @Column(name = "foto_usuario")
    private byte[] fotoUsuario;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fkidUsuarios")
    private List<Normas> normasList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fkidUsuarios")
    private List<Repuestosxempresas> repuestosxempresasList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fkidUsuarios")
    private List<Herramientasxempcomite> herramientasxempcomiteList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fkidUsuarios")
    private List<Observacionesproveedor> observacionesproveedorList;
    @JoinColumn(name = "Fk_idPerfil", referencedColumnName = "idPerfil")
    @ManyToOne(optional = false)
    private Perfil fkidPerfil;
    @JoinColumn(name = "Fk_idEmpresas", referencedColumnName = "idEmpresas")
    @ManyToOne(optional = false)
    private Empresas fkidEmpresas;

    public Usuarios() {
    }

    public Usuarios(Integer idUsuarios) {
        this.idUsuarios = idUsuarios;
    }

    public Usuarios(Integer idUsuarios, String nombreUsuario, String apellidoUsuario, String cargoUsuario, int movilUsuario, int fijoUsuario, String emailUsuario, String usuarioUsuario, String contrasenaUsuario, String estadoUsuario, Date fecregistroUsuario) {
        this.idUsuarios = idUsuarios;
        this.nombreUsuario = nombreUsuario;
        this.apellidoUsuario = apellidoUsuario;
        this.cargoUsuario = cargoUsuario;
        this.movilUsuario = movilUsuario;
        this.fijoUsuario = fijoUsuario;
        this.emailUsuario = emailUsuario;
        this.usuarioUsuario = usuarioUsuario;
        this.contrasenaUsuario = contrasenaUsuario;
        this.estadoUsuario = estadoUsuario;
        this.fecregistroUsuario = fecregistroUsuario;
    }

    public Integer getIdUsuarios() {
        return idUsuarios;
    }

    public void setIdUsuarios(Integer idUsuarios) {
        this.idUsuarios = idUsuarios;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getApellidoUsuario() {
        return apellidoUsuario;
    }

    public void setApellidoUsuario(String apellidoUsuario) {
        this.apellidoUsuario = apellidoUsuario;
    }

    public String getCargoUsuario() {
        return cargoUsuario;
    }

    public void setCargoUsuario(String cargoUsuario) {
        this.cargoUsuario = cargoUsuario;
    }

    public int getMovilUsuario() {
        return movilUsuario;
    }

    public void setMovilUsuario(int movilUsuario) {
        this.movilUsuario = movilUsuario;
    }

    public int getFijoUsuario() {
        return fijoUsuario;
    }

    public void setFijoUsuario(int fijoUsuario) {
        this.fijoUsuario = fijoUsuario;
    }

    public String getEmailUsuario() {
        return emailUsuario;
    }

    public void setEmailUsuario(String emailUsuario) {
        this.emailUsuario = emailUsuario;
    }

    public String getUsuarioUsuario() {
        return usuarioUsuario;
    }

    public void setUsuarioUsuario(String usuarioUsuario) {
        this.usuarioUsuario = usuarioUsuario;
    }

    public String getContrasenaUsuario() {
        return contrasenaUsuario;
    }

    public void setContrasenaUsuario(String contrasenaUsuario) {
        this.contrasenaUsuario = contrasenaUsuario;
    }

    public String getEstadoUsuario() {
        return estadoUsuario;
    }

    public void setEstadoUsuario(String estadoUsuario) {
        this.estadoUsuario = estadoUsuario;
    }

    public Date getFecregistroUsuario() {
        return fecregistroUsuario;
    }

    public void setFecregistroUsuario(Date fecregistroUsuario) {
        this.fecregistroUsuario = fecregistroUsuario;
    }

    public byte[] getFotoUsuario() {
        return fotoUsuario;
    }

    public void setFotoUsuario(byte[] fotoUsuario) {
        this.fotoUsuario = fotoUsuario;
    }

    @XmlTransient
    public List<Normas> getNormasList() {
        return normasList;
    }

    public void setNormasList(List<Normas> normasList) {
        this.normasList = normasList;
    }

    @XmlTransient
    public List<Repuestosxempresas> getRepuestosxempresasList() {
        return repuestosxempresasList;
    }

    public void setRepuestosxempresasList(List<Repuestosxempresas> repuestosxempresasList) {
        this.repuestosxempresasList = repuestosxempresasList;
    }

    @XmlTransient
    public List<Herramientasxempcomite> getHerramientasxempcomiteList() {
        return herramientasxempcomiteList;
    }

    public void setHerramientasxempcomiteList(List<Herramientasxempcomite> herramientasxempcomiteList) {
        this.herramientasxempcomiteList = herramientasxempcomiteList;
    }

    @XmlTransient
    public List<Observacionesproveedor> getObservacionesproveedorList() {
        return observacionesproveedorList;
    }

    public void setObservacionesproveedorList(List<Observacionesproveedor> observacionesproveedorList) {
        this.observacionesproveedorList = observacionesproveedorList;
    }

    public Perfil getFkidPerfil() {
        return fkidPerfil;
    }

    public void setFkidPerfil(Perfil fkidPerfil) {
        this.fkidPerfil = fkidPerfil;
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
        hash += (idUsuarios != null ? idUsuarios.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuarios)) {
            return false;
        }
        Usuarios other = (Usuarios) object;
        if ((this.idUsuarios == null && other.idUsuarios != null) || (this.idUsuarios != null && !this.idUsuarios.equals(other.idUsuarios))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Usuarios[ idUsuarios=" + idUsuarios + " ]";
    }
    
}
