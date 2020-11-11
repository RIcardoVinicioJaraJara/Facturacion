/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.ControladorCategoria;
import Controlador.ControladorHistorial;
import Controlador.ControladorProducto;
import Controlador.ControladorProveedor;
import Modelo.Categoria;
import Modelo.Historial;
import Modelo.Producto;
import Modelo.Proveedor;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import javafx.scene.control.cell.TextFieldTableCell;
import net.sourceforge.barbecue.Barcode;
import net.sourceforge.barbecue.BarcodeFactory;

/**
 *
 * @author VINICIO
 *
 */
public class VistaProducto extends javax.swing.JInternalFrame {

    ControladorProducto controladorProducto;
    ControladorCategoria controladorCategoria;
    ControladorProveedor controladorProveedor;
    private ControladorHistorial controladorHistorial;
    private int codigoID = -999;
    private Producto productoAux = null;
    private boolean barraBandera = false;

    public VistaProducto() {
        initComponents();
        controladorProducto = new ControladorProducto();
        controladorCategoria = new ControladorCategoria();
        controladorProveedor = new ControladorProveedor();
        controladorHistorial = new ControladorHistorial();

        comboCategoria.addItem("SELCIONAR");
        comboCategoriaM.addItem("SELCIONAR");
        comboProveedor.addItem("SELCIONAR");
        comboProveedorM.addItem("SELCIONAR");

        List<Categoria> categorias = controladorCategoria.listar();
        List<Proveedor> proveedores = controladorProveedor.listar();
        for (Categoria p : categorias) {
            comboCategoria.addItem(p.getId() + ": " + p.getNombre());
            comboCategoriaM.addItem(p.getId() + ": " + p.getNombre());
        }
        for (Proveedor p : proveedores) {
            comboProveedor.addItem(p.getId() + ": " + p.getNombre());
            comboProveedorM.addItem(p.getId() + ": " + p.getNombre());
        }
        //actualizarCodigo();
        cargarCombo();

    }

