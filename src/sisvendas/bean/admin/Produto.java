/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sisvendas.bean.admin;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Neto
 */
@Entity
@Table(name = "produto")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Produto.findAll", query = "SELECT p FROM Produto p"),
    @NamedQuery(name = "Produto.findByCodigo", query = "SELECT p FROM Produto p WHERE p.codigo = :codigo"),
    @NamedQuery(name = "Produto.findByDescricao", query = "SELECT p FROM Produto p WHERE p.descricao = :descricao"),
    @NamedQuery(name = "Produto.findByPreco", query = "SELECT p FROM Produto p WHERE p.preco = :preco"),
    @NamedQuery(name = "Produto.findByQtde", query = "SELECT p FROM Produto p WHERE p.qtde = :qtde"),
    @NamedQuery(name = "Produto.findByDataIn", query = "SELECT p FROM Produto p WHERE p.dataIn = :dataIn"),
    @NamedQuery(name = "Produto.findByDataUlt", query = "SELECT p FROM Produto p WHERE p.dataUlt = :dataUlt")})
public class Produto implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "codigo")
    private Long codigo;
    @Column(name = "descricao")
    private String descricao;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "preco")
    private Double preco;
    @Column(name = "qtde")
    private Integer qtde;
    @Column(name = "dataIn")
    @Temporal(TemporalType.DATE)
    private Date dataIn;
    @Column(name = "dataUlt")
    @Temporal(TemporalType.DATE)
    private Calendar dataUlt = Calendar.getInstance();
    @JoinColumn(name = "cod_tipo", referencedColumnName = "codigo")
    @ManyToOne(optional = false)
    private Tipo codTipo;

    public Produto() {
    }

    public Produto(Long codigo) {
        this.codigo = codigo;
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Integer getQtde() {
        return qtde;
    }

    public void setQtde(Integer qtde) {
        this.qtde = qtde;
    }

    public Date getDataIn() {
        return dataIn;
    }

    public void setDataIn(Date dataIn) {
        this.dataIn = dataIn;
    }

    public Calendar getDataUlt() {
        return dataUlt;
    }

    public void setDataUlt(Calendar dataUlt) {
        this.dataUlt = dataUlt;
    }

    public Tipo getCodTipo() {
        return codTipo;
    }

    public void setCodTipo(Tipo codTipo) {
        this.codTipo = codTipo;
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
        if (!(object instanceof Produto)) {
            return false;
        }
        Produto other = (Produto) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sisvendas.bean.admin.Produto[ codigo=" + codigo + " ]";
    }
    
}
