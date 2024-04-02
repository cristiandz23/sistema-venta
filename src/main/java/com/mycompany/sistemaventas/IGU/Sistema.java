package com.mycompany.sistemaventas.IGU;

import com.mycompany.sistemaventas.Logica.Cliente;
import com.mycompany.sistemaventas.Logica.Controladora;
import com.mycompany.sistemaventas.Logica.DetalleVenta;
import com.mycompany.sistemaventas.Logica.Empresa;
import com.mycompany.sistemaventas.Logica.Login;
import com.mycompany.sistemaventas.Logica.Producto;
import com.mycompany.sistemaventas.Logica.Proveedor;
import com.mycompany.sistemaventas.Logica.Validaciones;
import com.mycompany.sistemaventas.Logica.Venta;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

public class Sistema extends javax.swing.JFrame {

    Date fechaVenta = new Date();
    String fechaActual = new SimpleDateFormat("dd/MM/yyyy").format(fechaVenta);
    Login vendedor = null;
    Cliente cli = null;
    Empresa empresa = null;
    Proveedor pr = null;
    Producto prod = null;
    Venta venta = null;
    DetalleVenta detalle = null;
    Controladora control = new Controladora();
    DefaultTableModel modeloTabla = new DefaultTableModel();
    DefaultTableModel modeloTablaVenta = new DefaultTableModel();
    DefaultComboBoxModel modeloComboBox = new DefaultComboBoxModel();
    Validaciones validar = new Validaciones();
    int item = 0;
    double totalPagar = 0.00;
    //METODO CONSTRUCTOR

    public Sistema() {
        initComponents();
    }

