package Entities;

import java.util.Date;
import java.util.UUID;

public class Cliente 
{

    public Cliente(String nome, String cpf, String telefone, Date dataNascimento) {
        this.id = UUID.randomUUID();
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
    }
    private UUID id;
    private String nome;
    private String cpf;

    public UUID getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }
    private String telefone;
    private Date dataNascimento;
}
