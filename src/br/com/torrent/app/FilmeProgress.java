package br.com.torrent.app;

import javax.swing.JOptionPane;

public class FilmeProgress extends javax.swing.JFrame {

    String dateGeral;

    public FilmeProgress() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        progressBar = new javax.swing.JProgressBar();
        btnStop = new javax.swing.JButton();
        lblProgresso = new javax.swing.JLabel();
        lblFilmeEscolhido = new javax.swing.JLabel();
        btnStop1 = new javax.swing.JButton();

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

        lblProgresso.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblProgresso.setForeground(new java.awt.Color(255, 51, 51));
        lblProgresso.setText("jLabel2");

        lblFilmeEscolhido.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblFilmeEscolhido.setForeground(new java.awt.Color(255, 51, 51));
        lblFilmeEscolhido.setText("jLabel2");

        btnStop1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/torrent/icons/excluir.png"))); // NOI18N
        btnStop1.setText("Stop");
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
                .addGap(80, 80, 80)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblFilmeEscolhido)
                .addGap(139, 139, 139))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(progressBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnStop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnStop1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(173, 173, 173)
                .addComponent(lblProgresso)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblFilmeEscolhido))
                .addGap(18, 18, 18)
                .addComponent(progressBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblProgresso)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnStop, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btnStop1, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE))
                .addContainerGap())
        );

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
        try {
            int cont = 0;
            int stopingPoint = 0;
            for (cont = 0; cont < 101; cont++) {
                try {
//                    Thread.sleep(100);
                    progressBar.setValue(cont);
                    lblProgresso.setText(String.valueOf(cont) + "%");
                    if (cont == 100) {
                        setVisible(false);
                        dispose();
                    }
                    if (btnStop.isVisible()) {
                        stopingPoint = cont;
                        cont = stop();
                        System.out.println(stopingPoint);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
//            if (stopingPoint >= 100) {
//                setVisible(false);
//                dispose();
//                JOptionPane.showMessageDialog(null, "O filme foi visualizado por completo", "Visualização", JOptionPane.INFORMATION_MESSAGE);
//            } else {
//                setVisible(false);
//                dispose();
//                JOptionPane.showMessageDialog(null, "O filme não foi visualizado por completo", "Visualização", JOptionPane.INFORMATION_MESSAGE);
//            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnStopActionPerformed

    private void btnStop1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStop1ActionPerformed
        btnStop.setVisible(true);
    }//GEN-LAST:event_btnStop1ActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        FilmeProgress progress = new FilmeProgress();
        progress.initComponents();
    }//GEN-LAST:event_formWindowActivated

    public static void main(String args[]) throws InterruptedException {

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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblFilmeEscolhido;
    private javax.swing.JLabel lblProgresso;
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
}
