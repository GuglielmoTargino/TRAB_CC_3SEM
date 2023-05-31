
import javax.swing.JOptionPane;


public class TelaNotas extends javax.swing.JFrame {

    /**
     * Creates new form TelaNotas
     */
    public TelaNotas() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblFalta = new javax.swing.JLabel();
        txtFalta = new javax.swing.JTextField();
        lblAluno = new javax.swing.JLabel();
        lblDisciplina = new javax.swing.JLabel();
        lblAula = new javax.swing.JLabel();
        txtAluno = new javax.swing.JTextField();
        txtDisciplina = new javax.swing.JTextField();
        txtAula = new javax.swing.JTextField();
        btnResultado = new javax.swing.JButton();
        lblNota = new javax.swing.JLabel();
        txtNota = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        lblFalta.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblFalta.setText("N_Faltas");
        getContentPane().add(lblFalta);
        lblFalta.setBounds(20, 180, 70, 40);
        getContentPane().add(txtFalta);
        txtFalta.setBounds(130, 190, 100, 40);

        lblAluno.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblAluno.setText("Aluno");
        getContentPane().add(lblAluno);
        lblAluno.setBounds(20, 30, 70, 40);

        lblDisciplina.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblDisciplina.setText("Disciplina");
        getContentPane().add(lblDisciplina);
        lblDisciplina.setBounds(20, 80, 70, 40);

        lblAula.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblAula.setText("N_Aulas");
        getContentPane().add(lblAula);
        lblAula.setBounds(20, 130, 70, 40);
        getContentPane().add(txtAluno);
        txtAluno.setBounds(130, 22, 250, 40);
        getContentPane().add(txtDisciplina);
        txtDisciplina.setBounds(130, 80, 250, 40);

        txtAula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAulaActionPerformed(evt);
            }
        });
        getContentPane().add(txtAula);
        txtAula.setBounds(130, 130, 100, 40);

        btnResultado.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnResultado.setText("Resultado");
        btnResultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResultadoActionPerformed(evt);
            }
        });
        getContentPane().add(btnResultado);
        btnResultado.setBounds(260, 190, 120, 40);

        lblNota.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblNota.setText("Nota");
        getContentPane().add(lblNota);
        lblNota.setBounds(20, 236, 90, 40);
        getContentPane().add(txtNota);
        txtNota.setBounds(130, 240, 100, 40);

        setSize(new java.awt.Dimension(507, 365));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtAulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAulaActionPerformed

    private void btnResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResultadoActionPerformed
        // TODO add your handling code here:
        double nota;
       int nFaltas, nAulas;
       String status;
       nota = Double.parseDouble(txtNota.getText());
       nFaltas = Integer.parseInt(txtFalta.getText());
       nAulas = Integer.parseInt(txtAula.getText());
       
       status=NotasService.verificarAprovacao(nota, nAulas, nFaltas);
       JOptionPane.showMessageDialog(null, status,+txtAluno.getText()+'vc foi'+status+'em'+txtDisciplina.getText()); 
       
        
    }//GEN-LAST:event_btnResultadoActionPerformed

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
            java.util.logging.Logger.getLogger(TelaNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaNotas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnResultado;
    private javax.swing.JLabel lblAluno;
    private javax.swing.JLabel lblAula;
    private javax.swing.JLabel lblDisciplina;
    private javax.swing.JLabel lblFalta;
    private javax.swing.JLabel lblNota;
    private javax.swing.JTextField txtAluno;
    private javax.swing.JTextField txtAula;
    private javax.swing.JTextField txtDisciplina;
    private javax.swing.JTextField txtFalta;
    private javax.swing.JTextField txtNota;
    // End of variables declaration//GEN-END:variables
}
