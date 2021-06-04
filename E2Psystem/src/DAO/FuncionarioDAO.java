
package DAO;

import Entities.Funcionarios;
import javax.persistence.EntityManager;

public class FuncionarioDAO extends GenericDAO<Funcionarios>{
    public void excluir(int id){
        Funcionarios funcionario = super.selecionarPorCodigo(id);
        super.excluir(funcionario);
    }
    
    public Funcionarios autenticar(String cpf, String senha){
        return  getEntityManager()
                .createQuery("SELECT u FROM Funcionarios u Where u.cpf = :cpf AND u.senha = :senha", Funcionarios.class)
                .setParameter("cpf", cpf)
                .setParameter("senha", senha)
                .getSingleResult();
    }
}
