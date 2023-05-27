

import java.sql.Connection; //biblioteca para conexao com o bd
import java.sql.DriverManager;// biblioteca para loging com o bd
import java.sql.PreparedStatement;//biblioteca para pacote de dados loging no bd
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.ResultSet;

public class TelaLoginMedico extends javax.swing.JFrame {

    /**
     * Creates new form TelaLoginMedico
     */
    public TelaLoginMedico() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNomeMedico = new javax.swing.JLabel();
        lblSenhaMedico = new javax.swing.JLabel();
        txtNomeMedico = new javax.swing.JTextField();
        txtSenhaMedico = new javax.swing.JTextField();
        btnEntrar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login Médico");
        getContentPane().setLayout(null);

        lblNomeMedico.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblNomeMedico.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNomeMedico.setText("Codigo Médico");
        lblNomeMedico.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(lblNomeMedico);
        lblNomeMedico.setBounds(60, 80, 120, 40);

        lblSenhaMedico.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblSenhaMedico.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSenhaMedico.setText("Senha");
        lblSenhaMedico.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(lblSenhaMedico);
        lblSenhaMedico.setBounds(60, 140, 120, 40);
        getContentPane().add(txtNomeMedico);
        txtNomeMedico.setBounds(210, 80, 200, 40);
        getContentPane().add(txtSenhaMedico);
        txtSenhaMedico.setBounds(210, 140, 200, 40);

        btnEntrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEntrar.setText("Entrar");
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEntrar);
        btnEntrar.setBounds(170, 230, 110, 50);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/subtela_medico.jpg"))); // NOI18N
        jLabel4.setText("icone");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 6, 500, 370);

        setSize(new java.awt.Dimension(516, 383));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        // TODO add your handling code here:
        
        try{
            
            Class.forName("com.mysql.cj.jdbc.Driver"); //carrega o driver conector J para criar conexao com o bd.
            Connection conexao_=DriverManager.getConnection("jdbc:mysql://localhost:3306/proj3sem", "root", "");
            PreparedStatement st_=conexao_.prepareStatement("select* from user where nome=? and senha=?");
            
            
            st_.setString(1,txtNomeMedico.getText());
            st_.setString(2,txtSenhaMedico.getText());
            
            ResultSet pacote_=st_.executeQuery(); //Linha para executar no bd a query
              if (pacote_.next()){
                
              
                new TelaBuscaProntuario().setVisible(true);// chama tela menu com vaiveis usuario e cargo
               
            
                } else{
                JOptionPane.showMessageDialog(null,"Usuario ou senha incorreto");
                            
                }
            
            
        } catch (ClassNotFoundException ex) {
            
           JOptionPane.showMessageDialog(null, "Erro de biblioteca");
            
        } catch (SQLException ex) {
            
           JOptionPane.showMessageDialog(null," Erro de Banco de Dado");
        } 
    }//GEN-LAST:event_btnEntrarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaLoginMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLoginMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLoginMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLoginMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLoginMedico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrar;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblNomeMedico;
    private javax.swing.JLabel lblSenhaMedico;
    private javax.swing.JTextField txtNomeMedico;
    private javax.swing.JTextField txtSenhaMedico;
    // End of variables declaration//GEN-END:variables
}
