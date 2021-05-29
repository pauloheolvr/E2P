/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexão;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class SQL {
    private Connection conn = null;
    private Statement statement;
    public ResultSet resultSet;
    
    private String servidor = "localhost:3306";
    private String nomeDoBanco = "e2psystem";
    private String usuario = "root";
    private String senha = "20091997";
     
    public SQL(){
    
    }
    
    public SQL(String servidor, String nomeDoBanco, String usuario, String senha){
        this.servidor = servidor;
        this.nomeDoBanco = nomeDoBanco;
        this.usuario = usuario;
        this.senha = senha;
    }
    
    public Connection getConn() {
        return conn;
    }

    public void setConn(Connection conn) {
        this.conn = conn;
    }

    public Statement getStatement() {
        return statement;
    }

    public void setStatement(Statement statement) {
        this.statement = statement;
    }

    public ResultSet getResultSet() {
        return resultSet;
    }

    public void setResultSet(ResultSet resultSet) {
        this.resultSet = resultSet;
    }
        
    public void conectaBanco(){
        try {
            conn = DriverManager.getConnection("jdbc:mysql://" + servidor + "/" + nomeDoBanco, usuario, senha);
            if(conn != null){
                System.out.println("Conexão efetuada com sucesso! " + "ID: " + conn);
            }            
            
        } catch (Exception e) {
            System.out.println("Conexão não realizada - ERRO: " + e.getMessage());
        }
    }
    
    public boolean fechaBanco(){
        try {
            conn.close();
            return true;
        } catch (Exception e) {
            System.out.println("Erro ao fechar conexao " + e.getMessage());
            return false;
        }
    }
    
    public int insertSQL(String SQL){
        int status = 0;
        try {
            this.setStatement(getConn().createStatement());            
            this.getStatement().executeUpdate(SQL);            
        
            return status;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return status;
        }
    }
    
    public void executarSQL(String sql) {
        try {
            this.statement = conn.createStatement(
                    ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            this.resultSet = this.statement.executeQuery(sql);
        } catch (SQLException sqlex) {
            sqlex.printStackTrace();
        }
    }
    
    public boolean updateSQL(String pSQL){
        try {            
            this.setStatement(getConn().createStatement());

            getStatement().executeUpdate(pSQL);
            
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
        return true;
    }

    public PreparedStatement prepareStatement(String sql) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}
