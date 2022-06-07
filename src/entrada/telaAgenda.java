 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package entrada;

import com.sun.jdi.connect.spi.Connection;
import conexaobd.Agenda;
import conexaobd.Conexaobd;
import conexaobd.Funcionario;
import conexaobd.agendadto;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 3° Ano Info
 */
public class telaAgenda extends javax.swing.JFrame {
      Agenda cadastrar = new Agenda();
      Agenda salvar = new Agenda();
      Conexaobd conexao = new Conexaobd();
       private String cpf;
    /**
     * Creates new form telaAgenda
     */
    public telaAgenda() {
        initComponents();
        listarValores();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        telaprincipal = new javax.swing.JPanel();
        telaazulescuro1 = new javax.swing.JPanel();
        logo1 = new javax.swing.JLabel();
        abaagenda1 = new javax.swing.JPanel();
        logoagenda1 = new javax.swing.JLabel();
        agendatexto1 = new javax.swing.JLabel();
        abapacientes1 = new javax.swing.JPanel();
        logopacientes1 = new javax.swing.JLabel();
        pacientestexto1 = new javax.swing.JLabel();
        abaprofissionais1 = new javax.swing.JPanel();
        logoprofissionais1 = new javax.swing.JLabel();
        profissionaistexto1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTAgenda = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtPaciente = new javax.swing.JTextField();
        txtTratamentos = new javax.swing.JTextField();
        txtCpf = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        textListadePaciente = new javax.swing.JLabel();
        txtProfissionais = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jData = new javax.swing.JFormattedTextField();
        jHora = new javax.swing.JFormattedTextField();
        jLabel11 = new javax.swing.JLabel();
        fechar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        telaprincipal.setBackground(new java.awt.Color(138, 203, 222));

        telaazulescuro1.setBackground(new java.awt.Color(9, 86, 122));

        logo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons/Sem-Título-2 (1).png"))); // NOI18N

        abaagenda1.setBackground(new java.awt.Color(21, 103, 141));

        logoagenda1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons/agenda-dentaria.png"))); // NOI18N

        agendatexto1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        agendatexto1.setForeground(new java.awt.Color(255, 255, 255));
        agendatexto1.setText("Agenda");

        javax.swing.GroupLayout abaagenda1Layout = new javax.swing.GroupLayout(abaagenda1);
        abaagenda1.setLayout(abaagenda1Layout);
        abaagenda1Layout.setHorizontalGroup(
            abaagenda1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaagenda1Layout.createSequentialGroup()
                .addComponent(logoagenda1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(agendatexto1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        abaagenda1Layout.setVerticalGroup(
            abaagenda1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, abaagenda1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logoagenda1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(agendatexto1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        abapacientes1.setBackground(new java.awt.Color(21, 103, 141));
        abapacientes1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                abapacientes1MouseClicked(evt);
            }
        });

        logopacientes1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons/dentista.png"))); // NOI18N

        pacientestexto1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        pacientestexto1.setForeground(new java.awt.Color(255, 255, 255));
        pacientestexto1.setText("Pacientes");

        javax.swing.GroupLayout abapacientes1Layout = new javax.swing.GroupLayout(abapacientes1);
        abapacientes1.setLayout(abapacientes1Layout);
        abapacientes1Layout.setHorizontalGroup(
            abapacientes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abapacientes1Layout.createSequentialGroup()
                .addComponent(logopacientes1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pacientestexto1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        abapacientes1Layout.setVerticalGroup(
            abapacientes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logopacientes1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(pacientestexto1, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
        );

        abaprofissionais1.setBackground(new java.awt.Color(21, 103, 141));

        logoprofissionais1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons/Sem-Título-3.png"))); // NOI18N

        profissionaistexto1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        profissionaistexto1.setForeground(new java.awt.Color(255, 255, 255));
        profissionaistexto1.setText("Prontuário");
        profissionaistexto1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                profissionaistexto1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout abaprofissionais1Layout = new javax.swing.GroupLayout(abaprofissionais1);
        abaprofissionais1.setLayout(abaprofissionais1Layout);
        abaprofissionais1Layout.setHorizontalGroup(
            abaprofissionais1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaprofissionais1Layout.createSequentialGroup()
                .addComponent(logoprofissionais1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(profissionaistexto1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        abaprofissionais1Layout.setVerticalGroup(
            abaprofissionais1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaprofissionais1Layout.createSequentialGroup()
                .addComponent(logoprofissionais1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, abaprofissionais1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(profissionaistexto1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout telaazulescuro1Layout = new javax.swing.GroupLayout(telaazulescuro1);
        telaazulescuro1.setLayout(telaazulescuro1Layout);
        telaazulescuro1Layout.setHorizontalGroup(
            telaazulescuro1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(abaagenda1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(telaazulescuro1Layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(logo1)
                .addContainerGap(111, Short.MAX_VALUE))
            .addComponent(abapacientes1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(abaprofissionais1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        telaazulescuro1Layout.setVerticalGroup(
            telaazulescuro1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(telaazulescuro1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logo1)
                .addGap(63, 63, 63)
                .addComponent(abaagenda1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(abapacientes1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(abaprofissionais1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(192, 230, 240));

        jLabel1.setBackground(new java.awt.Color(9, 86, 122));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(9, 86, 122));
        jLabel1.setText("Agenda");
        jLabel1.setToolTipText("");

        jLabel2.setBackground(new java.awt.Color(9, 86, 122));
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(9, 86, 122));
        jLabel2.setText("Data da consulta:");

        jLabel6.setBackground(new java.awt.Color(9, 86, 122));
        jLabel6.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(9, 86, 122));
        jLabel6.setText("Paciente:");

        jLabel7.setBackground(new java.awt.Color(9, 86, 122));
        jLabel7.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(9, 86, 122));
        jLabel7.setText("Tratamentos:");

        jTAgenda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CPF", "Nome do Paciente", "Hora", "Data", "Tratamentos", "Profissionais"
            }
        ));
        jScrollPane1.setViewportView(jTAgenda);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(9, 86, 122));
        jLabel3.setText("               Salvar");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(9, 86, 122)));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(9, 86, 122));
        jLabel4.setText("               Editar");
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(9, 86, 122)));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(9, 86, 122));
        jLabel9.setText("               Deletar");
        jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(9, 86, 122)));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        txtPaciente.setBackground(new java.awt.Color(192, 230, 240));
        txtPaciente.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtPaciente.setForeground(new java.awt.Color(9, 86, 122));
        txtPaciente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(9, 86, 122)));
        txtPaciente.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPacienteFocusGained(evt);
            }
        });

        txtTratamentos.setBackground(new java.awt.Color(192, 230, 240));
        txtTratamentos.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtTratamentos.setForeground(new java.awt.Color(9, 86, 122));
        txtTratamentos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(9, 86, 122)));
        txtTratamentos.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtTratamentosFocusGained(evt);
            }
        });

        txtCpf.setBackground(new java.awt.Color(192, 230, 240));
        txtCpf.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtCpf.setForeground(new java.awt.Color(9, 86, 122));
        txtCpf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(9, 86, 122)));
        txtCpf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCpfFocusGained(evt);
            }
        });
        txtCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCpfActionPerformed(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(9, 86, 122));
        jLabel8.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(9, 86, 122));
        jLabel8.setText("CPF:");

        textListadePaciente.setBackground(new java.awt.Color(9, 86, 122));
        textListadePaciente.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        textListadePaciente.setForeground(new java.awt.Color(9, 86, 122));
        textListadePaciente.setText("Agendamentos");

        txtProfissionais.setBackground(new java.awt.Color(192, 230, 240));
        txtProfissionais.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtProfissionais.setForeground(new java.awt.Color(9, 86, 122));
        txtProfissionais.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cliníco Geral", "Endodontista", "Ortodontista", "Dentística", "Cirurgião-Dentista " }));

        jLabel10.setBackground(new java.awt.Color(9, 86, 122));
        jLabel10.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(9, 86, 122));
        jLabel10.setText("Profissionais:");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(9, 86, 122));
        jLabel5.setText("   Confirmar alteração");
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(9, 86, 122)));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        try {
            jData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            jHora.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel11.setBackground(new java.awt.Color(9, 86, 122));
        jLabel11.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(9, 86, 122));
        jLabel11.setText("Hora da consulta:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(290, 290, 290)
                        .addComponent(textListadePaciente)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel6)
                            .addComponent(txtPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jHora, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jData, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel11))
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTratamentos, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtProfissionais, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))
                                .addContainerGap(227, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(42, 42, 42)
                        .addComponent(jLabel7)
                        .addGap(61, 61, 61))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jHora, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtProfissionais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jData)
                            .addComponent(txtTratamentos, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textListadePaciente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        fechar.setBackground(new java.awt.Color(1, 89, 146));
        fechar.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        fechar.setForeground(new java.awt.Color(1, 89, 146));
        fechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons/fechar-simbolo-de-botao-circular.png"))); // NOI18N
        fechar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fecharMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout telaprincipalLayout = new javax.swing.GroupLayout(telaprincipal);
        telaprincipal.setLayout(telaprincipalLayout);
        telaprincipalLayout.setHorizontalGroup(
            telaprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(telaprincipalLayout.createSequentialGroup()
                .addComponent(telaazulescuro1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fechar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        telaprincipalLayout.setVerticalGroup(
            telaprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(telaprincipalLayout.createSequentialGroup()
                .addComponent(fechar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, telaprincipalLayout.createSequentialGroup()
                .addGap(0, 35, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
            .addComponent(telaazulescuro1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(telaprincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(telaprincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void fecharMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fecharMouseClicked
        dispose();
    }//GEN-LAST:event_fecharMouseClicked

    private void txtPacienteFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPacienteFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPacienteFocusGained

    private void txtTratamentosFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTratamentosFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTratamentosFocusGained

    private void txtCpfFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCpfFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCpfFocusGained

    private void abapacientes1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_abapacientes1MouseClicked
        new telaPrincipal().setVisible(true);
    }//GEN-LAST:event_abapacientes1MouseClicked

    private void profissionaistexto1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profissionaistexto1MouseClicked
        new telaProfissional().setVisible(true);
    }//GEN-LAST:event_profissionaistexto1MouseClicked

    void atualizarTabela(){
    try {
        Conexaobd conexao = new Conexaobd();
        Agenda atualizar = new Agenda();
          
         jTAgenda.setModel(new javax.swing.table.DefaultTableModel(
           new Object [][]{}, new String []{"ID","Cpf","Paciente","Hora_Consulta","Data_consulta","Tratamento","Profissional"} ));
    DefaultTableModel tabela = (DefaultTableModel) jTAgenda.getModel();
    while (atualizar.consulta.next()) {
    int cod = atualizar.consulta.getInt("id");
    String cpf = atualizar.consulta.getString("cpf");
    String paciente = atualizar.consulta.getString("paciente");
    String hora_consulta = atualizar.consulta.getString("hora_consulta");
    String data_consulta = atualizar.consulta.getString("data_consulta");
    String tratamento = atualizar.consulta.getString("tratamento");
    String profissional = atualizar.consulta.getString("profissonal");

    //Date data = (Date)cliente.consulta.getDate("data");
    //String dataNormal = DT.format(data);
    tabela.addRow(new Object[]{cod,cpf,paciente,hora_consulta,data_consulta,tratamento,profissional} );
    }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(rootPane, "Não foi possivel atualizar a tabela");
    }
}
    
    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
    cadastrar.cadAgenda(txtCpf.getText(),txtPaciente.getText(), jHora.getText(), jData.getText(), txtTratamentos.getText(), txtProfissionais.getSelectedItem().toString());
      
    listarValores();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void txtCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCpfActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
       int setar = jTAgenda.getSelectedRow();

      txtCpf.setText(jTAgenda.getModel().getValueAt(setar, 0).toString());
      txtPaciente.setText(jTAgenda.getModel().getValueAt(setar, 1).toString());
      jHora.setText(jTAgenda.getModel().getValueAt(setar, 2).toString());
      jData.setText(jTAgenda.getModel().getValueAt(setar, 3).toString());
      txtTratamentos.setText(jTAgenda.getModel().getValueAt(setar, 4).toString());
      txtProfissionais.setSelectedItem(jTAgenda.getModel().getValueAt(setar, 5).toString());
      
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        int setar = jTAgenda.getSelectedRow();
        cpf = jTAgenda.getModel().getValueAt(setar,0).toString();
        Object[] options = { "Confirmar", "Cancelar" };
        int result = JOptionPane.showOptionDialog(null, "Tem certeza que deseja deletar esse agendamento?", "Deletar agendamento", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0])
;       
        if (result == JOptionPane.OK_OPTION){
        Agenda deletar = new Agenda();
        deletar.deletarAgendamento(cpf);
        listarValores();
        }
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
       Agenda salvar = new Agenda();
       try{
           salvar.updAgenda(txtCpf.getText(), txtPaciente.getText(),jHora.getText(),jData.getText(), txtTratamentos.getText(), (String) txtProfissionais.getSelectedItem());
           listarValores();
           JOptionPane.showMessageDialog(null, "Dados alterados com sucesso");
        
       } catch (Exception ex){
           System.out.println(ex);
       }        
    }//GEN-LAST:event_jLabel5MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(telaAgenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaAgenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaAgenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaAgenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaAgenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel abaagenda1;
    private javax.swing.JPanel abapacientes1;
    private javax.swing.JPanel abaprofissionais1;
    private javax.swing.JLabel agendatexto1;
    private javax.swing.JLabel fechar;
    private javax.swing.JFormattedTextField jData;
    private javax.swing.JFormattedTextField jHora;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTAgenda;
    private javax.swing.JLabel logo1;
    private javax.swing.JLabel logoagenda1;
    private javax.swing.JLabel logopacientes1;
    private javax.swing.JLabel logoprofissionais1;
    private javax.swing.JLabel pacientestexto1;
    private javax.swing.JLabel profissionaistexto1;
    private javax.swing.JPanel telaazulescuro1;
    private javax.swing.JPanel telaprincipal;
    private javax.swing.JLabel textListadePaciente;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtPaciente;
    private javax.swing.JComboBox<String> txtProfissionais;
    private javax.swing.JTextField txtTratamentos;
    // End of variables declaration//GEN-END:variables

    private void tratabotoes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private void listarValores(){
        try {
          Agenda agenda = new Agenda();
          DefaultTableModel model = (DefaultTableModel) jTAgenda.getModel();
          model.setNumRows(0);
          ArrayList<Agenda> lista = agenda.ListarAgenda();
          
          for(int num = 0 ; num < lista.size(); num++){
              model.addRow(new Object[]{
              lista.get(num).getCpf(),
              lista.get(num).getPaciente(),
              lista.get(num).getHora_consulta(),
              lista.get(num).getData_consulta(),
              lista.get(num).getTratamento(),
              lista.get(num).getProfissional()
              });
          }
        } catch (Exception ex){
            JOptionPane.showMessageDialog(null,"Listar Valores VIEW"+ ex);
        }
    }
}