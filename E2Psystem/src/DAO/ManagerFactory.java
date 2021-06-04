package DAO;

import javax.persistence.*;

public class ManagerFactory {
    private static EntityManagerFactory emf;
    
    public static EntityManager getEntityManager(){
        if(emf == null){
            try{
            emf = Persistence.createEntityManagerFactory("E2PsystemPU");
            } catch (Exception ex){
                ex.printStackTrace();
            }
        }
        return emf.createEntityManager();
    }
}
