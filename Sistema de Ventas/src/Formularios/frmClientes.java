/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import Clases.ConectarClientes;
import Clases.Cliente;
import Clases.Utilerias;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
//import com.toedter.calendar.JDateChooser;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Efrain Soza
 */
public class frmClientes extends javax.swing.JInternalFrame {

    /**
     * Creates new form frmProductos
     */
    public frmClientes() {
        initComponents();
    }
    
    //modificar los parametros de la tabla
    private DefaultTableModel miTabla;
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cmbCiudad = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnPrimero = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnAnterior = new javax.swing.JButton();
        btnSiguiente = new javax.swing.JButton();
        btnUltimo = new javax.swing.JButton();
        txtClientes = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cmbIdentificacion = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblTabla = new javax.swing.JTable();
        btnNuevo = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnPDF = new javax.swing.JButton();
        txtfechaNacimiento = new javax.swing.JTextField();
        txtfechaIngreso = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("CLIENTES");
        setAutoscrolls(true);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 51, 255));
        jLabel7.setText("*Campos Obligatorios");

        txtNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Apellidos*:");

        txtApellido.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Direccion*:");

        txtDireccion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Ciudad*:");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Id Clientes*:");

        cmbCiudad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una ciudad...", "El Estor", "Rio Dulce", "Morales", "Puerto Barrios", "Los Amates", "Chiquimula", "Escuintla", "Jutiapa", "Huehuetenango", "Quetzaltenango", "Salama", "Cobán", "Carchá", "Chamelco", "Tactic", "Santa Cruz", "San Cristobal", " " }));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Nombres*:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Fecha de Ingreso* :");

        btnPrimero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Primero.png"))); // NOI18N
        btnPrimero.setToolTipText("Va al primer registro");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Telefono* :");

        btnAnterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Anterior.png"))); // NOI18N
        btnAnterior.setToolTipText("Va al anterior registro");

        btnSiguiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Siguiente.png"))); // NOI18N
        btnSiguiente.setToolTipText("Va al siguiente registro");

        btnUltimo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ultimo.png"))); // NOI18N
        btnUltimo.setToolTipText("Va al ultimo registro");

        txtClientes.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Identificación*:");

        cmbIdentificacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione un tipo de identificación...", "DPI", "LICENCIA DE CONDUCIR", "PASAPORTE" }));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Fecha de Nacimiento* :");

        tblTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tblTabla);

        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Nuevo.png"))); // NOI18N
        btnNuevo.setToolTipText("Nuevo registro");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Modificar.png"))); // NOI18N
        btnModificar.setToolTipText("Modificar registro");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Borrar2.png"))); // NOI18N
        btnEliminar.setToolTipText("Eliminar registro");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Buscar.png"))); // NOI18N
        btnBuscar.setToolTipText("Buscar registro");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/search.png"))); // NOI18N
        btnConsultar.setToolTipText("Consultar registro");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/applications.png"))); // NOI18N
        btnLimpiar.setToolTipText("Limpiar registro");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnPDF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/library bookmarked.png"))); // NOI18N
        btnPDF.setToolTipText("PDF del registro");
        btnPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPDFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 620, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtfechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtfechaIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(7, 7, 7)
                                        .addComponent(jLabel5)))
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(30, 30, 30)
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)
                                        .addComponent(cmbIdentificacion, 0, 294, Short.MAX_VALUE))
                                    .addComponent(txtNombre)
                                    .addComponent(txtApellido)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(36, 36, 36)
                                        .addComponent(jLabel9)
                                        .addGap(18, 18, 18)
                                        .addComponent(cmbCiudad, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(txtDireccion)))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnPrimero)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAnterior)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSiguiente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnUltimo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnConsultar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnLimpiar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNuevo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnModificar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEliminar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBuscar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnPDF)))))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(cmbIdentificacion))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(cmbCiudad, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtfechaNacimiento)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                        .addComponent(txtfechaIngreso)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnPrimero)
                    .addComponent(btnAnterior)
                    .addComponent(btnSiguiente)
                    .addComponent(btnUltimo)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnPDF)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnNuevo)
                            .addComponent(btnBuscar)
                            .addComponent(btnModificar)
                            .addComponent(btnEliminar)
                            .addComponent(btnLimpiar)))
                    .addComponent(btnConsultar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        llenarTabla();
    }//GEN-LAST:event_formInternalFrameOpened

    //crear un metodo para limpiar los cuadros de textos
    private void limpiar()
    {
        txtClientes.setText("");
        cmbIdentificacion.setSelectedIndex(0); //posicion cero es la primera
        txtNombre.setText("");
        txtApellido.setText("");
        txtDireccion.setText("");
        txtTelefono.setText("");
        cmbCiudad.setSelectedIndex(0);
        txtfechaNacimiento.setText("");
        txtfechaIngreso.setText("");   
    }
    
    //crear un metodo privado para mostrar los registros en la tabla
    private void llenarTabla()
    {
        //generamos una instancia a la clase conectar
        ConectarClientes conectar = new ConectarClientes();
        try {
            //llenar los encabezados de las columnas
            String titulos[] = {"Id Cliente", "Identificacion", "Nombre Cliente", "Apellido Cliente", "Direccion Cliente", 
                                "Telefono Cliente", "Ciudad Cliente", "Fecha Nacimiento", "Fecha Ingreso"};
            miTabla = new DefaultTableModel(null, titulos);
            String registros[] = new String[9];
        
            ResultSet rs = conectar.getClientes();
            while(rs.next())
            {
                registros[0] = rs.getString("Id_clientes");
                registros[1] = Identificacion(rs.getInt("Identificacion"));
                registros[2] = rs.getString("Nombre");
                registros[3] = rs.getString("Apellido");     
                registros[4] = rs.getString("Direccion");
                registros[5] = "" + rs.getInt("Telefono");
                registros[6] = Ciudad(rs.getInt("Ciudad"));
                registros[7] = rs.getString("Fecha_Nacimiento");
                registros[8] = rs.getString("Fecha_Ingreso");
                miTabla.addRow(registros);
            }
        } catch (SQLException ex) {
            Logger.getLogger(frmUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        tblTabla.setModel(miTabla);
        conectar.cerrarConexion();
    }
    
    //metodo para definir la identificacion
    private String Identificacion(int IdIdentificacion)
    {
        switch(IdIdentificacion)
        {
            
            case 1: return "DPI";
            case 2: return "LICENCIA DE CONDUCIR";
            case 3: return "PASAPORTE";
        }
        return "";
    }    
        //metodo para definir la ciudad
    private String Ciudad(int Ciudad)
    {
        switch(Ciudad)
        {
            case 1: return "Cobán";
            case 2: return "Carchá";
            case 3: return "Chamelco";
            case 4: return "Tactic";
            case 5: return "Santa Cruz";
            case 6: return "San Cristobal";            
        }
        return "";
    }

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        //validaciones
        if(txtClientes.getText().equals(""))
        {
            JOptionPane.showMessageDialog(rootPane, "Debe ingresar el Id del cliente");
            txtClientes.grabFocus();
            return;
        }
        ConectarClientes con = new ConectarClientes();
        Cliente cliente = con.getCliente(txtClientes.getText());
        if(cliente != null)
        {
            JOptionPane.showMessageDialog(rootPane,"Cliente ya existe");
            txtClientes.setText("");
            txtClientes.grabFocus();
            con.cerrarConexion();
            return;
        }
        if(!validarCampos())
        {
            con.cerrarConexion();
            return;
        }
        cliente = new Cliente(txtClientes.getText(),
            cmbIdentificacion.getSelectedIndex(),
            txtNombre.getText(),
            txtApellido.getText(),
            txtDireccion.getText(),
            Integer.parseInt(txtTelefono.getText()),
            cmbCiudad.getSelectedIndex(),
            txtfechaNacimiento.getText(),
            txtfechaIngreso.getText());
        
        if(con.insertarCliente(cliente))
        {
            JOptionPane.showMessageDialog(rootPane,"Cliente ingresado correctamente");
        }
        else
        {
            JOptionPane.showMessageDialog(rootPane,"Cliente no ingresado correctamente");
        }

        //limpiar los campos
        limpiar();
        con.cerrarConexion();
        llenarTabla();
    }//GEN-LAST:event_btnNuevoActionPerformed

    //metodo privado para validar campos
    private boolean validarCampos()
    {
        if(cmbIdentificacion.getSelectedIndex() == 0)
        {
            JOptionPane.showMessageDialog(rootPane, "Debe seleccionar alguna Identificacion", "Identificacion", WIDTH);
            cmbIdentificacion.grabFocus();
            return false;
        }  

        if(txtNombre.getText().equals(""))
        {
            JOptionPane.showMessageDialog(rootPane, "Debe ingresar el nombre del Cliente", "Nombre Cliente", WIDTH);
            txtNombre.grabFocus();
            return false;
        }
        
        if(txtApellido.getText().equals(""))
        {
            JOptionPane.showMessageDialog(rootPane, "Debe ingresar el apellido del Cliente", "Apellido Cliente", WIDTH);
            txtApellido.grabFocus();
            return false;
        }
        
        if(txtDireccion.getText().equals(""))
        {
            JOptionPane.showMessageDialog(rootPane, "Debe ingresar la direccion del Cliente", "Direccion Cliente", WIDTH);
            txtDireccion.grabFocus();
            return false;
        }
        
        if(txtTelefono.getText().equals(""))
        {
            JOptionPane.showMessageDialog(rootPane, "Debe ingresar el telefono del Cliente", "Telefono Cliente", WIDTH);
            txtTelefono.grabFocus();
            return false;
        }
        
        //revisar que no se ingrese un valor distinto a un numero
        if(!Utilerias.esNumero(txtTelefono.getText()))
        {
           JOptionPane.showMessageDialog(rootPane, "Debe digitar un valor numerico","Telefono", WIDTH);
            txtTelefono.grabFocus();
            return false; 
        }
        
        //revisar que el valor no sea negativo
        int telefono = Integer.parseInt(txtTelefono.getText());
        if(telefono <= 0)
        {
           JOptionPane.showMessageDialog(rootPane, "Debe digitar un valor mayor a cero","Telefono", WIDTH);
            txtTelefono.grabFocus();
            return false; 
        }
        
        if(cmbCiudad.getSelectedIndex() == 0)
        {
            JOptionPane.showMessageDialog(rootPane, "Debe seleccionar alguna Ciudad", "Ciudad del Cliente", WIDTH);
            cmbCiudad.grabFocus();
            return false;
        }
        
        if(txtfechaNacimiento.equals(""))
        {
            JOptionPane.showMessageDialog(rootPane, "Debe ingresar la Fecha de Nacimiento del Cliente", "Telefono Cliente", WIDTH);
            txtfechaNacimiento.grabFocus();
            return false;
        }
        
        if(txtfechaIngreso.equals(""))
        {
            JOptionPane.showMessageDialog(rootPane, "Debe ingresar la Fecha de Ingreso del Cliente", "Telefono Cliente", WIDTH);
            txtfechaIngreso.grabFocus();
            return false;
        }
        return true;
    }
    
    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        //validaciones
        if(txtClientes.getText().equals(""))
        {
            JOptionPane.showMessageDialog(rootPane, "Debe ingresar el Id del cliente");
            txtClientes.grabFocus();
            return;
        }
       
        
        ConectarClientes con = new ConectarClientes();
        Cliente cliente = con.getCliente(txtClientes.getText());
        if(cliente == null)
        {
            JOptionPane.showMessageDialog(rootPane,"Cliente no existe");
            txtClientes.setText("");
            txtClientes.grabFocus();
            con.cerrarConexion();
            return;
        }
        cliente = new Cliente(txtClientes.getText(),
            cmbIdentificacion.getSelectedIndex(),
            txtNombre.getText(),
            txtApellido.getText(),
            txtDireccion.getText(),
            Integer.parseInt(txtTelefono.getText()),
            cmbCiudad.getSelectedIndex(),
            txtfechaNacimiento.getText(),
            txtfechaIngreso.getText());

        if(!validarCampos())
        {
            con.cerrarConexion();
            return;
        }

        if(con.UpdateCliente(cliente))
        {
            JOptionPane.showMessageDialog(rootPane,"Cliente actualizado correctamente");
        }
        else
        {
            JOptionPane.showMessageDialog(rootPane,"Cliente no actualizado correctamente");
        }
        con.cerrarConexion();
        llenarTabla();
               
        
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int resp = JOptionPane.showConfirmDialog(rootPane, "Esta seguro de eliminar el cliente");
        if(resp != 0)
        {
            return;
        }
        //validaciones
        if(txtClientes.getText().equals(""))
        {
            JOptionPane.showMessageDialog(rootPane, "Debe ingresar el Id del cliente");
            txtClientes.grabFocus();
            return;
        }
        ConectarClientes con = new ConectarClientes();
        Cliente cliente = con.getCliente(txtClientes.getText());
        if(cliente == null)
        {
            JOptionPane.showMessageDialog(rootPane,"Cliente no existe");
            txtClientes.setText("");
            txtClientes.grabFocus();
            con.cerrarConexion();
            return;
        }
        if(con.deleteCliente(cliente))
        {
            JOptionPane.showMessageDialog(rootPane, "Cliente eliminado correctamente");
        }
        else
        {
            JOptionPane.showMessageDialog(rootPane, "Cliente no eliminado");
        }
        limpiar();
        con.cerrarConexion();
        llenarTabla();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String id = JOptionPane.showInputDialog(rootPane,"Ingrese el Id del usuario a buscar");

        if(id.equals(""))
        {
            return;
        }

        ConectarClientes con = new ConectarClientes();
        Cliente cliente = con.getCliente(id);
        if(cliente == null)
        {
            JOptionPane.showMessageDialog(rootPane,"Cliente no existe");
            txtClientes.setText("");
            txtClientes.grabFocus();
            con.cerrarConexion();
            return;
        }
        txtClientes.setText(cliente.getIdClientes());
        txtNombre.setText(cliente.getNombres());
        txtApellido.setText(cliente.getApellidos());
        txtDireccion.setText(cliente.getDireccion());
        txtTelefono.setText(String.valueOf(cliente.getTelefono()));
        cmbCiudad.setSelectedIndex(cliente.getCiudad());
        txtfechaNacimiento.setText(cliente.getFechaNacimiento());
        txtfechaIngreso.setText(cliente.getFechaIngreso());
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        //validaciones
        if(txtClientes.getText().equals(""))
        {
            JOptionPane.showMessageDialog(rootPane, "Debe ingresar el Id del cliente");
            txtClientes.grabFocus();
            return;
        }
        ConectarClientes con = new ConectarClientes();
        Cliente cliente = con.getCliente(txtClientes.getText());
        if(cliente == null)
        {
            JOptionPane.showMessageDialog(rootPane,"Cliente no existe");
            txtClientes.setText("");
            txtClientes.grabFocus();
            con.cerrarConexion();
            return;
        }
        txtNombre.setText(cliente.getNombres());
        txtApellido.setText(cliente.getApellidos());
        txtDireccion.setText(cliente.getDireccion());
        txtTelefono.setText(String.valueOf(cliente.getTelefono()));
        cmbCiudad.setSelectedIndex(cliente.getCiudad());
        txtfechaNacimiento.setText(cliente.getFechaNacimiento());
        txtfechaIngreso.setText(cliente.getFechaIngreso());
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPDFActionPerformed
        //crear un archivo PDF con la informacion de la tabla usuario
        Document documento = new Document();
        try {
            PdfWriter.getInstance(documento, new FileOutputStream("Cliente.pdf"));
            String texto = "Reporte de Clientes";
            Paragraph parrafo = new Paragraph(texto);
            documento.open();
            documento.add(parrafo);
            ConectarClientes conectar = new ConectarClientes();
            ResultSet rs = conectar.getClientes();

            while(rs.next())
            {
                texto = "ID: " + rs.getString("Id_clientes") + " - Identificacion: "
                + Identificacion(rs.getInt("Identificacion")) + " - Nombre: "
                + rs.getString("Nombre") + " - Apellido: "
                + rs.getString("Apellido") + " - Direccion: "
                + rs.getString("Direccion") + " - Telefono: "
                + rs.getInt("Telefono") + " - Ciudad: "
                + Ciudad(rs.getInt("Ciudad")) + " - Fecha_Nacimiento: "
                + rs.getString("Fecha_Nacimiento") + " - Fecha_Ingreso: "
                + rs.getString("Fecha_Ingreso");

                parrafo = new Paragraph(texto);
                documento.add(parrafo);
            }
            conectar.cerrarConexion();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(frmUsuario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DocumentException ex) {
            Logger.getLogger(frmUsuario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(frmUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally
        {
            documento.close();
            JOptionPane.showMessageDialog(rootPane, "Reporte generado");
        }
    }//GEN-LAST:event_btnPDFActionPerformed
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnterior;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnPDF;
    private javax.swing.JButton btnPrimero;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JButton btnUltimo;
    private javax.swing.JComboBox<String> cmbCiudad;
    private javax.swing.JComboBox<String> cmbIdentificacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblTabla;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtClientes;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtfechaIngreso;
    private javax.swing.JTextField txtfechaNacimiento;
    // End of variables declaration//GEN-END:variables

}
