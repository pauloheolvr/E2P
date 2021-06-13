package DAO;

import Entities.Clientes;
import javax.persistence.EntityManager;

public class ClienteDAO extends GenericDAO<Clientes>{
    public void excluir(int id){
        Clientes cliente = super.selecionarPorCodigo(id);
        super.excluir(cliente);
    }
    
    public Clientes selecionarPorCpf(String cpf) {
        return getEntityManager().getReference(Clientes.class, cpf);
    }
    
    public Clientes GetByCpf(String cpf){
        return getEntityManager()
                .createQuery("SELECT u FROM Clientes u Where u.cpf = :cpf", Clientes.class)
                .setParameter("cpf", cpf)
                .getSingleResult();
    }
    
    public Clientes GetByName(String nome){
        return getEntityManager()
                .createQuery("SELECT u FROM Clientes u Where u.nome = :nome", Clientes.class)
                .setParameter("nome", nome)
                .getSingleResult();
                
    }
}
