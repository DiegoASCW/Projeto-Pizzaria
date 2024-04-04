package DAO;

import java.sql.DriverManager;

public class Connection {

    private static Connection conex;
    private final String con_banco;
    private final String usuario_mysql;
    private final String senha_mysql;

    private Connection conn;

    private Connection(){
        conex = null;
        usuario_mysql = "root";
        senha_mysql = "PUC@1234";
        con_banco = "jdbc:mysql://127.0.0.1:3306/bdseg?useSSL=false";

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = (Connection) DriverManager.getConnection(con_banco, usuario_mysql, senha_mysql);
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public static Connection getInstance(){
        if (conex == null){
            conex = new Connection();
        }
        return conex;
    }

    public Connection getConexao(){
        return this.conn;
    }


}
