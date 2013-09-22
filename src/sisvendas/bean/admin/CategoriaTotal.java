/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sisvendas.bean.admin;

/**
 *
 * @author Neto
 */
public class CategoriaTotal {
    private String categoria;
    private Double total;

    public CategoriaTotal(String categoria, Double total) {
        this.categoria = categoria;
        this.total = total;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }
    
}
