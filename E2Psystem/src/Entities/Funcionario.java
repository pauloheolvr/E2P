package Entities;
<<<<<<< HEAD
=======

>>>>>>> 54957a9526915730e119c2d2b849fde5ab901c71
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
}
=======

    public void setId(UUID id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public UUID getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }

    public String getCpf() {
        return cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }
}
>>>>>>> 54957a9526915730e119c2d2b849fde5ab901c71
