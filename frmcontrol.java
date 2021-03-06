/*
    Curso: 6-1 Programación para Redes
    Autores: Sanizaca Bryan, Mirabá Washington Jiménez Anthony
    Fecha:10-01-2021 
 */
package ctruser;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class frmcontrol extends javax.swing.JFrame {
    private static Scanner sc;
    private static int intentos;
    private static String user, password;
    /**
     * Creates new form frmusuario
     */
    public frmcontrol() {
        initComponents();
        setLocationRelativeTo (null);
        rootPane.setDefaultButton(btnIngresar);   
    }
    public static void setIntentos(int intentos) {
        frmcontrol.intentos = intentos;
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
        lbluser = new javax.swing.JLabel();
        lblpass = new javax.swing.JLabel();
        txtuser = new javax.swing.JTextField();
        txtpass = new javax.swing.JPasswordField();
        btnCancelar = new javax.swing.JButton();
        btnIngresar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbluser.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lbluser.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbluser.setText("Usuario:");
        lbluser.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(lbluser, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 200, 150, 30));

        lblpass.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblpass.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblpass.setText("Contraseña:");
        lblpass.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(lblpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(423, 250, 150, 30));

        txtuser.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txtuser.setToolTipText("Agregar su usuario");
        txtuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtuserActionPerformed(evt);
            }
        });
        jPanel1.add(txtuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 200, 180, 30));

        txtpass.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txtpass.setToolTipText("Agregar su contraseña");
        txtpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpassActionPerformed(evt);
            }
        });
        jPanel1.add(txtpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 250, 180, 30));

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Cancelar.jpg"))); // NOI18N
        btnCancelar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 320, 160, 60));

        btnIngresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Ingresar.jpg"))); // NOI18N
        btnIngresar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        jPanel1.add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 320, 170, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Usuario.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 400, 310));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 770, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtuserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtuserActionPerformed

    private void txtpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpassActionPerformed

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
     FileReader fr=null;
        try {
            int nLineas=0;
            int i=0;
            String [] usuarios = null;  //Arreglo de tipo string 
            String linea;
            sc = new Scanner (new File("C:\\txt\\usuarios.txt"));
            File f = new File("C:/txt/usuarios.txt");
            fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            
            try {
                while ((linea=br.readLine())!=null){
                    nLineas++;
                }} catch (IOException ex) {
                Logger.getLogger(frmcontrol.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            usuarios=new String [nLineas]; // el tamano del arreglo
            
            while (sc.hasNextLine()){
                 usuarios[i++] = sc.nextLine();
            }
            intentos++;
            user = txtuser.getText();
            password= txtpass.getText();
            
             seguridad s = new seguridad ();
             s.validarUsuario(usuarios, user, password, intentos);
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(frmcontrol.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fr.close();
            } catch (IOException ex) {
                Logger.getLogger(frmcontrol.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        if (intentos==0)this.dispose(); // se descargue de memoria
         
    
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(frmcontrol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmcontrol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmcontrol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmcontrol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmcontrol().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblpass;
    private javax.swing.JLabel lbluser;
    private javax.swing.JPasswordField txtpass;
    private javax.swing.JTextField txtuser;
    // End of variables declaration//GEN-END:variables
}
