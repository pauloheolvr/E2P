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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Dell
 */
@Entity
@Table(name = "carrinho")
@NamedQueries({
    @NamedQuery(name = "Carrinho_1.findAll", query = "SELECT c FROM Carrinho_1 c"),
    @NamedQuery(name = "Carrinho_1.findById", query = "SELECT c FROM Carrinho_1 c WHERE c.id = :id")})
public class Carrinho_1 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id")
    private Integer id;
    @JoinColumn(name = "Produto_id", referencedColumnName = "Id")
    @ManyToOne
    private Produtos produtoid;

    public Carrinho_1() {
    }

    public Carrinho_1(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Produtos getProdutoid() {
        return produtoid;
    }

    public void setProdutoid(Produtos produtoid) {
        this.produtoid = produtoid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Carrinho_1)) {
            return false;
        }
        Carrinho_1 other = (Carrinho_1) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Carrinho_1[ id=" + id + " ]";
    }
    
}
