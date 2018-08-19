/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import Datos.vcliente;
import Logica.fcliente;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author daniel
 */
public class jfrmCliente extends javax.swing.JInternalFrame {

    /**
     * Creates new form jfrmCliente
     */
    public jfrmCliente() {
        initComponents();
        mostrar("");
        inhabilitar();
    }
    
    private String accion = "guardar";
    
    void ocultar_columnas(){
        tablaListaClientes.getColumnModel().getColumn(0).setMaxWidth(0);
        tablaListaClientes.getColumnModel().getColumn(0).setMinWidth(0);
        tablaListaClientes.getColumnModel().getColumn(0).setPreferredWidth(0);        
    } 
    
    void inhabilitar(){
        txtIdCliente.setVisible(false);
        txtNombreCliente.setEnabled(false);
        txtApellidosCliente.setEnabled(false);
        cboTipoDocCliente.setEnabled(false);
        txtNumeroDocCliente.setEnabled(false);
        txtDireccionCliente.setEnabled(false);
        txtTelefonoCliente.setEnabled(false);
        txtEmailCliente.setEnabled(false);
        txtCodigoCliente.setEnabled(false);
        
        
       
        
        
        btnGuardarC.setEnabled(false);
        btnCancelarC.setEnabled(false);
        btnBorrarC.setEnabled(false);
        
        txtIdCliente.setText("");
        txtNombreCliente.setText("");
        txtApellidosCliente.setText("");
        
        
        cboTipoDocCliente.setSelectedItem("");
        txtNumeroDocCliente.setText("");
        txtDireccionCliente.setText("");
        txtTelefonoCliente.setText("");
        txtEmailCliente.setText("");
        txtCodigoCliente.setText("");
        
    }
    
    void habilitar(){
        txtIdCliente.setVisible(true);
        txtNombreCliente.setEnabled(true);
        txtApellidosCliente.setEnabled(true);
        cboTipoDocCliente.setEnabled(true);
        txtNumeroDocCliente.setEnabled(true);
        txtDireccionCliente.setEnabled(true);
        txtTelefonoCliente.setEnabled(true);
        txtEmailCliente.setEnabled(true);
        txtCodigoCliente.setEnabled(true);
        
        
        btnBorrarC.setEnabled(true);
        btnGuardarC.setEnabled(true);
        btnCancelarC.setEnabled(true);
        
        txtIdCliente.setText("");
        txtNombreCliente.setText("");
        txtApellidosCliente.setText("");
        
        
        cboTipoDocCliente.setSelectedItem("");
        txtNumeroDocCliente.setText("");
        txtDireccionCliente.setText("");
        txtTelefonoCliente.setText("");
        txtEmailCliente.setText("");
        txtCodigoCliente.setText("");
        
    }
    
    void mostrar(String buscar){
        try {
            DefaultTableModel modelo;
            
            fcliente func = new fcliente();
            modelo = func.mostrar(buscar);
            tablaListaClientes.setModel(modelo);
            
            ocultar_columnas();
            lblTotalRegistrosC.setText("Total Register: " + Integer.toString(func.totalRegistros));
            
            
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(rootPane, e);
        }
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
        jLabel9 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        txtIdCliente = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtNombreCliente = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        btnGuardarC = new javax.swing.JButton();
        btnCancelarC = new javax.swing.JButton();
        btnNuevoC = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtNumeroDocCliente = new javax.swing.JTextField();
        cboTipoDocCliente = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        txtApellidosCliente = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtTelefonoCliente = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtDireccionCliente = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtEmailCliente = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtCodigoCliente = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        txtBuscarCliente = new javax.swing.JTextField();
        btnBuscarC = new javax.swing.JButton();
        btnBorrarC = new javax.swing.JButton();
        btnSalirC = new javax.swing.JButton();
        jScrollPane9 = new javax.swing.JScrollPane();
        tablaListaClientes = new javax.swing.JTable();
        lblTotalRegistrosC = new javax.swing.JLabel();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);

