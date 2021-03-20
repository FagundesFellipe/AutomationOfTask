package opcao_calculo_lucro;

import java.awt.event.KeyEvent;


public class Lucro_Total extends javax.swing.JFrame {

    public Lucro_Total() {
        setExtendedState(MAXIMIZED_BOTH);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        imagem_superior = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        imagem_inferior = new javax.swing.JLabel();
        Painel_central = new javax.swing.JPanel();
        Mensagem1 = new javax.swing.JLabel();
        Mensagem2 = new javax.swing.JLabel();
        Item1 = new javax.swing.JLabel();
        Texto_item1 = new javax.swing.JTextField();
        Obrigatório1 = new javax.swing.JLabel();
        Item2 = new javax.swing.JLabel();
        Texto_item2 = new javax.swing.JTextField();
        Obrigatório2 = new javax.swing.JLabel();
        Item3 = new javax.swing.JLabel();
        Texto_Item3 = new javax.swing.JTextField();
        Item4 = new javax.swing.JLabel();
        Texto_Item4 = new javax.swing.JTextField();
        Item5 = new javax.swing.JLabel();
        Texto_Item5 = new javax.swing.JTextField();
        Item6 = new javax.swing.JLabel();
        Texto_Item6 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        imagem_superior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/011.png"))); // NOI18N
        getContentPane().add(imagem_superior);
        imagem_superior.setBounds(1090, 0, 240, 220);

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/wwp.png"))); // NOI18N
        getContentPane().add(logo);
        logo.setBounds(1060, 220, 302, 302);

        imagem_inferior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/011.png"))); // NOI18N
        getContentPane().add(imagem_inferior);
        imagem_inferior.setBounds(1080, 530, 290, 240);

        Painel_central.setBackground(new java.awt.Color(153, 153, 153));

        Mensagem1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        Mensagem1.setText("*Insira os dados pedidos a seguir para a realização do calculo requisitado");

        Mensagem2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Mensagem2.setText("*Os dados ja devem ter sido previamente calculados");

        Item1.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        Item1.setText("   Despesas Fixas:   R$");

        Texto_item1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Texto_item1ActionPerformed(evt);
            }
        });
        Texto_item1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Texto_item1KeyPressed(evt);
            }
        });

        Obrigatório1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Obrigatório1.setForeground(new java.awt.Color(153, 0, 0));
        Obrigatório1.setText("*Obrigatório");

        Item2.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        Item2.setText("   Receita Total:     R$");

        Texto_item2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Texto_item2KeyPressed(evt);
            }
        });

        Obrigatório2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Obrigatório2.setForeground(new java.awt.Color(153, 0, 0));
        Obrigatório2.setText("*Obrigatório");

        Item3.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        Item3.setText("     Item3:               R$");

        Texto_Item3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Texto_Item3KeyPressed(evt);
            }
        });

        Item4.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        Item4.setText("     Item 4:              R$");

        Texto_Item4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Texto_Item4KeyPressed(evt);
            }
        });

        Item5.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        Item5.setText("    Item 5:               R$");

        Texto_Item5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Texto_Item5KeyPressed(evt);
            }
        });

        Item6.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        Item6.setText("    Item 6:               R$");

        jButton1.setBackground(new java.awt.Color(102, 204, 255));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(153, 0, 0));
        jButton1.setText("Calcular");

        javax.swing.GroupLayout Painel_centralLayout = new javax.swing.GroupLayout(Painel_central);
        Painel_central.setLayout(Painel_centralLayout);
        Painel_centralLayout.setHorizontalGroup(
            Painel_centralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel_centralLayout.createSequentialGroup()
                .addGroup(Painel_centralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Painel_centralLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(Painel_centralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Mensagem1, javax.swing.GroupLayout.PREFERRED_SIZE, 777, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Mensagem2, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(Painel_centralLayout.createSequentialGroup()
                        .addGroup(Painel_centralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(Painel_centralLayout.createSequentialGroup()
                                .addComponent(Item6, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Texto_Item6, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE))
                            .addGroup(Painel_centralLayout.createSequentialGroup()
                                .addComponent(Item5, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Texto_Item5))
                            .addGroup(Painel_centralLayout.createSequentialGroup()
                                .addComponent(Item4, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Texto_Item4))
                            .addGroup(Painel_centralLayout.createSequentialGroup()
                                .addComponent(Item3, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Texto_Item3))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Painel_centralLayout.createSequentialGroup()
                                .addGroup(Painel_centralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(Item2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Item1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(Painel_centralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Texto_item1, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                                    .addComponent(Texto_item2))))
                        .addGap(18, 18, 18)
                        .addGroup(Painel_centralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Obrigatório1, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                            .addComponent(Obrigatório2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(283, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Painel_centralLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(131, 131, 131))
        );
        Painel_centralLayout.setVerticalGroup(
            Painel_centralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel_centralLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(Mensagem1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Mensagem2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addGroup(Painel_centralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Item1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Texto_item1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Obrigatório1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(Painel_centralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Item2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Texto_item2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Obrigatório2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(Painel_centralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Item3, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(Texto_Item3))
                .addGroup(Painel_centralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(Painel_centralLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(Item4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(Painel_centralLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(Texto_Item4)))
                .addGap(18, 18, 18)
                .addGroup(Painel_centralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Item5, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(Texto_Item5))
                .addGap(18, 18, 18)
                .addGroup(Painel_centralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Item6, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(Texto_Item6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 200, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74))
        );

        getContentPane().add(Painel_central);
        Painel_central.setBounds(0, 0, 1070, 770);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Texto_item1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Texto_item1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Texto_item1ActionPerformed

    private void Texto_item1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Texto_item1KeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
        Texto_item2.requestFocus();
        }
    }//GEN-LAST:event_Texto_item1KeyPressed

    private void Texto_item2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Texto_item2KeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
        Texto_Item3.requestFocus();
        }
    }//GEN-LAST:event_Texto_item2KeyPressed

    private void Texto_Item3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Texto_Item3KeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
        Texto_Item4.requestFocus();
        }
    }//GEN-LAST:event_Texto_Item3KeyPressed

    private void Texto_Item4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Texto_Item4KeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
        Texto_Item5.requestFocus();
        }
    }//GEN-LAST:event_Texto_Item4KeyPressed

    private void Texto_Item5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Texto_Item5KeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
        Texto_Item6.requestFocus();
        }
    }//GEN-LAST:event_Texto_Item5KeyPressed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Lucro_Total lucro_total = new Lucro_Total();
                lucro_total.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Item1;
    private javax.swing.JLabel Item2;
    private javax.swing.JLabel Item3;
    private javax.swing.JLabel Item4;
    private javax.swing.JLabel Item5;
    private javax.swing.JLabel Item6;
    private javax.swing.JLabel Mensagem1;
    private javax.swing.JLabel Mensagem2;
    private javax.swing.JLabel Obrigatório1;
    private javax.swing.JLabel Obrigatório2;
    private javax.swing.JPanel Painel_central;
    private javax.swing.JTextField Texto_Item3;
    private javax.swing.JTextField Texto_Item4;
    private javax.swing.JTextField Texto_Item5;
    private javax.swing.JTextField Texto_Item6;
    private javax.swing.JTextField Texto_item1;
    private javax.swing.JTextField Texto_item2;
    private javax.swing.JLabel imagem_inferior;
    private javax.swing.JLabel imagem_superior;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel logo;
    // End of variables declaration//GEN-END:variables
}
