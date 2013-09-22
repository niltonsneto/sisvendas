/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sisvendas.bean.admin;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Neto
 */
@Entity
@Table(name = "reserva")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reserva.findAll", query = "SELECT r FROM Reserva r"),
    @NamedQuery(name = "Reserva.findByCodigo", query = "SELECT r FROM Reserva r WHERE r.codigo = :codigo"),
    @NamedQuery(name = "Reserva.findByNome", query = "SELECT r FROM Reserva r WHERE r.nome = :nome"),
    @NamedQuery(name = "Reserva.findByEmail", query = "SELECT r FROM Reserva r WHERE r.email = :email"),
    @NamedQuery(name = "Reserva.findByFone", query = "SELECT r FROM Reserva r WHERE r.fone = :fone"),
    @NamedQuery(name = "Reserva.findByDatareserva", query = "SELECT r FROM Reserva r WHERE r.datareserva = :datareserva"),
    @NamedQuery(name = "Reserva.findByStatus", query = "SELECT r FROM Reserva r WHERE r.status = :status")})
public class Reserva implements Serializable {
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
    @Lob
    @Column(name = "descricao")
    private String descricao;
    @Column(name = "datareserva")
    @Temporal(TemporalType.DATE)
    private Date datareserva;
    @Column(name = "status")
    private Boolean status;
    @JoinColumn(name = "cod_tipo", referencedColumnName = "codigo")
    @ManyToOne(optional = false)
    private Tipo codTipo;
    @JoinColumn(name = "cod_usuario", referencedColumnName = "codigo")
    @ManyToOne(optional = false)
    private Usuario codUsuario;

    public Reserva() {
    }

    public Reserva(Integer codigo) {
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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        String oldDescricao = this.descricao;
        this.descricao = descricao;
        changeSupport.firePropertyChange("descricao", oldDescricao, descricao);
    }

    public Date getDatareserva() {
        return datareserva;
    }

    public void setDatareserva(Date datareserva) {
        Date oldDatareserva = this.datareserva;
        this.datareserva = datareserva;
        changeSupport.firePropertyChange("datareserva", oldDatareserva, datareserva);
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        Boolean oldStatus = this.status;
        this.status = status;
        changeSupport.firePropertyChange("status", oldStatus, status);
    }

    public Tipo getCodTipo() {
        return codTipo;
    }

    public void setCodTipo(Tipo codTipo) {
        Tipo oldCodTipo = this.codTipo;
        this.codTipo = codTipo;
        changeSupport.firePropertyChange("codTipo", oldCodTipo, codTipo);
    }

    public Usuario getCodUsuario() {
        return codUsuario;
    }

    public void setCodUsuario(Usuario codUsuario) {
        Usuario oldCodUsuario = this.codUsuario;
        this.codUsuario = codUsuario;
        changeSupport.firePropertyChange("codUsuario", oldCodUsuario, codUsuario);
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
        if (!(object instanceof Reserva)) {
            return false;
        }
        Reserva other = (Reserva) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sisvendas.bean.admin.Reserva[ codigo=" + codigo + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
