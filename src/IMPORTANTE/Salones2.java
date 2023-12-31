
package IMPORTANTE;

import DTOS.SalonesDto;
import DAOS.SalonesDao;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Salones2 extends javax.swing.JInternalFrame {

    public Salones2() {
        initComponents();
        
        
        mostrarBuscar("");
        
        
   
       
    }
    
    
    public void addplaceholder(JTextField textField){
        Font font= textField.getFont();
        font = font.deriveFont(Font.ITALIC);
        textField.setFont(font);
        textField.setForeground(Color.gray);
       
    }
    public void deleteplaceholder(JTextField textField){
        Font font= textField.getFont();
        font = font.deriveFont(Font.PLAIN|Font.BOLD);
        textField.setFont(font);
        textField.setForeground(Color.black);
    }

    public void mostrarBuscar(String salon) {
        DefaultTableModel miModelo;
        SalonesDao salDao = new SalonesDao();
        SalonesDto salDto = new SalonesDto();
        salDto.setCodigoSalon(salon);
                //.setUsuario(salon);
        miModelo = salDao.mostrarSalones(salDto);
                //.mostrarUsuarios(salDto);
        tblSalones.setModel(miModelo);

    }

   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSalones = new javax.swing.JTable();
        txtBuscarSalon = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setPreferredSize(new java.awt.Dimension(909, 480));

        jPanel2.setBackground(new java.awt.Color(102, 255, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "SALONES", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 3, 12), new java.awt.Color(255, 0, 0))); // NOI18N

        tblSalones.setBackground(new java.awt.Color(153, 153, 255));
        tblSalones.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        tblSalones.setForeground(new java.awt.Color(0, 0, 0));
        tblSalones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOMBRE", "USUARIO", "NFicha", "NControl", "Carrera", "Turno", "Puesto", "Institucion", "Escuela", "PERFIL"
            }
        ));
        tblSalones.setSelectionBackground(new java.awt.Color(255, 102, 255));
        tblSalones.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tblSalones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSalonesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblSalones);

        txtBuscarSalon.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtBuscarSalonFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtBuscarSalonFocusLost(evt);
            }
        });
        txtBuscarSalon.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscarSalonKeyTyped(evt);
            }
        });

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/consulta.png"))); // NOI18N
        btnBuscar.setBorderPainted(false);
        btnBuscar.setContentAreaFilled(false);
        btnBuscar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/consulta.png"))); // NOI18N
        btnBuscar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/consulta2.png"))); // NOI18N
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 805, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtBuscarSalon, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscarSalon, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblSalonesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSalonesMouseClicked
        // TODO add your handling code here:
        /**int fila = tblSalones.getSelectedRow();
        txtIdSalon.setText(tblSalones.getValueAt(fila, 0).toString());
        txtCodigo.setText(tblSalones.getValueAt(fila, 1).toString());
        txtPizarron.setText(tblSalones.getValueAt(fila, 2).toString());
        txtF.setText(tblSalones.getValueAt(fila, 3).toString());
        txtSilla.setText(tblSalones.getValueAt(fila, 4).toString());
        txtFS.setText(tblSalones.getValueAt(fila, 5).toString());
        txtMesa.setText(tblSalones.getValueAt(fila, 6).toString());
        txtFM.setText(tblSalones.getValueAt(fila, 7).toString());
        txtPC.setText(tblSalones.getValueAt(fila, 8).toString());
        txtFPC.setText(tblSalones.getValueAt(fila, 9).toString());
        txtProyec.setText(tblSalones.getValueAt(fila, 10).toString());
        txtFPRO.setText(tblSalones.getValueAt(fila, 11).toString());
        txtBote.setText(tblSalones.getValueAt(fila, 12).toString());
        txtFBB.setText(tblSalones.getValueAt(fila, 13).toString());
        txtMesaban.setText(tblSalones.getValueAt(fila, 14).toString());
        txtFMB.setText(tblSalones.getValueAt(fila, 15).toString());
        txtClima.setText(tblSalones.getValueAt(fila, 16).toString());
        txtLuz.setText(tblSalones.getValueAt(fila, 17).toString());
        txtUbi.setText(tblSalones.getValueAt(fila, 18).toString());
        txtObser.setText(tblSalones.getValueAt(fila, 19).toString());
        */
                
    }//GEN-LAST:event_tblSalonesMouseClicked

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        
        mostrarBuscar(txtBuscarSalon.getText());
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtBuscarSalonKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarSalonKeyTyped
         
    }//GEN-LAST:event_txtBuscarSalonKeyTyped

    private void txtBuscarSalonFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBuscarSalonFocusGained
       if(txtBuscarSalon.getText().equals("Ingrese el Salón")){
         txtBuscarSalon.setText(null);
         txtBuscarSalon.requestFocus();
         deleteplaceholder(txtBuscarSalon);
        
        
     }
    }//GEN-LAST:event_txtBuscarSalonFocusGained

    private void txtBuscarSalonFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBuscarSalonFocusLost
        if(txtBuscarSalon.getText().length()==0){
          addplaceholder(txtBuscarSalon);
          txtBuscarSalon.setText("Ingrese el Salón");
      }
    }//GEN-LAST:event_txtBuscarSalonFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblSalones;
    private javax.swing.JTextField txtBuscarSalon;
    // End of variables declaration//GEN-END:variables

}
