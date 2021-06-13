/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Dell
 */
@Entity
@Table(name = "vendafinalizada", catalog = "e2psystem", schema = "")
@NamedQueries({
    @NamedQuery(name = "Vendafinalizada.findAll", query = "SELECT v FROM Vendafinalizada v"),
    @NamedQuery(name = "Vendafinalizada.findByCodigoVenda", query = "SELECT v FROM Vendafinalizada v WHERE v.codigoVenda = :codigoVenda"),
    @NamedQuery(name = "Vendafinalizada.findByNomeCliente", query = "SELECT v FROM Vendafinalizada v WHERE v.nomeCliente = :nomeCliente"),
    @NamedQuery(name = "Vendafinalizada.findByDataVenda", query = "SELECT v FROM Vendafinalizada v WHERE v.dataVenda = :dataVenda"),
    @NamedQuery(name = "Vendafinalizada.findByFormaDePagamento", query = "SELECT v FROM Vendafinalizada v WHERE v.formaDePagamento = :formaDePagamento"),
    @NamedQuery(name = "Vendafinalizada.findByTotalCompra", query = "SELECT v FROM Vendafinalizada v WHERE v.totalCompra = :totalCompra")})
public class Vendafinalizada implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "CodigoVenda")
    private Integer codigoVenda;
    @Column(name = "NomeCliente")
    private String nomeCliente;
    @Column(name = "DataVenda")
    private String dataVenda;
    @Column(name = "FormaDePagamento")
    private String formaDePagamento;
    @Column(name = "TotalCompra")
    private String totalCompra;

    public Vendafinalizada() {
    }

    public Vendafinalizada(Integer codigoVenda) {
        this.codigoVenda = codigoVenda;
    }

    public Integer getCodigoVenda() {
        return codigoVenda;
    }

    public void setCodigoVenda(Integer codigoVenda) {
        this.codigoVenda = codigoVenda;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(String dataVenda) {
        this.dataVenda = dataVenda;
    }

    public String getFormaDePagamento() {
        return formaDePagamento;
    }

    public void setFormaDePagamento(String formaDePagamento) {
        this.formaDePagamento = formaDePagamento;
    }

    public String getTotalCompra() {
        return totalCompra;
    }

    public void setTotalCompra(String totalCompra) {
        this.totalCompra = totalCompra;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigoVenda != null ? codigoVenda.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Vendafinalizada)) {
            return false;
        }
        Vendafinalizada other = (Vendafinalizada) object;
        if ((this.codigoVenda == null && other.codigoVenda != null) || (this.codigoVenda != null && !this.codigoVenda.equals(other.codigoVenda))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Vendafinalizada[ codigoVenda=" + codigoVenda + " ]";
    }
    
}
