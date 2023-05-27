/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import Clases.Cliente;
import Clases.Conectar;
import Clases.ConectarClientes; 
import Clases.ConectarProductos;
//import Clases.DatosClientes;
//import Clases.DatosProductos;
import Clases.Factura;
import Clases.Opcion;
import Clases.Utilerias;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import static java.awt.image.ImageObserver.HEIGHT;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MELVIN TORRES
 */
public class frmFactura extends javax.swing.JInternalFrame {
    private Conectar Con = new Conectar();
    /**
     * Creates new form frmFactura
     */
    public frmFactura() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        cmbCliente = new javax.swing.JComboBox<>();
        cmbProducto = new javax.swing.JComboBox<>();
        txtCantidad = new javax.swing.JTextField();
        btnAgregarProducto = new javax.swing.JButton();
        btnEliminarProducto = new javax.swing.JButton();
        btnBorrarProductos = new javax.swing.JButton();
        btnGuardarFactura = new javax.swing.JButton();
        btnBuscarCliente = new javax.swing.JButton();
        btnBuscarProducto = new javax.swing.JButton();
        txtTotalCantidad = new javax.swing.JTextField();
        txtTotalValor = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDetalle = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("NUEVA FACTURA");
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

        jLabel1.setText("Fecha:");

        jLabel2.setText("Cliente:");

        jLabel3.setText("Producto:");

        jLabel4.setText("Total:");

        jLabel5.setText("Cantidad:");