    public Sistema(Login vendedor) {
        initComponents();
        if (vendedor.getRol().equals("Asistente")) {
            btnProveedor.setEnabled(false);
            btnProductos.setEnabled(false);
            btnConfig.setEnabled(false);
        } else {

        }
        this.vendedor = new Login();

        this.vendedor = vendedor;
        this.setLocationRelativeTo(null);
        AutoCompleteDecorator.decorate(cmbProveedorPro);
        lblVendedor.setText(vendedor.getNombre());

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnClientes = new javax.swing.JButton();
        btnNuevaVenta = new javax.swing.JButton();
        btnProveedor = new javax.swing.JButton();
        btnProductos = new javax.swing.JButton();
        btnVentas = new javax.swing.JButton();
        btnConfig = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnNuevaVenta1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        tpPrincipal = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtCodigoVenta = new javax.swing.JTextField();
        txtDescripcionVenta = new javax.swing.JTextField();
        txtCantidadVenta = new javax.swing.JTextField();
        txtPrecioVenta = new javax.swing.JTextField();
        txtStockDisponible = new javax.swing.JTextField();
        btnEliminarVenta = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVenta = new javax.swing.JTable(){
            public boolean isCellEditable(int row,int column){
                return false;
            }
        };
        jLabel8 = new javax.swing.JLabel();
        txtDniVenta = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtNombreClienteVenta = new javax.swing.JTextField();
        btnGenerarVenta = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        lblTotalPagar = new javax.swing.JLabel();
        btnGrafica = new javax.swing.JButton();
        dateCalendario = new com.toedter.calendar.JDateChooser();
        jPanel3 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtRazonCliente = new javax.swing.JTextField();
        txtDireccionCliente = new javax.swing.JTextField();
        txtTelefonoCliente = new javax.swing.JTextField();
        txtNombreCliente = new javax.swing.JTextField();
        txtDniCliente = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCliente =  new javax.swing.JTable(){
            public boolean isCellEditable(int row,int column){
                return false;
            }
        };
        btnGuardarCliente = new javax.swing.JButton();
        btnEditarCliente = new javax.swing.JButton();
        btnEliminarCliente = new javax.swing.JButton();
        btnNuevoCliente = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        txtRazonProveedor = new javax.swing.JTextField();
        txtDireccionProveedor = new javax.swing.JTextField();
        txtTelefonoProveedor = new javax.swing.JTextField();
        txtNombreProveedor = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblProveedor = new javax.swing.JTable(){
            public boolean isCellEditable(int row,int column){
                return false;
            }
        };
        btnGuardarProveedor = new javax.swing.JButton();
        btnEditarProveedor = new javax.swing.JButton();
        btnEliminarProveedor = new javax.swing.JButton();
        btnNuevoProveedor = new javax.swing.JButton();
        txtCuilProveedor = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        txtPrecioPro = new javax.swing.JTextField();
        txtCantidadPro = new javax.swing.JTextField();
        txtDescripcionPro = new javax.swing.JTextField();
        txtCodigoPro = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblProducto = new javax.swing.JTable(){
            public boolean isCellEditable(int row,int column){
                return false;
            }
        };
        btnExcelPro = new javax.swing.JButton();
        btnGuardarPro = new javax.swing.JButton();
        btnEditarPro = new javax.swing.JButton();
        btnEliminarPro = new javax.swing.JButton();
        btnNuevoPro = new javax.swing.JButton();
        cmbProveedorPro = new javax.swing.JComboBox<>();
        txtIdPro = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblDetalleVentas = new javax.swing.JTable(){
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        btnPdfVentas = new javax.swing.JButton();
        txtIdVenta = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        txtCuilEmpresa = new javax.swing.JTextField();
        txtNombreEmpresa = new javax.swing.JTextField();
        txtTelefonoEmpresa = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        txtDireccionEmpresa = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        txtRazonEmpresa = new javax.swing.JTextField();
        btnActualizarEmpresa = new javax.swing.JButton();
        lblVendedor = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1000, 530));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        btnClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Clientes.png"))); // NOI18N
        btnClientes.setText("Cliente");
        btnClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientesActionPerformed(evt);
            }
        });

        btnNuevaVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Nventa.png"))); // NOI18N
        btnNuevaVenta.setText("Nueva venta");
        btnNuevaVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaVentaActionPerformed(evt);
            }
        });

        btnProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/proveedor.png"))); // NOI18N
        btnProveedor.setText("Proveedor");
        btnProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProveedorActionPerformed(evt);
            }
        });

        btnProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/producto.png"))); // NOI18N
        btnProductos.setText("Productos");
        btnProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductosActionPerformed(evt);
            }
        });

        btnVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Carrito-de-compras.png"))); // NOI18N
        btnVentas.setText("Ventas");
        btnVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentasActionPerformed(evt);
            }
        });

        btnConfig.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/config.png"))); // NOI18N
        btnConfig.setText("Condig");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo.png"))); // NOI18N

        btnNuevaVenta1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/registrar.png"))); // NOI18N
        btnNuevaVenta1.setText("RegistrarUsuario");
        btnNuevaVenta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaVenta1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnNuevaVenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnProveedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnProductos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnVentas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnConfig, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNuevaVenta1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(16, 16, 16))
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(btnNuevaVenta1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNuevaVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnConfig, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 530));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/encabezado.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 830, 130));

        tpPrincipal.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tpPrincipal.setEnabled(false);

        jLabel3.setText("Codigo:");

        jLabel4.setText("Descripcion:");

        jLabel5.setText("Cantidad:");

        jLabel6.setText("Precio:");

        jLabel7.setText("Stock disponible:");

        txtCodigoVenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCodigoVentaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodigoVentaKeyTyped(evt);
            }
        });

        txtDescripcionVenta.setEditable(false);

        txtCantidadVenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCantidadVentaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantidadVentaKeyTyped(evt);
            }
        });

        txtPrecioVenta.setEditable(false);

        txtStockDisponible.setEditable(false);

        btnEliminarVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eliminar.png"))); // NOI18N
        btnEliminarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarVentaActionPerformed(evt);
            }
        });

        tblVenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODIGO", "DESCIPCION", "CANTIDAD", "PRECIO", "TOTAL"
            }
        ));
        jScrollPane1.setViewportView(tblVenta);
        if (tblVenta.getColumnModel().getColumnCount() > 0) {
            tblVenta.getColumnModel().getColumn(0).setPreferredWidth(30);
            tblVenta.getColumnModel().getColumn(1).setPreferredWidth(100);
            tblVenta.getColumnModel().getColumn(2).setPreferredWidth(30);
            tblVenta.getColumnModel().getColumn(3).setPreferredWidth(30);
            tblVenta.getColumnModel().getColumn(4).setPreferredWidth(40);
        }

        jLabel8.setText("DNI/CUIL:");

        txtDniVenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDniVentaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDniVentaKeyTyped(evt);
            }
        });

        jLabel9.setText("Nombre:");

        txtNombreClienteVenta.setEditable(false);

        btnGenerarVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/print.png"))); // NOI18N
        btnGenerarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarVentaActionPerformed(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/money.png"))); // NOI18N
        jLabel10.setText("Total a pagar:");

        lblTotalPagar.setText("----------");

        btnGrafica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/torta.png"))); // NOI18N
        btnGrafica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGraficaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDniVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(txtNombreClienteVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jLabel9)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGenerarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(lblTotalPagar)
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCodigoVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDescripcionVenta, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCantidadVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPrecioVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtStockDisponible, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(dateCalendario, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(16, 16, 16)))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnGrafica, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                            .addComponent(btnEliminarVenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(18, Short.MAX_VALUE)
                        .addComponent(dateCalendario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnGrafica)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCodigoVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDescripcionVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCantidadVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPrecioVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtStockDisponible, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btnEliminarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(lblTotalPagar))
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btnGenerarVenta)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombreClienteVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDniVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15))))
        );

        tpPrincipal.addTab("Nueva Venta", jPanel2);

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel12.setText("DNI / CUIL:");

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel13.setText("Nombre:");

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel14.setText("Telefono:");

        jLabel15.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel15.setText("Direccion:");

        jLabel16.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel16.setText("Razon social:");

        txtTelefonoCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoClienteKeyTyped(evt);
            }
        });

        txtNombreCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreClienteKeyTyped(evt);
            }
        });

        txtDniCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDniClienteKeyTyped(evt);
            }
        });

        tblCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "DNI/CUIL", "NOMBRE", "TELEFONO", "DIRECCION", "RAZON SOCIAL"
            }
        ));
        tblCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblClienteMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblCliente);
        if (tblCliente.getColumnModel().getColumnCount() > 0) {
            tblCliente.getColumnModel().getColumn(0).setPreferredWidth(25);
            tblCliente.getColumnModel().getColumn(1).setPreferredWidth(20);
            tblCliente.getColumnModel().getColumn(2).setPreferredWidth(60);
            tblCliente.getColumnModel().getColumn(3).setPreferredWidth(60);
            tblCliente.getColumnModel().getColumn(4).setPreferredWidth(60);
            tblCliente.getColumnModel().getColumn(5).setPreferredWidth(60);
        }

        btnGuardarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/GuardarTodo.png"))); // NOI18N
        btnGuardarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarClienteActionPerformed(evt);
            }
        });

        btnEditarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Actualizar (2).png"))); // NOI18N
        btnEditarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarClienteActionPerformed(evt);
            }
        });

        btnEliminarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eliminar.png"))); // NOI18N
        btnEliminarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarClienteActionPerformed(evt);
            }
        });

        btnNuevoCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/nuevo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jLabel15)
                            .addComponent(jLabel14)
                            .addComponent(jLabel16))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtRazonCliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                            .addComponent(txtDireccionCliente, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTelefonoCliente, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombreCliente, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDniCliente, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnEliminarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnGuardarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnNuevoCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                            .addComponent(btnEditarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 584, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel12)
                                    .addComponent(txtDniCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel13)
                                    .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel14)
                                    .addComponent(txtTelefonoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel15)
                                    .addComponent(txtDireccionCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel16)
                                    .addComponent(txtRazonCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27)
                                .addComponent(btnGuardarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnEditarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnNuevoCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                            .addComponent(btnEliminarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13))
        );

        tpPrincipal.addTab("Cliente", jPanel3);

        jLabel17.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel17.setText("DNI / CUIL:");

        jLabel18.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel18.setText("Nombre:");

        jLabel19.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel19.setText("Telefono:");

        jLabel20.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel20.setText("Direccion:");

        jLabel21.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel21.setText("Razon social:");

        txtTelefonoProveedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoProveedorKeyTyped(evt);
            }
        });

        tblProveedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "DNI/CUIL", "NOMBRE", "TELEFONO", "DIRECCION", "RAZON SOCIAL"
            }
        ));
        tblProveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProveedorMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblProveedor);
        if (tblProveedor.getColumnModel().getColumnCount() > 0) {
            tblProveedor.getColumnModel().getColumn(0).setPreferredWidth(15);
            tblProveedor.getColumnModel().getColumn(1).setPreferredWidth(20);
            tblProveedor.getColumnModel().getColumn(2).setPreferredWidth(60);
            tblProveedor.getColumnModel().getColumn(3).setPreferredWidth(60);
            tblProveedor.getColumnModel().getColumn(4).setPreferredWidth(60);
            tblProveedor.getColumnModel().getColumn(5).setPreferredWidth(60);
        }

        btnGuardarProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/GuardarTodo.png"))); // NOI18N
        btnGuardarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarProveedorActionPerformed(evt);
            }
        });

        btnEditarProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Actualizar (2).png"))); // NOI18N
        btnEditarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarProveedorActionPerformed(evt);
            }
        });

        btnEliminarProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eliminar.png"))); // NOI18N
        btnEliminarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarProveedorActionPerformed(evt);
            }
        });

        btnNuevoProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/nuevo.png"))); // NOI18N

        txtCuilProveedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCuilProveedorKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18)
                            .addComponent(jLabel20)
                            .addComponent(jLabel19)
                            .addComponent(jLabel21))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtRazonProveedor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                            .addComponent(txtDireccionProveedor, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTelefonoProveedor, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombreProveedor, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCuilProveedor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnEliminarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnGuardarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnNuevoProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEditarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 584, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txtCuilProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txtNombreProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(txtTelefonoProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(txtDireccionProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(txtRazonProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(btnGuardarProveedor, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                        .addGap(31, 31, 31))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(btnEditarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEliminarProveedor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNuevoProveedor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 828, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 374, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 12, Short.MAX_VALUE)))
        );

        tpPrincipal.addTab("Proveedor", jPanel4);

        jLabel22.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel22.setText("Codigo:");

        jLabel23.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel23.setText("Descripcion:");

        jLabel24.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel24.setText("Cantidad");

        jLabel25.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel25.setText("Precio");

        jLabel26.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel26.setText("Proveedor:");

        txtPrecioPro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioProKeyTyped(evt);
            }
        });

        txtCantidadPro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantidadProKeyTyped(evt);
            }
        });

        txtCodigoPro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodigoProKeyTyped(evt);
            }
        });

        tblProducto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "CODIGO", "DESCRIPCION", "PROVEEDOR", "STOCK", "PRECIO"
            }
        ));
        tblProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProductoMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tblProducto);
        if (tblProducto.getColumnModel().getColumnCount() > 0) {
            tblProducto.getColumnModel().getColumn(0).setPreferredWidth(10);
            tblProducto.getColumnModel().getColumn(1).setPreferredWidth(20);
            tblProducto.getColumnModel().getColumn(2).setPreferredWidth(90);
            tblProducto.getColumnModel().getColumn(3).setPreferredWidth(60);
            tblProducto.getColumnModel().getColumn(4).setPreferredWidth(30);
            tblProducto.getColumnModel().getColumn(5).setPreferredWidth(30);
        }

        btnExcelPro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/excel.png"))); // NOI18N

        btnGuardarPro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/GuardarTodo.png"))); // NOI18N
        btnGuardarPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarProActionPerformed(evt);
            }
        });

        btnEditarPro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Actualizar (2).png"))); // NOI18N
        btnEditarPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarProActionPerformed(evt);
            }
        });

        btnEliminarPro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eliminar.png"))); // NOI18N
        btnEliminarPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarProActionPerformed(evt);
            }
        });

        btnNuevoPro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/nuevo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel23)
                                    .addComponent(jLabel25)
                                    .addComponent(jLabel24)
                                    .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                                    .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtCodigoPro, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPrecioPro)
                                    .addComponent(txtCantidadPro)
                                    .addComponent(txtDescripcionPro)
                                    .addComponent(cmbProveedorPro, 0, 139, Short.MAX_VALUE)))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(btnExcelPro, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(btnNuevoPro, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(btnGuardarPro, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnEditarPro, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnEliminarPro, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(txtIdPro, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 579, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(txtIdPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(txtCodigoPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(txtDescripcionPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(txtCantidadPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(txtPrecioPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(cmbProveedorPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(btnEliminarPro, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btnEditarPro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGuardarPro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnExcelPro, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNuevoPro, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        tpPrincipal.addTab("Productos", jPanel5);

        tblDetalleVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "CLIENTE", "VENDEDOR", "TOTAL"
            }
        ));
        jScrollPane5.setViewportView(tblDetalleVentas);
        if (tblDetalleVentas.getColumnModel().getColumnCount() > 0) {
            tblDetalleVentas.getColumnModel().getColumn(0).setPreferredWidth(20);
            tblDetalleVentas.getColumnModel().getColumn(1).setPreferredWidth(60);
            tblDetalleVentas.getColumnModel().getColumn(2).setPreferredWidth(60);
            tblDetalleVentas.getColumnModel().getColumn(3).setPreferredWidth(60);
        }

        btnPdfVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pdf.png"))); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 736, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(btnPdfVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(104, 104, 104)
                        .addComponent(txtIdVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPdfVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIdVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tpPrincipal.addTab("Ventas", jPanel6);

        jLabel27.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel27.setText("CUIL:");

        jLabel28.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel28.setText("NOMBRE:");

        jLabel29.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel29.setText("TELEFONO:");

        txtCuilEmpresa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCuilEmpresaKeyPressed(evt);
            }
        });

        txtTelefonoEmpresa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTelefonoEmpresaKeyPressed(evt);
            }
        });

        jLabel30.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel30.setText("DIRECCION:");

        jLabel31.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel31.setText("RAZON SOCIAL:");

        btnActualizarEmpresa.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnActualizarEmpresa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Actualizar (2).png"))); // NOI18N
        btnActualizarEmpresa.setText("ACTUALIZAR");
        btnActualizarEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarEmpresaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel27)
                            .addComponent(jLabel30)
                            .addComponent(txtDireccionEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCuilEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtRazonEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel31)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNombreEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel28))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel29)
                                    .addComponent(txtTelefonoEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(282, 282, 282)
                        .addComponent(btnActualizarEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(169, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(jLabel28)
                    .addComponent(jLabel29))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCuilEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombreEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefonoEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(jLabel31))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtRazonEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDireccionEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addComponent(btnActualizarEmpresa)
                .addGap(68, 68, 68))
        );

        tpPrincipal.addTab("Configuracion", jPanel7);

        getContentPane().add(tpPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 830, 400));

        lblVendedor.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        getContentPane().add(lblVendedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 80, 240, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //********************FUNCIONES PARA EL CLIENTE*****************************
    //MOSTRAR CLIENTES EN TABLA CLIENTES
    public void listarClientes() {
        limpiarTabala();
        List<Cliente> lista = control.listarClientes();
        modeloTabla = (DefaultTableModel) tblCliente.getModel();

        Object[] ob = new Object[6];
        for (int i = 0; i < lista.size(); i++) {
            ob[0] = lista.get(i).getId();
            ob[1] = lista.get(i).getDni();
            ob[2] = lista.get(i).getNombre();
            ob[3] = lista.get(i).getTelefono();
            ob[4] = lista.get(i).getDireccion();
            ob[5] = lista.get(i).getRazon();
            modeloTabla.addRow(ob);

        }

        tblCliente.setModel(modeloTabla);

    }

    //BOTON GUARDAR CLIENTE
    private void btnGuardarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarClienteActionPerformed
        if (!"".equals(txtDniCliente.getText()) || !"".equals(txtNombreCliente.getText()) || !"".equals(txtTelefonoCliente.getText()) || !"".equals(txtDireccionCliente.getText())) {
            cli = new Cliente();
            cli.setDni(txtDniCliente.getText().trim());
            cli.setDireccion(txtDireccionCliente.getText());
            cli.setNombre(txtNombreCliente.getText());
            cli.setTelefono(txtTelefonoCliente.getText().trim());
            cli.setRazon(txtRazonCliente.getText());
            if (control.verificarCliente(cli.getDni()) == false) {
                control.registrarCliente(cli);
                JOptionPane.showMessageDialog(null, "Operacion exitosa");
                this.listarClientes();
                this.limpiarCamposTextField("cliente");
            } else {
                JOptionPane.showMessageDialog(null, "Cliente ya registrado");
            }

        } else {
            JOptionPane.showMessageDialog(null, "Debe completar los campos obligatorios");
        }
    }//GEN-LAST:event_btnGuardarClienteActionPerformed
    //ENTRADA PARA TELEFONO
    private void txtTelefonoClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoClienteKeyTyped
        validar.soloNumeros(evt);
    }//GEN-LAST:event_txtTelefonoClienteKeyTyped
    //ENTRADA SOLO NUMEROS PARA DNI CLIENTE
    private void txtDniClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDniClienteKeyTyped
        validar.soloNumeros(evt);
    }//GEN-LAST:event_txtDniClienteKeyTyped
    //MOSTRAR PANEL CLIENTES
    private void btnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesActionPerformed
        tpPrincipal.setSelectedIndex(1);
        //limpiarTabala();
        this.listarClientes();

    }//GEN-LAST:event_btnClientesActionPerformed
    //LLENAR CAMPOS DE CLIENTE DE LA FILA SELECCIONADA
    private void tblClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblClienteMouseClicked
        int fila = tblCliente.rowAtPoint(evt.getPoint());
        txtDniCliente.setText(tblCliente.getValueAt(fila, 1).toString());
        txtNombreCliente.setText(tblCliente.getValueAt(fila, 2).toString());
        txtTelefonoCliente.setText(tblCliente.getValueAt(fila, 3).toString());
        txtDireccionCliente.setText(tblCliente.getValueAt(fila, 4).toString());
        txtRazonCliente.setText(tblCliente.getValueAt(fila, 5).toString());
    }//GEN-LAST:event_tblClienteMouseClicked
    //BOTON ELIMINAR CLIENTE
    private void btnEliminarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarClienteActionPerformed
        int pregunta = JOptionPane.showConfirmDialog(null, "¿Seguro que desea eliminar este cliente?");
        if (pregunta == 0) {
            if (tblCliente.getSelectedRow()!=-1) {
                if (control.eliminarCliente(Integer.parseInt(tblCliente.getValueAt(tblCliente.getSelectedRow(), 0).toString())) == true) {
                    JOptionPane.showMessageDialog(null, "Cliente eliminado");
                    this.limpiarCamposTextField("cliente");
                    this.listarClientes();
                }else{
                    JOptionPane.showMessageDialog(null, "Error al eliminar cliente");
                }
            }else{
                JOptionPane.showMessageDialog(null, "Seleccione un cliente");
            }
        }
    }//GEN-LAST:event_btnEliminarClienteActionPerformed
    //BOTON EDITAR CLIENTE
    private void btnEditarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarClienteActionPerformed
        if (tblCliente.getRowCount() > 0) {
            if (tblCliente.getSelectedRow() != -1) {
                cli = new Cliente();
                cli.setDireccion(txtDireccionCliente.getText());
                cli.setDni(txtDniCliente.getText());
                cli.setId(Integer.parseInt((String) tblCliente.getValueAt(tblCliente.getSelectedRow(), 0).toString()));
                cli.setNombre(txtNombreCliente.getText());
                cli.setRazon(txtRazonCliente.getText());
                cli.setTelefono(txtTelefonoCliente.getText());
                if (control.editarCliente(cli) == false) {
                    JOptionPane.showMessageDialog(null, "Operacion exitosa!");
                    this.listarClientes();
                } else {
                    JOptionPane.showMessageDialog(null, "No se pudo editar el ciente");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Seleccione un cliente");
            }
        } else {
            JOptionPane.showInputDialog("No hay clientes para editar");
        }

    }//GEN-LAST:event_btnEditarClienteActionPerformed

    //********************FUNCIONES PARA EL PROVEEDOR*****************************
    //MOSTRAR PANEL DE PROVEEDOR
    private void btnProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProveedorActionPerformed
        tpPrincipal.setSelectedIndex(2);
        this.listarProveedor();

    }//GEN-LAST:event_btnProveedorActionPerformed
    //BOTON PARA GUARDAR PROVEEDOR
    private void btnGuardarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarProveedorActionPerformed
        if (!"".equals(txtCuilProveedor.getText()) || !"".equals(txtNombreProveedor.getText())
                || !"".equals(txtTelefonoProveedor.getText()) || !"".equals(txtDireccionProveedor.getText()) || !"".equals(txtRazonProveedor.getText())) {
            pr = new Proveedor();
            pr.setCuil(txtCuilProveedor.getText());
            pr.setDireccion(txtDireccionProveedor.getText());
            pr.setNombre(txtNombreProveedor.getText());
            pr.setTelefono(txtTelefonoProveedor.getText().trim());
            pr.setRazon(txtRazonProveedor.getText());
            if (JOptionPane.showConfirmDialog(null, "¿Guardar Proveedor?") == 0) {
                if (control.verificarProveedor(pr.getCuil())==false) {

                    if (control.registrarProveedor(pr) == false) {
                        JOptionPane.showMessageDialog(null, "REGISTRADO");
                        listarProveedor();
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "Cuil existente");
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe completar todos los campos");
        }
    }//GEN-LAST:event_btnGuardarProveedorActionPerformed
    //LLENAR CAMPOS DE PROVEEDOR CON FILA SELECCIONADA
    private void tblProveedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProveedorMouseClicked
        int fila = tblProveedor.rowAtPoint(evt.getPoint());
        txtCuilProveedor.setText(tblProveedor.getValueAt(fila, 1).toString());
        txtNombreProveedor.setText(tblProveedor.getValueAt(fila, 2).toString());
        txtTelefonoProveedor.setText(tblProveedor.getValueAt(fila, 3).toString());
        txtDireccionProveedor.setText(tblProveedor.getValueAt(fila, 4).toString());
        txtRazonProveedor.setText(tblProveedor.getValueAt(fila, 5).toString());
    }//GEN-LAST:event_tblProveedorMouseClicked
    //BOTON PARA EDITAR UN PROVEEDOR
    private void btnEditarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarProveedorActionPerformed
        if (tblProveedor.getSelectedRow() != -1) {
            if (!"".equals(txtCuilProveedor.getText()) || !"".equals(txtNombreProveedor.getText())
                    || !"".equals(txtTelefonoProveedor.getText()) || !"".equals(txtDireccionProveedor.getText())) {
                pr = new Proveedor();
                pr.setId(Integer.parseInt(tblProveedor.getValueAt(tblProveedor.getSelectedRow(), 0).toString()));
                pr.setCuil(txtCuilProveedor.getText());
                pr.setNombre(txtNombreProveedor.getText());
                pr.setDireccion(txtDireccionProveedor.getText());
                pr.setTelefono(txtTelefonoProveedor.getText());
                pr.setRazon(txtRazonProveedor.getText());

                if (JOptionPane.showConfirmDialog(null, "Editar proveedor?") == 0) {
                    try {
                        if (control.editarProveedor(pr) == false) {
                            JOptionPane.showMessageDialog(null, "Operacion exitosa");
                            limpiarCamposTextField("proveedor");
                            this.listarProveedor();
                        } else {
                            JOptionPane.showMessageDialog(null, "Error al editar proveedor");

                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(Sistema.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "Debe completar todos los campos");
            }
        }


    }//GEN-LAST:event_btnEditarProveedorActionPerformed
    //BOTON PARA ELIMINAR UN PROVEEDOR
    private void btnEliminarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarProveedorActionPerformed

        if (tblProveedor.getRowCount() > 0) {
            if (tblProveedor.getSelectedRow() != -1) {
                if (JOptionPane.showConfirmDialog(null, "Eliminar proveedor?") == 0) {
                    if (control.eliminarProveedor(Integer.parseInt(tblProveedor.getValueAt(tblProveedor.getSelectedRow(),0).toString()))) {
                        JOptionPane.showMessageDialog(null, "Proveedor eliminado");
                        this.listarProveedor();
                    } else {
                        JOptionPane.showMessageDialog(null, "No se pudo eliminar proveedor");
                    }
                }
            }

        }
    }//GEN-LAST:event_btnEliminarProveedorActionPerformed
    //LISTA LOS PROVEEDORES EN LA TABLA DE PROVEEDORES
    public void listarProveedor() {
        limpiarTabala();
        limpiarCamposTextField("proveedor");
        List<Proveedor> lista = control.listarProveedor();
        modeloTabla = (DefaultTableModel) tblProveedor.getModel();
        Object[] ob = new Object[6];
        for (int i = 0; i < lista.size(); i++) {
            ob[0] = lista.get(i).getId();
            ob[1] = lista.get(i).getCuil();
            ob[2] = lista.get(i).getNombre();
            ob[3] = lista.get(i).getTelefono();
            ob[4] = lista.get(i).getDireccion();
            ob[5] = lista.get(i).getRazon();
            modeloTabla.addRow(ob);
        }
        tblProveedor.setModel(modeloTabla);

    }

//********************FUNCIONES PARA PRODUCTOS*****************************
    //MUESTRA EL PANEL PRODUCTOS
    private void btnProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductosActionPerformed
        tpPrincipal.setSelectedIndex(3);
        this.comboBox();
        this.listarProductos();

    }//GEN-LAST:event_btnProductosActionPerformed
    //GUARDAR PRODUCTO
    private void btnGuardarProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarProActionPerformed
        if (!"".equals(txtCodigoPro.getText()) || !"".equals(txtCantidadPro.getText())
                || !"".equals(txtPrecioPro.getText()) || cmbProveedorPro.getSelectedIndex() != -1) {
            prod = new Producto();
            prod.setCodigo(Integer.parseInt(txtCodigoPro.getText()));
            prod.setPrecio(Double.parseDouble(txtPrecioPro.getText()));
            prod.setProveedor((Proveedor) cmbProveedorPro.getSelectedItem());
            prod.setStock(Integer.parseInt(txtCantidadPro.getText()));
            prod.setDescripcion(txtDescripcionPro.getText());
            if (JOptionPane.showConfirmDialog(null, "¿Guardar producto?") == 0) {
                if (control.verificarProducto(prod.getCodigo()) == false) {
                    if (control.guardarProductos(prod) == false) {
                        JOptionPane.showMessageDialog(null, "Producto guardado");
                        listarProductos();
                    } else {
                        JOptionPane.showMessageDialog(null, "Error al guardar cambios");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Codigo repetido");
                    txtCodigoPro.setText("");
                    txtCodigoPro.requestFocus();
                }

            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe completar todos los campos");
        }
    }//GEN-LAST:event_btnGuardarProActionPerformed
    //LLEAR CAMPOS CON FILA SELECCIONADA
    private void tblProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProductoMouseClicked
        int fila = tblProducto.getSelectedRow();
        //txtIdPro.setText(tblProducto.getValueAt(fila, 0).toString());
        txtCodigoPro.setText(tblProducto.getValueAt(fila, 1).toString());
        txtDescripcionPro.setText(tblProducto.getValueAt(fila, 2).toString());
        cmbProveedorPro.setEditable(true);
        cmbProveedorPro.setSelectedItem(tblProducto.getValueAt(fila, 3));
        cmbProveedorPro.setEditable(false);
        txtCantidadPro.setText(tblProducto.getValueAt(fila, 4).toString());
        txtPrecioPro.setText(tblProducto.getValueAt(fila, 5).toString());

        System.out.println(fila);
        System.out.println(tblProducto.getValueAt(fila, 0));

    }//GEN-LAST:event_tblProductoMouseClicked
    //ELIMINAR PRODUCTO
    private void btnEliminarProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarProActionPerformed

        if (tblProducto.getRowCount() > 0) {
            if (tblProducto.getSelectedRow() != -1) {
                if (JOptionPane.showConfirmDialog(null, "¡Seguro desea eliminar este producto?") == 0) {
                    control.eliminarProducto(Integer.parseInt(tblProducto.getValueAt(tblProducto.getSelectedRow(), 0).toString()));
                    JOptionPane.showMessageDialog(null, "Operacion exitosa");
                    this.listarProductos();
                } else {
                    JOptionPane.showMessageDialog(null, "Error al eliminar el producto");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Seleccione un producto");
            }
        } else {
            JOptionPane.showMessageDialog(null, "No hay productos para eliminar");
        }

    }//GEN-LAST:event_btnEliminarProActionPerformed
    //EDITAR PRODUCTO
    private void btnEditarProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarProActionPerformed
        if (tblProducto.getSelectedRow() != -1) {
            if (!"".equals(txtCodigoPro.getText()) || !"".equals(txtDescripcionPro.getText())
                    || !"".equals(txtCantidadPro.getText()) || !"".equals(txtPrecioPro.getText()) || !"".equals(cmbProveedorPro.getSelectedItem())) {
                prod = new Producto();
                prod.setId(Integer.parseInt(tblProducto.getValueAt(tblProducto.getSelectedRow(), 0).toString()));
                prod.setCodigo(Integer.parseInt(txtCodigoPro.getText()));
                prod.setDescripcion(txtDescripcionPro.getText());
                prod.setPrecio(Double.parseDouble(txtPrecioPro.getText()));
                prod.setStock(Integer.parseInt(txtCantidadPro.getText()));
                prod.setProveedor((Proveedor) cmbProveedorPro.getSelectedItem());
                if (JOptionPane.showConfirmDialog(null, "¡Guardar cambios?") == 0) {
                    if (control.editarProducto(prod) == false) {
                        JOptionPane.showMessageDialog(null, "Operacion exitosa");
                        this.listarProductos();
                    } else {
                        JOptionPane.showMessageDialog(null, "Error al guardar cambios");
                    }
                }

            } else {
                JOptionPane.showMessageDialog(null, "Debe completar todos los campos");

            }
        }
    }//GEN-LAST:event_btnEditarProActionPerformed
    //LISTAR PRODUCTOS EN TABLA PRODUCTOS
    public void listarProductos() {
        this.limpiarCamposTextField("producto");
        this.limpiarTabala();
        List<Producto> lista = new ArrayList();
        lista = control.listarProducto();
        modeloTabla = (DefaultTableModel) tblProducto.getModel();
        Object[] ob = new Object[6];
        // modeloTabla = new DefaultTableModel();
        for (int i = 0; i < lista.size(); i++) {
            ob[0] = lista.get(i).getId();
            ob[1] = lista.get(i).getCodigo();
            ob[2] = lista.get(i).getDescripcion();
            ob[3] = lista.get(i).getProveedor();
            ob[4] = lista.get(i).getStock();
            ob[5] = lista.get(i).getPrecio();
            modeloTabla.addRow(ob);
        }
        tblProducto.setModel(modeloTabla);
    }

