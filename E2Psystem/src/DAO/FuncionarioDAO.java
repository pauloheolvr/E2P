
package DAO;

import Entities.Funcionarios;
import javax.persistence.EntityManager;

public class FuncionarioDAO extends GenericDAO<Funcionarios>{
    public void excluir(int id){
        Funcionarios funcionario = super.selecionarPorCodigo(id);
        super.excluir(funcionario);
    }
    public Funcionarios GetByCpf(String cpf){
        return getEntityManager()
                .createQuery("SELECT u FROM Funcionarios u Where u.cpf = "+cpf, Funcionarios.class)
                .getSingleResult();
    }
}