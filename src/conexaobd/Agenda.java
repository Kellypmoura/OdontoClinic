/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexaobd;

import java.sql.PreparedStatement;
import conexaobd.Conexaobd;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author 3° Ano Info
 */
public class Agenda {
    
  private Conexaobd conexao = new Conexaobd();
    private String cpf;
    private String paciente;
    private String hora_consulta;
    private String data_consulta;
    private String tratamento;
    private String profissional;
    public ResultSet consulta;
    private int codigo;
    Connection conn;
    PreparedStatement pstm;
    ArrayList<Agenda> lista=new ArrayList<>();
    
    
  public void cadAgenda (String cpf, String paciente, String hora_consulta, String data_consulta, String tratamento, String profissional) {
        
        boolean sessao = false;
         try{
            String query = "INSERT INTO `agenda`( `cpf`, `paciente`, `hora_consulta`, `data_consulta`, `tratamento`, `profissional`) VALUES  " + "('"+cpf+"','"+paciente+"','"+hora_consulta+"','"+data_consulta+"','"+tratamento+"','"+profissional+"');";
             System.out.println("insert into agenda (cpf, paciente, hora_consulta, data_consulta, tratamento, profissional) values " + "('"+cpf+"','"+paciente+"','"+hora_consulta+"','"+data_consulta+"','"+tratamento+"','"+profissional+"')");
             conexao.conectar();
             int i = conexao.atualizar(query);
             System.out.println("Salvo com sucesso!()");
           
           } catch (SQLException e) {
    
           JOptionPane.showMessageDialog(null, e);
            }
}
   
  public void updAgenda (String cpf, String paciente, String hora_consulta, String data_consulta, String tratamento, String profissional) {
        
        boolean sessao = false;
         try{
            String query = "update agenda set cpf = '"+cpf+"', paciente = '"+paciente+"', hora_consulta = '"+hora_consulta+"', data_consulta = '"+data_consulta+"', tratamento = '"+tratamento+"', profissional = '"+profissional+"' WHERE cpf = '"+cpf+"'";
             System.out.println("insert into agenda values " + "(0, '"+cpf+"','"+paciente+"','"+hora_consulta+"','"+data_consulta+"','"+tratamento+"','"+profissional+"')");
             conexao.conectar();
             int i = conexao.atualizar(query);
             System.out.println("Alterado com sucesso!()");
           
           } catch (SQLException e) {
    
           JOptionPane.showMessageDialog(null, "Tente novamente!");
            }
}
  public void deletarAgendamento(String cpf){
     String sql = "DELETE FROM agenda WHERE cpf =?";
     
     try {
         conn = (Connection) new Conexaobd().conectar();
         pstm = conn.prepareStatement(sql);
         pstm.setString(1,cpf);
         
         pstm.executeUpdate();
     } catch (SQLException erro){
         JOptionPane.showMessageDialog(null, "Erro"+erro);
     }
  }
 public ArrayList<Agenda> ListarAgenda(){
     String sql = "select * from agenda";
      try {
          conn = (Connection) new Conexaobd().conectar();
      } catch (SQLException ex) {
          Logger.getLogger(Agenda.class.getName()).log(Level.SEVERE, null, ex);
      }
      try {
          pstm=conn.prepareStatement(sql);
          consulta = pstm.executeQuery();
          
          while(consulta.next()){
              Agenda agenda = new Agenda();
              agenda.setCpf(consulta.getString("cpf"));
              agenda.setPaciente(consulta.getString("paciente"));
              agenda.setHora_consulta(consulta.getString("hora_consulta"));
              agenda.setData_consulta(consulta.getString("data_consulta"));
              agenda.setTratamento(consulta.getString("tratamento"));
              agenda.setProfissional(consulta.getString("profissional"));
              lista.add(agenda);
          }
          
      } catch (SQLException ex) {
          Logger.getLogger(Agenda.class.getName()).log(Level.SEVERE, null, ex);
      }
      return lista;
 }
  
//  public void localizar() throws SQLException{
//      String query = "select * from agenda";
//            conexao.conectar();
//           consulta = conexao.consultar(query);
//           
//    } catch (SQLException e) { 
//      JOptionPane.showMessageDialog(null, "Ocorreu um erro!");
//         }
  
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
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the paciente
     */
    public String getPaciente() {
        return paciente;
    }

    /**
     * @param paciente the paciente to set
     */
    public void setPaciente(String paciente) {
        this.paciente = paciente;
    }
    /**
     * @return the hora_consulta
     */
    public String getHora_consulta() {
        return hora_consulta;
    }

    /**
     * @param hora_consulta the paciente to set
     */
    public void setHora_consulta(String hora_consulta) {
        this.hora_consulta = hora_consulta;
    }
    /**
     * @return the data_consulta
     */
    public String getData_consulta() {
        return data_consulta;
    }

    /**
     * @param data_consulta the data_consulta to set
     */
    public void setData_consulta(String data_consulta) {
        this.data_consulta = data_consulta;
    }

    /**
     * @return the tratamento
     */
    public String getTratamento() {
        return tratamento;
    }

    /**
     * @param tratamento the tratamento to set
     */
    public void setTratamento(String tratamento) {
        this.tratamento = tratamento;
    }

    /**
     * @return the profissional
     */
    public String getProfissional() {
        return profissional;
    }

    /**
     * @param profissional the profissional to set
     */
    public void setProfissional(String profissional) {
        this.profissional = profissional;
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