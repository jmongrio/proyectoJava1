package GUI;

import Persona.Personas;
import Metodo.Metodos;
import Metodo.Tiquete;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class UI extends javax.swing.JFrame {
    Personas persona = new Personas();
    Tiquete tiquete = new Tiquete();
    Metodos metodo = new Metodos();
    
    DefaultTableModel model = new DefaultTableModel();

    /**
     * Creates new form UI
     */
    public UI() {
        initComponents();
        
        //Columnas
        model.addColumn("Nombre");
        model.addColumn("1er Apellido");
        model.addColumn("2do Apellido");
        model.addColumn("Pasaporte");
        model.addColumn("Destino");
        model.addColumn("Género");        
        model.addColumn("Asiento");
        model.addColumn("Edad");
        model.addColumn("Ciudadano Oro");
        model.addColumn("Reg. Pensión");
        model.addColumn("Costo Boleto");
        model.addColumn("Tiquete");
        this.tblContenido.setModel(model);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellido1 = new javax.swing.JTextField();
        txtApellido2 = new javax.swing.JTextField();
        txtPasaporte = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblContenido = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        spnEdad = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();
        cmbGenero = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        cmbAsiento = new javax.swing.JComboBox<>();
        cmbPension = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        cmbDestino = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        txtCiudadanoOro = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtCostoBoleto = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtTiquete = new javax.swing.JTextField();
        btnSalir = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Nombre:");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Primer apellido:");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Segundo apellido:");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Pasaporte:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtApellido1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtApellido2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPasaporte, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtApellido1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtApellido2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPasaporte, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        tblContenido.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "1er Apellido", "2do Apellido", "Pasaporte", "Destino", "Genero", "Asiento", "Edad", "Ciudadano Oro", "Reg. Pensión", "Costo Boleto", "Tiquete"
            }
        ));
        tblContenido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblContenidoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblContenido);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Edad:");

        spnEdad.setModel(new javax.swing.SpinnerNumberModel(1, 1, 115, 1));
        spnEdad.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnEdadStateChanged(evt);
            }
        });

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Género:");

        cmbGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Masculino", "Femenino", "Otro" }));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Asiento:");

        cmbAsiento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20" }));

        cmbPension.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Reg. Pensión", "Mag. Nacional", "CCSS", "No Aplica" }));
        cmbPension.setEnabled(false);

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Destino:");

        cmbDestino.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Panamá", "Nicaragua" }));
        cmbDestino.setToolTipText("PNA = 100 / NCA = 95\n");

        jLabel9.setText("Ciudadano Oro:");

        txtCiudadanoOro.setEditable(false);
        txtCiudadanoOro.setText("No");
        txtCiudadanoOro.setEnabled(false);

        jLabel10.setText("Costo boleto:");

        txtCostoBoleto.setEditable(false);
        txtCostoBoleto.setEnabled(false);

        jLabel11.setText("Tiquete:");

        txtTiquete.setEditable(false);
        txtTiquete.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmbDestino, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(spnEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmbGenero, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbAsiento, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCostoBoleto)
                            .addComponent(txtTiquete)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCiudadanoOro, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cmbPension, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbAsiento, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spnEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtCiudadanoOro, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(cmbPension, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCostoBoleto, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txtTiquete, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(96, Short.MAX_VALUE))
        );

        btnSalir.setText("Salir");
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalirMouseClicked(evt);
            }
        });

        btnRegistrar.setText("Registrar");
        btnRegistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegistrarMouseClicked(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditarMouseClicked(evt);
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
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 955, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSalir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnSalirMouseClicked
    
    private void btnRegistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarMouseClicked
        if(metodo.checkEspacios(txtApellido1.getText(), txtApellido2.getText(), txtNombre.getText(), txtPasaporte.getText(), cmbDestino.getSelectedIndex(), cmbGenero.getSelectedIndex()) == true)
        {
            establecerValores();
            agregarDatosTabla();
            restablecerValores();
        }
        else
        {
            metodo.checkEspacios(txtApellido1.getText(), txtApellido2.getText(), txtNombre.getText(), txtPasaporte.getText(), cmbDestino.getSelectedIndex(), cmbGenero.getSelectedIndex());
        }
        
    }//GEN-LAST:event_btnRegistrarMouseClicked

    private void spnEdadStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnEdadStateChanged
        persona.setDestino((String) cmbDestino.getSelectedItem());
        persona.setnAsiento(String.valueOf(cmbAsiento.getSelectedItem()));

        //checkBoleto(int selecDestino, String destino, int edad, double boletoNeto)
        persona.setcDelBoleto(tiquete.costoBoleto(cmbDestino.getSelectedIndex(), (int) spnEdad.getValue()));
        persona.setnTiquete(tiquete.generaTiquete(persona.getDestino(), persona.getnAsiento()));
        ciudadanoOro();
        datosTiquete();
        
    }//GEN-LAST:event_spnEdadStateChanged

    private void tblContenidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblContenidoMouseClicked
        int filaSeleccionada = tblContenido.getSelectedRow();
        
        txtNombre.setText(tblContenido.getValueAt(filaSeleccionada, 0).toString());//Nombre
        txtApellido1.setText(tblContenido.getValueAt(filaSeleccionada, 1).toString());//Apellido1
        txtApellido2.setText(tblContenido.getValueAt(filaSeleccionada, 2).toString());//Apellido2
        txtPasaporte.setText(tblContenido.getValueAt(filaSeleccionada, 3).toString());//Pasaporte
        cmbDestino.setSelectedItem(tblContenido.getValueAt(filaSeleccionada, 4));//Destino
        cmbGenero.setSelectedItem(tblContenido.getValueAt(filaSeleccionada, 5));//Genero
        cmbAsiento.setSelectedItem(tblContenido.getValueAt(filaSeleccionada, 6));//Asiento
        spnEdad.setValue(tblContenido.getValueAt(filaSeleccionada, 7));//Edad
        txtCiudadanoOro.setText(tblContenido.getValueAt(filaSeleccionada, 8).toString());//CiudadanoOro
        cmbPension.setSelectedItem(tblContenido.getValueAt(filaSeleccionada, 9));//Reg. Pension
        txtCostoBoleto.setText(tblContenido.getValueAt(filaSeleccionada, 10).toString());//Costo Boleto
        txtTiquete.setText(tblContenido.getValueAt(filaSeleccionada, 11).toString());//Tiquete
        
        fila = filaSeleccionada;
        
    }//GEN-LAST:event_tblContenidoMouseClicked

    private void btnEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseClicked
        establecerValores();
        modificarDatosTabla();
        restablecerValores();
    }//GEN-LAST:event_btnEditarMouseClicked

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
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UI().setVisible(true);
            }
        });
    }
    
    public void establecerValores()
    {
        persona.setNombre(txtNombre.getText());//Nombre
        persona.setApellido1(txtApellido1.getText());//Apellido1
        persona.setApellido2(txtApellido2.getText());//Apellido2
        persona.setnPasaporte(txtPasaporte.getText());//Pasaporte
        persona.setEdad((int) spnEdad.getValue());//Destino
        persona.setGenero((String) cmbGenero.getSelectedItem());//Genero
        persona.setnAsiento((String) cmbAsiento.getSelectedItem());//Asiento
        persona.setEdad((int) spnEdad.getValue());//Edad
        persona.setCiudadanoOro(txtCiudadanoOro.getText());//CiudadanoOro
        persona.setRegPension((String) cmbPension.getSelectedItem());//Reg. Pension
        persona.setcDelBoleto(Double.valueOf(txtCostoBoleto.getText()));//Costo Boleto
        persona.setnTiquete(txtTiquete.getText());//Tiquete

    }
    
    public void restablecerValores()
    {
        //Variables
        persona.setNombre("");//Nombre
        persona.setApellido1("");//Apellido1
        persona.setApellido2("");//Apellido2
        persona.setnPasaporte("");//Pasaporte
        persona.setDestino("");//Destino
        persona.setGenero("");//Genero
        persona.setnAsiento("");//Asiento
        persona.setEdad(0);//Edad
        persona.setCiudadanoOro("");//CiudadanoOro
        persona.setRegPension("");//Reg. Pension
        persona.setcDelBoleto(0);//Costo Boleto
        persona.setnTiquete("");//Tiquete
                
        //GUI
        txtNombre.setText("");//Nombre
        txtApellido1.setText("");//Apellido1
        txtApellido2.setText("");//Apellido2
        txtPasaporte.setText("");//Pasaporte
        cmbDestino.setSelectedIndex(0);//Destino
        cmbGenero.setSelectedIndex(0);//Genero
        cmbAsiento.setSelectedIndex(0);//Asiento
        spnEdad.setValue(1);//Edad
        //CiudadanoOro
        cmbPension.setSelectedIndex(0);//Reg. Pension
        //Costo Boleto
        //Tiquete
        
    }//Fin limpiarValores.

    public void ciudadanoOro()
    {
        if(((int)spnEdad.getValue()) >= 65)
        {
            persona.setCiudadanoOro("Si");
            txtCiudadanoOro.setText("Si");
            cmbPension.setEnabled(true);
        }
        else
        {
            persona.setCiudadanoOro("No");
            txtCiudadanoOro.setText("No");
            cmbPension.setSelectedItem("No Aplica");
            cmbPension.setEnabled(false);
            
        }//Fin if.
        
    }//Fin ciudadanoOro.
    
    public void agregarDatosTabla()
    {
        Object[] agregar = new Object[12];
        
        agregar[0] = persona.getNombre();//Nombre
        agregar[1] = persona.getApellido1();//Apellido1
        agregar[2] = persona.getApellido2();//Apellido2
        agregar[3] = persona.getnPasaporte();//Pasaporte
        agregar[4] = persona.getDestino();//Destino
        agregar[5] = persona.getGenero();//Genero
        agregar[6] = persona.getnAsiento();//Asiento
        agregar[7] = persona.getEdad();//Edad
        agregar[8] = persona.getCiudadanoOro();//CiudadanoOro
        agregar[9] = persona.getRegPension();//Reg. Pension
        agregar[10] = persona.getcDelBoleto();//Costo Boleto
        agregar[11] = persona.getnTiquete();//Tiquete

        model.addRow(agregar);
    }//Fin agregarDatostabla.
    
    int fila; //Guarda la fila.
    
    public void modificarDatosTabla()
    {
        establecerValores();
        
        Object[] editar = new Object[12];
        
        editar[0] = persona.getNombre();//Nombre
        editar[1] = persona.getApellido1();//Apellido1
        editar[2] = persona.getApellido2();//Apellido2
        editar[3] = persona.getnPasaporte();//Pasaporte
        editar[4] = persona.getDestino();//Destino
        editar[5] = persona.getGenero();//Genero
        editar[6] = persona.getnAsiento();//Asiento
        editar[7] = persona.getEdad();//Edad
        editar[8] = persona.getCiudadanoOro();//CiudadanoOro
        editar[9] = persona.getRegPension();//Reg. Pension
        editar[10] = persona.getcDelBoleto();//Costo Boleto
        editar[11] = persona.getnTiquete();//Tiquete
        
        for (int i = 0; i < tblContenido.getColumnCount(); i++) 
        {
            model.setValueAt(editar[i], fila, i);
        }//Fin for.

    }//Fin modificarDatosTabla.
    
    public void datosTiquete()
    {
        txtTiquete.setText(persona.getnTiquete());
        txtCostoBoleto.setText(String.valueOf(persona.getcDelBoleto()));
    }//Fin datosTiquete.

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cmbAsiento;
    private javax.swing.JComboBox<String> cmbDestino;
    private javax.swing.JComboBox<String> cmbGenero;
    private javax.swing.JComboBox<String> cmbPension;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner spnEdad;
    private javax.swing.JTable tblContenido;
    private javax.swing.JTextField txtApellido1;
    private javax.swing.JTextField txtApellido2;
    private javax.swing.JTextField txtCiudadanoOro;
    private javax.swing.JTextField txtCostoBoleto;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPasaporte;
    private javax.swing.JTextField txtTiquete;
    // End of variables declaration//GEN-END:variables
}
