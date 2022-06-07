/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexaobd;
import java.sql.Connection;
import java.lang.System.Logger;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author 3° Ano Info
 */
public class Funcionario {
    
    private Conexaobd conexao = new Conexaobd();
    private String nome;
    private String sobrenome;
    private String email;
    private String senha;
    private ResultSet consulta;
    private int codigo;
    Connection conn;
    PreparedStatement pstm;
    ArrayList<Funcionario> lista=new ArrayList<>();
    
  public void Funcionarios (String nome, String sobrenome, String email, String senha) {
        
        boolean sessao = false;
         try{
            String query = "insert into cadastro values " + "(0, '"+nome+"','"+sobrenome+"','"+email+"','"+senha+"')";
             System.out.println("insert into cadastro values " + "(0, '"+nome+"','"+sobrenome+"','"+email+"','"+senha+"')");
            getConexao().conectar();
           int i = getConexao().atualizar(query);
             System.out.println("Cadastro realizado com sucesso!()");
           
           } catch (SQLException e) {
    
           JOptionPane.showMessageDialog(null, "Tente novamente!");
            }
}
  public void updFuncionario (String nome, String sobrenome, String email, String senha) {
        
        boolean sessao = false;
         try{
            String query = "update cadastro set nome = '"+nome+"', sobrenome = '"+sobrenome+"', email = '"+email+"',  senha = '"+senha+"' WHERE nome = '"+nome+"'";
             System.out.println("insert into cadastro values " + "(0, '"+nome+"','"+sobrenome+"','"+email+"','"+senha+"')");
             conexao.conectar();
             int i = conexao.atualizar(query);
             System.out.println("Alterado com sucesso!()");
           
           } catch (SQLException e) {
    
           JOptionPane.showMessageDialog(null, "Tente novamente!");
            }
  }
  public void deletarFuncionario(String email){
     String sql = "DELETE FROM cadastro WHERE email =?";
     
     try {
         conn = (Connection) new Conexaobd().conectar();
         pstm = conn.prepareStatement(sql);
         pstm.setString(1,email);
         
         pstm.executeUpdate();
     } catch (SQLException erro){
         JOptionPane.showMessageDialog(null, "Erro"+erro);
     }
  }
     public ArrayList<Funcionario> ListarFuncionario(){
     String sql = "select * from cadastro";
      try {
         conn = (Connection) new Conexaobd().conectar();
      } catch (SQLException ex) {
          System.out.println(ex);
      }
      try {
          pstm=conn.prepareStatement(sql);
            setConsulta(pstm.executeQuery());
          
          while(getConsulta().next()){
              Funcionario funcionario = new Funcionario();
              funcionario.setNome(getConsulta().getString("nome"));
              funcionario.setSobrenome(getConsulta().getString("sobrenome"));
              funcionario.setEmail(getConsulta().getString("email"));
              funcionario.setSenha(getConsulta().getString("senha"));
              lista.add(funcionario);
          }
          
      } catch (SQLException ex) {
          System.out.println(ex);
      }
      return lista;
       }
    
             
    /**
     * @return the conexao
     */
    public Conexaobd getConexao() {
        return conexao;
    }

    /**
     * @param conexao the conexao to set
     */
    public void setConexao(Conexaobd conexao) {
        this.conexao = conexao;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the sobrenome
     */
    public String getSobrenome() {
        return sobrenome;
    }

    /**
     * @param sobrenome the sobrenome to set
     */
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     * @return the consulta
     */
    public ResultSet getConsulta() {
        return consulta;
    }

    /**
     * @param consulta the consulta to set
     */
    public void setConsulta(ResultSet consulta) {
        this.consulta = consulta;
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

  