//  ********************FUNCIONES PARA VENTAS*****************************
    //OBTENER DATOS POR CODIGO DE PRODUCTO
    private void txtCodigoVentaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoVentaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (!"".equals(txtCodigoVenta.getText())) {
                prod = new Producto();
                int codigo = Integer.parseInt(txtCodigoVenta.getText());
                prod = control.buscarProducto(codigo);
                if (prod.getDescripcion() != null) {
                    txtDescripcionVenta.setText("" + prod.getDescripcion());
                    txtPrecioVenta.setText("" + prod.getPrecio());
                    txtStockDisponible.setText("" + prod.getStock());
                    txtCantidadVenta.requestFocus();
                } else {
                    this.limpiarCamposTextField("ventas");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Ingrese codigo de producto");
                txtCodigoVenta.requestFocus();
            }
        }
    }//GEN-LAST:event_txtCodigoVentaKeyPressed
    //MOSTRAR PANEL DE VENTAS
    private void btnNuevaVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaVentaActionPerformed
        tpPrincipal.setSelectedIndex(0);
        txtCodigoVenta.requestFocus();
    }//GEN-LAST:event_btnNuevaVentaActionPerformed
    //INGRESAR PRODUCTO A LA TABLA VERIFICANDO QUE ESTE NO ESTE AUN EN LA TABLA
    private void txtCantidadVentaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadVentaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (!"".equals(txtCantidadVenta.getText())) {

                int codigo = Integer.parseInt(txtCodigoVenta.getText());
                String descripcion = txtDescripcionVenta.getText();
                int cantidad = Integer.parseInt(txtCantidadVenta.getText());
                double precio = Double.parseDouble(txtPrecioVenta.getText());
                double total = cantidad * precio;
                int stock = Integer.parseInt(txtStockDisponible.getText());
                if (stock >= cantidad) {
                    modeloTablaVenta = (DefaultTableModel) tblVenta.getModel();
                    for (int i = 0; i < tblVenta.getRowCount(); i++) {
                        if (tblVenta.getValueAt(i, 1).equals(txtDescripcionVenta.getText())) {
                            JOptionPane.showMessageDialog(null, "Producto ya ingresado");
                            return;
                        }
                    }
                    item = item + 1;
                    ArrayList lista = new ArrayList();
                    lista.add(item);
                    lista.add(codigo);
                    lista.add(descripcion);
                    lista.add(cantidad);
                    lista.add(precio);
                    lista.add(total);
                    Object[] ob = new Object[5];
                    ob[0] = lista.get(1);
                    ob[1] = lista.get(2);
                    ob[2] = lista.get(3);
                    ob[3] = lista.get(4);
                    ob[4] = lista.get(5);

                    modeloTablaVenta.addRow(ob);
                    tblVenta.setModel(modeloTablaVenta);
                    this.totalPagar();
                    this.limpiarCamposTextField("ventas");
                } else {
                    JOptionPane.showMessageDialog(null, "Stock no disponible");
                    txtCantidadVenta.setText("");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Ingrese cantidad");
            }
        }
    }//GEN-LAST:event_txtCantidadVentaKeyPressed
    //QUITAR VENTA DE LA TABLA
    private void btnEliminarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarVentaActionPerformed
        if (tblVenta.getSelectedRow() != -1) {
            modeloTabla = (DefaultTableModel) tblVenta.getModel();
            modeloTabla.removeRow(tblVenta.getSelectedRow());
            totalPagar();
            txtCodigoVenta.requestFocus();
        } else {
            JOptionPane.showMessageDialog(null, "Eliga un producto");
        }


    }//GEN-LAST:event_btnEliminarVentaActionPerformed
    //BUSCAR CLIENTE POR EL DNI
    private void txtDniVentaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDniVentaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (!"".equals(txtDniVenta.getText())) {
                cli = new Cliente();
                cli = control.buscarCliente(txtDniVenta.getText());
                if (cli != null) {
                    txtNombreClienteVenta.setText("" + cli.getNombre());
                } else {
                    if (JOptionPane.showConfirmDialog(null, "No se encontro cliente.¿Desea registrar uno?") == 0) {
                        tpPrincipal.setSelectedIndex(1);

                    } else {
                        txtDniVenta.setText("");
                        txtDniVenta.requestFocus();
                    }

                }

            }
        }
    }//GEN-LAST:event_txtDniVentaKeyPressed
    //BOTON PARA REGISTRAR LA VENTA
    private void btnGenerarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarVentaActionPerformed
        if (tblVenta.getRowCount() > 0) {
            if (!"".equals(txtNombreClienteVenta.getText())) {
                if (JOptionPane.showConfirmDialog(null, "¿Generar venta?") == 0) {
                    this.registrarVenta();
                    txtDniVenta.setText("");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Debe ingresar un cliente");
            }
        } else {
            JOptionPane.showMessageDialog(null, "No hay productos cargador");
        }

    }//GEN-LAST:event_btnGenerarVentaActionPerformed
    //REGISTRAR VENTA
    public void registrarVenta() {
        venta = new Venta();
        venta.setCliente(cli);
        venta.setVendedor(vendedor);
        venta.setTotal(totalPagar);
        venta.setFecha(fechaActual);
        if (control.registrarVenta(venta) == true) {
            this.registrarDetalleVenta();
            JOptionPane.showMessageDialog(null, "Venta registrada");
            this.limpiarTablaVentas();

        }
    }

    //REGISTRAR DETALLES DE LA VENTA
    public void registrarDetalleVenta() {

        detalle = new DetalleVenta();
        int idMax = control.obtenerIdUltimaVenta() - 1;
        if (idMax != 0) {
            venta.setId(idMax);
        }
        for (int i = 0; i < tblVenta.getRowCount(); i++) {
            detalle.setProducto(control.buscarProducto((int) tblVenta.getValueAt(i, 0)));
            detalle.setCanttidad((int) tblVenta.getValueAt(i, 2));
            detalle.setVenta(venta);
            control.registrarDetalle(detalle);
            prod.setStock(prod.getStock() - (int) tblVenta.getValueAt(i, 2));
            control.actualizarStock(prod);
        }
        System.out.println(prod.getCodigo());

    }

    //  ********************FUNCIONES PARA VALIDAR ENTRADA DE CAMPOS DE TEXTO*****************************
    //VALIDAR ENTRADA CODIGO DE PRODUCTO EN VENTAS
    private void txtCodigoVentaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoVentaKeyTyped
        validar.soloNumeros(evt);
    }//GEN-LAST:event_txtCodigoVentaKeyTyped
    //VALIDAR ENTRADA CANTIDAD EN VENTAS
    private void txtCantidadVentaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadVentaKeyTyped
        validar.soloNumeros(evt);
    }//GEN-LAST:event_txtCantidadVentaKeyTyped
    //VALIDAR ENTRADA PARA DNI EN VENTAS
    private void txtDniVentaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDniVentaKeyTyped
        validar.soloNumeros(evt);
    }//GEN-LAST:event_txtDniVentaKeyTyped
    //VALIDAR VALIDAR ENTRADA PARA NOMBRE CLIENTE
    private void txtNombreClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreClienteKeyTyped
        validar.soloTexto(evt);
    }//GEN-LAST:event_txtNombreClienteKeyTyped
    //VALIDAR ENTRADA CUIL PROVEEDOR
    private void txtCuilProveedorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCuilProveedorKeyTyped
        validar.soloNumeros(evt);
    }//GEN-LAST:event_txtCuilProveedorKeyTyped
    //VALIDAR ENTRADA TELEFONO PROVEEDOR
    private void txtTelefonoProveedorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoProveedorKeyTyped
        validar.soloNumeros(evt);
    }//GEN-LAST:event_txtTelefonoProveedorKeyTyped
    //VALIDAR ENTRADA CODIGO DE PRODUCTO
    private void txtCodigoProKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoProKeyTyped
        validar.soloNumeros(evt);
    }//GEN-LAST:event_txtCodigoProKeyTyped
    //VALIDAR ENTRADA STOCK DE PRODUCTO
    private void txtCantidadProKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadProKeyTyped
        validar.soloNumeros(evt);
    }//GEN-LAST:event_txtCantidadProKeyTyped
    //VALIDAR ENTRADA PRECIO DE PRODUCTO
    private void txtPrecioProKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioProKeyTyped
        validar.aceptarDecimales(evt, txtPrecioPro);
    }//GEN-LAST:event_txtPrecioProKeyTyped

