/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sisvendas.bean.admin;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Calendar;
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
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Neto
 */
@Entity
@Table(name = "venda")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Venda.findAll", query = "SELECT v FROM Venda v"),
    @NamedQuery(name = "Venda.findByCodigo", query = "SELECT v FROM Venda v WHERE v.codigo = :codigo"),
    @NamedQuery(name = "Venda.findByQtde", query = "SELECT v FROM Venda v WHERE v.qtde = :qtde"),
    @NamedQuery(name = "Venda.findByTotal", query = "SELECT v FROM Venda v WHERE v.total = :total"),
    @NamedQuery(name = "Venda.findByData", query = "SELECT v FROM Venda v WHERE v.data = :data"),
    @NamedQuery(name = "Venda.vendaDia", query = "SELECT SUM(v.total) FROM Venda v WHERE v.data = :dia")/*and v.data = :dia")*/})
public class Venda implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codigo")
    private Integer codigo;
    @Column(name = "qtde")
    private Integer qtde;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "total")
    private Double total;
    @Column(name = "data")
    @Temporal(TemporalType.DATE)
    private Calendar data = Calendar.getInstance();
    @Column(name = "item")
    private Integer item;
    @JoinColumn(name = "cod_produto", referencedColumnName = "codigo")
    @ManyToOne(optional = false)
    private Produto codProduto;
    @JoinColumn(name = "cod_usuario", referencedColumnName = "codigo")
    @ManyToOne(optional = false)
    private Usuario codUsuario;

    public Venda() {
    }

    public Venda(Integer codigo) {
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

    public Integer getQtde() {
        return qtde;
    }

    public void setQtde(Integer qtde) {
        Integer oldQtde = this.qtde;
        this.qtde = qtde;
        changeSupport.firePropertyChange("qtde", oldQtde, qtde);
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        Double oldTotal = this.total;
        this.total = total;
        changeSupport.firePropertyChange("total", oldTotal, total);
    }

    public Calendar getData() {
        return data;
    }

    public void setData(Calendar data) {
        Calendar oldData = this.data;
        this.data = data;
        changeSupport.firePropertyChange("data", oldData, data);
    }

    public Integer getItem() {
        return item;
    }

    public void setItem(Integer item) {
        Integer oldItem = this.item;
        this.item = item;
        changeSupport.firePropertyChange("item", oldItem, item);
    }

    public Produto getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(Produto codProduto) {
        Produto oldCodProduto = this.codProduto;
        this.codProduto = codProduto;
        changeSupport.firePropertyChange("codProduto", oldCodProduto, codProduto);
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
        if (!(object instanceof Venda)) {
            return false;
        }
        Venda other = (Venda) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sisvendas.bean.admin.Venda[ codigo=" + codigo + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
