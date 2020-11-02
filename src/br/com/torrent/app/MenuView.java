package br.com.torrent.app;

import br.com.torrent.bll.ContratoBll;
import br.com.torrent.bll.PlanoBll;
import br.com.torrent.bll.UsuarioBll;
import br.com.torrent.bll.ValidacoesBll;
import br.com.torrent.dal.UsuarioDal;
import br.com.torrent.enumerations.Status;
import br.com.torrent.interfaces.ContratoInterface;
import br.com.torrent.interfaces.PlanoInterface;
import br.com.torrent.model.ContratoModel;
import br.com.torrent.model.PlanoModel;
import br.com.torrent.model.Usuario;
import br.com.torrent.util.ContratoTableModel;
import br.com.torrent.util.PlanoTableModel;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

public class MenuView extends javax.swing.JFrame {
    
    Usuario usuario = new Usuario();
    PlanoInterface novoPlano = null;
    PlanoTableModel tabelaPlano;
    ContratoInterface novoContrato;
    ContratoTableModel tabelaContrato;
    UsuarioBll usuarioBll = new UsuarioBll();
    boolean incluirPlano = true;
    boolean incluirContrato = true;
    int idDelete;
    
    public MenuView() throws Exception {
        super("Sistema Torrent Filmes");
        initComponents();
        tabelaPlano = new PlanoTableModel(new String[]{"Nome do Plano", "Preço", "Identificador", "Possui Acesso Simultaneo"});
        tabelaContrato = new ContratoTableModel(new String[]{"Plano", "Identificador", "Data Inicio", "Data Fim", "Status", "Usuario"});
        tabViewPlano.setModel(tabelaPlano);
        tabViewContrato.setModel(tabelaContrato);
        novoPlano = new PlanoBll();
        novoContrato = new ContratoBll();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jMenu1 = new javax.swing.JMenu();
        jPanel8 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblUser = new javax.swing.JLabel();
        lblDateAcess = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        btnPlanoIncluir = new javax.swing.JButton();
        btnPlanoCancelar = new javax.swing.JButton();
        btnPlanoSalvar = new javax.swing.JButton();
        btnPlanoDeletar = new javax.swing.JButton();
        btnPlanoAlterar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jcPlanoAcesso = new javax.swing.JComboBox<>();
        txtPlanoNome = new javax.swing.JTextField();
        txtPlanoPreco = new javax.swing.JTextField();
        jPanel12 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabViewPlano = new javax.swing.JTable();
        jPanel10 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        btnContratoIncluir = new javax.swing.JButton();
        btnContratoCancelar = new javax.swing.JButton();
        btnContratoSalvar = new javax.swing.JButton();
        btnContratoDeletar = new javax.swing.JButton();
        btnContratoAlterar = new javax.swing.JButton();
        jcContratoPlanos = new javax.swing.JComboBox<>();
        jcContratoUsuarios = new javax.swing.JComboBox<>();
        jcContratoStatus = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtContratoInicio = new javax.swing.JFormattedTextField();
        txtContratoFim = new javax.swing.JFormattedTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabViewContrato = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu Principal");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder("Gestão Torrent Filmes"));

        jLabel1.setText("Usuario: ");

        jLabel2.setText("Data:");

        lblUser.setForeground(new java.awt.Color(255, 0, 0));
        lblUser.setText("jLabel3");

        lblDateAcess.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        lblDateAcess.setForeground(new java.awt.Color(255, 0, 0));
        lblDateAcess.setText("jLabel3");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblUser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblDateAcess)
                .addGap(21, 21, 21))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(lblDateAcess))
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(lblUser)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder("Manutenção"));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 810, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 471, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Filmes", jPanel1);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setText("teste");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addContainerGap(760, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addContainerGap(451, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 800, 480));

        jTabbedPane1.addTab("Usuarios", jPanel3);

        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder("Gestão dos Planos"));

        btnPlanoIncluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/torrent/icons/mais.png"))); // NOI18N
        btnPlanoIncluir.setText("INCLUIR");
        btnPlanoIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlanoIncluirActionPerformed(evt);
            }
        });

        btnPlanoCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/torrent/icons/cancel_77947.png"))); // NOI18N
        btnPlanoCancelar.setText("CANCELAR");
        btnPlanoCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlanoCancelarActionPerformed(evt);
            }
        });

        btnPlanoSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/torrent/icons/salve.png"))); // NOI18N
        btnPlanoSalvar.setText("SALVAR");
        btnPlanoSalvar.setEnabled(false);
        btnPlanoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlanoSalvarActionPerformed(evt);
            }
        });

        btnPlanoDeletar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/torrent/icons/lixo-24.png"))); // NOI18N
        btnPlanoDeletar.setText("DELETAR");
        btnPlanoDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlanoDeletarActionPerformed(evt);
            }
        });

        btnPlanoAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/torrent/icons/papel.png"))); // NOI18N
        btnPlanoAlterar.setText("ALTERAR");
        btnPlanoAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlanoAlterarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Nome");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("Possui Acesso Simultaneo");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setText("Preço");

        jcPlanoAcesso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SIM", "NAO" }));
        jcPlanoAcesso.setEnabled(false);

        txtPlanoNome.setEnabled(false);

        txtPlanoPreco.setEnabled(false);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtPlanoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcPlanoAcesso, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPlanoPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(btnPlanoIncluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPlanoDeletar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPlanoAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPlanoSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(92, 92, 92)
                        .addComponent(btnPlanoCancelar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(jcPlanoAcesso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPlanoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPlanoPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPlanoIncluir)
                    .addComponent(btnPlanoDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPlanoSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPlanoAlterar)
                    .addComponent(btnPlanoCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder("Planos"));

        tabViewPlano.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabViewPlano.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabViewPlanoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabViewPlano);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Planos", jPanel7);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 810, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 471, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Cupons", jPanel10);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 810, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 471, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Categorias", jPanel6);

        jPanel14.setBorder(javax.swing.BorderFactory.createTitledBorder("Gestão dos Contratos"));

        btnContratoIncluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/torrent/icons/mais.png"))); // NOI18N
        btnContratoIncluir.setText("INCLUIR");
        btnContratoIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContratoIncluirActionPerformed(evt);
            }
        });

        btnContratoCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/torrent/icons/cancel_77947.png"))); // NOI18N
        btnContratoCancelar.setText("CANCELAR");
        btnContratoCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContratoCancelarActionPerformed(evt);
            }
        });

        btnContratoSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/torrent/icons/salve.png"))); // NOI18N
        btnContratoSalvar.setText("SALVAR");
        btnContratoSalvar.setEnabled(false);
        btnContratoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContratoSalvarActionPerformed(evt);
            }
        });

        btnContratoDeletar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/torrent/icons/lixo-24.png"))); // NOI18N
        btnContratoDeletar.setText("DELETAR");
        btnContratoDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContratoDeletarActionPerformed(evt);
            }
        });

        btnContratoAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/torrent/icons/papel.png"))); // NOI18N
        btnContratoAlterar.setText("ALTERAR");
        btnContratoAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContratoAlterarActionPerformed(evt);
            }
        });

        jcContratoPlanos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "selecione" }));
        jcContratoPlanos.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jcContratoPlanosAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jcContratoUsuarios.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "selecione" }));
        jcContratoUsuarios.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jcContratoUsuariosAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jcContratoStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ATIVO", "INATIVO" }));

        jLabel7.setText("Data de Inicio");

        jLabel8.setText("Data de Fim");

        txtContratoInicio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));

        txtContratoFim.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));

        jLabel9.setText("Plano");

        jLabel10.setText("Usuario");

        jLabel11.setText("Status");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel14Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jcContratoPlanos, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel14Layout.createSequentialGroup()
                                .addComponent(btnContratoIncluir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnContratoDeletar)))
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnContratoAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnContratoSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(92, 92, 92)
                                .addComponent(btnContratoCancelar))
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addComponent(jcContratoUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(86, Short.MAX_VALUE))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel14Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtContratoInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtContratoFim, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jcContratoStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(107, 107, 107))))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtContratoInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtContratoFim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcContratoStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(14, 14, 14)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jcContratoPlanos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jcContratoUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnContratoIncluir)
                    .addComponent(btnContratoDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnContratoSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnContratoAlterar)
                    .addComponent(btnContratoCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel15.setBorder(javax.swing.BorderFactory.createTitledBorder("Contratos"));

        tabViewContrato.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabViewContrato.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabViewContratoMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabViewContrato);

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Contratos", jPanel13);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1))
        );

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/torrent/icons/excluir.png"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel5)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(9, 9, 9)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void limparCamposUsuario() {
//        txtUsuNome.setText("");
//        txtUsuCpf.setText("");
//        txtUsuEmail.setText("");
//        txtUsuSenha.setText("");
    }
    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        try {
            LoginView login = new LoginView();
            login.setVisible(true);
            dispose();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jLabel5MouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        try {
            lblDateAcess.setText(new SimpleDateFormat("dd 'de' MMMM 'de' yyyy").format(new Date()));
            tabelaPlano.update((ArrayList<PlanoModel>) novoPlano.getAllPlano());
        } catch (Exception e) {
        }
    }//GEN-LAST:event_formWindowActivated
    public void userTransfer(String user) {
        try {
            lblUser.setText(user);
        } catch (Exception e) {
        }
    }

    private void btnUsuSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuSalvarActionPerformed
        try {
//            usuario.setNome(txtUsuNome.getText());
//            usuario.setCpf(txtUsuCpf.getText());
//            usuario.setEmail(txtUsuEmail.getText());
//            usuario.setSenha(txtUsuSenha.getText());
//
//            usuarioBll.adicionarUsuario(usuario);
            System.out.println("cadastro de usuario");
            limparCamposUsuario();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnUsuSalvarActionPerformed

    private void btnUsuConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuConsultarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUsuConsultarActionPerformed

    private void btnUsuExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuExcluirActionPerformed

    }//GEN-LAST:event_btnUsuExcluirActionPerformed

    private void btnUsuNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuNovoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUsuNovoActionPerformed

    private void btnPlanoIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlanoIncluirActionPerformed
        try {
            incluirPlano = true;
            PlanoEnableButtons(true);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnPlanoIncluirActionPerformed

    private void btnPlanoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlanoSalvarActionPerformed
        try {
            String nomePlano = txtPlanoNome.getText();
            double precoPlano = Double.parseDouble(txtPlanoPreco.getText());
            boolean tipoDeAcesso = jcPlanoAcesso.getSelectedItem().toString().equalsIgnoreCase("sim") ? true : false;
            PlanoModel plano = new PlanoModel();
            plano.setNome(nomePlano);
            plano.setPreco(precoPlano);
            plano.setAcessoSimultaneo(tipoDeAcesso);
            
            if (ValidacoesBll.validarEntradaDeDadosPlano(plano)) {
                if (incluirPlano) {
                    novoPlano.adicionarPlano(plano);
                    JOptionPane.showMessageDialog(null, "Plano Incluido com Sucesso!");
                    tabelaPlano.update(novoPlano.getAllPlano());
                } else {
                    plano.setId(novoPlano.getPlanoById(idDelete).getId());
                    novoPlano.updatePlano(plano);
                    tabelaPlano.update(novoPlano.getAllPlano());
                    JOptionPane.showMessageDialog(null, "Plano: " + plano.getNome() + ", Foi atualizado com sucesso!");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Dados do Plano não consistentes!\nO nome precisa ter mais que 5 caracteres e o preço precisa ser maior que zero!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos ");
        } finally {
            PlanoEnableButtons(false);
        }
    }//GEN-LAST:event_btnPlanoSalvarActionPerformed

    private void btnPlanoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlanoCancelarActionPerformed
        try {
            PlanoEnableButtons(false);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnPlanoCancelarActionPerformed

    private void btnPlanoAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlanoAlterarActionPerformed
        try {
            PlanoEnableButtons(true);
            incluirPlano = false;
            jcPlanoAcesso.removeAllItems();
            jcPlanoAcesso.addItem("SIM");
            jcPlanoAcesso.addItem("NAO");
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnPlanoAlterarActionPerformed

    private void btnPlanoDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlanoDeletarActionPerformed
        try {
            novoPlano.deletePlano(novoPlano.getPlanoById(idDelete));
            JOptionPane.showMessageDialog(null, "Plano: " + novoPlano.getPlanoById(idDelete).getNome() + "! Deletado");
            clearFields();
            tabelaPlano.update(novoPlano.getAllPlano());
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnPlanoDeletarActionPerformed

    private void tabViewPlanoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabViewPlanoMouseClicked
        try {
            int codigo = Integer.parseInt(tabViewPlano.getValueAt(tabViewPlano.getSelectedRow(), 2).toString());
            transferirDadosPlano(codigo);
            idDelete = codigo;
        } catch (Exception e) {
        }
    }//GEN-LAST:event_tabViewPlanoMouseClicked

    private void btnContratoIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContratoIncluirActionPerformed
        try {
            ContratoEnableButtons(true);
            incluirContrato = true;
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnContratoIncluirActionPerformed

    private void btnContratoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContratoCancelarActionPerformed
        try {
            ContratoEnableButtons(false);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnContratoCancelarActionPerformed

    private void btnContratoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContratoSalvarActionPerformed
        try {
            ContratoModel newContrato = new ContratoModel();
            newContrato.setFim(new Date(txtContratoFim.getText()));
            newContrato.setId_plano(novoPlano.findPlanoName(jcContratoPlanos.getSelectedItem().toString()));
            newContrato.setId_usu(usuarioBll.consultarUsuarioPorNome(jcContratoUsuarios.getSelectedItem().toString()));
            newContrato.setInicio(new Date(txtContratoInicio.getText()));
            newContrato.setStatus(Status.valueOf(jcContratoStatus.getSelectedItem().toString()));
            if (incluirContrato) {
                novoContrato.adicionarContrato(newContrato);
            } else {
                
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao Incluir: " + e.getMessage());
        } finally {
            ContratoEnableButtons(false);
        }
    }//GEN-LAST:event_btnContratoSalvarActionPerformed

    private void btnContratoDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContratoDeletarActionPerformed
        try {
            ContratoEnableButtons(false);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnContratoDeletarActionPerformed

    private void btnContratoAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContratoAlterarActionPerformed
        try {
            incluirContrato = false;
            ContratoEnableButtons(true);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnContratoAlterarActionPerformed

    private void tabViewContratoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabViewContratoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tabViewContratoMouseClicked

    private void jcContratoPlanosAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jcContratoPlanosAncestorAdded
        try {
            ArrayList<PlanoModel> planos = novoPlano.getAllPlano();
            for (PlanoModel plan : planos) {
                jcContratoPlanos.addItem(plan.getNome());
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jcContratoPlanosAncestorAdded

    private void jcContratoUsuariosAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jcContratoUsuariosAncestorAdded
        try {
            UsuarioDal usua = new UsuarioDal();
            ArrayList<Usuario> usuariosNaLiata = (ArrayList<Usuario>) usua.getAllUsuario();
            for (Usuario usuarios : usuariosNaLiata) {
                jcContratoUsuarios.addItem(usuarios.getNome());
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jcContratoUsuariosAncestorAdded
    
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
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new MenuView().setVisible(true);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Erro: " + ex.getMessage());
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnContratoAlterar;
    private javax.swing.JButton btnContratoCancelar;
    private javax.swing.JButton btnContratoDeletar;
    private javax.swing.JButton btnContratoIncluir;
    private javax.swing.JButton btnContratoSalvar;
    private javax.swing.JButton btnPlanoAlterar;
    private javax.swing.JButton btnPlanoCancelar;
    private javax.swing.JButton btnPlanoDeletar;
    private javax.swing.JButton btnPlanoIncluir;
    private javax.swing.JButton btnPlanoSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JComboBox<String> jcContratoPlanos;
    private javax.swing.JComboBox<String> jcContratoStatus;
    private javax.swing.JComboBox<String> jcContratoUsuarios;
    private javax.swing.JComboBox<String> jcPlanoAcesso;
    private javax.swing.JLabel lblDateAcess;
    private javax.swing.JLabel lblUser;
    private javax.swing.JTable tabViewContrato;
    private javax.swing.JTable tabViewPlano;
    private javax.swing.JFormattedTextField txtContratoFim;
    private javax.swing.JFormattedTextField txtContratoInicio;
    private javax.swing.JTextField txtPlanoNome;
    private javax.swing.JTextField txtPlanoPreco;
    // End of variables declaration//GEN-END:variables

    private void PlanoEnableButtons(boolean butt) {
        if (butt) {
            btnPlanoIncluir.setEnabled(false);
            btnPlanoAlterar.setEnabled(false);
            btnPlanoCancelar.setEnabled(true);
            btnPlanoDeletar.setEnabled(false);
            btnPlanoSalvar.setEnabled(true);
            txtPlanoNome.setEnabled(true);
            txtPlanoPreco.setEnabled(true);
            jcPlanoAcesso.setEnabled(true);
        } else {
            btnPlanoIncluir.setEnabled(true);
            btnPlanoAlterar.setEnabled(true);
            btnPlanoCancelar.setEnabled(true);
            btnPlanoDeletar.setEnabled(true);
            
            btnPlanoSalvar.setEnabled(false);
            txtPlanoNome.setEnabled(false);
            txtPlanoPreco.setEnabled(false);
            jcPlanoAcesso.setEnabled(false);
            txtPlanoNome.setText("");
            txtPlanoPreco.setText("");
            jcPlanoAcesso.setSelectedItem("Nao");
        }
    }
    
    private void ContratoEnableButtons(boolean butt) {
        if (butt) {
            btnContratoIncluir.setEnabled(false);
            btnContratoAlterar.setEnabled(false);
            btnContratoCancelar.setEnabled(true);
            btnContratoDeletar.setEnabled(false);
            btnContratoSalvar.setEnabled(true);
        } else {
            btnContratoIncluir.setEnabled(true);
            btnContratoAlterar.setEnabled(true);
            btnContratoCancelar.setEnabled(true);
            btnContratoDeletar.setEnabled(true);
            
            btnContratoSalvar.setEnabled(false);
        }
    }
    
    private void transferirDadosPlano(int id) {
        try {
            PlanoModel delete = novoPlano.getPlanoById(id);
            txtPlanoNome.setText(delete.getNome());
            txtPlanoPreco.setText(delete.getPreco() + "");
            String acess = delete.isAcessoSimultaneo() ? "SIM" : "NÃO";
            jcPlanoAcesso.removeAllItems();
            jcPlanoAcesso.addItem(acess);
        } catch (Exception e) {
        }
    }
    
    public void clearFields() {
        txtPlanoNome.setText("");
        txtPlanoPreco.setText("");
        jcPlanoAcesso.removeAllItems();
        jcPlanoAcesso.addItem("SIM");
    }
}
