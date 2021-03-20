package opcao_calculo_lucro;

import java.awt.event.KeyEvent;


public class Produtos_Ind extends javax.swing.JFrame {

    public Produtos_Ind() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Imagem_superior = new javax.swing.JLabel();
        Logo = new javax.swing.JLabel();
        Imagem_inferior = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Cabeçalho = new javax.swing.JLabel();
        Item1 = new javax.swing.JLabel();
        Texto_item1 = new javax.swing.JTextField();
        Item2 = new javax.swing.JLabel();
        Texto_item2 = new javax.swing.JTextField();
        Item3 = new javax.swing.JLabel();
        Texto_item3 = new javax.swing.JTextField();
        Item4 = new javax.swing.JLabel();
        Texto_item4 = new javax.swing.JTextField();
        Item5 = new javax.swing.JLabel();
        Texto_item5 = new javax.swing.JTextField();
        Item6 = new javax.swing.JLabel();
        Texto_item6 = new javax.swing.JTextField();
        Obrigatorio1 = new javax.swing.JLabel();
        Obrigatorio2 = new javax.swing.JLabel();
        Obrigatorio3 = new javax.swing.JLabel();
        Obrigatorio4 = new javax.swing.JLabel();
        Obrigatorio5 = new javax.swing.JLabel();
        Botao1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1366, 768));
        getContentPane().setLayout(null);

        Imagem_superior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/011.png"))); // NOI18N
        getContentPane().add(Imagem_superior);
        Imagem_superior.setBounds(1074, 0, 250, 230);

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/wwp.png"))); // NOI18N
        getContentPane().add(Logo);
        Logo.setBounds(1050, 240, 320, 300);

        Imagem_inferior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/011.png"))); // NOI18N
        getContentPane().add(Imagem_inferior);
        Imagem_inferior.setBounds(1090, 540, 230, 230);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        Cabeçalho.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        Cabeçalho.setText("* Insira as informaocões a seguir para a realizaçao dos calculos!");

        Item1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        Item1.setText("   Codigo do Produto:");

        Texto_item1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Texto_item1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Texto_item1KeyPressed(evt);
            }
        });

        Item2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        Item2.setText("       Categoria:");

        Texto_item2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Texto_item2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Texto_item2ActionPerformed(evt);
            }
        });
        Texto_item2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Texto_item2KeyPressed(evt);
            }
        });

        Item3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        Item3.setText("    Preço de venda: ");

        Texto_item3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Texto_item3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Texto_item3KeyPressed(evt);
            }
        });

        Item4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        Item4.setText("    Preço de custo:");

        Texto_item4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Texto_item4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Texto_item4KeyPressed(evt);
            }
        });

        Item5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        Item5.setText("    Unidades a ser calculadas:");

        Texto_item5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Texto_item5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Texto_item5KeyPressed(evt);
            }
        });

        Item6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        Item6.setText("    Estoque:");

        Texto_item6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        Obrigatorio1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Obrigatorio1.setText("* Obrigatorio");

        Obrigatorio2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Obrigatorio2.setText("* Obrigatório");

        Obrigatorio3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Obrigatorio3.setText("* Obrigatório");

        Obrigatorio4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Obrigatorio4.setText("* Obrigatório");

        Obrigatorio5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Obrigatorio5.setText("* Obrigatório");

        Botao1.setBackground(new java.awt.Color(153, 204, 255));
        Botao1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        Botao1.setForeground(new java.awt.Color(255, 0, 0));
        Botao1.setText("Calcular!");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Item5, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Texto_item5, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(Obrigatorio5, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Cabeçalho, javax.swing.GroupLayout.PREFERRED_SIZE, 669, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Item6, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Texto_item6, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(Item4, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Texto_item4, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Item3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Item2, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Texto_item2, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
                                    .addComponent(Texto_item3))))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Obrigatorio3, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Obrigatorio2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Obrigatorio4, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(Item1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Texto_item1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(Obrigatorio1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(360, 360, 360))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(Botao1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(92, 92, 92))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(Cabeçalho, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Item1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Texto_item1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Obrigatorio1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Item2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Texto_item2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Obrigatorio2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Item3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Texto_item3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Obrigatorio3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Item4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Texto_item4, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                    .addComponent(Obrigatorio4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Obrigatorio5, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Item5, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Texto_item5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(Item6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(Texto_item6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                .addComponent(Botao1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1050, 770);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Texto_item2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Texto_item2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Texto_item2ActionPerformed

    private void Texto_item1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Texto_item1KeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
        Texto_item2.requestFocus();
        }
    }//GEN-LAST:event_Texto_item1KeyPressed

    private void Texto_item2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Texto_item2KeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
        Texto_item3.requestFocus();
        }
    }//GEN-LAST:event_Texto_item2KeyPressed

    private void Texto_item3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Texto_item3KeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
        Texto_item4.requestFocus();
        }
    }//GEN-LAST:event_Texto_item3KeyPressed

    private void Texto_item4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Texto_item4KeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
        Texto_item5.requestFocus();
        }
    }//GEN-LAST:event_Texto_item4KeyPressed

    private void Texto_item5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Texto_item5KeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
        Texto_item6.requestFocus();
        }
    }//GEN-LAST:event_Texto_item5KeyPressed


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Produtos_Ind().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Botao1;
    private javax.swing.JLabel Cabeçalho;
    private javax.swing.JLabel Imagem_inferior;
    private javax.swing.JLabel Imagem_superior;
    private javax.swing.JLabel Item1;
    private javax.swing.JLabel Item2;
    private javax.swing.JLabel Item3;
    private javax.swing.JLabel Item4;
    private javax.swing.JLabel Item5;
    private javax.swing.JLabel Item6;
    private javax.swing.JLabel Logo;
    private javax.swing.JLabel Obrigatorio1;
    private javax.swing.JLabel Obrigatorio2;
    private javax.swing.JLabel Obrigatorio3;
    private javax.swing.JLabel Obrigatorio4;
    private javax.swing.JLabel Obrigatorio5;
    private javax.swing.JTextField Texto_item1;
    private javax.swing.JTextField Texto_item2;
    private javax.swing.JTextField Texto_item3;
    private javax.swing.JTextField Texto_item4;
    private javax.swing.JTextField Texto_item5;
    private javax.swing.JTextField Texto_item6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
