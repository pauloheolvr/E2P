package Entities;

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


    public String getNome() {
        return nome;
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

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}