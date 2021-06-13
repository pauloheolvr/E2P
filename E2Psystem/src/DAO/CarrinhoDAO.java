
package DAO;

import Entities.Carrinho;
import java.math.BigDecimal;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

public class CarrinhoDAO extends GenericDAO<Carrinho>{
    public void deletarDados(List<Carrinho> carrinho){
        getEntityManager()
                .remove(carrinho);
    }
    public BigDecimal valorTotal(){
        return (BigDecimal) getEntityManager()
                .createNativeQuery("SELECT SUM(total) from CARRINHO")
                .getSingleResult();
    }
        public void excluir(int id){
        Carrinho carrinho = super.selecionarPorCodigo(id);
        super.excluir(carrinho);
    }
}