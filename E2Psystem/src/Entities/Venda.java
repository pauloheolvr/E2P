
import Entities.Cliente;
import Entities.Produto;
import Views.Funcionario;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.UUID;

public class Venda 
{    
    public Venda(Cliente cliente, Funcionario funcionario, List<Produto> produtos) 
    {
        this.dataVenda = getDateTime();
        this.cliente = cliente;
        this.funcionario = funcionario;
        this.Produtos = produtos;
    }
    private UUID id;
    private Cliente cliente;
    private Funcionario funcionario;
    private List<Produto> Produtos;
    private String dataVenda ;
    
    private String getDateTime() 
    { 
	DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy"); 
	Date date = new Date(); 
	return dateFormat.format(date); 
    }
}
