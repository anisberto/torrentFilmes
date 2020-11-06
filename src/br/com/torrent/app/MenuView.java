package br.com.torrent.app;

import br.com.torrent.bll.CategoriaBll;
import br.com.torrent.bll.ContratoBll;
import br.com.torrent.bll.FilmesBll;
import br.com.torrent.bll.PlanoBll;
import br.com.torrent.bll.UsuarioBll;
import br.com.torrent.bll.ValidacoesBll;
import br.com.torrent.dal.UsuarioDal;
import br.com.torrent.interfaces.CategoriasInterfaces;
import br.com.torrent.interfaces.ContratoInterface;
import br.com.torrent.interfaces.FilmesInterfaces;
import br.com.torrent.interfaces.PlanoInterface;
import br.com.torrent.interfaces.UsuarioInterface;
import br.com.torrent.model.CategoriaFilmesModel;
import br.com.torrent.model.ContratoModel;
import br.com.torrent.model.Cupon;
import br.com.torrent.model.FilmeModel;
import br.com.torrent.model.PlanoModel;
import br.com.torrent.model.UsuarioModel;
import br.com.torrent.util.CategoriaTableModel;
import br.com.torrent.util.ContratoTableModel;
import br.com.torrent.util.FilmeTableModel;
import br.com.torrent.util.PlanoTableModel;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MenuView extends javax.swing.JFrame {

    UsuarioModel usuario = new UsuarioModel();
    PlanoInterface novoPlano = null;
    PlanoTableModel tabelaPlano;

    ContratoInterface novoContrato;
    ContratoTableModel tabelaContrato;
    FilmeTableModel tabelaFilmesModel;
    UsuarioInterface novoUsuario = null;
    UsuarioBll usuarioBll = new UsuarioBll();
    CategoriaTableModel categoriaTabela;
    CategoriasInterfaces novaCategoria;
    FilmesInterfaces novofilme = null;
    boolean incluirUsuario = true;
    boolean incluirPlano = true;
    boolean incluirContrato = true;
    boolean incluirCategoria = true;
    boolean incluirFilmes = true;
    int idDeleteFilme;
    int idDelete;

    public MenuView() throws Exception {
        super("Sistema Torrent Filmes");
        initComponents();
        tabelaPlano = new PlanoTableModel(new String[]{"Nome do Plano", "Preço", "Identificador", "Possui Acesso Simultaneo"});
        tabelaContrato = new ContratoTableModel(new String[]{"Plano", "Usuario", "Preço com Desconto", "Percentual de Desconto", "Vigencia", "Status", "Preço do Plano", "Identificador"});
        categoriaTabela = new CategoriaTableModel(new String[]{"Nome da Categoria", "Identificador"});
        tabelaFilmesModel = new FilmeTableModel(new String[]{"Identificador", "Titulo", "Ano de Lançamento", "Categoria"});
        tabViewFilme.setModel(tabelaFilmesModel);
        tabViewCategoria.setModel(categoriaTabela);
        tabViewPlano.setModel(tabelaPlano);
        tabViewContrato.setModel(tabelaContrato);
        tableUsuarios.setModel(tabelaPlano);
        novoPlano = new PlanoBll();
        novoContrato = new ContratoBll();
        novaCategoria = new CategoriaBll();
        novofilme = new FilmesBll();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jMenu1 = new javax.swing.JMenu();
        jDialog1 = new javax.swing.JDialog();
        jPanel8 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblUser = new javax.swing.JLabel();
        lblDateAcess = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        btnFilmeIncluir = new javax.swing.JButton();
        btnFilmeCancelar = new javax.swing.JButton();
        btnFilmeSalvar = new javax.swing.JButton();
        btnFilmeDeletar = new javax.swing.JButton();
        btnFilmeAlterar = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jcFilmeCategoria = new javax.swing.JComboBox<>();
        txtAnoFilme = new javax.swing.JTextField();
        txtFilmeTitulo = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtSinopseFilme = new javax.swing.JTextArea();
        jPanel19 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabViewFilme = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        txtUsuariosNome = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtUsuariosEmail = new javax.swing.JTextField();
        txtUsuariosSenha = new javax.swing.JTextField();
        txtUsuariosCpf = new javax.swing.JFormattedTextField();
        btnUsuariosIncluir = new javax.swing.JButton();
        btnUsuariosDeletar = new javax.swing.JButton();
        btnUsuariosAlterar = new javax.swing.JButton();
        btnUsuariosSalvar = new javax.swing.JButton();
        btnUsuariosCancelar = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        tableUsuarios = new javax.swing.JTable();
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
        jPanel17 = new javax.swing.JPanel();
        jPanel23 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabelaFilmesVer = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        btnCategoriaIncluir = new javax.swing.JButton();
        btnCategoriaCancelar = new javax.swing.JButton();
        btnCategoriaSalvar = new javax.swing.JButton();
        btnCategoriaDeletar = new javax.swing.JButton();
        btnCategoriaAlterar = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        txtCategoria = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jPanel22 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tabViewCategoria = new javax.swing.JTable();
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

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

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

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/torrent/icons/excluir.png"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

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
                .addGap(63, 63, 63)
                .addComponent(jLabel5))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(lblUser)
                        .addComponent(jLabel2)
                        .addComponent(lblDateAcess))
                    .addComponent(jLabel5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder("Manutenção"));

        jPanel18.setBorder(javax.swing.BorderFactory.createTitledBorder("Gestão dos Planos"));

        btnFilmeIncluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/torrent/icons/mais.png"))); // NOI18N
        btnFilmeIncluir.setText("INCLUIR");
        btnFilmeIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFilmeIncluirActionPerformed(evt);
            }
        });

        btnFilmeCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/torrent/icons/cancel_77947.png"))); // NOI18N
        btnFilmeCancelar.setText("CANCELAR");
        btnFilmeCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFilmeCancelarActionPerformed(evt);
            }
        });

        btnFilmeSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/torrent/icons/salve.png"))); // NOI18N
        btnFilmeSalvar.setText("SALVAR");
        btnFilmeSalvar.setEnabled(false);
        btnFilmeSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFilmeSalvarActionPerformed(evt);
            }
        });

        btnFilmeDeletar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/torrent/icons/lixo-24.png"))); // NOI18N
        btnFilmeDeletar.setText("DELETAR");
        btnFilmeDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFilmeDeletarActionPerformed(evt);
            }
        });

        btnFilmeAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/torrent/icons/papel.png"))); // NOI18N
        btnFilmeAlterar.setText("ALTERAR");
        btnFilmeAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFilmeAlterarActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel17.setText("Categoria");

        jLabel18.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel18.setText("ano");

        jcFilmeCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));
        jcFilmeCategoria.setEnabled(false);
        jcFilmeCategoria.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jcFilmeCategoriaAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        txtAnoFilme.setEnabled(false);

        txtFilmeTitulo.setEnabled(false);

        jLabel19.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel19.setText("Titulo");

        jPanel20.setBorder(javax.swing.BorderFactory.createTitledBorder("Sinopse"));

        txtSinopseFilme.setColumns(20);
        txtSinopseFilme.setRows(5);
        txtSinopseFilme.setEnabled(false);
        jScrollPane5.setViewportView(txtSinopseFilme);

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5)
                .addContainerGap())
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtFilmeTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jcFilmeCategoria, 0, 176, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel18)
                        .addGap(18, 18, 18)
                        .addComponent(txtAnoFilme, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addComponent(btnFilmeIncluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnFilmeDeletar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnFilmeAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnFilmeSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnFilmeCancelar)))
                .addContainerGap())
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAnoFilme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(txtFilmeTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(jcFilmeCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFilmeIncluir)
                    .addComponent(btnFilmeDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFilmeSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFilmeAlterar)
                    .addComponent(btnFilmeCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel19.setBorder(javax.swing.BorderFactory.createTitledBorder("Filmes"));

        tabViewFilme.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabViewFilme.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabViewFilmeMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tabViewFilme);

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4)
                .addContainerGap())
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel18.getAccessibleContext().setAccessibleName("Gestão dos Filmes");

        jTabbedPane1.addTab("Filmes", jPanel1);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel16.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastro de Usuario"));

        jLabel12.setText("Nome de Usuario: ");

        txtUsuariosNome.setEnabled(false);

        jLabel13.setText("CPF");

        jLabel14.setText("E-mail");

        jLabel15.setText("Senha");

        txtUsuariosEmail.setEnabled(false);

        txtUsuariosSenha.setEnabled(false);

        try {
            txtUsuariosCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtUsuariosCpf.setEnabled(false);

        btnUsuariosIncluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/torrent/icons/mais.png"))); // NOI18N
        btnUsuariosIncluir.setText("INCLUIR");
        btnUsuariosIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuariosIncluirActionPerformed(evt);
            }
        });

        btnUsuariosDeletar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/torrent/icons/lixo-24.png"))); // NOI18N
        btnUsuariosDeletar.setText("DELETAR");
        btnUsuariosDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuariosDeletarActionPerformed(evt);
            }
        });

        btnUsuariosAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/torrent/icons/papel.png"))); // NOI18N
        btnUsuariosAlterar.setText("ALTERAR");
        btnUsuariosAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuariosAlterarActionPerformed(evt);
            }
        });

        btnUsuariosSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/torrent/icons/salve.png"))); // NOI18N
        btnUsuariosSalvar.setText("SALVAR");
        btnUsuariosSalvar.setEnabled(false);
        btnUsuariosSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuariosSalvarActionPerformed(evt);
            }
        });

        btnUsuariosCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/torrent/icons/cancel_77947.png"))); // NOI18N
        btnUsuariosCancelar.setText("CANCELAR");
        btnUsuariosCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuariosCancelarActionPerformed(evt);
            }
        });

        tableUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "CPF", "E-mail", "Porc. %"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableUsuariosMouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(tableUsuarios);
        if (tableUsuarios.getColumnModel().getColumnCount() > 0) {
            tableUsuarios.getColumnModel().getColumn(0).setMinWidth(50);
            tableUsuarios.getColumnModel().getColumn(0).setPreferredWidth(50);
            tableUsuarios.getColumnModel().getColumn(0).setMaxWidth(50);
            tableUsuarios.getColumnModel().getColumn(2).setPreferredWidth(150);
            tableUsuarios.getColumnModel().getColumn(4).setMinWidth(60);
            tableUsuarios.getColumnModel().getColumn(4).setPreferredWidth(60);
            tableUsuarios.getColumnModel().getColumn(4).setMaxWidth(60);
        }

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane7)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(txtUsuariosNome)
                        .addGap(33, 33, 33)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtUsuariosCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 554, Short.MAX_VALUE))
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addComponent(txtUsuariosEmail)
                                .addGap(33, 33, 33)))
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(txtUsuariosSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(btnUsuariosIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnUsuariosDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(btnUsuariosAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                        .addComponent(btnUsuariosSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnUsuariosCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUsuariosIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUsuariosAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUsuariosSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUsuariosCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUsuariosDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUsuariosNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUsuariosCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(18, 18, 18)
                        .addComponent(txtUsuariosEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(18, 18, 18)
                        .addComponent(txtUsuariosSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 780, 420));

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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
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

        jPanel23.setBorder(javax.swing.BorderFactory.createTitledBorder("Filmes disponiveis"));

        tabelaFilmesVer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(tabelaFilmesVer);

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 744, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(151, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Ver Filmes", jPanel10);

        jPanel21.setBorder(javax.swing.BorderFactory.createTitledBorder("Gestão das Categorias"));

        btnCategoriaIncluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/torrent/icons/mais.png"))); // NOI18N
        btnCategoriaIncluir.setText("INCLUIR");
        btnCategoriaIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCategoriaIncluirActionPerformed(evt);
            }
        });

        btnCategoriaCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/torrent/icons/cancel_77947.png"))); // NOI18N
        btnCategoriaCancelar.setText("CANCELAR");
        btnCategoriaCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCategoriaCancelarActionPerformed(evt);
            }
        });

        btnCategoriaSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/torrent/icons/salve.png"))); // NOI18N
        btnCategoriaSalvar.setText("SALVAR");
        btnCategoriaSalvar.setEnabled(false);
        btnCategoriaSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCategoriaSalvarActionPerformed(evt);
            }
        });

        btnCategoriaDeletar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/torrent/icons/lixo-24.png"))); // NOI18N
        btnCategoriaDeletar.setText("DELETAR");
        btnCategoriaDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCategoriaDeletarActionPerformed(evt);
            }
        });

        btnCategoriaAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/torrent/icons/papel.png"))); // NOI18N
        btnCategoriaAlterar.setText("ALTERAR");
        btnCategoriaAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCategoriaAlterarActionPerformed(evt);
            }
        });

        txtCategoria.setEnabled(false);

        jLabel20.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel20.setText("Nome");

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addComponent(btnCategoriaIncluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCategoriaDeletar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCategoriaAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCategoriaSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 149, Short.MAX_VALUE)
                        .addComponent(btnCategoriaCancelar))
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(txtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCategoriaIncluir)
                    .addComponent(btnCategoriaDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCategoriaSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCategoriaAlterar)
                    .addComponent(btnCategoriaCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel22.setBorder(javax.swing.BorderFactory.createTitledBorder("Categorias"));

        tabViewCategoria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabViewCategoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabViewCategoriaMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(tabViewCategoria);

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6)
                .addContainerGap())
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel21, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel22, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jcContratoPlanosAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jcContratoUsuarios.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "selecione" }));
        jcContratoUsuarios.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jcContratoUsuariosAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
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
                        .addContainerGap(63, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void limparCamposUsuario() {
        txtUsuariosNome.setText("");
        txtUsuariosCpf.setText("");
        txtUsuariosEmail.setText("");
        txtUsuariosSenha.setText("");
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
            tabelaFilmesModel.update(novofilme.getAllFilmes());
            tabelaContrato.update(novoContrato.getAllContratos());
            categoriaTabela.update(novaCategoria.getAllCategorias());
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
            clearPlanosFields();
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
            newContrato.setFim(txtContratoFim.getText());
            newContrato.setId_plano(novoPlano.findPlanoName(jcContratoPlanos.getSelectedItem().toString()));
            newContrato.setId_usu(usuarioBll.findUsuarioName(jcContratoUsuarios.getSelectedItem().toString()));
            newContrato.setInicio(txtContratoInicio.getText());
            newContrato.setStatus(jcContratoStatus.getSelectedItem().toString());
            if (incluirContrato) {
                novoContrato.adicionarContrato(newContrato);
            } else {

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao Incluir: " + e.getMessage());
        } finally {
            ContratoEnableButtons(false);
            tabelaContrato.update(novoContrato.getAllContratos());
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
        try {
            int codigo = Integer.parseInt(tabViewContrato.getValueAt(tabViewContrato.getSelectedRow(), 7).toString());
            System.out.println(codigo);
            transferirDadosGridContrato(codigo);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_tabViewContratoMouseClicked

    private void jcContratoPlanosAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jcContratoPlanosAncestorAdded
        try {
            ArrayList<PlanoModel> planos = novoPlano.getAllPlano();
            jcContratoPlanos.removeAllItems();
            jcContratoPlanos.addItem("Selecione");
            for (PlanoModel plan : planos) {
                jcContratoPlanos.addItem(plan.getNome());
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jcContratoPlanosAncestorAdded

    private void jcContratoUsuariosAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jcContratoUsuariosAncestorAdded
        try {
            UsuarioDal usua = new UsuarioDal();
            jcContratoUsuarios.removeAllItems();
            ArrayList<UsuarioModel> usuariosNaLiata = (ArrayList<UsuarioModel>) usua.getAllUsuario();
            jcContratoUsuarios.addItem("Selecione");
            for (UsuarioModel usuarios : usuariosNaLiata) {
                jcContratoUsuarios.addItem(usuarios.getNome());
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jcContratoUsuariosAncestorAdded

    private void btnUsuariosIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuariosIncluirActionPerformed
        try {
            incluirUsuario = true;
            UsuariosEnableButtons(true);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnUsuariosIncluirActionPerformed

    private void btnUsuariosDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuariosDeletarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUsuariosDeletarActionPerformed

    private void btnUsuariosAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuariosAlterarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUsuariosAlterarActionPerformed

    private void btnUsuariosSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuariosSalvarActionPerformed
        Cupon cupon = new Cupon();
        try {
            usuario.setNome(txtUsuariosNome.getText());
            usuario.setCpf(txtUsuariosCpf.getText());
            usuario.setEmail(txtUsuariosEmail.getText());
            usuario.setSenha(txtUsuariosSenha.getText());

            usuarioBll.adicionarUsuario(usuario);
            System.out.println("cadastro de usuario - ok");
            limparCamposUsuario();
            JOptionPane.showMessageDialog(null, "Usuário Incluido com Sucesso!");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos ##");
        } finally {
            UsuariosEnableButtons(false);
        }
    }//GEN-LAST:event_btnUsuariosSalvarActionPerformed

    private void btnUsuariosCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuariosCancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUsuariosCancelarActionPerformed

    private void btnFilmeIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFilmeIncluirActionPerformed
        try {
            enableBuFilmes(true);
            incluirFilmes = true;
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnFilmeIncluirActionPerformed

    private void btnFilmeCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFilmeCancelarActionPerformed
        try {
            enableBuFilmes(false);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnFilmeCancelarActionPerformed

    private void btnFilmeSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFilmeSalvarActionPerformed
        try {
            FilmeModel novoFilme = new FilmeModel();
            novoFilme.setTitulo(txtFilmeTitulo.getText());
            novoFilme.setCategoria(novaCategoria.findCategoriasName(jcFilmeCategoria.getSelectedItem().toString()));
            novoFilme.setAno(Integer.parseInt(txtAnoFilme.getText()));
            novoFilme.setSinopse(txtSinopseFilme.getText());
            if (incluirFilmes) {
                novofilme.adicionarFilmes(novoFilme);
                JOptionPane.showMessageDialog(null, "Filme incluido com Sucesso!");
            } else {
                FilmeModel alterFil = novofilme.getFilmesById(idDeleteFilme);
                novoFilme.setIden(alterFil.getIden());
                novofilme.updateFilmes(novoFilme);
                JOptionPane.showMessageDialog(null, "Filme alterado com sucesso","Alteração",JOptionPane.OK_OPTION);
            }
        } catch (Exception e) {
        } finally {
            tabelaFilmesModel.update(novofilme.getAllFilmes());
            enableBuFilmes(false);
        }
    }//GEN-LAST:event_btnFilmeSalvarActionPerformed

    private void btnFilmeDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFilmeDeletarActionPerformed
        try {
            if (txtFilmeTitulo.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Selecione o Filme na Tabela", "Deleção", JOptionPane.ERROR_MESSAGE);
            } else {
                int conf = JOptionPane.showConfirmDialog(null, "Confirmar a deleção do filme: " + txtFilmeTitulo.getText(), "Deleção",
                        JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE, null);
                if (conf == 0) {
                    novofilme.deleteFilmes(idDeleteFilme);
                    JOptionPane.showMessageDialog(null, "Filme deletado com sucesso");
                } else {
                    JOptionPane.showMessageDialog(null, "Deleção Cancelada!");
                }
            }
        } catch (Exception e) {
        } finally {
            clearFilmesFilds();
        }
    }//GEN-LAST:event_btnFilmeDeletarActionPerformed

    private void btnFilmeAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFilmeAlterarActionPerformed
        try {
            enableBuFilmes(true);
            incluirFilmes = false;
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnFilmeAlterarActionPerformed

    private void tabViewFilmeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabViewFilmeMouseClicked
        transferirDadosFilmes();
    }//GEN-LAST:event_tabViewFilmeMouseClicked

    private void btnCategoriaIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCategoriaIncluirActionPerformed
        try {
            CategoriasEnableButtons(true);
            incluirCategoria = true;
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnCategoriaIncluirActionPerformed

    private void btnCategoriaCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCategoriaCancelarActionPerformed
        try {
            CategoriasEnableButtons(false);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnCategoriaCancelarActionPerformed

    private void btnCategoriaSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCategoriaSalvarActionPerformed
        try {
            CategoriaFilmesModel catFilme = new CategoriaFilmesModel();
            catFilme.setNome(txtCategoria.getText());
            if (incluirCategoria) {
                novaCategoria.adicionarCategorias(catFilme);
            } else {

            }
        } catch (Exception e) {
        } finally {
            CategoriasEnableButtons(false);
            categoriaTabela.update(novaCategoria.getAllCategorias());
        }
    }//GEN-LAST:event_btnCategoriaSalvarActionPerformed

    private void btnCategoriaDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCategoriaDeletarActionPerformed
        try {
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnCategoriaDeletarActionPerformed

    private void btnCategoriaAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCategoriaAlterarActionPerformed
        try {
            CategoriasEnableButtons(true);
            incluirCategoria = false;
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnCategoriaAlterarActionPerformed

    private void tabViewCategoriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabViewCategoriaMouseClicked
        try {
            int codigo = Integer.parseInt(tabViewContrato.getValueAt(tabViewContrato.getSelectedRow(), 7).toString());
            transferirDadosGridCategoria(codigo);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_tabViewCategoriaMouseClicked

    private void tableUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableUsuariosMouseClicked

        try {
            int coluna = tableUsuarios.getSelectedRow();
            Integer codigo = Integer.parseInt(tableUsuarios.getValueAt(coluna, 0).toString());
            //int linha = Integer.parseInt(tableUsuarios.getValueAt(tableUsuarios.getSelectedRow(), 2).toString());
//            transferirDadosUsuario(linha);
//            idDelete = linha;
        } catch (Exception e) {
        }
    }//GEN-LAST:event_tableUsuariosMouseClicked

    private void jcFilmeCategoriaAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jcFilmeCategoriaAncestorAdded
        try {
            setItemsCombo();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jcFilmeCategoriaAncestorAdded

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
                    JOptionPane.showMessageDialog(null, "Erro: 456456" + ex.getMessage());
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCategoriaAlterar;
    private javax.swing.JButton btnCategoriaCancelar;
    private javax.swing.JButton btnCategoriaDeletar;
    private javax.swing.JButton btnCategoriaIncluir;
    private javax.swing.JButton btnCategoriaSalvar;
    private javax.swing.JButton btnContratoAlterar;
    private javax.swing.JButton btnContratoCancelar;
    private javax.swing.JButton btnContratoDeletar;
    private javax.swing.JButton btnContratoIncluir;
    private javax.swing.JButton btnContratoSalvar;
    private javax.swing.JButton btnFilmeAlterar;
    private javax.swing.JButton btnFilmeCancelar;
    private javax.swing.JButton btnFilmeDeletar;
    private javax.swing.JButton btnFilmeIncluir;
    private javax.swing.JButton btnFilmeSalvar;
    private javax.swing.JButton btnPlanoAlterar;
    private javax.swing.JButton btnPlanoCancelar;
    private javax.swing.JButton btnPlanoDeletar;
    private javax.swing.JButton btnPlanoIncluir;
    private javax.swing.JButton btnPlanoSalvar;
    private javax.swing.JButton btnUsuariosAlterar;
    private javax.swing.JButton btnUsuariosCancelar;
    private javax.swing.JButton btnUsuariosDeletar;
    private javax.swing.JButton btnUsuariosIncluir;
    private javax.swing.JButton btnUsuariosSalvar;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
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
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JComboBox<String> jcContratoPlanos;
    private javax.swing.JComboBox<String> jcContratoStatus;
    private javax.swing.JComboBox<String> jcContratoUsuarios;
    private javax.swing.JComboBox<String> jcFilmeCategoria;
    private javax.swing.JComboBox<String> jcPlanoAcesso;
    private javax.swing.JLabel lblDateAcess;
    private javax.swing.JLabel lblUser;
    private javax.swing.JTable tabViewCategoria;
    private javax.swing.JTable tabViewContrato;
    private javax.swing.JTable tabViewFilme;
    private javax.swing.JTable tabViewPlano;
    private javax.swing.JTable tabelaFilmesVer;
    private javax.swing.JTable tableUsuarios;
    private javax.swing.JTextField txtAnoFilme;
    private javax.swing.JTextField txtCategoria;
    private javax.swing.JFormattedTextField txtContratoFim;
    private javax.swing.JFormattedTextField txtContratoInicio;
    private javax.swing.JTextField txtFilmeTitulo;
    private javax.swing.JTextField txtPlanoNome;
    private javax.swing.JTextField txtPlanoPreco;
    private javax.swing.JTextArea txtSinopseFilme;
    private javax.swing.JFormattedTextField txtUsuariosCpf;
    private javax.swing.JTextField txtUsuariosEmail;
    private javax.swing.JTextField txtUsuariosNome;
    private javax.swing.JTextField txtUsuariosSenha;
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

    public void clearPlanosFields() {
        txtPlanoNome.setText("");
        txtPlanoPreco.setText("");
        jcPlanoAcesso.removeAllItems();
        jcPlanoAcesso.addItem("SIM");
    }

    public void clearFilmesFilds() {
        txtFilmeTitulo.setText("");
        txtAnoFilme.setText("");
        txtSinopseFilme.setText("");
        jcFilmeCategoria.removeAllItems();
        jcFilmeCategoria.addItem("Selecione");
    }

    private void UsuariosEnableButtons(boolean butt) {
        if (butt) {
            btnUsuariosIncluir.setEnabled(false);
            btnUsuariosAlterar.setEnabled(false);
            btnUsuariosCancelar.setEnabled(true);
            btnUsuariosDeletar.setEnabled(false);
            btnUsuariosSalvar.setEnabled(true);
            txtUsuariosNome.setEnabled(true);
            txtUsuariosCpf.setEnabled(true);
            txtUsuariosEmail.setEnabled(true);
            txtUsuariosSenha.setEnabled(true);

        } else {
            btnUsuariosIncluir.setEnabled(true);
            btnUsuariosAlterar.setEnabled(true);
            btnUsuariosCancelar.setEnabled(true);
            btnUsuariosDeletar.setEnabled(true);

            btnUsuariosSalvar.setEnabled(false);
            txtUsuariosNome.setEnabled(false);
            txtUsuariosCpf.setEnabled(false);
            txtUsuariosEmail.setEnabled(false);
            txtUsuariosSenha.setEnabled(false);
            limparCamposUsuario();
        }
    }

    private void CategoriasEnableButtons(boolean butt) {
        if (butt) {
            btnCategoriaIncluir.setEnabled(false);
            btnCategoriaAlterar.setEnabled(false);
            btnCategoriaCancelar.setEnabled(true);
            btnCategoriaDeletar.setEnabled(false);
            btnCategoriaSalvar.setEnabled(true);
            txtCategoria.setEnabled(true);
        } else {
            btnCategoriaIncluir.setEnabled(true);
            btnCategoriaAlterar.setEnabled(true);
            btnCategoriaCancelar.setEnabled(true);
            btnCategoriaDeletar.setEnabled(true);

            btnCategoriaSalvar.setEnabled(false);
            txtCategoria.setEnabled(false);

            txtCategoria.setText("");
        }
    }

    // Usuario
    private void transferirDadosUsuario(int id) {
        try {
            UsuarioModel delete = novoUsuario.getUsuarioById(id);
            txtUsuariosNome.setText(delete.getNome());
            txtUsuariosCpf.setText(delete.getNome());
            txtUsuariosEmail.setText(delete.getNome());

        } catch (Exception e) {
        }
    }

    private void consultarUsuarios(List<UsuarioModel> lista) throws Exception {
        DefaultTableModel modelo = (DefaultTableModel) tableUsuarios.getModel();
        modelo.setNumRows(0);

        for (int pos = 0; pos < lista.size(); pos++) {
            String[] linha = new String[2];
            UsuarioModel aux = lista.get(pos);
            linha[0] = aux.getIden() + "";
            linha[1] = aux.getNome() + "";
            modelo.addRow(linha);

        }
    }

    private void preencheUsuario(int id) throws Exception {
        try {
            if (id > 0) {

            }
        } catch (Exception e) {
        }
    }

    private void transferirDadosGridContrato(int codigo) {
        ContratoModel bIContrato = novoContrato.getContratoById(codigo);
        System.out.println(bIContrato);
        txtContratoInicio.setText(new SimpleDateFormat("dd 'de' MMMM 'de' yyyy").format(bIContrato.getInicio()));
        txtContratoFim.setText(new SimpleDateFormat("dd 'de' MMMM 'de' yyyy").format(bIContrato.getFim()));
    }

    private void transferirDadosGridCategoria(int codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void enableBuFilmes(boolean butt) {
        if (butt) {
            btnFilmeIncluir.setEnabled(false);
            btnFilmeAlterar.setEnabled(false);
            btnFilmeCancelar.setEnabled(true);
            btnFilmeDeletar.setEnabled(false);
            btnFilmeSalvar.setEnabled(true);

            txtFilmeTitulo.setEnabled(true);
            txtAnoFilme.setEnabled(true);
            jcFilmeCategoria.setEnabled(true);
            txtSinopseFilme.setEnabled(true);
        } else {
            btnFilmeIncluir.setEnabled(true);
            btnFilmeAlterar.setEnabled(true);
            btnFilmeCancelar.setEnabled(true);
            btnFilmeDeletar.setEnabled(true);
            btnFilmeSalvar.setEnabled(false);

            txtFilmeTitulo.setEnabled(false);
            txtAnoFilme.setEnabled(false);
            jcFilmeCategoria.setEnabled(false);
            txtSinopseFilme.setEnabled(false);

            txtSinopseFilme.setText("");
            txtFilmeTitulo.setText("");
            txtAnoFilme.setText("");
            jcFilmeCategoria.removeAllItems();
            jcFilmeCategoria.addItem("Selecione");
            setItemsCombo();
        }
    }

    private void setItemsCombo() {
        jcFilmeCategoria.removeAllItems();
        ArrayList<CategoriaFilmesModel> contraPlanos = (ArrayList<CategoriaFilmesModel>) novaCategoria.getAllCategorias();
        jcFilmeCategoria.addItem("Selecione");
        for (CategoriaFilmesModel plan : contraPlanos) {
            jcFilmeCategoria.addItem(plan.getNome());
        }
    }

    private void transferirDadosFilmes() {
        try {
            int codigo = Integer.parseInt(tabViewFilme.getValueAt(tabViewFilme.getSelectedRow(), 0).toString());
            FilmeModel deleteFil = novofilme.getFilmesById(codigo);
            idDeleteFilme = codigo;
            txtAnoFilme.setText(deleteFil.getAno() + "");
            txtFilmeTitulo.setText(deleteFil.getTitulo());
            jcFilmeCategoria.removeAllItems();
            jcFilmeCategoria.addItem(deleteFil.getCategoria().getNome().toString());
            txtSinopseFilme.setText(deleteFil.getSinopse().toUpperCase());
        } catch (Exception e) {
        }
    }
}