//***************FUNCIONES DE DETALLE DE VENTAS************************** 
    //PANEL DE VENTAS
    private void btnVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentasActionPerformed
        tpPrincipal.setSelectedIndex(4);
        this.listarTablaVentas();
    }//GEN-LAST:event_btnVentasActionPerformed
    //MOSTRAR GRAFICO DE VENTAS
    private void btnGraficaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGraficaActionPerformed
        if (dateCalendario.getDate() != null) {
            String fecha = new SimpleDateFormat("dd/MM/yyyy").format(dateCalendario.getDate());

            if (control.graficoVentas(fecha) == false) {
                JOptionPane.showMessageDialog(null, "No hay ventas correspondientes a esta fecha");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Indique una fecha");
        }


    }//GEN-LAST:event_btnGraficaActionPerformed
    //PERMITIR SOLO NUMEROS EN CUIL DE EMPRESA
    private void txtCuilEmpresaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCuilEmpresaKeyPressed
        validar.soloNumeros(evt);
    }//GEN-LAST:event_txtCuilEmpresaKeyPressed
    //PERMITIR SOLO NUMEROS EN TELEFONO EMPRESA
    private void txtTelefonoEmpresaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoEmpresaKeyPressed
        validar.soloNumeros(evt);
    }//GEN-LAST:event_txtTelefonoEmpresaKeyPressed

    private void btnActualizarEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarEmpresaActionPerformed
        if (!"".equals(txtCuilEmpresa.getText()) || !"".equals(txtNombreEmpresa.getText())
                || !"".equals(txtDireccionEmpresa.getText()) || !"".equals(txtTelefonoEmpresa.getText())
                || !"".equals(txtRazonEmpresa.getText())) {

            empresa = new Empresa();
            empresa.setCuil(txtCuilEmpresa.getText());
            empresa.setDireccion(txtDireccionEmpresa.getText());
            empresa.setNombre(txtNombreEmpresa.getText());
            empresa.setRazonSocial(txtRazonEmpresa.getText());
            empresa.setTelefono(txtTelefonoEmpresa.getText());
            control.editarEmpresa(empresa);
        }
    }//GEN-LAST:event_btnActualizarEmpresaActionPerformed

    private void btnNuevaVenta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaVenta1ActionPerformed
        Registro regi = new Registro();
        regi.setVisible(true);
        regi.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnNuevaVenta1ActionPerformed
    //LISTAR TABLA DETALLE VENTAS
    public void listarTablaVentas() {
        this.limpiarTabala();
        List<Venta> lista = new ArrayList();
        lista = control.listarTablaVentas();
        modeloTabla = (DefaultTableModel) tblDetalleVentas.getModel();
        Object[] ob = new Object[4];
        for (int i = 0; i < lista.size(); i++) {
            ob[0] = lista.get(i).getId();
            ob[1] = lista.get(i).getCliente().getNombre();
            ob[2] = lista.get(i).getVendedor().getNombre();
            ob[3] = lista.get(i).getTotal();
            modeloTabla.addRow(ob);
        }
        tblDetalleVentas.setModel(modeloTabla);
    }

