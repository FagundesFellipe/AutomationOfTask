package opcoes;

import tela_opcoes.Tela_Opcoes;
import opcao_calculo_lucro.Produtos_Ind;
import opcao_calculo_lucro.Lucro_Total;

public class Calculo_Lucro extends javax.swing.JFrame {

    public Calculo_Lucro() {
        setExtendedState(MAXIMIZED_BOTH);
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Painel_esquerda = new javax.swing.JPanel();
        Botao2 = new javax.swing.JButton();
        Botao3 = new javax.swing.JButton();
        Texto_Bt1 = new javax.swing.JLabel();
        Texto_bt1 = new javax.swing.JLabel();
        Botao1 = new javax.swing.JButton();
        Texto_Bt2 = new javax.swing.JLabel();
        Texto_Bt3 = new javax.swing.JLabel();
        Texto_bt3 = new javax.swing.JLabel();
        Painel_superior = new javax.swing.JPanel();
        botao1 = new javax.swing.JButton();
        texto_bt1 = new javax.swing.JLabel();
        texto_bt2 = new javax.swing.JLabel();
        botao2 = new javax.swing.JButton();
        botao3 = new javax.swing.JButton();
        texto_bt3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        Painel_esquerda.setBackground(new java.awt.Color(153, 153, 153));
        Painel_esquerda.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(102, 102, 102), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(102, 102, 102)));

        Botao2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logo-dinheiro-png-7 copy.png"))); // NOI18N
        Botao2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao2ActionPerformed(evt);
            }
        });

        Botao3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/33262.png"))); // NOI18N
        Botao3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao3ActionPerformed(evt);
            }
        });

        Texto_Bt1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Texto_Bt1.setText("  Lucro de Produtos ");

        Texto_bt1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Texto_bt1.setText("      individuais ");

        Botao1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/a.png"))); // NOI18N
        Botao1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao1ActionPerformed(evt);
            }
        });

        Texto_Bt2.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        Texto_Bt2.setText("      Lucro Total");

        Texto_Bt3.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        Texto_Bt3.setText("   Voltar para tela ");

        Texto_bt3.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        Texto_bt3.setText("        de opçoes");

        javax.swing.GroupLayout Painel_esquerdaLayout = new javax.swing.GroupLayout(Painel_esquerda);
        Painel_esquerda.setLayout(Painel_esquerdaLayout);
        Painel_esquerdaLayout.setHorizontalGroup(
            Painel_esquerdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Texto_Bt1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Painel_esquerdaLayout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(Botao2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
            .addGroup(Painel_esquerdaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Texto_bt1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(Texto_Bt2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Texto_Bt3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Texto_bt3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(Painel_esquerdaLayout.createSequentialGroup()
                .addGroup(Painel_esquerdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Painel_esquerdaLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(Botao1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Painel_esquerdaLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(Botao3, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Painel_esquerdaLayout.setVerticalGroup(
            Painel_esquerdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel_esquerdaLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(Botao1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Texto_Bt1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Texto_bt1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(Botao2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Texto_Bt2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(Botao3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Texto_Bt3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Texto_bt3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        getContentPane().add(Painel_esquerda);
        Painel_esquerda.setBounds(0, 110, 170, 660);

        Painel_superior.setBackground(new java.awt.Color(153, 153, 153));
        Painel_superior.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 153, 153), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(153, 153, 153)));

        botao1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/editar.png"))); // NOI18N

        texto_bt1.setFont(new java.awt.Font("Times New Roman", 1, 21)); // NOI18N
        texto_bt1.setText("Editar produtos ");

        texto_bt2.setFont(new java.awt.Font("Times New Roman", 1, 21)); // NOI18N
        texto_bt2.setText("Exibir informações");

        botao2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/info.png"))); // NOI18N

        botao3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/graficos.png"))); // NOI18N

        texto_bt3.setFont(new java.awt.Font("Times New Roman", 1, 21)); // NOI18N
        texto_bt3.setText("Análise em gráficos");

        javax.swing.GroupLayout Painel_superiorLayout = new javax.swing.GroupLayout(Painel_superior);
        Painel_superior.setLayout(Painel_superiorLayout);
        Painel_superiorLayout.setHorizontalGroup(
            Painel_superiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel_superiorLayout.createSequentialGroup()
                .addGap(168, 168, 168)
                .addComponent(botao1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(texto_bt1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(126, 126, 126)
                .addComponent(botao2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(texto_bt2, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(193, 193, 193)
                .addComponent(botao3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(texto_bt3, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(109, Short.MAX_VALUE))
        );
        Painel_superiorLayout.setVerticalGroup(
            Painel_superiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel_superiorLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(Painel_superiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botao1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(texto_bt1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(texto_bt2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botao2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botao3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(texto_bt3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        getContentPane().add(Painel_superior);
        Painel_superior.setBounds(0, 0, 1370, 110);

        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(210, 130, 1120, 620);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/addition-black-and-white-black-and-white-374918.jpg"))); // NOI18N
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 2));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(300, 180, 360, 230);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/calculate-calculator-class-5775.jpg"))); // NOI18N
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 2));
        getContentPane().add(jLabel3);
        jLabel3.setBounds(850, 170, 380, 250);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/albert-einstein-blackboard-chalk-714699.jpg"))); // NOI18N
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 2));
        getContentPane().add(jLabel4);
        jLabel4.setBounds(850, 490, 260, 210);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/albert-einstein-alphabet-black-and-white-256369.jpg"))); // NOI18N
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 2));
        getContentPane().add(jLabel5);
        jLabel5.setBounds(240, 490, 380, 210);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Botao3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao3ActionPerformed
        // TODO add your handling code here:
        new Tela_Opcoes().setVisible(true);
        dispose();
    }//GEN-LAST:event_Botao3ActionPerformed

    private void Botao1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao1ActionPerformed
        // TODO add your handling code here:
        new Produtos_Ind().setVisible(true);
        dispose();
    }//GEN-LAST:event_Botao1ActionPerformed

    private void Botao2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao2ActionPerformed
        // TODO add your handling code here:
        new Lucro_Total().setVisible(true);
        dispose();
    }//GEN-LAST:event_Botao2ActionPerformed


    public static void main(String args[]) {
  
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Calculo_Lucro calculo_lucro = new Calculo_Lucro();
                calculo_lucro.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Botao1;
    private javax.swing.JButton Botao2;
    private javax.swing.JButton Botao3;
    private javax.swing.JPanel Painel_esquerda;
    private javax.swing.JPanel Painel_superior;
    private javax.swing.JLabel Texto_Bt1;
    private javax.swing.JLabel Texto_Bt2;
    private javax.swing.JLabel Texto_Bt3;
    private javax.swing.JLabel Texto_bt1;
    private javax.swing.JLabel Texto_bt3;
    private javax.swing.JButton botao1;
    private javax.swing.JButton botao2;
    private javax.swing.JButton botao3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel texto_bt1;
    private javax.swing.JLabel texto_bt2;
    private javax.swing.JLabel texto_bt3;
    // End of variables declaration//GEN-END:variables
}
