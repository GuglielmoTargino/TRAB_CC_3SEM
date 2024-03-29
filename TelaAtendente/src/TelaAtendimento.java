
public class TelaAtendimento extends javax.swing.JFrame {

    /**
     * Creates new form TelaAtendimento
     */
    public TelaAtendimento() {
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

        lblCodigoProntuario = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        lblNCartaoSus = new javax.swing.JLabel();
        lblCpf = new javax.swing.JLabel();
        lblRg = new javax.swing.JLabel();
        lblSexo = new javax.swing.JLabel();
        lblRaca = new javax.swing.JLabel();
        lblDtNasc = new javax.swing.JLabel();
        txtCodigoProntuario = new javax.swing.JTextField();
        txtNome1 = new javax.swing.JTextField();
        txtNome2 = new javax.swing.JTextField();
        txtNome3 = new javax.swing.JTextField();
        txtNome4 = new javax.swing.JTextField();
        txtNome5 = new javax.swing.JTextField();
        txtNome6 = new javax.swing.JTextField();
        txtNome7 = new javax.swing.JTextField();
        lblMotivo = new javax.swing.JLabel();
        txtMotivo = new javax.swing.JTextField();
        btnBuscarUsuario = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        lblEndereco1 = new javax.swing.JLabel();
        txtNome8 = new javax.swing.JTextField();
        lblIconeatende = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela de Atendimento ao Cliente");
        getContentPane().setLayout(null);

        lblCodigoProntuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCodigoProntuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCodigoProntuario.setText("Cod.Prontuário");
        lblCodigoProntuario.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(lblCodigoProntuario);
        lblCodigoProntuario.setBounds(30, 350, 120, 30);

        lblNome.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblNome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNome.setText("Nome");
        lblNome.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(lblNome);
        lblNome.setBounds(30, 30, 100, 30);

        lblNCartaoSus.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblNCartaoSus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNCartaoSus.setText("N. Cart. SUS.");
        lblNCartaoSus.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(lblNCartaoSus);
        lblNCartaoSus.setBounds(30, 70, 100, 30);

        lblCpf.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCpf.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCpf.setText("CPF");
        lblCpf.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(lblCpf);
        lblCpf.setBounds(30, 110, 100, 30);

        lblRg.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblRg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRg.setText("RG");
        lblRg.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(lblRg);
        lblRg.setBounds(30, 150, 100, 30);

        lblSexo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblSexo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSexo.setText("Sexo");
        lblSexo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(lblSexo);
        lblSexo.setBounds(30, 190, 100, 30);

        lblRaca.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblRaca.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRaca.setText("Raça");
        lblRaca.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(lblRaca);
        lblRaca.setBounds(30, 230, 100, 30);

        lblDtNasc.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblDtNasc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDtNasc.setText("Dt.Nasc.");
        lblDtNasc.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(lblDtNasc);
        lblDtNasc.setBounds(30, 270, 100, 30);

        txtCodigoProntuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoProntuarioActionPerformed(evt);
            }
        });
        getContentPane().add(txtCodigoProntuario);
        txtCodigoProntuario.setBounds(160, 350, 200, 30);

        txtNome1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNome1ActionPerformed(evt);
            }
        });
        getContentPane().add(txtNome1);
        txtNome1.setBounds(140, 30, 220, 30);

        txtNome2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNome2ActionPerformed(evt);
            }
        });
        getContentPane().add(txtNome2);
        txtNome2.setBounds(140, 70, 220, 30);

        txtNome3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNome3ActionPerformed(evt);
            }
        });
        getContentPane().add(txtNome3);
        txtNome3.setBounds(140, 110, 220, 30);

        txtNome4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNome4ActionPerformed(evt);
            }
        });
        getContentPane().add(txtNome4);
        txtNome4.setBounds(140, 150, 220, 30);

        txtNome5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNome5ActionPerformed(evt);
            }
        });
        getContentPane().add(txtNome5);
        txtNome5.setBounds(140, 190, 220, 30);

        txtNome6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNome6ActionPerformed(evt);
            }
        });
        getContentPane().add(txtNome6);
        txtNome6.setBounds(140, 230, 220, 30);

        txtNome7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNome7ActionPerformed(evt);
            }
        });
        getContentPane().add(txtNome7);
        txtNome7.setBounds(140, 270, 220, 30);

        lblMotivo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblMotivo.setForeground(new java.awt.Color(51, 255, 255));
        lblMotivo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMotivo.setText("Motivo Atendimento.");
        lblMotivo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(lblMotivo);
        lblMotivo.setBounds(30, 400, 640, 30);

        txtMotivo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtMotivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMotivoActionPerformed(evt);
            }
        });
        getContentPane().add(txtMotivo);
        txtMotivo.setBounds(30, 435, 640, 100);

        btnBuscarUsuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBuscarUsuario.setText("Buscar Usuário");
        getContentPane().add(btnBuscarUsuario);
        btnBuscarUsuario.setBounds(470, 40, 150, 50);

        btnCadastrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCadastrar.setText("Cadastrar Usuário");
        getContentPane().add(btnCadastrar);
        btnCadastrar.setBounds(470, 110, 150, 50);

        btnAlterar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAlterar.setText("Alterar Usuário");
        getContentPane().add(btnAlterar);
        btnAlterar.setBounds(470, 180, 150, 50);

        lblEndereco1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEndereco1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEndereco1.setText("Endereço");
        lblEndereco1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(lblEndereco1);
        lblEndereco1.setBounds(30, 310, 100, 30);

        txtNome8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNome8ActionPerformed(evt);
            }
        });
        getContentPane().add(txtNome8);
        txtNome8.setBounds(140, 310, 220, 30);

        lblIconeatende.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/clinica-preco2.jpg"))); // NOI18N
        lblIconeatende.setText("icone");
        getContentPane().add(lblIconeatende);
        lblIconeatende.setBounds(10, 0, 700, 590);

        setSize(new java.awt.Dimension(748, 595));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodigoProntuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoProntuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoProntuarioActionPerformed

    private void txtNome1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNome1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNome1ActionPerformed

    private void txtNome2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNome2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNome2ActionPerformed

    private void txtNome3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNome3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNome3ActionPerformed

    private void txtNome4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNome4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNome4ActionPerformed

    private void txtNome5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNome5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNome5ActionPerformed

    private void txtNome6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNome6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNome6ActionPerformed

    private void txtNome7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNome7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNome7ActionPerformed

    private void txtMotivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMotivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMotivoActionPerformed

    private void txtNome8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNome8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNome8ActionPerformed

   


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnBuscarUsuario;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JLabel lblCodigoProntuario;
    private javax.swing.JLabel lblCpf;
    private javax.swing.JLabel lblDtNasc;
    private javax.swing.JLabel lblEndereco1;
    private javax.swing.JLabel lblIconeatende;
    private javax.swing.JLabel lblMotivo;
    private javax.swing.JLabel lblNCartaoSus;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblRaca;
    private javax.swing.JLabel lblRg;
    private javax.swing.JLabel lblSexo;
    private javax.swing.JTextField txtCodigoProntuario;
    private javax.swing.JTextField txtMotivo;
    private javax.swing.JTextField txtNome1;
    private javax.swing.JTextField txtNome2;
    private javax.swing.JTextField txtNome3;
    private javax.swing.JTextField txtNome4;
    private javax.swing.JTextField txtNome5;
    private javax.swing.JTextField txtNome6;
    private javax.swing.JTextField txtNome7;
    private javax.swing.JTextField txtNome8;
    // End of variables declaration//GEN-END:variables
}