//************OTRAS FUNCIONES GENERALES***************************
    //LLENAR EL COMBOBOX CON PROVEEDORES
    public void comboBox() {
        cmbProveedorPro.removeAllItems();
        modeloComboBox.insertElementAt("", 0);
        List<Proveedor> lista = control.listarProveedor();
        lista = control.listarProveedor();
        for (int i = 0; i < lista.size(); i++) {
            modeloComboBox.addElement(lista.get(i));
        }
        cmbProveedorPro.setModel(modeloComboBox);
    }

    //CALCULAR EL TOTAL DE LA VENTA PARA INDICAR EN RESPECTIVO LABEL
    private void totalPagar() {
        totalPagar = 0.00;
        int fila = tblVenta.getRowCount();
        for (int i = 0; i < fila; i++) {
            double calcular = Double.parseDouble(String.valueOf(tblVenta.getModel().getValueAt(i, 4)));
            totalPagar = totalPagar + calcular;
        }
        lblTotalPagar.setText("$" + String.format("%.2f", totalPagar));
    }

    //LIMPIAR CAMPOS TEXTFIELD;
    public void limpiarCamposTextField(String panel) {

        switch (panel) {
            case "cliente" -> {
                txtDniCliente.setText("");
                txtNombreCliente.setText("");
                txtDireccionCliente.setText("");
                txtRazonCliente.setText("");
                txtTelefonoCliente.setText("");
            }
            case "proveedor" -> {
                txtCuilProveedor.setText("");
                txtNombreProveedor.setText("");
                txtDireccionProveedor.setText("");
                txtTelefonoProveedor.setText("");
                txtRazonProveedor.setText("");
            }
            case "producto" -> {
                txtIdPro.setText("");
                txtCodigoPro.setText("");
                txtPrecioPro.setText("");
                txtDescripcionPro.setText("");
                txtCantidadPro.setText("");
                cmbProveedorPro.setSelectedIndex(0);
                txtIdPro.setText("");
            }
            case "ventas" -> {
                txtDescripcionVenta.setText("");
                txtPrecioVenta.setText("");
                txtStockDisponible.setText("");
                txtCantidadVenta.setText("");
                txtCodigoVenta.setText("");
                txtDniVenta.setText("");
                txtNombreClienteVenta.setText("");
                txtCodigoVenta.requestFocus();
            }
            default -> {
            }
        }
    }

    //LIMPIAR TABLAS
    public void limpiarTabala() {

        for (int i = 0; i < modeloTabla.getRowCount(); i++) {
            modeloTabla.removeRow(i);
            i = i - 1;
        }

    }

    //LIMPIAR TABLA DE VENTAS
    public void limpiarTablaVentas() {
        for (int i = 0; i < modeloTablaVenta.getRowCount(); i++) {
            modeloTablaVenta.removeRow(i);
            i = i - 1;
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarEmpresa;
    private javax.swing.JButton btnClientes;
    private javax.swing.JButton btnConfig;
    private javax.swing.JButton btnEditarCliente;
    private javax.swing.JButton btnEditarPro;
    private javax.swing.JButton btnEditarProveedor;
    private javax.swing.JButton btnEliminarCliente;
    private javax.swing.JButton btnEliminarPro;
    private javax.swing.JButton btnEliminarProveedor;
    private javax.swing.JButton btnEliminarVenta;
    private javax.swing.JButton btnExcelPro;
    private javax.swing.JButton btnGenerarVenta;
    private javax.swing.JButton btnGrafica;
    private javax.swing.JButton btnGuardarCliente;
    private javax.swing.JButton btnGuardarPro;
    private javax.swing.JButton btnGuardarProveedor;
    private javax.swing.JButton btnNuevaVenta;
    private javax.swing.JButton btnNuevaVenta1;
    private javax.swing.JButton btnNuevoCliente;
    private javax.swing.JButton btnNuevoPro;
    private javax.swing.JButton btnNuevoProveedor;
    private javax.swing.JButton btnPdfVentas;
    private javax.swing.JButton btnProductos;
    private javax.swing.JButton btnProveedor;
    private javax.swing.JButton btnVentas;
    private javax.swing.JComboBox<String> cmbProveedorPro;
    private com.toedter.calendar.JDateChooser dateCalendario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel lblTotalPagar;
    private javax.swing.JLabel lblVendedor;
    public javax.swing.JTable tblCliente;
    private javax.swing.JTable tblDetalleVentas;
    private javax.swing.JTable tblProducto;
    private javax.swing.JTable tblProveedor;
    private javax.swing.JTable tblVenta;
    private javax.swing.JTabbedPane tpPrincipal;
    private javax.swing.JTextField txtCantidadPro;
    private javax.swing.JTextField txtCantidadVenta;
    private javax.swing.JTextField txtCodigoPro;
    private javax.swing.JTextField txtCodigoVenta;
    private javax.swing.JTextField txtCuilEmpresa;
    private javax.swing.JTextField txtCuilProveedor;
    private javax.swing.JTextField txtDescripcionPro;
    private javax.swing.JTextField txtDescripcionVenta;
    private javax.swing.JTextField txtDireccionCliente;
    private javax.swing.JTextField txtDireccionEmpresa;
    private javax.swing.JTextField txtDireccionProveedor;
    private javax.swing.JTextField txtDniCliente;
    private javax.swing.JTextField txtDniVenta;
    private javax.swing.JTextField txtIdPro;
    private javax.swing.JTextField txtIdVenta;
    private javax.swing.JTextField txtNombreCliente;
    private javax.swing.JTextField txtNombreClienteVenta;
    private javax.swing.JTextField txtNombreEmpresa;
    private javax.swing.JTextField txtNombreProveedor;
    private javax.swing.JTextField txtPrecioPro;
    private javax.swing.JTextField txtPrecioVenta;
    private javax.swing.JTextField txtRazonCliente;
    private javax.swing.JTextField txtRazonEmpresa;
    private javax.swing.JTextField txtRazonProveedor;
    private javax.swing.JTextField txtStockDisponible;
    private javax.swing.JTextField txtTelefonoCliente;
    private javax.swing.JTextField txtTelefonoEmpresa;
    private javax.swing.JTextField txtTelefonoProveedor;
    // End of variables declaration//GEN-END:variables
}
