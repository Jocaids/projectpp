
package FrontEnd;

import BackEnd.Enfermeiro;
import BackEnd.Hospital;
import BackEnd.Sistema;
import Serializacao.Serializacao;
import javax.swing.JOptionPane;

public class DadosPessoaisEnfermeiro extends javax.swing.JInternalFrame {
       private Sistema sistema;
       private Serializacao serializacao;
       private Enfermeiro enfermeiro;
       private Hospital hospital;
    
    public DadosPessoaisEnfermeiro(Sistema sistema, Enfermeiro enfermeiro, Hospital hospital, Serializacao serializacao) {
        initComponents();
        
        this.sistema = sistema;
        this.enfermeiro = enfermeiro;
        this.hospital = hospital;
        
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        
         txtUsername.setText(sistema.getEnfermeiroLigado().getNomeUtilizador());
        
        txtPassword.setText(sistema.getEnfermeiroLigado().getPassword());
        
        txtUsername.setEditable(false);
        txtPassword.setEditable(false);

    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        UsernameLabel = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        PasswordLabel = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        butEditarPassword = new javax.swing.JButton();
        butGuardar = new javax.swing.JButton();

        UsernameLabel.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 24)); // NOI18N
        UsernameLabel.setText("Username : ");

        txtUsername.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtUsername.setText("Username");

        PasswordLabel.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 24)); // NOI18N
        PasswordLabel.setText("Password : ");

        txtPassword.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtPassword.setText("Password");

        butEditarPassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_edit_24px_2.png"))); // NOI18N
        butEditarPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                butEditarPasswordMouseClicked(evt);
            }
        });

        butGuardar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        butGuardar.setText("Guardar");
        butGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(UsernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PasswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(butEditarPassword)))
                .addContainerGap(38, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(butGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(butEditarPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(UsernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PasswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 176, Short.MAX_VALUE)
                .addComponent(butGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void butEditarPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butEditarPasswordMouseClicked
        
        //botões visiveis
        txtPassword.setEditable(true);
        butGuardar.setVisible(true);
        txtPassword.setText("");
        txtPassword.requestFocus();
        butEditarPassword.setVisible(false);
    }//GEN-LAST:event_butEditarPasswordMouseClicked

    private void butGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butGuardarActionPerformed

        //Guardar Dados Editados
        butGuardar.setVisible(false);
        txtUsername.setEditable(false);
        txtPassword.setEditable(false);
        if(txtPassword.getText().length() == 0 || txtPassword.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Não introduziu a password!", "ERRO", JOptionPane.ERROR_MESSAGE);
            txtPassword.requestFocus();
            txtPassword.setEditable(true);
            butGuardar.setVisible(true);
        }else{
            sistema.getMedicoLigado().setPassword(txtPassword.getText());
            butEditarPassword.setVisible(true);
        }
        serializacao.guardar(sistema);
    }//GEN-LAST:event_butGuardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel PasswordLabel;
    private javax.swing.JLabel UsernameLabel;
    private javax.swing.JButton butEditarPassword;
    private javax.swing.JButton butGuardar;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
