package Entities;

import java.util.UUID;

public class Produto {
   
    public Produto(String nome, String tamanho, double valor, int quantidadeEstoque) {
        this.id = UUID.randomUUID();
        this.nome = nome;
        this.tamanho = tamanho;
        this.valor = valor;
        this.quantidadeEstoque = quantidadeEstoque;
    }
    
    private UUID id;
    private String nome;
    private String tamanho;
    private double valor;
    private int quantidadeEstoque;
    
    private void Update(String nome, String tamanho, double valor, int quantidadeEstoque){
        this.nome = nome;
        this.tamanho = tamanho;
        this.valor = valor;
        this.quantidadeEstoque = quantidadeEstoque;
    }
    
    public UUID getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getTamanho() {
        return tamanho;
    }

    public double getValor() {
        return valor;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }
}
