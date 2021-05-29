package Entities;
<<<<<<< HEAD
=======

>>>>>>> b2311419ac68e404f3437d6efdbdd618c03cb593
import java.util.UUID;

public class Funcionario 
{  
    public Funcionario() {
        this.id = UUID.randomUUID();
    }
    
    public UUID id;
    public String nome;
    public String cargo;
    public String cpf;
    public String senha;
<<<<<<< HEAD

    public void setId(UUID id) {
        this.id = id;
=======
 
    public String getNome() {
        return nome;
>>>>>>> b2311419ac68e404f3437d6efdbdd618c03cb593
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getCpf() {
        return cpf;
    }

<<<<<<< HEAD
=======
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSenha() {
        return senha;
    }

>>>>>>> b2311419ac68e404f3437d6efdbdd618c03cb593
    public void setSenha(String senha) {
        this.senha = senha;
    }
    

}


<<<<<<< HEAD
    public String getSenha() {
        return senha;
    }
}
=======
   


>>>>>>> b2311419ac68e404f3437d6efdbdd618c03cb593
