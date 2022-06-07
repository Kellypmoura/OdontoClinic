/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexaobd;
 import java.sql.ResultSet;
 import java.sql.SQLException;
 import javax.swing.JOptionPane;
/**
 *
 * @author 3° Ano Info
 */
public class Login {
    
    Conexaobd conexao = new Conexaobd();
    private String email;
    private String senha;
    private ResultSet consulta;
    private int codigo;
    
    public boolean Login(String email, String senha) {
        
        boolean sessao = false;
        try{
            String query = "select email,senha from cadastro where email='" + email + "'and senha='" + senha + "'";
            conexao.conectar();
           consulta = conexao.consultar(query);
            if (consulta != null) {
                while (consulta.next())  {
                    Login login = new Login();
                    login.setEmail(consulta.getString(1));
                    login.setSenha(consulta.getString(2));
                    sessao = true;
                    
                }
            }
    } catch (SQLException e) {
    
           JOptionPane.showMessageDialog(null, "ocorreu um error");
            }
    
        return sessao;
        
}
        public String getEmail()  {
            return email;
            
        }
        
        public void setEmail(String email) {
            this.email = email;
        }
        public String getSenha() {
            return senha;
        }
        
        public void setSenha(String senha) {
            this.senha = senha;
        }
        
        public ResultSet getConsulta() {
            return consulta;
        
}

    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
}
