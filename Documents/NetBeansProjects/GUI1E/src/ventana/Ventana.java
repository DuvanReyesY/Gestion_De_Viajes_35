
package ventana;

/**
 *
 * @author USER
 */
public class Ventana extends javax.swing.JFrame {

    /**
     * Creates new form Ventana
     */
    public Ventana() {
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

        btnAceptar = new javax.swing.JButton();
        chkPerro = new javax.swing.JCheckBox();
        chkGato = new javax.swing.JCheckBox();
        chkRaton = new javax.swing.JCheckBox();
        jPanel1 = new javax.swing.JPanel();
        etiResultado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 255));

        btnAceptar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        chkPerro.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        chkPerro.setText("Perro");
        chkPerro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkPerroActionPerformed(evt);
            }
        });

        chkGato.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        chkGato.setText("Gato");
        chkGato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkGatoActionPerformed(evt);
            }
        });

        chkRaton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        chkRaton.setText("Raton");
        chkRaton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkRatonActionPerformed(evt);
            }
        });

        etiResultado.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        etiResultado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        etiResultado.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                etiResultadoPropertyChange(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(etiResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(120, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etiResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkRaton, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chkGato, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chkPerro, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(chkPerro, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(chkGato, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(chkRaton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
                  String mensaje = "Animales elegidos: ";
                  if (chkPerro.isSelected()) {
                       mensaje=mensaje+"Perro ";
                  }     
                  if (chkGato.isSelected()) {
                      mensaje=mensaje+"Gato ";
                  }   
                  if (chkRaton.isSelected()) {
                      mensaje=mensaje+"Raton ";
                  }
                   etiResultado.setText(mensaje.toString());
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void chkRatonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkRatonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkRatonActionPerformed

    private void chkGatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkGatoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkGatoActionPerformed

    private void chkPerroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkPerroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkPerroActionPerformed

    private void etiResultadoPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_etiResultadoPropertyChange

    }//GEN-LAST:event_etiResultadoPropertyChange

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JCheckBox chkGato;
    private javax.swing.JCheckBox chkPerro;
    private javax.swing.JCheckBox chkRaton;
    private javax.swing.JLabel etiResultado;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
