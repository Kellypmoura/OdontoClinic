/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexaobd;

import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import conexaobd.Conexaobd;
import java.sql.Connection;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author 3° Ano Info
 */
public class Paciente {

    private Conexaobd conexao = new Conexaobd();
    private String nome;
    private String cpf;
    private String endereco;
    private String numero_dente;
    private String data_de_nascimento;
    private String sexo;
    private String alergias;
    private String telefone;
    private ResultSet consulta;
    private int codigo;
    Connection conn;
    PreparedStatement pstm;
    ArrayList<Paciente> lista = new ArrayList<>();

    public void cadPacientes(String nome, String cpf, String endereco, String numero_dente, String data_de_nascimento, String sexo, String alergias, String telefone) {

        boolean sessao = false;
        try {
            String query = "insert into principal_pacientes values " + "(0,'" + nome + "','" + cpf + "','" + endereco + "', '" + numero_dente + "','" + data_de_nascimento + "','" + sexo + "','" + alergias + "','" + telefone + "')";
            System.out.println("insert into principal_pacientes values " + "(0,'" + nome + "','" + cpf + "','" + endereco + "','" + numero_dente + "','" + data_de_nascimento + "','" + sexo + "','" + alergias + "','" + telefone + "')");
            getConexao().conectar();
            int i = getConexao().atualizar(query);
            System.out.println("Salvo com sucesso!()");

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void updPaciente(String nome, String cpf, String endereco, String numero_dente, String data_de_nascimento, String sexo, String alergias, String telefone) {

        boolean sessao = false;
        try {
            String query = "update principal_pacientes set nome = '" + nome + "', cpf = '" + cpf + "', endereco = '" + endereco + "', numero_dente = '" + numero_dente + "', data_de_nascimento = '" + data_de_nascimento + "', sexo = '" + sexo + "', alergias = '" + alergias + "', telefone = '" + telefone + "' WHERE cpf = '" + cpf + "'";
            conexao.conectar();
            int i = conexao.atualizar(query);
            System.out.println("Alterado com sucesso!()");

        } catch (SQLException e) {
          JOptionPane.showMessageDialog(null, "Tente novamente"+e);
        }
    }

    public void deletarPaciente(String cpf) {
        String sql = "DELETE FROM principal_pacientes WHERE cpf =?";

        try {
            conn = (Connection) new Conexaobd().conectar();
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, cpf);

            pstm.executeUpdate();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro" + erro);
        }
    }
 public void alterarPaciente(String nome, String cpf, String endereco, String data_de_nascimento, String sexo, String alergias, String telefone) throws ClassCastException, SQLException{
     String sql  = "UPDATE principal_pacientes SET nome = ?, cpf = ?, endereco = ?, numero_dente = ?, data_de_nascimento = ?, sexo = ?, alergias = ?, telefone = ? WHERE cpf = ?";
     
      try {
            conn = (Connection) new Conexaobd().conectar();
            pstm = conn.prepareStatement(sql);
            pstm.setString(1,nome);
            pstm.setString(2,cpf);
            pstm.setString(3,endereco);
            pstm.setString(4,numero_dente);
            pstm.setString(5,data_de_nascimento);
            pstm.setString(6,sexo);
            pstm.setString(7,alergias);
            pstm.setString(8,telefone);
            
            pstm.executeUpdate();
     }catch (SQLException erro){
         JOptionPane.showMessageDialog(null, "Paciente alterarPaciente:"+erro);
     }
 }

    public ArrayList<Paciente> ListarPaciente() {
        String sql = "select * from principal_pacientes";
        try {
          conn = (Connection) new Conexaobd().conectar();
        } catch (SQLException ex) {

        }
        try {
            pstm = conn.prepareStatement(sql);
            consulta = pstm.executeQuery();

            while (consulta.next()) {
                Paciente paciente = new Paciente();
                paciente.setNome(consulta.getString("nome"));
                paciente.setCpf(consulta.getString("cpf"));
                paciente.setEndereco(consulta.getString("endereco"));
                paciente.setNumero_dente(consulta.getString("numero_dente"));
                paciente.setData_de_nascimento(consulta.getString("data_de_nascimento"));
                paciente.setSexo(consulta.getString("sexo"));
                paciente.setAlergias(consulta.getString("alergias"));
                paciente.setTelefone(consulta.getString("telefone"));
                lista.add(paciente);
            }

        } catch (SQLException ex) {

        }
        return lista;
    }

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
     * @return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    /**
     * @return the numero_dente
     */
    public String getNumero_dente() {
        return numero_dente;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setNumero_dente(String numero_dente) {
        this.numero_dente = numero_dente;
    }
    /**
     * @return the data_de_nascimento
     */
    public String getData_de_nascimento() {
        return data_de_nascimento;
    }

    /**
     * @param data_de_nascimento the data_de_nascimento to set
     */
    public void setData_de_nascimento(String data_de_nascimento) {
        this.data_de_nascimento = data_de_nascimento;
    }

    /**
     * @return the sexo
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    /**
     * @return the alergias
     */
    public String getAlergias() {
        return alergias;
    }

    /**
     * @param alergias the alergias to set
     */
    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    /**
     * @return the telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
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
