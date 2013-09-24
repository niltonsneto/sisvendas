/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sisvendas.bean.admin;

/**
 *
 * @author Neto
 */
public class RelatReserva {
    private String desc;
    private Integer qtde;
    private Double total;
    private String nome;
    private String tipo;

    public RelatReserva(String desc, Integer qtde, Double total, String nome, String tipo) {
        this.desc = desc;
        this.qtde = qtde;
        this.total = total;
        this.nome = nome;
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

      
    
    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Integer getQtde() {
        return qtde;
    }

    public void setQtde(Integer qtde) {
        this.qtde = qtde;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    
}
