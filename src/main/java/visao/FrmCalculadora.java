package visao;

import modelo.Calculadora;

public class FrmCalculadora extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public FrmCalculadora() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        JTFValorA = new javax.swing.JTextField();
        JTFValorB = new javax.swing.JTextField();
        JLResultado = new javax.swing.JLabel();
        JCOperacao = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        JBCalcular = new javax.swing.JButton();
        JBLimpar = new javax.swing.JButton();
        JBFechar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora simples");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(null);

        jLabel1.setText("Valor A:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(17, 18, 70, 16);

        jLabel2.setText("Valor B:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 130, 80, 16);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Resultado:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 190, 80, 16);
        jPanel1.add(JTFValorA);
        JTFValorA.setBounds(17, 35, 77, 22);
        jPanel1.add(JTFValorB);
        JTFValorB.setBounds(20, 150, 77, 22);

        JLResultado.setText("0.0");
        jPanel1.add(JLResultado);
        JLResultado.setBounds(20, 210, 80, 16);

        JCOperacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Adição", "Subtração", "Multiplicação", "Divisão" }));
        jPanel1.add(JCOperacao);
        JCOperacao.setBounds(20, 90, 106, 22);

        jLabel4.setText("Operação:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(20, 70, 80, 16);

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        JBCalcular.setText("Calcular");
        JBCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCalcularActionPerformed(evt);
            }
        });

        JBLimpar.setText("Limpar");
        JBLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBLimparActionPerformed(evt);
            }
        });

        JBFechar.setText("Fechar");
        JBFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBFecharActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(JBCalcular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JBLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JBFechar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(JBCalcular)
                .addGap(18, 18, 18)
                .addComponent(JBLimpar)
                .addGap(18, 18, 18)
                .addComponent(JBFechar)
                .addContainerGap(129, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCalcularActionPerformed
        // TODO add your handling code here:
        //Instância a Calculadora
        Calculadora calculadora = new Calculadora();
        //Recupera os valores das caixas de texto
        calculadora.setValorA(Double.parseDouble(JTFValorA.getText()));
        calculadora.setValorB(Double.parseDouble(JTFValorB.getText()));

        //Recupera o resultado da adição
        if (JCOperacao.getSelectedIndex() == 0) {
            JLResultado.setText("" + calculadora.getSoma());
        } else {
            //Recupera o resultado da subtração
            if (JCOperacao.getSelectedIndex() == 1) {
                JLResultado.setText("" + calculadora.getDiferenca());
            } else {
                //Recupera o resultado da multiplicação
                if (JCOperacao.getSelectedIndex() == 2) {
                    JLResultado.setText("" + calculadora.getProduto());
                } else {
                    //Recupera o resultado da divisão
                    JLResultado.setText("" + calculadora.getQuociente());
                }
            }
        }
    }//GEN-LAST:event_JBCalcularActionPerformed

    private void JBLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBLimparActionPerformed
        // TODO add your handling code here:
        //Limpa as caixas de texto e rótulos
        JTFValorA.setText("");
        JCOperacao.setSelectedIndex(0);
        JTFValorB.setText("");
        JLResultado.setText("0.0");

    }//GEN-LAST:event_JBLimparActionPerformed

    private void JBFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBFecharActionPerformed
        // TODO add your handling code here:
        //Encerra o programa
        System.exit(0);
    }//GEN-LAST:event_JBFecharActionPerformed

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
            java.util.logging.Logger.getLogger(FrmCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCalculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBCalcular;
    private javax.swing.JButton JBFechar;
    private javax.swing.JButton JBLimpar;
    private javax.swing.JComboBox<String> JCOperacao;
    private javax.swing.JLabel JLResultado;
    private javax.swing.JTextField JTFValorA;
    private javax.swing.JTextField JTFValorB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
