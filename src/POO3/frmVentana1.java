
package POO3;

import javax.swing.JOptionPane;


//Tengo una clase frmVentana1 que hereda de javax.swing.JFrame
public class frmVentana1 extends javax.swing.JFrame
{
    
    //Dispositivo dispositivo = new Dispositivo();

    //Constructor de la Ventana 1
    public frmVentana1() 
    {
        initComponents();//Aqui manda a llamar a initComponents es un metodo que se encuentra oculto en el Generate Code
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtfTipo = new javax.swing.JTextField();
        jtfFolio = new javax.swing.JTextField();
        jtfMagnitud = new javax.swing.JTextField();
        jbnInsertar = new javax.swing.JButton();
        jbnConsultar = new javax.swing.JButton();
        jbnLimpiar = new javax.swing.JButton();
        jbnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("DISPOSITIVOS");
        jLabel1.setToolTipText("");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Ingrese el tipo:");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Ingrese el folio:");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Ingrese la magnitud: ");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel5.setText("Ingrese los datos del Dispositivo");

        jtfTipo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jtfTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfTipoActionPerformed(evt);
            }
        });

        jtfFolio.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jtfMagnitud.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jbnInsertar.setText("Insertar");
        jbnInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnInsertarActionPerformed(evt);
            }
        });

        jbnConsultar.setText("Consultar");
        jbnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnConsultarActionPerformed(evt);
            }
        });

        jbnLimpiar.setText("Limpiar");
        jbnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnLimpiarActionPerformed(evt);
            }
        });

        jbnSalir.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jbnSalir.setText("Salir");
        jbnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(324, 324, 324)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(18, 18, 18)
                                    .addComponent(jtfTipo))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(18, 18, 18)
                                    .addComponent(jtfFolio, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel5)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jbnInsertar)
                                        .addComponent(jLabel4))
                                    .addGap(18, 18, 18)
                                    .addComponent(jtfMagnitud)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 291, Short.MAX_VALUE)
                                .addComponent(jbnConsultar)
                                .addGap(135, 135, 135)
                                .addComponent(jbnLimpiar)))))
                .addGap(89, 89, 89))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jbnSalir)
                .addGap(49, 49, 49))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jbnSalir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addComponent(jLabel5)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtfTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtfFolio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtfMagnitud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbnInsertar)
                    .addComponent(jbnLimpiar)
                    .addComponent(jbnConsultar))
                .addContainerGap(64, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Creacion del objeto
    Dispositivo objeto = new Dispositivo(); 
    
    
    //EVENTO Insertar 
    private void jbnInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnInsertarActionPerformed
        // TODO add your handling code here:
        /*Se obtienen los datos del registro y los guarda en un objeto de tipo Dispositivo
        Los almacena en un arreglo de tipo Dispositivo*/
        
                 
        
        //Los datos en la vista estan almacenados en las varibles
        String tipoString = jtfTipo.getText();
        objeto.setTipo(tipoString);
        String folioString = jtfFolio.getText();
        objeto.setFolio(folioString);
        float magnitudFloat = Float.parseFloat(jtfMagnitud.getText());
        objeto.setMedidaPantalla(magnitudFloat);
        
        /*String magnitudString = jtfMagnitud.getText();
        float magnitudFloat = Float.parseFloat(magnitudString);*/
       
        
        //Esto hace que cuando se registre un usuario se ponga en blanco
        jtfTipo.setText("");
        jtfFolio.setText("");
        jtfMagnitud.setText("");
        
        mensajeDeAlerta("Usuario Registrado" , "Registro" );
        
    }//GEN-LAST:event_jbnInsertarActionPerformed

    public static void mensajeDeAlerta(String mensaje, String titulo)
    {
        javax.swing.JOptionPane.showMessageDialog(null, mensaje, titulo, javax.swing.JOptionPane.INFORMATION_MESSAGE);
    }
    
    
    
    //EVENTO Consultar
    private void jbnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnConsultarActionPerformed
        // TODO add your handling code here:
        
        this.jtfTipo.setText(objeto.getTipo());
        this.jtfFolio.setText(objeto.getFolio());
        this.jtfMagnitud.setText(String.valueOf(objeto.getMedidaPantalla()));
        
        
        
    }//GEN-LAST:event_jbnConsultarActionPerformed
    
    //EVENTO limpiar
    private void jbnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnLimpiarActionPerformed
        // TODO add your handling code here:
         //Esto hace que cuando se registre un usuario se ponga en blanco
        jtfTipo.setText("");
        jtfFolio.setText("");
        jtfMagnitud.setText("");
    }//GEN-LAST:event_jbnLimpiarActionPerformed

    private void jbnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnSalirActionPerformed
        // TODO add your handling code here:
         dispose(); //Este metodo sirve para terminar el programa
    }//GEN-LAST:event_jbnSalirActionPerformed

    private void jtfTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfTipoActionPerformed


    public static void main(String args[]) 
    {
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
            java.util.logging.Logger.getLogger(frmVentana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmVentana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmVentana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmVentana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() //Con este metodo se visualiza todo mi programa
        {
            public void run() 
            {
                new frmVentana1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton jbnConsultar;
    private javax.swing.JButton jbnInsertar;
    private javax.swing.JButton jbnLimpiar;
    private javax.swing.JButton jbnSalir;
    private javax.swing.JTextField jtfFolio;
    private javax.swing.JTextField jtfMagnitud;
    private javax.swing.JTextField jtfTipo;
    // End of variables declaration//GEN-END:variables
}
