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
}