/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sisvendas.bean.admin;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
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
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Neto
 */
@Entity
@Table(name = "usuario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Usuario.findAll", query = "SELECT u FROM Usuario u"),
    @NamedQuery(name = "Usuario.findByCodigo", query = "SELECT u FROM Usuario u WHERE u.codigo = :codigo"),
    @NamedQuery(name = "Usuario.findByNome", query = "SELECT u FROM Usuario u WHERE u.nome = :nome"),
    @NamedQuery(name = "Usuario.findByEmail", query = "SELECT u FROM Usuario u WHERE u.email = :email"),
    @NamedQuery(name = "Usuario.findByFone", query = "SELECT u FROM Usuario u WHERE u.fone = :fone"),
    @NamedQuery(name = "Usuario.findByLogin", query = "SELECT u FROM Usuario u WHERE u.login = :login"),
    @NamedQuery(name = "Usuario.findBySenha", query = "SELECT u FROM Usuario u WHERE u.senha = :senha"),
    @NamedQuery(name = "Usuario.autentica", query = "SELECT u FROM Usuario u WHERE u.login = :login and u.senha = :senha"),
    @NamedQuery(name = "Usuario.findByStatus", query = "SELECT u FROM Usuario u WHERE u.status = :status"),
    @NamedQuery(name = "Usuario.findByDataCad", query = "SELECT u FROM Usuario u WHERE u.dataCad = :dataCad"),
    @NamedQuery(name = "Usuario.findByAcesso", query = "SELECT u FROM Usuario u WHERE u.acesso = :acesso")})
public class Usuario implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codigo")
    private Integer codigo;
    @Column(name = "nome")
    private String nome;
    @Column(name = "email")
    private String email;
    @Column(name = "fone")
    private String fone;
    @Column(name = "login")
    private String login;
    @Column(name = "senha")
    private String senha;
    @Column(name = "status")
    private Boolean status;
    @Column(name = "data_cad")
    @Temporal(TemporalType.DATE)
    private Date dataCad;
    @Column(name = "acesso")
    private Boolean acesso;
    @JoinColumn(name = "cod_cargo", referencedColumnName = "codigo")
    @ManyToOne(optional = false)
    private Cargo codCargo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codUsuario")
    private List<Venda> vendaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codUsuario")
    private List<Reserva> reservaList;

    public Usuario() {
    }

    public Usuario(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        Integer oldCodigo = this.codigo;
        this.codigo = codigo;
        changeSupport.firePropertyChange("codigo", oldCodigo, codigo);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        String oldNome = this.nome;
        this.nome = nome;
        changeSupport.firePropertyChange("nome", oldNome, nome);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        String oldEmail = this.email;
        this.email = email;
        changeSupport.firePropertyChange("email", oldEmail, email);
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        String oldFone = this.fone;
        this.fone = fone;
        changeSupport.firePropertyChange("fone", oldFone, fone);
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        String oldLogin = this.login;
        this.login = login;
        changeSupport.firePropertyChange("login", oldLogin, login);
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        String oldSenha = this.senha;
        this.senha = senha;
        changeSupport.firePropertyChange("senha", oldSenha, senha);
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        Boolean oldStatus = this.status;
        this.status = status;
        changeSupport.firePropertyChange("status", oldStatus, status);
    }

    public Date getDataCad() {
        return dataCad;
    }

    public void setDataCad(Date dataCad) {
        Date oldDataCad = this.dataCad;
        this.dataCad = dataCad;
        changeSupport.firePropertyChange("dataCad", oldDataCad, dataCad);
    }

    public Boolean getAcesso() {
        return acesso;
    }

    public void setAcesso(Boolean acesso) {
        Boolean oldAcesso = this.acesso;
        this.acesso = acesso;
        changeSupport.firePropertyChange("acesso", oldAcesso, acesso);
    }

    public Cargo getCodCargo() {
        return codCargo;
    }

    public void setCodCargo(Cargo codCargo) {
        Cargo oldCodCargo = this.codCargo;
        this.codCargo = codCargo;
        changeSupport.firePropertyChange("codCargo", oldCodCargo, codCargo);
    }

    @XmlTransient
    public List<Venda> getVendaList() {
        return vendaList;
    }

    public void setVendaList(List<Venda> vendaList) {
        this.vendaList = vendaList;
    }

    @XmlTransient
    public List<Reserva> getReservaList() {
        return reservaList;
    }

    public void setReservaList(List<Reserva> reservaList) {
        this.reservaList = reservaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigo != null ? codigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuario)) {
            return false;
        }
        Usuario other = (Usuario) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sisvendas.bean.admin.Usuario[ codigo=" + codigo + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
