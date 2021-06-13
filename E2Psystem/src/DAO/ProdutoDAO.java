
package DAO;
import javax.persistence.EntityManager;

import Entities.Produtos;
public class ProdutoDAO extends GenericDAO<Produtos>{
     public void excluir(int id){
        Produtos produto = super.selecionarPorCodigo(id);
        super.excluir(produto);
    }
     public void atualizarEstoque(int quantidade, int Id){
         getEntityManager()
                 .createQuery("UPDATE Produtos u SET u.quantidadeEstoque = u.quantidadeEstoque - :quantidade WHERE u.id = :id")
                 .setParameter("quantidade", quantidade)
                 .setParameter("id", Id);
     }
     public int deletarTodosCarrinho(){
         return getEntityManager()
                 .createQuery("DELETE FROM Carrinho")
                 .executeUpdate();
     }
     
    
}
