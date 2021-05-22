package Entities;

import Enum.Cargo;
import java.util.UUID;

public class Funcionario 
{

    public Funcionario(String nome, Cargo cargo, String cpf, String telefone, String email, String senha) {
        this.id = UUID.randomUUID();
        this.nome = nome;
        this.cargo = cargo;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
        this.senha = senha;
    }
    
    private UUID id;
    private String nome;
    private Cargo cargo;
    private String cpf;
    private String telefone;
    private String email;
    private String senha;

    public void Update(Cargo cargo, String telefone, String email)
    {
        this.cargo = cargo;
        this.telefone = telefone;
        this.email = email;
    }

    @Override
    public String toString() {
        return "ID: "+id+"\nNome: "+nome+"\nCargo: "+cargo+"\nCpf: "+cpf+"\nTelefone: "+telefone+"\nEmail: "+email+"\nSenha: "+senha;
    }
    
    
    public UUID getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Cargo getCargo() {
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