        jPanel1.setBackground(java.awt.Color.orange);

        jLabel9.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel9.setText("Client");

        jPanel4.setBackground(java.awt.Color.darkGray);
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registration of clients", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 12), java.awt.Color.white)); // NOI18N

        jLabel12.setForeground(java.awt.Color.white);
        jLabel12.setText("First Name:");

        txtNombreCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreClienteActionPerformed(evt);
            }
        });

        jLabel16.setForeground(java.awt.Color.white);
        jLabel16.setText("Type Doc:");

        btnGuardarC.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        btnGuardarC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/save.png"))); // NOI18N
        btnGuardarC.setText("SAVE");
        btnGuardarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarCActionPerformed(evt);
            }
        });

        btnCancelarC.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        btnCancelarC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/delete.png"))); // NOI18N
        btnCancelarC.setText("CANCEL");

        btnNuevoC.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        btnNuevoC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/add.png"))); // NOI18N
        btnNuevoC.setText("NEW");
        btnNuevoC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoCActionPerformed(evt);
            }
        });

        jLabel2.setForeground(java.awt.Color.white);
        jLabel2.setText("Num. Doc:");

        txtNumeroDocCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroDocClienteActionPerformed(evt);
            }
        });

        cboTipoDocCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CI", "TP", "DNI", "TI", "NN", " " }));
        cboTipoDocCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboTipoDocClienteActionPerformed(evt);
            }
        });

        jLabel13.setForeground(java.awt.Color.white);
        jLabel13.setText("Last Name:");

        txtApellidosCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidosClienteActionPerformed(evt);
            }
        });

        jLabel3.setForeground(java.awt.Color.white);
        jLabel3.setText("E-Mail:");

        txtTelefonoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoClienteActionPerformed(evt);
            }
        });

        jLabel4.setForeground(java.awt.Color.white);
        jLabel4.setText("Phone:");

        txtDireccionCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccionClienteActionPerformed(evt);
            }
        });

        jLabel5.setForeground(java.awt.Color.white);
        jLabel5.setText("Address:");

        txtEmailCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailClienteActionPerformed(evt);
            }
        });

        jLabel6.setForeground(java.awt.Color.white);
        jLabel6.setText("Code:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel6))
                                .addGap(11, 11, 11))
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDireccionCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEmailCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCodigoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(txtTelefonoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                                .addComponent(btnCancelarC, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel12))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cboTipoDocCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(txtApellidosCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnNuevoC, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel2))
                        .addGap(24, 24, 24)
                        .addComponent(txtNumeroDocCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGuardarC, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtApellidosCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnNuevoC, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(cboTipoDocCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel13)
                        .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(btnGuardarC, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumeroDocCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDireccionCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtTelefonoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelarC, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtEmailCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.setBackground(java.awt.Color.gray);
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "List clients", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 12), java.awt.Color.white)); // NOI18N

        jLabel20.setForeground(java.awt.Color.white);
        jLabel20.setText("Search:");

        btnBuscarC.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        btnBuscarC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/search.png"))); // NOI18N
        btnBuscarC.setText("SEARCH");
        btnBuscarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarCActionPerformed(evt);
            }
        });

        btnBorrarC.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        btnBorrarC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/garbage.png"))); // NOI18N
        btnBorrarC.setText("TRASH");
        btnBorrarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarCActionPerformed(evt);
            }
        });

        btnSalirC.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        btnSalirC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/delete.png"))); // NOI18N
        btnSalirC.setText("QUIT");
        btnSalirC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirCActionPerformed(evt);
            }
        });

        tablaListaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "First Name", "Last Name", "Type Doc", "Number Doc", "Address", "Phone", "E-Mail", "Code"
            }
        ));
        tablaListaClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaListaClientesMouseClicked(evt);
            }
        });
        jScrollPane9.setViewportView(tablaListaClientes);

        lblTotalRegistrosC.setForeground(java.awt.Color.red);
        lblTotalRegistrosC.setText("REGISTERS");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel20)
                .addGap(18, 18, 18)
                .addComponent(txtBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBuscarC)
                .addGap(18, 18, 18)
                .addComponent(btnBorrarC)
                .addGap(18, 18, 18)
                .addComponent(btnSalirC)
                .addGap(0, 24, Short.MAX_VALUE))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblTotalRegistrosC))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane9)))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(txtBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarC)
                    .addComponent(btnBorrarC)
                    .addComponent(btnSalirC))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTotalRegistrosC, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(8, 8, 8))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreClienteActionPerformed
        // TODO add your handling code here:
        txtNombreCliente.transferFocus();
    }//GEN-LAST:event_txtNombreClienteActionPerformed

    private void btnGuardarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarCActionPerformed
        // TODO add your handling code here:
        //Validations
        if (txtNombreCliente.getText().length()==0) {
            JOptionPane.showConfirmDialog(rootPane, "Please enter first name of client");
            txtNombreCliente.requestFocus();
            return;
        }
        
        if (txtApellidosCliente.getText().length()==0) {
            JOptionPane.showConfirmDialog(rootPane, "Please enter last name of client");
            txtApellidosCliente.requestFocus();
            return;
        }

        if (txtNumeroDocCliente.getText().length()==0) {
            JOptionPane.showConfirmDialog(rootPane, "Please enter number doc. of client");
            txtNumeroDocCliente.requestFocus();
            return;
        }
        
        if (txtDireccionCliente.getText().length()==0) {
            JOptionPane.showConfirmDialog(rootPane, "Please enter address of client");
            txtDireccionCliente.requestFocus();
            return;
        }
        
        if (txtTelefonoCliente.getText().length()==0) {
            JOptionPane.showConfirmDialog(rootPane, "Please enter phone of client");
            txtTelefonoCliente.requestFocus();
            return;
        }
        
        if (txtEmailCliente.getText().length()==0) {
            JOptionPane.showConfirmDialog(rootPane, "Please enter email of client");
            txtEmailCliente.requestFocus();
            return;
        }

        vcliente dts = new vcliente();
        fcliente func = new fcliente();

        dts.setNombre(txtNombreCliente.getText());
        dts.setApellidos(txtApellidosCliente.getText());
        int s = cboTipoDocCliente.getSelectedIndex();
        dts.setTipo_documento((String) cboTipoDocCliente.getItemAt(s));
        dts.setNum_documento(txtNumeroDocCliente.getText());
        dts.setDireccion(txtDireccionCliente.getText());
        dts.setTelefono(txtTelefonoCliente.getText());
        dts.setEmail(txtEmailCliente.getText());
        dts.setCodigo_cliente(txtCodigoCliente.getText());

        if (accion.equals("guardar")) {
            if (func.insertar(dts)) {
                JOptionPane.showMessageDialog(rootPane, "The client was registered successfully!");
                mostrar("");
                inhabilitar();
            }
        }else if(accion.equals("editar")){
            dts.setIdpersona(Integer.parseInt(txtIdCliente.getText()));

            if (func.editar(dts)) {
                JOptionPane.showMessageDialog(rootPane, "The client was edited successfully!");
                mostrar("");
                inhabilitar();
            }
        }
    }//GEN-LAST:event_btnGuardarCActionPerformed

    private void btnNuevoCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoCActionPerformed
        // TODO add your handling code here:
        habilitar();
        btnGuardarC.setText("Guardar");
        accion = "guardar";
    }//GEN-LAST:event_btnNuevoCActionPerformed

    private void cboTipoDocClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboTipoDocClienteActionPerformed
        // TODO add your handling code here:
        cboTipoDocCliente.transferFocus();
    }//GEN-LAST:event_cboTipoDocClienteActionPerformed

    private void btnBuscarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarCActionPerformed
        // TODO add your handling code here:
        mostrar(txtBuscarCliente.getText());
    }//GEN-LAST:event_btnBuscarCActionPerformed

    private void btnBorrarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarCActionPerformed
        // TODO add your handling code here:
        if (!txtIdCliente.getText().equals("")) {
            int confirmacion = JOptionPane.showConfirmDialog(rootPane, "Are you sure?","Comfirm",2);

            if (confirmacion==0) {
                fcliente func = new fcliente();
                vcliente dts = new vcliente();

                dts.setIdpersona(Integer.parseInt(txtIdCliente.getText()));
                func.eliminar(dts);
                mostrar("");
                inhabilitar();
            }
        }
    }//GEN-LAST:event_btnBorrarCActionPerformed

    private void btnSalirCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirCActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnSalirCActionPerformed

    private void tablaListaClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaListaClientesMouseClicked
        // TODO add your handling code here:
        btnGuardarC.setText("EDIT");
        habilitar();
        btnBorrarC.setEnabled(true);
        accion = "editar";

        int fila = tablaListaClientes.rowAtPoint(evt.getPoint());

        txtIdCliente.setText(tablaListaClientes.getValueAt(fila, 0).toString());
        txtNombreCliente.setText(tablaListaClientes.getValueAt(fila, 1).toString());
        txtApellidosCliente.setText(tablaListaClientes.getValueAt(fila, 2).toString());
        
        cboTipoDocCliente.setSelectedItem(tablaListaClientes.getValueAt(fila, 3).toString());
        txtNumeroDocCliente.setText(tablaListaClientes.getValueAt(fila, 4).toString());
        txtDireccionCliente.setText(tablaListaClientes.getValueAt(fila, 5).toString());
        txtTelefonoCliente.setText(tablaListaClientes.getValueAt(fila, 6).toString());
        txtEmailCliente.setText(tablaListaClientes.getValueAt(fila, 7).toString());
        txtCodigoCliente.setText(tablaListaClientes.getValueAt(fila, 8).toString());

    }//GEN-LAST:event_tablaListaClientesMouseClicked

    private void txtApellidosClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidosClienteActionPerformed
        // TODO add your handling code here:
        txtApellidosCliente.transferFocus();
    }//GEN-LAST:event_txtApellidosClienteActionPerformed

    private void txtNumeroDocClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroDocClienteActionPerformed
        // TODO add your handling code here:
        txtNumeroDocCliente.transferFocus();
    }//GEN-LAST:event_txtNumeroDocClienteActionPerformed

    private void txtDireccionClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionClienteActionPerformed
        // TODO add your handling code here:
        txtDireccionCliente.transferFocus();
    }//GEN-LAST:event_txtDireccionClienteActionPerformed

    private void txtTelefonoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoClienteActionPerformed
        // TODO add your handling code here:
        txtTelefonoCliente.transferFocus();
    }//GEN-LAST:event_txtTelefonoClienteActionPerformed

    private void txtEmailClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailClienteActionPerformed
        // TODO add your handling code here:
        txtEmailCliente.transferFocus();
    }//GEN-LAST:event_txtEmailClienteActionPerformed

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
            java.util.logging.Logger.getLogger(jfrmCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jfrmCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jfrmCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jfrmCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jfrmCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrarC;
    private javax.swing.JButton btnBuscarC;
    private javax.swing.JButton btnCancelarC;
    private javax.swing.JButton btnGuardarC;
    private javax.swing.JButton btnNuevoC;
    private javax.swing.JButton btnSalirC;
    private javax.swing.JComboBox<String> cboTipoDocCliente;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JLabel lblTotalRegistrosC;
    private javax.swing.JTable tablaListaClientes;
    private javax.swing.JTextField txtApellidosCliente;
    private javax.swing.JTextField txtBuscarCliente;
    private javax.swing.JTextField txtCodigoCliente;
    private javax.swing.JTextField txtDireccionCliente;
    private javax.swing.JTextField txtEmailCliente;
    private javax.swing.JTextField txtIdCliente;
    private javax.swing.JTextField txtNombreCliente;
    private javax.swing.JTextField txtNumeroDocCliente;
    private javax.swing.JTextField txtTelefonoCliente;
    // End of variables declaration//GEN-END:variables
}
