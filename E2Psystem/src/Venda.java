
import Views.CrudFuncionario;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.UUID;

public class Venda 
{    
    public Venda(CrudFuncionario funcionario) 
    {
        this.dataVenda = getDateTime();
        this.funcionario = funcionario;
    }
    private UUID id;
    private CrudFuncionario funcionario;
    private String dataVenda ;
    
    private String getDateTime() 
    { 
	DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy"); 
	Date date = new Date(); 
	return dateFormat.format(date); 
    }
}
