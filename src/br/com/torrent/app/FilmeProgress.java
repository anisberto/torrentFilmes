package br.com.torrent.app;

import br.com.torrent.bll.FilmesBll;
import br.com.torrent.bll.UsuarioBll;
import br.com.torrent.bll.VisualizaBll;
import br.com.torrent.dal.FilmesDal;
import br.com.torrent.dal.UsuarioDal;
import br.com.torrent.interfaces.VisualizaInterface;
import br.com.torrent.model.VisualizaModel;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class FilmeProgress extends javax.swing.JFrame {

    String dateGeral;
    boolean visuCompelto = true;
    TimerVis timer = new TimerVis();
    String nomeUser;
    int idUser;
    int idFilme;
    int contOld;
    String tituloDoFilme;
    VisualizaInterface visualizacao;

    public FilmeProgress() throws Exception {
        initComponents();
        progressBar.setStringPainted(true);
        progressBar.setBounds(80, 80, 500, 80);
        visualizacao = new VisualizaBll();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        progressBar = new javax.swing.JProgressBar();
        btnStop = new javax.swing.JButton();
        lblFilmeEscolhido = new javax.swing.JLabel();
        btnStop1 = new javax.swing.JButton();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Filme");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Vendo Filme......");

        btnStop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/torrent/icons/iconfinder_Education-Filled_12_3672897 (1).png"))); // NOI18N
        btnStop.setText("VER FILME");
        btnStop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStopActionPerformed(evt);
            }
        });

        lblFilmeEscolhido.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblFilmeEscolhido.setForeground(new java.awt.Color(255, 51, 51));
        lblFilmeEscolhido.setText("jLabel2");

        btnStop1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/torrent/icons/excluir.png"))); // NOI18N
        btnStop1.setText("Stop");
        btnStop1.setEnabled(false);
        btnStop1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStop1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(progressBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnStop, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnStop1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(lblFilmeEscolhido)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblFilmeEscolhido))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(progressBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnStop1, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                    .addComponent(btnStop, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        jMenu3.setText("Menu");

        jMenuItem1.setText("Menu Principal");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuBar2.add(jMenu3);

        jMenu4.setText("Relatorios");

        jMenuItem2.setText("Relatorio de Visualizações");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem2);

        jMenuBar2.add(jMenu4);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnStopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStopActionPerformed
        btnStop1.setEnabled(true);
        timer.start();
        btnStop.setEnabled(false);
    }//GEN-LAST:event_btnStopActionPerformed

    private void btnStop1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStop1ActionPerformed
        contOld = timer.cont;
        timer.cont = 100;
        visuCompelto = false;
        System.out.println(contOld);
        try {
            incluirVisualiza();
        } catch (Exception ex) {
            Logger.getLogger(FilmeProgress.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnStop1ActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        FilmeProgress progress = null;
        try {
            progress = new FilmeProgress();
        } catch (Exception ex) {
            Logger.getLogger(FilmeProgress.class.getName()).log(Level.SEVERE, null, ex);
        }
        lblFilmeEscolhido.setText(tituloDoFilme);
    }//GEN-LAST:event_formWindowActivated

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        try {
            MenuView menu = new MenuView();
            menu.setVisible(true);
            menu.userTransfer(nomeUser);
            dispose();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        try {
            RelacaoVisualizados rela = new RelacaoVisualizados();
            rela.setVisible(true);
            rela.nomeUser = nomeUser;
            dispose();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    public void incluirVisualiza() throws Exception {
        FilmesDal fil = new FilmesDal();
        UsuarioDal user = new UsuarioDal();
        VisualizaModel visu = new VisualizaModel();
        
        visu.setFime(fil.getFilmesById(idFilme));
        visu.setUsuario(user.getUsuarioById(idUser));
        visu.setVisuCompleto(visuCompelto);
        System.out.println(visu);
        visualizacao.adicionarVisualizacao(visu);
    }

    public static void main(String args[]) throws InterruptedException, Exception {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FilmeProgress.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FilmeProgress.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FilmeProgress.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FilmeProgress.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        FilmeProgress progress = new FilmeProgress();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                progress.setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnStop;
    private javax.swing.JButton btnStop1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblFilmeEscolhido;
    private javax.swing.JProgressBar progressBar;
    // End of variables declaration//GEN-END:variables

    private int stop() {
        return 100;
    }

    public void reciveDate(String date) {
        dateGeral = date;
    }

    public String sendDate(String date) {
        return date;
    }

    public class TimerVis extends Thread {

        int cont = 1;

        public void run() {
            while (progressBar.getValue() < 100) {
                try {
                    sleep(200);
                    progressBar.setValue(progressBar.getValue() + cont);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            int ok = JOptionPane.showConfirmDialog(null, "O Filme Acabou! Sair? ", "Filme", JOptionPane.OK_OPTION);
            try {
                if (ok != -1) {
                    incluirVisualiza();
                }
            } catch (Exception ex) {
                Logger.getLogger(FilmeProgress.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (ok == 0) {
                try {
                    MenuView menu = new MenuView();
                    menu.setVisible(true);
                    menu.userTransfer(nomeUser);
                    dispose();
                } catch (Exception e) {
                }
            } else {
                btnStop.setEnabled(false);
                btnStop1.setEnabled(false);
            }
        }
    }
}
