package tela_opcoes;
import java.awt.event.KeyEvent;
import opcoes.Calculo_Lucro;
import opcoes.Simulaçao_Produçao;


public class Tela_Opcoes extends javax.swing.JFrame {

    public Tela_Opcoes() {
        setExtendedState(MAXIMIZED_BOTH);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Painel_fundo = new javax.swing.JPanel();
        Botao1 = new javax.swing.JButton();
        Texto_Bt1 = new javax.swing.JLabel();
        Botao2 = new javax.swing.JButton();
        Texto_Bt2 = new javax.swing.JLabel();
        Botao3 = new javax.swing.JButton();
        Texto_Bt3 = new javax.swing.JLabel();
        Botao4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });
        getContentPane().setLayout(null);

        Painel_fundo.setBackground(new java.awt.Color(0, 0, 51));
        Painel_fundo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));

        Botao1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Cliente\\Downloads\\coffee-data-device-1080849.jpg")); // NOI18N
        Botao1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao1ActionPerformed(evt);
            }
        });

        Texto_Bt1.setBackground(new java.awt.Color(255, 255, 255));
        Texto_Bt1.setFont(new java.awt.Font("Times New Roman", 1, 28)); // NOI18N
        Texto_Bt1.setForeground(new java.awt.Color(255, 255, 255));
        Texto_Bt1.setText("    Panilha Eletrônica");

        Botao2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Cliente\\Downloads\\bank-banking-banknote-262558.jpg")); // NOI18N
        Botao2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao2ActionPerformed(evt);
            }
        });

        Texto_Bt2.setFont(new java.awt.Font("Times New Roman", 1, 28)); // NOI18N
        Texto_Bt2.setForeground(new java.awt.Color(255, 255, 255));
        Texto_Bt2.setText("     Calculo de Lucro");

        Botao3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Cliente\\Downloads\\accounting-black-budget-53621.jpg")); // NOI18N

        Texto_Bt3.setFont(new java.awt.Font("Times New Roman", 1, 28)); // NOI18N
        Texto_Bt3.setForeground(new java.awt.Color(255, 255, 255));
        Texto_Bt3.setText("        Investimentos");

        Botao4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Cliente\\Downloads\\activity-blueprint-building-583393.jpg")); // NOI18N
        Botao4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao4ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Simulação de Produçao");

        javax.swing.GroupLayout Painel_fundoLayout = new javax.swing.GroupLayout(Painel_fundo);
        Painel_fundo.setLayout(Painel_fundoLayout);
        Painel_fundoLayout.setHorizontalGroup(
            Painel_fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel_fundoLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(Painel_fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Botao1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Texto_Bt1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addGroup(Painel_fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Botao2, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Texto_Bt2, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68)
                .addGroup(Painel_fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Botao3, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Texto_Bt3, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(Painel_fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Botao4, javax.swing.GroupLayout.PREFERRED_SIZE, 286, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(28, 28, 28))
        );
        Painel_fundoLayout.setVerticalGroup(
            Painel_fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel_fundoLayout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addGroup(Painel_fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Texto_Bt1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Texto_Bt2)
                    .addComponent(Texto_Bt3)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Painel_fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Botao1, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Botao2, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Botao3, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Botao4, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(244, Short.MAX_VALUE))
        );

        getContentPane().add(Painel_fundo);
        Painel_fundo.setBounds(0, 0, 1380, 780);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Botao2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao2ActionPerformed
        // TODO add your handling code here:
        new Calculo_Lucro().setVisible(true);
        dispose();
    }//GEN-LAST:event_Botao2ActionPerformed

    private void Botao1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao1ActionPerformed
        // TODO add your handling code here
        
    }//GEN-LAST:event_Botao1ActionPerformed

    private void Botao4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao4ActionPerformed
        // TODO add your handling code here:
        new Simulaçao_Produçao().setVisible(true);
        dispose();
    }//GEN-LAST:event_Botao4ActionPerformed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_formKeyPressed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            Tela_Opcoes tela_opcao = new Tela_Opcoes();
            tela_opcao.setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Botao1;
    private javax.swing.JButton Botao2;
    private javax.swing.JButton Botao3;
    private javax.swing.JButton Botao4;
    private javax.swing.JPanel Painel_fundo;
    private javax.swing.JLabel Texto_Bt1;
    private javax.swing.JLabel Texto_Bt2;
    private javax.swing.JLabel Texto_Bt3;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
