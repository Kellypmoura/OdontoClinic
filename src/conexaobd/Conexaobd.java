/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexaobd;
 import java.sql.*;
 import java.util.logging.Level;
 import java.util.logging.Logger;
 import javax.swing.JOptionPane;
/**
 *
 * @author 3° Ano Info
 */
public class Conexaobd {
    
    public static final String DRIVER = "com.mysql.jdbc.Driver";
    public static final String HOST = "127.0.0.1:3306";
    public static final String BASE = "odonto_clinica";
    public static final String USER = "root";
    public static final String PASS = "";

    static com.mysql.jdbc.PreparedStatement prepareStatement(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    Connection conexao;
    
    public Connection conectar() throws SQLException {
        try {
           Class.forName(DRIVER);
            Connection con = DriverManager.getConnection("jdbc:mysql://" + HOST + "/" + BASE+ "?user=" + USER + "&password=" + PASS + "");
            this.conexao = con;
            System.out.println("conectar()");
        } catch (Exception ex){
            Logger.getLogger(Conexaobd.class.getName()).log(Level.SEVERE, null, ex);
        System.out.println("falha ao conectar()");
                    
         
    }
        return conexao;
}
    public ResultSet consultar(String query) throws SQLException {
        Statement ps = this.conexao.createStatement();
        ResultSet rs = ps.executeQuery(query);
        return rs;
    }
   
    
     public int atualizar(String query) throws SQLException {
        Statement ps = this.conexao.createStatement();
        int rs = ps.executeUpdate(query);
        return rs;
    }
    }
