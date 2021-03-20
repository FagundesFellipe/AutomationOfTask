package opcoes;

public class Simulaçao_Produçao extends javax.swing.JFrame {


    public Simulaçao_Produçao() {
        setExtendedState(MAXIMIZED_BOTH);
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1366, 768));
        getContentPane().setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Cliente\\aTubeCatcher\\Desktop\\06 gif.gif")); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(330, 50, 870, 570);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               Simulaçao_Produçao simulacao_prod = new Simulaçao_Produçao();
               simulacao_prod.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
