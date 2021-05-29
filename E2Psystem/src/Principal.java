import Conexão.SQL;
import Views.Load;

public class Principal 
{
    public static void main(String[] args) 
    {
        new Load().setVisible(true);
        SQL mySyql = new SQL();
        mySyql.conectaBanco();
    }
}