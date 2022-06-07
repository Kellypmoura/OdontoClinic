/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package entrada;

import conexaobd.Paciente;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 3° Ano Info
 */
public class telaProfissional extends javax.swing.JFrame {

    /**
     * Creates new form telaProfissional
     */
    public telaProfissional() {
        initComponents();
        listarValores();
    }
     private void listarValores(){
        try {
          Paciente paciente = new Paciente();
          DefaultTableModel model = (DefaultTableModel) tb_paciente.getModel();
          model.setNumRows(0);
          ArrayList<Paciente> lista = paciente.ListarPaciente();
          
          for(int num = 0 ; num < lista.size(); num++){
              model.addRow(new Object[]{
              lista.get(num).getNome(),
              lista.get(num).getCpf(),
              lista.get(num).getEndereco(),
              lista.get(num).getNumero_dente(),
              lista.get(num).getData_de_nascimento(),
              lista.get(num).getSexo(),
              lista.get(num).getAlergias(),
              lista.get(num).getTelefone()
              });
          }
        } catch (Exception ex){
            JOptionPane.showMessageDialog(null,"Listar Valores VIEW"+ ex);
        }
     }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        telaprincipal = new javax.swing.JPanel();
        fechar = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        listaPaciente = new javax.swing.JScrollPane();
        tb_paciente = new javax.swing.JTable();
        dente10 = new javax.swing.JLabel();
        dente11 = new javax.swing.JLabel();
        dente12 = new javax.swing.JLabel();
        dente1 = new javax.swing.JLabel();
        dente13 = new javax.swing.JLabel();
        dente14 = new javax.swing.JLabel();
        dente15 = new javax.swing.JLabel();
        dente16 = new javax.swing.JLabel();
        dente3 = new javax.swing.JLabel();
        dente5 = new javax.swing.JLabel();
        dente4 = new javax.swing.JLabel();
        dente6 = new javax.swing.JLabel();
        dente8 = new javax.swing.JLabel();
        dente9 = new javax.swing.JLabel();
        dente2 = new javax.swing.JLabel();
        dente7 = new javax.swing.JLabel();
        dente17 = new javax.swing.JLabel();
        dente18 = new javax.swing.JLabel();
        dente19 = new javax.swing.JLabel();
        dente20 = new javax.swing.JLabel();
        dente21 = new javax.swing.JLabel();
        dente22 = new javax.swing.JLabel();
        dente23 = new javax.swing.JLabel();
        dente24 = new javax.swing.JLabel();
        dente25 = new javax.swing.JLabel();
        dente26 = new javax.swing.JLabel();
        dente27 = new javax.swing.JLabel();
        dente28 = new javax.swing.JLabel();
        dente29 = new javax.swing.JLabel();
        dente30 = new javax.swing.JLabel();
        dente31 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        dente32 = new javax.swing.JLabel();
        telaazulescuro = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        abaagenda = new javax.swing.JPanel();
        logoagenda = new javax.swing.JLabel();
        agendatexto = new javax.swing.JLabel();
        abapacientes = new javax.swing.JPanel();
        logopacientes = new javax.swing.JLabel();
        pacientestexto = new javax.swing.JLabel();
        abaprofissionais = new javax.swing.JPanel();
        logoprofissionais = new javax.swing.JLabel();
        profissionaistexto = new javax.swing.JLabel();

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        telaprincipal.setBackground(new java.awt.Color(138, 203, 222));
        telaprincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fechar.setBackground(new java.awt.Color(1, 89, 146));
        fechar.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        fechar.setForeground(new java.awt.Color(1, 89, 146));
        fechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons/fechar-simbolo-de-botao-circular.png"))); // NOI18N
        fechar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fecharMouseClicked(evt);
            }
        });
        telaprincipal.add(fechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 0, -1, 40));

        jLabel9.setBackground(new java.awt.Color(9, 86, 122));
        jLabel9.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(9, 86, 122));
        jLabel9.setText("Identificação do Paciente");
        telaprincipal.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, -1, -1));

        tb_paciente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome do paciente", "CPF", "Endereço", "N° do dente", "Data de nascimento", "Sexo", "Alergias", "Telefone"
            }
        ));
        listaPaciente.setViewportView(tb_paciente);

        telaprincipal.add(listaPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, 610, 229));

        dente10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons/dente-10-definitivo.png"))); // NOI18N
        telaprincipal.add(dente10, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 363, 40, 60));

        dente11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons/dente-11-definitivo.png"))); // NOI18N
        telaprincipal.add(dente11, new org.netbeans.lib.awtextra.AbsoluteConstraints(521, 380, 60, 60));

        dente12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons/dente-12-definitivo.png"))); // NOI18N
        telaprincipal.add(dente12, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 414, -1, 40));

        dente1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons/dente-1-definitivo.png"))); // NOI18N
        telaprincipal.add(dente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 520, -1, 50));

        dente13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons/dente-13-definitivo.png"))); // NOI18N
        telaprincipal.add(dente13, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 430, 70, 50));

        dente14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons/dente-14-definitivo.png"))); // NOI18N
        telaprincipal.add(dente14, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 460, -1, 50));

        dente15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons/dente-15-definitivo.png"))); // NOI18N
        telaprincipal.add(dente15, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 490, -1, 50));

        dente16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons/dente-16-definitivo.png"))); // NOI18N
        telaprincipal.add(dente16, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 521, -1, 50));

        dente3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons/dente-3-definitivo.png"))); // NOI18N
        telaprincipal.add(dente3, new org.netbeans.lib.awtextra.AbsoluteConstraints(374, 462, -1, 50));

        dente5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons/dente-5-definitivo.png"))); // NOI18N
        telaprincipal.add(dente5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 420, 50, -1));

        dente4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons/dente-4-definitivo.png"))); // NOI18N
        telaprincipal.add(dente4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 440, 60, -1));

        dente6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons/dente-6-definitivo.png"))); // NOI18N
        telaprincipal.add(dente6, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 390, -1, -1));

        dente8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons/dente-8-definitivo.png"))); // NOI18N
        telaprincipal.add(dente8, new org.netbeans.lib.awtextra.AbsoluteConstraints(457, 363, 40, 60));

        dente9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons/dente-9-definitivo.png"))); // NOI18N
        telaprincipal.add(dente9, new org.netbeans.lib.awtextra.AbsoluteConstraints(484, 361, 40, 60));

        dente2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons/dente-2-definitivo.png"))); // NOI18N
        telaprincipal.add(dente2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 500, -1, -1));

        dente7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons/dente-7-definitivo.png"))); // NOI18N
        telaprincipal.add(dente7, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 369, -1, 60));

        dente17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons/dente-17 (1).png"))); // NOI18N
        telaprincipal.add(dente17, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 360, 80, 90));

        dente18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons/dente-18 (1).png"))); // NOI18N
        telaprincipal.add(dente18, new org.netbeans.lib.awtextra.AbsoluteConstraints(875, 390, -1, 90));

        dente19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons/dente-19 (1).png"))); // NOI18N
        telaprincipal.add(dente19, new org.netbeans.lib.awtextra.AbsoluteConstraints(866, 430, 80, 70));

        dente20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons/dente-20 (1).png"))); // NOI18N
        telaprincipal.add(dente20, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 480, 70, 40));

        dente21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons/dente-21 (1).png"))); // NOI18N
        telaprincipal.add(dente21, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 499, -1, 50));

        dente22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons/dente-22 (1).png"))); // NOI18N
        telaprincipal.add(dente22, new org.netbeans.lib.awtextra.AbsoluteConstraints(835, 522, 50, 40));

        dente23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons/dente-23 (1).png"))); // NOI18N
        telaprincipal.add(dente23, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 530, 50, 50));

        dente24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons/dente-24 (1).png"))); // NOI18N
        telaprincipal.add(dente24, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 540, 30, -1));

        dente25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons/dente-25 (1).png"))); // NOI18N
        telaprincipal.add(dente25, new org.netbeans.lib.awtextra.AbsoluteConstraints(779, 540, 30, -1));

        dente26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons/dente-26 (1).png"))); // NOI18N
        telaprincipal.add(dente26, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 530, 50, 60));

        dente27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons/dente-27 (1).png"))); // NOI18N
        telaprincipal.add(dente27, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 520, 50, 50));

        dente28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons/dente-28 (1).png"))); // NOI18N
        telaprincipal.add(dente28, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 502, 50, 40));

        dente29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons/dente-29 (1).png"))); // NOI18N
        telaprincipal.add(dente29, new org.netbeans.lib.awtextra.AbsoluteConstraints(693, 480, 60, -1));

        dente30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons/dente-30 (1).png"))); // NOI18N
        telaprincipal.add(dente30, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 440, 80, 50));

        dente31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons/dente-31 (1).png"))); // NOI18N
        telaprincipal.add(dente31, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 410, 80, 50));

        jPanel1.setBackground(new java.awt.Color(192, 230, 240));

        jLabel2.setBackground(new java.awt.Color(9, 86, 122));
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(9, 86, 122));
        jLabel2.setText("Arcada dentária superior");
        jLabel2.setToolTipText("");

        jLabel1.setBackground(new java.awt.Color(9, 86, 122));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(9, 86, 122));
        jLabel1.setText("Arcada dentária inferior");
        jLabel1.setToolTipText("");

        dente32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons/dente-32 (1).png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(69, 69, 69))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(dente32, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(235, 235, 235))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(37, 37, 37)
                .addComponent(dente32, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(161, Short.MAX_VALUE))
        );

        telaprincipal.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 290, 610, 300));

        telaazulescuro.setBackground(new java.awt.Color(9, 86, 122));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons/Sem-Título-2 (1).png"))); // NOI18N

        abaagenda.setBackground(new java.awt.Color(21, 103, 141));
        abaagenda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                abaagendaMouseClicked(evt);
            }
        });

        logoagenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons/agenda-dentaria.png"))); // NOI18N

        agendatexto.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        agendatexto.setForeground(new java.awt.Color(255, 255, 255));
        agendatexto.setText("Agenda");

        javax.swing.GroupLayout abaagendaLayout = new javax.swing.GroupLayout(abaagenda);
        abaagenda.setLayout(abaagendaLayout);
        abaagendaLayout.setHorizontalGroup(
            abaagendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaagendaLayout.createSequentialGroup()
                .addComponent(logoagenda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(agendatexto, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        abaagendaLayout.setVerticalGroup(
            abaagendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, abaagendaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logoagenda, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(agendatexto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        abapacientes.setBackground(new java.awt.Color(21, 103, 141));

        logopacientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons/dentista.png"))); // NOI18N

        pacientestexto.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        pacientestexto.setForeground(new java.awt.Color(255, 255, 255));
        pacientestexto.setText("Pacientes");

        javax.swing.GroupLayout abapacientesLayout = new javax.swing.GroupLayout(abapacientes);
        abapacientes.setLayout(abapacientesLayout);
        abapacientesLayout.setHorizontalGroup(
            abapacientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abapacientesLayout.createSequentialGroup()
                .addComponent(logopacientes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pacientestexto, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        abapacientesLayout.setVerticalGroup(
            abapacientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logopacientes, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(pacientestexto, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
        );

        abaprofissionais.setBackground(new java.awt.Color(21, 103, 141));
        abaprofissionais.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                abaprofissionaisMouseClicked(evt);
            }
        });

        logoprofissionais.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons/Sem-Título-3.png"))); // NOI18N

        profissionaistexto.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        profissionaistexto.setForeground(new java.awt.Color(255, 255, 255));
        profissionaistexto.setText("Prontuário");
        profissionaistexto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                profissionaistextoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout abaprofissionaisLayout = new javax.swing.GroupLayout(abaprofissionais);
        abaprofissionais.setLayout(abaprofissionaisLayout);
        abaprofissionaisLayout.setHorizontalGroup(
            abaprofissionaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaprofissionaisLayout.createSequentialGroup()
                .addComponent(logoprofissionais)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(profissionaistexto, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        abaprofissionaisLayout.setVerticalGroup(
            abaprofissionaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaprofissionaisLayout.createSequentialGroup()
                .addComponent(logoprofissionais, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, abaprofissionaisLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(profissionaistexto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout telaazulescuroLayout = new javax.swing.GroupLayout(telaazulescuro);
        telaazulescuro.setLayout(telaazulescuroLayout);
        telaazulescuroLayout.setHorizontalGroup(
            telaazulescuroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(abaagenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(telaazulescuroLayout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(logo)
                .addContainerGap(111, Short.MAX_VALUE))
            .addComponent(abapacientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(abaprofissionais, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        telaazulescuroLayout.setVerticalGroup(
            telaazulescuroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(telaazulescuroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logo)
                .addGap(65, 65, 65)
                .addComponent(abaagenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(abapacientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(abaprofissionais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        telaprincipal.add(telaazulescuro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 630));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(telaprincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 1115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(telaprincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 631, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void fecharMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fecharMouseClicked
        dispose();
    }//GEN-LAST:event_fecharMouseClicked

    private void abaagendaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_abaagendaMouseClicked
        new telaAgenda().setVisible(true);
    }//GEN-LAST:event_abaagendaMouseClicked

    private void profissionaistextoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profissionaistextoMouseClicked
        new telaProfissional().setVisible(true);
    }//GEN-LAST:event_profissionaistextoMouseClicked

    private void abaprofissionaisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_abaprofissionaisMouseClicked

    }//GEN-LAST:event_abaprofissionaisMouseClicked

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
            java.util.logging.Logger.getLogger(telaProfissional.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaProfissional.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaProfissional.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaProfissional.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaProfissional().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel abaagenda;
    private javax.swing.JPanel abapacientes;
    private javax.swing.JPanel abaprofissionais;
    private javax.swing.JLabel agendatexto;
    private javax.swing.JLabel dente1;
    private javax.swing.JLabel dente10;
    private javax.swing.JLabel dente11;
    private javax.swing.JLabel dente12;
    private javax.swing.JLabel dente13;
    private javax.swing.JLabel dente14;
    private javax.swing.JLabel dente15;
    private javax.swing.JLabel dente16;
    private javax.swing.JLabel dente17;
    private javax.swing.JLabel dente18;
    private javax.swing.JLabel dente19;
    private javax.swing.JLabel dente2;
    private javax.swing.JLabel dente20;
    private javax.swing.JLabel dente21;
    private javax.swing.JLabel dente22;
    private javax.swing.JLabel dente23;
    private javax.swing.JLabel dente24;
    private javax.swing.JLabel dente25;
    private javax.swing.JLabel dente26;
    private javax.swing.JLabel dente27;
    private javax.swing.JLabel dente28;
    private javax.swing.JLabel dente29;
    private javax.swing.JLabel dente3;
    private javax.swing.JLabel dente30;
    private javax.swing.JLabel dente31;
    private javax.swing.JLabel dente32;
    private javax.swing.JLabel dente4;
    private javax.swing.JLabel dente5;
    private javax.swing.JLabel dente6;
    private javax.swing.JLabel dente7;
    private javax.swing.JLabel dente8;
    private javax.swing.JLabel dente9;
    private javax.swing.JLabel fechar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JScrollPane listaPaciente;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel logoagenda;
    private javax.swing.JLabel logopacientes;
    private javax.swing.JLabel logoprofissionais;
    private javax.swing.JLabel pacientestexto;
    private javax.swing.JLabel profissionaistexto;
    private javax.swing.JTable tb_paciente;
    private javax.swing.JPanel telaazulescuro;
    private javax.swing.JPanel telaprincipal;
    // End of variables declaration//GEN-END:variables
}