    public void cargarCombo() {
        txtPrecioClie.removeAllItems();
        txtPrecioPro.removeAllItems();
        txtPrecioClieM.removeAllItems();
        txtPrecioProM.removeAllItems();
        for (int i = 0; i < 100; i++) {
            txtPrecioClie.addItem(i + "");
            txtPrecioPro.addItem(i + "");
            txtPrecioClieM.addItem(i + "");
            txtPrecioProM.addItem(i + "");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        panelCrud = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        foto = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        comboCategoria = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        comboProveedor = new javax.swing.JComboBox<>();
        jLabel30 = new javax.swing.JLabel();
        txtStock = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        txtPrecioPro = new javax.swing.JComboBox<>();
        txtPrecioClie = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtEliminar = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        buscarE = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        txtPrecioE = new javax.swing.JTextField();
        txtNombreE = new javax.swing.JTextField();
        fotoE = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        txtCategoriaE = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        txtProveedorE = new javax.swing.JTextField();
        txtStockE = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        txtPrecioProE = new javax.swing.JTextField();
        jLabel49 = new javax.swing.JLabel();
        txtPrecioCliE = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtModificar = new javax.swing.JTextField();
        buscarM = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        txtPrecioM = new javax.swing.JTextField();
        txtNombreM = new javax.swing.JTextField();
        fotoM = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        comboCategoriaM = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        comboProveedorM = new javax.swing.JComboBox<>();
        jLabel35 = new javax.swing.JLabel();
        txtStockM = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        btnGuardarM = new javax.swing.JButton();
        txtCodigoM = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        txtPrecioClieM = new javax.swing.JComboBox<>();
        txtPrecioProM = new javax.swing.JComboBox<>();
        jPanel6 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        txtBuscar = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        buscarB = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        txtPrecioB = new javax.swing.JTextField();
        txtPrecioProB = new javax.swing.JTextField();
        fotoB = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        txtCategoriaB = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        txtProveedorB = new javax.swing.JTextField();
        txtStockB = new javax.swing.JTextField();
        jLabel50 = new javax.swing.JLabel();
        txtPrecioCliB = new javax.swing.JTextField();
        jLabel51 = new javax.swing.JLabel();
        txtNombreB = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelCrud.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                panelCrudStateChanged(evt);
            }
        });

        jPanel1.setPreferredSize(new java.awt.Dimension(579, 400));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Verdana", 3, 14)); // NOI18N
        jLabel1.setText("REGISTRAR ARTICULO");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        jPanel9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jPanel9KeyReleased(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel24.setText("NOMBRE: ");

        jLabel25.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel25.setText("PRECIO:");

        jLabel27.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guardar.png"))); // NOI18N
        jButton1.setText("GUARDAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        foto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel3.setText("CATEGORIA:");

        comboCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboCategoriaActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel4.setText("PROVEEDOR:");

        comboProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboProveedorActionPerformed(evt);
            }
        });

        jLabel30.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel30.setText("STOCK:");

        jLabel36.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel36.setText("CODIGO");

        txtCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCodigoKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCodigoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodigoKeyTyped(evt);
            }
        });

        jLabel44.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel44.setText("% PRECIO CLIENTE:");

        jLabel45.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel45.setText("% PRECIO PROVEEDOR:");
        jLabel45.setFocusCycleRoot(true);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel30)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel45)))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(jLabel27))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel24)
                            .addComponent(jLabel25)
                            .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(212, 212, 212))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(comboProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(156, 156, 156)
                        .addComponent(jButton1))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtStock, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                            .addComponent(comboCategoria, 0, 210, Short.MAX_VALUE)
                            .addComponent(txtPrecio, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                            .addComponent(txtPrecioPro, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtPrecioClie, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGap(101, 101, 101)
                                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(foto, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))))))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel27))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jLabel36)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel24)))
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel25)
                                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel44)
                                    .addComponent(txtPrecioClie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel45)
                                    .addComponent(txtPrecioPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel30)
                                    .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(foto, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(comboProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 56, -1, -1));

        panelCrud.addTab("CREAR", jPanel1);

        jLabel7.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel7.setText("ELIMINAR ARTICULOS");

        jLabel11.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel11.setText("INGRESE CODIGO:  ");

        buscarE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar.png"))); // NOI18N
        buscarE.setText("BUSCAR");
        buscarE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarEActionPerformed(evt);
            }
        });

        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel28.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel28.setText("NOMBRE: ");
        jPanel10.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 20, -1, -1));

        jLabel31.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel31.setText("PRECIO:");
        jPanel10.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 55, -1, -1));

        jLabel32.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jPanel10.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(447, 24, -1, -1));

        txtPrecioE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioEKeyTyped(evt);
            }
        });
        jPanel10.add(txtPrecioE, new org.netbeans.lib.awtextra.AbsoluteConstraints(233, 58, 210, -1));

        txtNombreE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreEKeyTyped(evt);
            }
        });
        jPanel10.add(txtNombreE, new org.netbeans.lib.awtextra.AbsoluteConstraints(233, 20, 210, -1));

        fotoE.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel10.add(fotoE, new org.netbeans.lib.awtextra.AbsoluteConstraints(525, 10, 360, 170));

        jLabel9.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel9.setText("CATEGORIA:");
        jPanel10.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 216, 101, 20));

        jLabel10.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel10.setText("PROVEEDOR:");
        jPanel10.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 254, 101, -1));

        jLabel33.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel33.setText("STOCK:");
        jPanel10.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 181, -1, -1));

        txtCategoriaE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCategoriaEKeyTyped(evt);
            }
        });
        jPanel10.add(txtCategoriaE, new org.netbeans.lib.awtextra.AbsoluteConstraints(233, 213, 210, -1));

        jLabel37.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel37.setText("CODIGO");
        jPanel10.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(689, 191, 69, -1));

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/garbage.png"))); // NOI18N
        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel10.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(592, 251, 162, -1));

        txtProveedorE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtProveedorEKeyTyped(evt);
            }
        });
        jPanel10.add(txtProveedorE, new org.netbeans.lib.awtextra.AbsoluteConstraints(233, 251, 210, -1));

        txtStockE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtStockEKeyTyped(evt);
            }
        });
        jPanel10.add(txtStockE, new org.netbeans.lib.awtextra.AbsoluteConstraints(233, 182, 210, -1));

        jLabel48.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel48.setText("% PRECIO PROVEEDOR:");
        jPanel10.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 146, -1, -1));

        txtPrecioProE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioProEKeyTyped(evt);
            }
        });
        jPanel10.add(txtPrecioProE, new org.netbeans.lib.awtextra.AbsoluteConstraints(233, 144, 210, -1));

        jLabel49.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel49.setText("% PRECIO CLIENTE:");
        jPanel10.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 96, -1, -1));

        txtPrecioCliE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioCliEKeyTyped(evt);
            }
        });
        jPanel10.add(txtPrecioCliE, new org.netbeans.lib.awtextra.AbsoluteConstraints(233, 96, 210, -1));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addGap(156, 156, 156)
                .addComponent(jLabel11)
                .addGap(16, 16, 16)
                .addComponent(txtEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(buscarE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel11))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(txtEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(buscarE)))
                .addGap(11, 11, 11)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelCrud.addTab("ELIMINAR", jPanel2);

        jLabel22.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel22.setText("MODIFICAR ARTICULOS");

        jLabel12.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel12.setText("INGRESE CODIGO:  ");

        buscarM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar.png"))); // NOI18N
        buscarM.setText("BUSCAR");
        buscarM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarMActionPerformed(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel26.setText("NOMBRE: ");

        jLabel29.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel29.setText("PRECIO:");

        jLabel34.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N

        fotoM.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        fotoM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fotoMKeyPressed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel8.setText("CATEGORIA:");

        comboCategoriaM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboCategoriaMActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel13.setText("PROVEEDOR:");

        comboProveedorM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboProveedorMActionPerformed(evt);
            }
        });

        jLabel35.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel35.setText("STOCK:");

        jLabel38.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel38.setText("CODIGO");

        btnGuardarM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guardar.png"))); // NOI18N
        btnGuardarM.setText("GUARDAR");
        btnGuardarM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarMActionPerformed(evt);
            }
        });

        txtCodigoM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCodigoMKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCodigoMKeyReleased(evt);
            }
        });

        jLabel46.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel46.setText("PRECIO CLIENTE:");

        jLabel47.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel47.setText("PRECIO PROVEEDOR:");
        jLabel47.setFocusCycleRoot(true);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(jLabel47)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtPrecioProM, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(comboCategoriaM, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel35)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnGuardarM)
                                    .addComponent(comboProveedorM, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                        .addComponent(fotoM, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(jLabel29)
                                .addGap(100, 100, 100)
                                .addComponent(txtPrecioM, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(jLabel26)
                                .addGap(6, 6, 6)
                                .addComponent(jLabel34)
                                .addGap(83, 83, 83)
                                .addComponent(txtNombreM, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtStockM, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPrecioClieM, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addGap(109, 109, 109)
                                .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addGap(108, 108, 108)
                                .addComponent(txtCodigoM, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))))))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel26))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel34))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(txtNombreM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel38))
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCodigoM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel29))))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPrecioM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel35)
                            .addComponent(txtStockM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel46))
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtPrecioClieM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel47)
                            .addComponent(txtPrecioProM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(comboCategoriaM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(comboProveedorM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(fotoM, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnGuardarM)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(18, 18, 18)
                                .addComponent(txtModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(91, 91, 91)
                                .addComponent(buscarM)))
                        .addContainerGap(141, Short.MAX_VALUE))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscarM))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        panelCrud.addTab("MODIFICAR", jPanel4);

        jLabel23.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel23.setText("LISTA DE ARTICULOS");

        tabla.setBackground(new java.awt.Color(102, 255, 204));
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "NOMBRE", "PRECIO", "STOCK", "PROVEDOR", "CATEGORIA", "CODIGO", "% Cliente", "% Proveedor"
            }
        ));
        tabla.setRowHeight(50);
        jScrollPane1.setViewportView(tabla);
        if (tabla.getColumnModel().getColumnCount() > 0) {
            tabla.getColumnModel().getColumn(4).setResizable(false);
            tabla.getColumnModel().getColumn(6).setPreferredWidth(200);
        }

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addComponent(jLabel23)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 945, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelCrud.addTab("LISTA", jPanel6);

        jLabel16.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel16.setText("CODIGO: ");

        jLabel17.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel17.setText("BUSQUEDA DE ARTICULOS");

        buscarB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar.png"))); // NOI18N
        buscarB.setText("BUSCAR");
        buscarB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarBActionPerformed(evt);
            }
        });

        jLabel39.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel39.setText("NOMBRE: ");

        jLabel40.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel40.setText("PRECIO:");

        jLabel41.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N

        txtPrecioB.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioBKeyTyped(evt);
            }
        });

        txtPrecioProB.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioProBKeyTyped(evt);
            }
        });

        fotoB.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel14.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel14.setText("CATEGORIA:");

        jLabel15.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel15.setText("PROVEEDOR:");

        jLabel42.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel42.setText("STOCK:");

        txtCategoriaB.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCategoriaBKeyTyped(evt);
            }
        });

        jLabel43.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel43.setText("CODIGO");

        txtProveedorB.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtProveedorBKeyTyped(evt);
            }
        });

        txtStockB.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtStockBKeyTyped(evt);
            }
        });

        jLabel50.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel50.setText("% PRECIO CLIENTE:");

        txtPrecioCliB.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioCliBKeyTyped(evt);
            }
        });

        jLabel51.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel51.setText("% PRECIO PROVEEDOR:");

        txtNombreB.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreBKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCategoriaB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtProveedorB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel12Layout.createSequentialGroup()
                                        .addGap(179, 179, 179)
                                        .addComponent(txtNombreB, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel12Layout.createSequentialGroup()
                                        .addComponent(jLabel50)
                                        .addGap(28, 28, 28)
                                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtStockB, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtPrecioCliB, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel12Layout.createSequentialGroup()
                                        .addComponent(jLabel51)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtPrecioProB, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addComponent(jLabel39)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel41))
                            .addComponent(jLabel40)
                            .addComponent(jLabel42))
                        .addGap(101, 101, 101)
                        .addComponent(txtPrecioB, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(fotoB, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(177, 177, 177))))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(fotoB, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel43)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel41))
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel39)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel40)
                                    .addComponent(txtPrecioB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel42)
                            .addComponent(txtStockB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel50)
                            .addComponent(txtPrecioCliB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtNombreB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel51)
                    .addComponent(txtPrecioProB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCategoriaB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel15))
                    .addComponent(txtProveedorB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(111, 111, 111))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel16)
                        .addGap(18, 18, 18)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67)
                        .addComponent(buscarB)))
                .addContainerGap(83, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel16)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscarB))
                .addGap(57, 57, 57)
                .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelCrud.addTab("BUSCAR", jPanel3);

        getContentPane().add(panelCrud, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 48, 950, 460));

        jLabel6.setFont(new java.awt.Font("Sitka Heading", 2, 24)); // NOI18N
        jLabel6.setText("CONTROLADOR PRODUCTO");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 11, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/producto1.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 130, 100));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void actualizarCodigo() {
        codigoID = controladorProducto.obtenerCodigo() + 999;
        Barcode barcode = null;
        try {
            barcode = BarcodeFactory.createCode128C(codigoID + "");
        } catch (Exception e) {
            System.out.println("Error al calcular el codigo de barrar");
        }
        barcode.setDrawingText(false);

        barcode.setBarWidth(2);
        barcode.setBarHeight(60);
        BufferedImage image = new BufferedImage(300, 100, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g = (Graphics2D) image.getGraphics();

        try {
            barcode.draw(g, 5, 20);
        } catch (Exception e) {
        }
        ImageIcon icon = new ImageIcon(image);
        foto.setIcon(icon);
    }

    private void CodigoEliminar(String codigoID) {
        Barcode barcode = null;
        try {
            barcode = BarcodeFactory.createCode128C(codigoID + "");
        } catch (Exception e) {
            System.out.println("Error al calcular el codigo de barrar");
        }
        barcode.setDrawingText(false);

        barcode.setBarWidth(2);
        barcode.setBarHeight(60);
        BufferedImage image = new BufferedImage(300, 100, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g = (Graphics2D) image.getGraphics();

        try {
            barcode.draw(g, 5, 20);
        } catch (Exception e) {
        }
        ImageIcon icon = new ImageIcon(image);
        fotoE.setIcon(icon);
    }

    private ImageIcon Codigolistar(String codigoID) {
        Barcode barcode = null;
        try {
            barcode = BarcodeFactory.createCode128C(codigoID + "");
        } catch (Exception e) {
            System.out.println("Error al calcular el codigo de barrar");
        }
        barcode.setDrawingText(false);

        barcode.setBarWidth(2);
        barcode.setBarHeight(60);
        BufferedImage image = new BufferedImage(300, 100, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g = (Graphics2D) image.getGraphics();

        try {
            barcode.draw(g, 5, 20);
        } catch (Exception e) {
        }
        ImageIcon icon = new ImageIcon(image);
        return icon;
    }

    private void CodigoBuscar(String codigoID) {
        Barcode barcode = null;
        try {
            barcode = BarcodeFactory.createCode128C(codigoID + "");
        } catch (Exception e) {
            System.out.println("Error al calcular el codigo de barrar");
        }
        barcode.setDrawingText(false);

        barcode.setBarWidth(2);
        barcode.setBarHeight(60);
        BufferedImage image = new BufferedImage(300, 100, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g = (Graphics2D) image.getGraphics();

        try {
            barcode.draw(g, 5, 20);
        } catch (Exception e) {
        }
        ImageIcon icon = new ImageIcon(image);
        fotoB.setIcon(icon);
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int cont = 0;

        if ("" != txtNombre.getText()) {
            cont++;
        }
        if ("" != txtPrecio.getText()) {
            cont++;
        }
        if ("" != txtStock.getText()) {
            cont++;
        }

        if (0 != comboCategoria.getSelectedIndex()) {
            cont++;
        }
        if (0 != comboProveedor.getSelectedIndex()) {
            cont++;
        }

        if (foto.getIcon() != null) {
            cont++;
        }
        if (cont == 6) {

            int id = controladorProducto.obtenerCodigo();
            String nombre = txtNombre.getText();
            double precio = Double.parseDouble(txtPrecio.getText());
            int stock = Integer.parseInt(txtStock.getText());
            Categoria categoria = controladorCategoria.buscar(obtenerCodigoCombo(comboCategoria));
            Proveedor proveedor = controladorProveedor.buscarID(obtenerCodigoCombo(comboProveedor));
            String codigo = txtCodigo.getText();
            int preclie = Integer.parseInt(txtPrecioClie.getSelectedItem().toString());
            int prepro = Integer.parseInt(txtPrecioPro.getSelectedItem().toString());

            Producto producto = new Producto(id, nombre, precio, stock, categoria, proveedor, codigo, preclie, prepro);

            if (controladorProducto.ingresar(producto)) {
                JOptionPane.showMessageDialog(this, "Producto INGRESADO");
                
                Date date = new Date();
                DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                String fecha = dateFormat.format(date);
                String motivo = "SE CREA EL PRODUCTO | " + producto.getNombre();
                int cantidadAnt = producto.getStock();
                int cantidadNew = producto.getStock();
                int cantidadOld = 0;
                Historial h = new Historial(0, fecha, motivo, producto, cantidadAnt, cantidadNew, cantidadOld);
                controladorHistorial.ingresar(h);
                limpiarCrear();
            } else {
                JOptionPane.showMessageDialog(this, "EERRO AL INGRESAR:" + cont, "PRODUCTO", JOptionPane.ERROR_MESSAGE);
                limpiarModificar();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Exiten errores en los campos!! \n Realize nueva busqueda:" + cont, "PRODUCTO", JOptionPane.ERROR_MESSAGE);
            limpiarModificar();
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    private void limpiarCrear() {
        actualizarCodigo();
        txtNombre.setText("");
        txtPrecio.setText("");
        txtStock.setText("");
        comboCategoria.setSelectedIndex(0);
        comboProveedor.setSelectedIndex(0);
        txtPrecioClie.setSelectedIndex(0);
        txtPrecioPro.setSelectedIndex(0);
        foto.setIcon(null);
    }

    private void limpiarModificar() {
        txtNombreM.setText("");
        txtPrecioM.setText("");
        txtStockM.setText("");
        comboCategoriaM.setSelectedIndex(0);
        comboProveedorM.setSelectedIndex(0);
        fotoM.setIcon(null);
        productoAux = null;
        txtCodigoM.setText("");
        txtModificar.setText("");
        txtPrecioClieM.setSelectedIndex(0);
        txtPrecioProM.setSelectedIndex(0);
    }

    private void limpiarEliminar() {
        txtNombreE.setText("");
        txtPrecioE.setText("");
        txtStockE.setText("");
        txtCategoriaE.setText("");
        txtProveedorE.setText("");
        txtPrecioCliE.setText("");
        txtPrecioProE.setText("");
        fotoE.setIcon(null);
        productoAux = null;
    }

    private void limpiarBuscar() {
        txtNombreB.setText("");
        txtPrecioProB.setText("");
        txtPrecioB.setText("");
        txtStockB.setText("");
        txtCategoriaB.setText("");
        txtProveedorB.setText("");
        txtPrecioCliB.setText("");
        txtPrecioProB.setText("");
        fotoB.setIcon(null);
        productoAux = null;
    }

    private String obtenerCodigoCombo(JComboBox comboBox) {
        String cate = (String) comboBox.getSelectedItem();
        int pos = cate.indexOf(":");
        cate = cate.substring(0, pos);
        return cate;
    }
    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if (productoAux != null) {
            int resp = JOptionPane.showConfirmDialog(this, "SEGURO DECESAS ELMINAR EL PRODUCTO");
            if (JOptionPane.OK_OPTION == resp) {
                controladorProducto.eliminar(productoAux);
                limpiarEliminar();
            } else {
                limpiarEliminar();
            }
        } else {
            JOptionPane.showMessageDialog(this, "REVISE EL CONPO DE CEDULA", "CLIENTE", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    public void limpiarTabla() {
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
    }

    private void panelCrudStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_panelCrudStateChanged
        int n = panelCrud.getSelectedIndex();

        if (n == 3) {
            limpiarTabla();
            List<Producto> lis;

            lis = controladorProducto.listar();
            List<Object[]> lista = new ArrayList<>();
            for (Producto li : lis) {
                Object[] lisAr = new Object[9];
                lisAr[0] = li.getId();
                lisAr[1] = li.getNombre();
                lisAr[2] = li.getPrecio();
                lisAr[3] = li.getStock();
                lisAr[4] = li.getProveedor().getNombre();
                lisAr[5] = li.getCategoria().getNombre();
                lisAr[6] = Codigolistar(li.getCodigo());
                lisAr[7] = li.getPre_cliente();
                lisAr[8] = li.getPre_proveedor();
                lista.add(lisAr);
            }
            String nombrecolumnas[] = {"ID", "NOMBRE", "PRECIO", "STOCK", "PROVEEDOR", "CATEGORIA", "CODIGO", "% CLIENTE", "% PROVEEDOR"};
            Object datos[][] = new Object[lista.size()][nombrecolumnas.length];

            for (int j = 0; j < lista.size(); j++) {
                datos[j][0] = lista.get(j)[0];
                datos[j][1] = lista.get(j)[1];
                datos[j][2] = lista.get(j)[2];
                datos[j][3] = lista.get(j)[3];
                datos[j][4] = lista.get(j)[4];
                datos[j][5] = lista.get(j)[5];
                datos[j][6] = lista.get(j)[6];
                datos[j][7] = lista.get(j)[7];
                datos[j][8] = lista.get(j)[8];
            }
            DefaultTableModel modelo = new DefaultTableModel(datos, nombrecolumnas) {
                @Override
                public Class getColumnClass(int column) {
                    switch (column) {
                        case 6:
                            return ImageIcon.class;
                        default:
                            return Object.class;
                    }
                }
            };
            tabla.setModel(modelo);
            tabla.getColumn("CODIGO").setPreferredWidth(300);
        }
    }//GEN-LAST:event_panelCrudStateChanged

    private void btnGuardarMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarMActionPerformed
        int cont = 0;

        if ("" != txtNombreM.getText()) {
            cont++;
        }
        if ("" != txtPrecioM.getText()) {
            cont++;
        }
        if ("" != txtStockM.getText()) {
            cont++;
        }

        if (0 != comboCategoriaM.getSelectedIndex()) {
            cont++;
        }
        if (0 != comboProveedorM.getSelectedIndex()) {
            cont++;
        }

        if (fotoM.getIcon() != null) {
            cont++;
        }
        if (cont == 6 && productoAux != null) {

            int id = productoAux.getId();
            String nombre = txtNombreM.getText();
            double precio = Double.parseDouble(txtPrecioM.getText());
            int stock = Integer.parseInt(txtStockM.getText());
            Categoria categoria = controladorCategoria.buscar(obtenerCodigoCombo(comboCategoriaM));
            Proveedor proveedor = controladorProveedor.buscarID(obtenerCodigoCombo(comboProveedorM));
            String codigo = txtCodigoM.getText();

            int preclie = Integer.parseInt(txtPrecioClieM.getSelectedItem().toString());
            int prepro = Integer.parseInt(txtPrecioProM.getSelectedItem().toString());

            Producto producto = new Producto(id, nombre, precio, stock, categoria, proveedor, codigo, preclie, prepro);

            if (controladorProducto.actualizar(producto)) {
                JOptionPane.showMessageDialog(this, "Producto ACTUALIZADO");
                Date date = new Date();
                DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                String fecha = dateFormat.format(date);
                String motivo = "SE ACTUALIZA  EL PRODUCTO | " + producto.getNombre();
                int cantidadAnt = productoAux.getStock();
                int cantidadNew = producto.getStock();
                int cantidadOld = productoAux.getStock();
                Historial h = new Historial(0, fecha, motivo, producto, cantidadAnt, cantidadNew, cantidadOld);
                controladorHistorial.ingresar(h);
                
                limpiarModificar();
            } else {
                JOptionPane.showMessageDialog(this, "EERRO AL INGRESAR:" + cont, "PRODUCTO", JOptionPane.ERROR_MESSAGE);
                limpiarModificar();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Exiten errores en los campos!! \n Realize nueva busqueda:" + cont, "PRODUCTO", JOptionPane.ERROR_MESSAGE);
            limpiarModificar();
        }
    }//GEN-LAST:event_btnGuardarMActionPerformed

    private void comboCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboCategoriaActionPerformed

    private void buscarBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarBActionPerformed
        String id = txtBuscar.getText();
        Producto producto = controladorProducto.buscar(id);
        if (producto != null) {
            txtNombreB.setText(producto.getNombre());
            txtPrecioProB.setText(producto.getNombre());
            txtPrecioB.setText(producto.getPrecio() + "");
            txtStockB.setText(producto.getStock() + "");
            txtCategoriaB.setText(producto.getCategoria().getNombre());
            txtProveedorB.setText(producto.getProveedor().getNombre());
            txtPrecioCliB.setText(producto.getPre_cliente() + "");
            txtPrecioProB.setText(producto.getPre_proveedor() + "");
            CodigoBuscar(producto.getCodigo());

        } else {
            JOptionPane.showMessageDialog(this, "PRODUCTO NO ECONTRADO", "PRODUCTO", JOptionPane.ERROR_MESSAGE);
            limpiarBuscar();
        }
    }//GEN-LAST:event_buscarBActionPerformed

    private void buscarEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarEActionPerformed
        String id = txtEliminar.getText();
        Producto producto = controladorProducto.buscar(id);
        if (producto != null) {
            txtNombreE.setText(producto.getNombre());
            txtPrecioE.setText(producto.getPrecio() + "");
            txtStockE.setText(producto.getStock() + "");
            txtCategoriaE.setText(producto.getCategoria().getNombre());
            txtProveedorE.setText(producto.getProveedor().getNombre());
            txtPrecioCliE.setText(producto.getPre_cliente() + "");
            txtPrecioProE.setText(producto.getPre_proveedor() + "");
            CodigoEliminar(producto.getCodigo());
            productoAux = producto;
        } else {
            productoAux = null;
            JOptionPane.showMessageDialog(this, "PRODUCTO NO ECONTRADO", "PRODUCTO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_buscarEActionPerformed

    private void buscarMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarMActionPerformed
        String id = txtModificar.getText();
        Producto producto = controladorProducto.buscar(id);
        if (producto != null) {
            txtNombreM.setText(producto.getNombre());
            txtPrecioM.setText(producto.getPrecio() + "");
            txtStockM.setText(producto.getStock() + "");
            txtCodigoM.setText(producto.getCodigo());
            comboCategoriaM.setSelectedItem(producto.getCategoria().getId() + ": " + producto.getCategoria().getNombre());
            comboProveedorM.setSelectedItem(producto.getProveedor().getId() + ": " + producto.getProveedor().getNombre());
            txtPrecioClieM.setSelectedItem(producto.getPre_cliente() + "");
            txtPrecioProM.setSelectedItem(producto.getPre_proveedor() + "");
            CodigoModificar(producto.getCodigo());
            productoAux = producto;
        } else {
            JOptionPane.showMessageDialog(this, "PRODUCTO NO ECONTRADO", "PRODUCTO", JOptionPane.ERROR_MESSAGE);
            productoAux = null;
        }
    }//GEN-LAST:event_buscarMActionPerformed
    private void CodigoModificar(String codigoID) {
        Barcode barcode = null;
        try {
            barcode = BarcodeFactory.createCode128C(codigoID + "");
        } catch (Exception e) {
            System.out.println("Error al calcular el codigo de barrar");
        }
        barcode.setDrawingText(false);

        barcode.setBarWidth(2);
        barcode.setBarHeight(60);
        BufferedImage image = new BufferedImage(300, 100, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g = (Graphics2D) image.getGraphics();

        try {
            barcode.draw(g, 5, 20);
        } catch (Exception e) {
        }
        ImageIcon icon = new ImageIcon(image);
        fotoM.setIcon(icon);
    }
    private void comboProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboProveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboProveedorActionPerformed

    private void txtPrecioEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioEKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioEKeyTyped

    private void txtNombreEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreEKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreEKeyTyped

    private void txtCategoriaEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCategoriaEKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCategoriaEKeyTyped

    private void txtProveedorEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProveedorEKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProveedorEKeyTyped

    private void txtStockEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtStockEKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStockEKeyTyped

    private void comboCategoriaMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboCategoriaMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboCategoriaMActionPerformed

    private void comboProveedorMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboProveedorMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboProveedorMActionPerformed

    private void txtPrecioBKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioBKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioBKeyTyped

    private void txtPrecioProBKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioProBKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioProBKeyTyped

    private void txtCategoriaBKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCategoriaBKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCategoriaBKeyTyped

    private void txtProveedorBKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProveedorBKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProveedorBKeyTyped

    private void txtStockBKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtStockBKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStockBKeyTyped

    private void txtCodigoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoKeyPressed

    }//GEN-LAST:event_txtCodigoKeyPressed

    private void fotoMKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fotoMKeyPressed


    }//GEN-LAST:event_fotoMKeyPressed

    private void txtCodigoMKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoMKeyPressed

    }//GEN-LAST:event_txtCodigoMKeyPressed

    private void txtCodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoKeyTyped

    }//GEN-LAST:event_txtCodigoKeyTyped

    private void jPanel9KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPanel9KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel9KeyReleased

    private void txtCodigoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoKeyReleased
        try {
            Barcode barcode = null;
            try {
                barcode = BarcodeFactory.createCode128C(txtCodigo.getText() + "");
            } catch (Exception e) {
                foto.setIcon(null);
                System.out.println(e.getMessage() + " es por que no lleva letras");
            }
            barcode.setDrawingText(false);

            barcode.setBarWidth(2);
            barcode.setBarHeight(60);
            BufferedImage image = new BufferedImage(300, 100, BufferedImage.TYPE_INT_ARGB);
            Graphics2D g = (Graphics2D) image.getGraphics();

            try {
                barcode.draw(g, 5, 20);

            } catch (Exception e) {
            }
            ImageIcon icon = new ImageIcon(image);
            foto.setIcon(icon);
            barraBandera = true;
        } catch (Exception e) {
            barraBandera = false;
        }
    }//GEN-LAST:event_txtCodigoKeyReleased

    private void txtPrecioProEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioProEKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioProEKeyTyped

    private void txtPrecioCliEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioCliEKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioCliEKeyTyped

    private void txtPrecioCliBKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioCliBKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioCliBKeyTyped

    private void txtNombreBKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreBKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreBKeyTyped

    private void txtCodigoMKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoMKeyReleased
        try {
            Barcode barcode = null;
            try {
                barcode = BarcodeFactory.createCode128C(txtCodigoM.getText() + "");
            } catch (Exception e) {
                fotoM.setIcon(null);
                System.out.println(e.getMessage() + " es por que no lleva letras");
            }
            barcode.setDrawingText(false);

            barcode.setBarWidth(2);
            barcode.setBarHeight(60);
            BufferedImage image = new BufferedImage(300, 100, BufferedImage.TYPE_INT_ARGB);
            Graphics2D g = (Graphics2D) image.getGraphics();

            try {
                barcode.draw(g, 5, 20);

            } catch (Exception e) {
            }
            ImageIcon icon = new ImageIcon(image);
            fotoM.setIcon(icon);
            barraBandera = true;
        } catch (Exception e) {
            barraBandera = false;
        }
    }//GEN-LAST:event_txtCodigoMKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardarM;
    private javax.swing.JButton buscarB;
    private javax.swing.JButton buscarE;
    private javax.swing.JButton buscarM;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JComboBox<String> comboCategoria;
    private javax.swing.JComboBox<String> comboCategoriaM;
    private javax.swing.JComboBox<String> comboProveedor;
    private javax.swing.JComboBox<String> comboProveedorM;
    private javax.swing.JLabel foto;
    private javax.swing.JLabel fotoB;
    private javax.swing.JLabel fotoE;
    private javax.swing.JLabel fotoM;
    private javax.swing.JButton jButton1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
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
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane panelCrud;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCategoriaB;
    private javax.swing.JTextField txtCategoriaE;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtCodigoM;
    private javax.swing.JTextField txtEliminar;
    private javax.swing.JTextField txtModificar;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreB;
    private javax.swing.JTextField txtNombreE;
    private javax.swing.JTextField txtNombreM;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtPrecioB;
    private javax.swing.JTextField txtPrecioCliB;
    private javax.swing.JTextField txtPrecioCliE;
    private javax.swing.JComboBox<String> txtPrecioClie;
    private javax.swing.JComboBox<String> txtPrecioClieM;
    private javax.swing.JTextField txtPrecioE;
    private javax.swing.JTextField txtPrecioM;
    private javax.swing.JComboBox<String> txtPrecioPro;
    private javax.swing.JTextField txtPrecioProB;
    private javax.swing.JTextField txtPrecioProE;
    private javax.swing.JComboBox<String> txtPrecioProM;
    private javax.swing.JTextField txtProveedorB;
    private javax.swing.JTextField txtProveedorE;
    private javax.swing.JTextField txtStock;
    private javax.swing.JTextField txtStockB;
    private javax.swing.JTextField txtStockE;
    private javax.swing.JTextField txtStockM;
    // End of variables declaration//GEN-END:variables
}