        txtFecha.setEnabled(false);
        txtFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaActionPerformed(evt);
            }
        });

        txtCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadActionPerformed(evt);
            }
        });

        btnAgregarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/anadir.png"))); // NOI18N
        btnAgregarProducto.setToolTipText("Agregar Producto a la Factura");
        btnAgregarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarProductoActionPerformed(evt);
            }
        });

        btnEliminarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/menos.png"))); // NOI18N
        btnEliminarProducto.setToolTipText("Elimina el Producto de la Factura");
        btnEliminarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarProductoActionPerformed(evt);
            }
        });

        btnBorrarProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Borrar_Basurero.png"))); // NOI18N
        btnBorrarProductos.setToolTipText("Borra todos los productos de la factura");
        btnBorrarProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarProductosActionPerformed(evt);
            }
        });

        btnGuardarFactura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Guardar.png"))); // NOI18N
        btnGuardarFactura.setToolTipText("Guardar Factura");
        btnGuardarFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarFacturaActionPerformed(evt);
            }
        });

        btnBuscarCliente.setText("...");
        btnBuscarCliente.setToolTipText("Buscar Cliente");
        btnBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarClienteActionPerformed(evt);
            }
        });

        btnBuscarProducto.setText("...");
        btnBuscarProducto.setToolTipText("Buscar Producto");
        btnBuscarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarProductoActionPerformed(evt);
            }
        });

        txtTotalCantidad.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtTotalCantidad.setEnabled(false);

        txtTotalValor.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtTotalValor.setEnabled(false);
        txtTotalValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalValorActionPerformed(evt);
            }
        });

        tblDetalle.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblDetalle);

        jLabel6.setText("Total");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel6))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cmbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cmbProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnBuscarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnAgregarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnEliminarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnBorrarProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnGuardarFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(txtTotalCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtTotalValor, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnBuscarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAgregarProducto)
                            .addComponent(btnEliminarProducto)
                            .addComponent(btnBorrarProductos)
                            .addComponent(btnGuardarFactura)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtTotalCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtTotalValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(81, 81, 81))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        Conectar conectar = new Conectar();
        conectar.llenarComboboxCliente(cmbCliente);
        conectar.llenarComboboxProducto(cmbProducto);
        
        //obtener la fecha del sistema
        Calendar fecha = Calendar.getInstance(); 
        int dia = fecha.get(Calendar.DAY_OF_MONTH);
        int mes = fecha.get(Calendar.MONTH)+1;
        int año = fecha.get(Calendar.YEAR); 
        //concatenar las variables del dia mes y año
        String fe=String.valueOf(dia)+"/" +
                  String.valueOf(mes)+"/" +
                  String.valueOf(año);
        txtFecha.setText(fe);
        
        //mostrar los totales en ceros
        //txtTotalCantidad.setText("0");
        //txtTotalValor.setText("0");
        //llenarTabla();
        
        
    }//GEN-LAST:event_formInternalFrameOpened

    private void txtFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaActionPerformed
        
    }//GEN-LAST:event_txtFechaActionPerformed

    private void btnAgregarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarProductoActionPerformed
        // validaciones
        
        if(cmbCliente.getSelectedItem().equals(evt))
        {
            JOptionPane.showMessageDialog(rootPane,"Debe ingresar el Producto", "Producto", HEIGHT);
            cmbCliente.grabFocus();
            return;
        }
        if(cmbProducto.getSelectedItem().equals(evt))
        {
            JOptionPane.showMessageDialog(rootPane,"Debe ingresar el Producto", "Producto", HEIGHT);
            cmbProducto.grabFocus();
            return;
        }
        Conectar conectar = new Conectar();
        
        Factura factura = conectar.getFactura(cmbCliente.getItemAt(cmbCliente.getSelectedIndex()));
        /*if(factura !=null)
        {
            JOptionPane.showMessageDialog(rootPane, "Cliente ya existe");
            cmbCliente.grabFocus();
            conectar.cerrarConexion();
            return;
        }*/
        
        //para validar los campos y luego cerrar
        if(!Validar())
        {
            conectar.cerrarConexion();
            return;
        }
        
        //esta sirve para mandar nuevos datos a la clase Factura
        factura = new Factura(txtFecha.getText(),
                cmbCliente.getSelectedItem().toString(),
                cmbProducto.getSelectedItem().toString(),
                Integer.parseInt(txtCantidad.getText()),
                Double.valueOf(txtTotal.getText()));
        //esto es para mandar los datos a la base de datos
        if(conectar.insertarFactura(factura))
        {
            JOptionPane.showMessageDialog(rootPane, "Factura ingresada Correctamente");
            
        }
        else
        {
            JOptionPane.showMessageDialog(rootPane, "Factura no ingresada");
        }
        
        
        llenarTabla();
        conectar.cerrarConexion();
        
        
    }//GEN-LAST:event_btnAgregarProductoActionPerformed
    
    private void btnBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarClienteActionPerformed
        // TODO add your handling code here:
        // UTILIZAR UN IMPUT DIALOG
        String nombre = JOptionPane.showInputDialog(rootPane, "Ingrese el Nombre del Cliente");
        if(nombre.equals(""))
        {
            return;
        }
        Conectar conectar = new Conectar();
        Factura factura = conectar.getFactura(nombre);
        if(factura == null)
        {
            JOptionPane.showMessageDialog(rootPane, "El Cliente no existe");
            conectar.cerrarConexion();
            return;
        }
        cmbCliente.setSelectedItem(factura.getNombre());
        //mostrar los datos
        cmbProducto.setSelectedItem(factura.getProducto());
        txtCantidad.setText(""+factura.getCantidad());
        txtTotalValor.setText(""+factura.getTotal());
        
        cmbCliente.grabFocus();
        cmbProducto.setEnabled(true);
        txtCantidad.setEnabled(true);
        txtTotalValor.setEnabled(true);
    }//GEN-LAST:event_btnBuscarClienteActionPerformed

    private void btnBorrarProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarProductosActionPerformed
        // TODO add your handling code here:
        
           int resp = JOptionPane.showConfirmDialog(rootPane, "Estas seguro de eliminar el Registro");
            if(resp !=0)
            {
                return;
            }
            //GENERAR VALIDACIONES ANTES DE MODIFICAR
            if(cmbCliente.getSelectedItem()=="")
            {
                JOptionPane.showMessageDialog(rootPane,"Debe ingresar el Nombre del Cliente");
                return; 
            }
            Conectar conectar = new Conectar();
            Factura factura = conectar.getFactura(cmbCliente.getSelectedItem().toString());
            if(factura == null)
            {
                JOptionPane.showMessageDialog(rootPane, "El Usuario no existe");
                conectar.cerrarConexion();
                return;
            }
            if(conectar.deleteFactura(factura))
            {
                JOptionPane.showMessageDialog(rootPane, "Factura Eliminado Correctamente");
            }
            else
            {
                JOptionPane.showMessageDialog(rootPane, "Factura no Eliminado");
            }
            llenarTabla();
            //limpiar();
            conectar.cerrarConexion();
    }//GEN-LAST:event_btnBorrarProductosActionPerformed

    private void btnBuscarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarProductoActionPerformed
        // UTILIZAR UN IMPUT DIALOG
        String producto = JOptionPane.showInputDialog(rootPane, "Ingrese el Nombre del Producto");
        if(producto.equals(""))
        
        {
            return;
        }
        Conectar conectar = new Conectar(); 
        Factura factura = conectar.getFactura(producto);       
        //Factura factura = conectar.getProducto(producto);
        if(factura == null)
        {
            JOptionPane.showMessageDialog(rootPane, "El Producto no existe");
            conectar.cerrarConexion();
            return;
        }
        cmbCliente.setSelectedItem(factura.getNombre());
        //mostrar los datos
        cmbProducto.setSelectedItem(factura.getProducto());
        txtCantidad.setText(""+factura.getCantidad());
        txtTotalValor.setText(""+factura.getTotal());
        
        cmbCliente.grabFocus();
        cmbProducto.setEnabled(true);
        txtCantidad.setEnabled(true);
        txtTotalValor.setEnabled(true);
    }//GEN-LAST:event_btnBuscarProductoActionPerformed

    // TODO add your handling code here:    
    
    private void btnEliminarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarProductoActionPerformed
    int fila = tblDetalle.getRowCount();
        for(int i = fila-1; i>=0; i--)
        {
            miTabla.removeRow(i); 
        }        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarProductoActionPerformed

    private void btnGuardarFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarFacturaActionPerformed
        // TODO add your handling code here:
        Document documento = new Document();
        try {
            Conectar conectar = new Conectar();
            //crear un archivo pdf con la información de la tabla usuario
            //Document documento = new Document();
            PdfWriter.getInstance(documento,new FileOutputStream("Reporte de Factura.pdf"));
            String texto = "Reporte";
            Paragraph parrafo = new Paragraph(texto);
            documento.open();
            documento.add(parrafo);
            ResultSet rs = conectar.getFactura();
            while(rs.next())
            {
                texto = "Fecha: " + rs.getString("Fecha") + " - Cliente: "
                        + rs.getString("Cliente")+ " - Producto: "
                        + rs.getString("Producto")+" - Cantidad: "
                        + rs.getString("Cantidad")+" - Total: "
                        + rs.getString("Total"); 
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
            JOptionPane.showMessageDialog(rootPane, "El Documento PDF ha sido guardado");
        }
        //creamos un arreglo para los titulos de la tabla
        cmbCliente.setSelectedIndex(0);
        cmbProducto.setSelectedIndex(0);
        txtCantidad.setText("");
        txtTotal.setText("");
        
        int fila = tblDetalle.getRowCount();
        for(int i = fila-1; i>=0; i--)
        {
            miTabla.removeRow(i); 
        }        // TODO add your handling code here:
        
        /*registro[0] = txtFecha.getText();
        registro[1] = ""+cmbCliente.getSelectedItem(); 
        registro[2] = ""+cmbProducto.getSelectedItem();
        registro[3] = txtCantidad.getText();
        registro[4] = txtTotal.getText();
            
        miTabla.addRow(registro);*/
        
            
        
    }//GEN-LAST:event_btnGuardarFacturaActionPerformed

    private void txtCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadActionPerformed
        totales(); 
    }//GEN-LAST:event_txtCantidadActionPerformed

    private void txtTotalValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalValorActionPerformed
        totales(); 
    }//GEN-LAST:event_txtTotalValorActionPerformed
    private boolean Validar()
    {
         // validaciones
        if(cmbProducto.getSelectedIndex()==0)
        {
            JOptionPane.showMessageDialog(rootPane, "Debe selecionar un producto");
            cmbProducto.requestFocusInWindow();
            //cmbProducto.grabFocus();
            return false;   
        }
        //validamos que el campo cantidad no esta vacio
        if(txtCantidad.getText().equals(""))
        {
            JOptionPane.showMessageDialog(rootPane, "Debe ingresar una cantidad"); 
            txtCantidad.grabFocus();
            return false;
        }
        //revisar que no se ingrese un valor distinto a un numero
        if(!Utilerias.esNumero(txtCantidad.getText()))
        {
            JOptionPane.showMessageDialog(rootPane,"Debe digitar un valor numerio", "Cantidad", HEIGHT);
            txtCantidad.setText("");
            txtCantidad.grabFocus();
            return false;
        }
        //debe revisar que el valor no sea negativo
        int cantidad = Integer.parseInt(txtCantidad.getText());
        if(cantidad<=0)
        {
            JOptionPane.showMessageDialog(rootPane,"Debe digitar un valor Mayor a cero", "Cantidad", HEIGHT);
            txtCantidad.setText("");
            txtCantidad.grabFocus();
            return false;
        }
        return true;
    }
    //metodo para los totales
    private void totales()
    {
        DecimalFormat df = new DecimalFormat("#.0000"); //Redondear a 4 decimales
        double num = tblDetalle.getRowCount(); //devuelve el numero de filas
        double sumCan = 0, sumVal = 0;
        for(int i = 0; i<num;i++)
        {
            //para getValueAt el primer parametro es el de las filas "i"
            sumCan = sumCan + Double.parseDouble((String)tblDetalle.getValueAt(i,3));
            // el segundo parametro es el de las columnas 3, 4
            sumVal = sumVal + Double.parseDouble((String)tblDetalle.getValueAt(i, 4));
        }
        txtTotalCantidad.setText(String.valueOf(df.format(sumCan)));
        txtTotalValor.setText(String.valueOf(df.format(sumVal)));
    }
    // metodo para llenar la tabla
    public DefaultTableModel miTabla;
    public void llenarTabla()
    {
            //creamos un arreglo para los titulos de la tabla
            String titulos[] = {"Fecha","Cliente","Producto","cantidad","Total"};
            //llenar la tabla
            miTabla = new DefaultTableModel(null, titulos); 
             //creamos un arreglo para el control de los registros
            String registro[] = new String[5];
            registro[0] = txtFecha.getText();
            registro[1] = ""+cmbCliente.getSelectedItem(); 
            registro[2] = ""+cmbProducto.getSelectedItem();
            registro[3] = txtCantidad.getText();
            registro[4] = txtTotal.getText();
            
            miTabla.addRow(registro);
            
            //conectamos con el método conectar para obtener la informacion en la tabla
            Conectar conectar = new Conectar(); 
            tblDetalle.setModel(miTabla);;
            totales();
            conectar.cerrarConexion(); 
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarProducto;
    private javax.swing.JButton btnBorrarProductos;
    private javax.swing.JButton btnBuscarCliente;
    private javax.swing.JButton btnBuscarProducto;
    private javax.swing.JButton btnEliminarProducto;
    private javax.swing.JButton btnGuardarFactura;
    private javax.swing.JComboBox<String> cmbCliente;
    private javax.swing.JComboBox<String> cmbProducto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblDetalle;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JTextField txtTotalCantidad;
    private javax.swing.JTextField txtTotalValor;
    // End of variables declaration//GEN-END:variables
}
