package Vista;

import Controlador.ControladorUsuario;
import Modelo.Usuario;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Event;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Locale;
import java.util.Properties;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
//import javax.mail.Message;
//import javax.mail.MessagingException;
//import javax.mail.Session;
//import javax.mail.Transport;
//import javax.mail.internet.AddressException;
//import javax.mail.internet.InternetAddress;
//import javax.mail.internet.MimeMessage;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.event.InternalFrameEvent;
import javax.swing.table.DefaultTableModel;

/**
 * VentanaCrudClientes
 *
 * @author Fanny
 */
public class VistaUsuarios extends javax.swing.JInternalFrame {

    private JButton b;
    private DefaultTableModel modelo;
    private ControladorUsuario controladorUsuario;
    private Usuario usuarioAux;

    public VistaUsuarios() {
        initComponents();
        modelo = new DefaultTableModel();
        controladorUsuario = new ControladorUsuario();
        usuarioAux = null;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        panelesCrudCliente = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        nombre = new javax.swing.JLabel();
        apellido = new javax.swing.JLabel();
        cedula = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        direccion = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        telefono = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        direcion5 = new javax.swing.JLabel();
        direcion6 = new javax.swing.JLabel();
        comboRol = new javax.swing.JComboBox<String>();
        txtDirecion = new javax.swing.JTextField();
        direcion12 = new javax.swing.JLabel();
        txtContraseña = new javax.swing.JPasswordField();
        agregarClientes = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        listadeClientes = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        buscarclientes = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        ingreseCedula = new javax.swing.JLabel();
        panelBuscarCliente = new javax.swing.JPanel();
        nombre2 = new javax.swing.JLabel();
        apillido2 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        txtApellidoB = new javax.swing.JTextField();
        txtNombreB = new javax.swing.JTextField();
        txtTelefonoB = new javax.swing.JTextField();
        telefono2 = new javax.swing.JLabel();
        direcion2 = new javax.swing.JLabel();
        txtDirecionB = new javax.swing.JTextField();
        direcion3 = new javax.swing.JLabel();
        txtCorreoB = new javax.swing.JTextField();
        direcion4 = new javax.swing.JLabel();
        txtRolB = new javax.swing.JTextField();
        buscar1 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        cedula3 = new javax.swing.JLabel();
        txtModificar = new javax.swing.JTextField();
        modificarcliente = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        nombre3 = new javax.swing.JLabel();
        apellido3 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        telefono3 = new javax.swing.JLabel();
        direccion3 = new javax.swing.JLabel();
        actulizarM = new javax.swing.JButton();
        txtCedulaM = new javax.swing.JTextField();
        txtNombreM = new javax.swing.JTextField();
        txtApellidoM = new javax.swing.JTextField();
        txtTelefonoM = new javax.swing.JTextField();
        txtDirecionM = new javax.swing.JTextField();
        nombre5 = new javax.swing.JLabel();
        direcion9 = new javax.swing.JLabel();
        txtCorreoM = new javax.swing.JTextField();
        direcion10 = new javax.swing.JLabel();
        comboRolM = new javax.swing.JComboBox<String>();
        direcion13 = new javax.swing.JLabel();
        txtContraseñaM = new javax.swing.JPasswordField();
        buscar2 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        eliminarcliente = new javax.swing.JLabel();
        cedula4 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        nombre4 = new javax.swing.JLabel();
        apellido4 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txtApellidoE = new javax.swing.JTextField();
        txtNombreE = new javax.swing.JTextField();
        txtTelefonoE = new javax.swing.JTextField();
        telefono4 = new javax.swing.JLabel();
        direccion4 = new javax.swing.JLabel();
        txtDirecionE = new javax.swing.JTextField();
        btnEliminar = new javax.swing.JButton();
        direcion7 = new javax.swing.JLabel();
        txtCorreoE = new javax.swing.JTextField();
        txtRolE = new javax.swing.JTextField();
        direcion8 = new javax.swing.JLabel();
        txtEliminar = new javax.swing.JTextField();
        buscar3 = new javax.swing.JButton();
        lblControlarCliente = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();

        jMenuItem1.setText("jMenuItem1");

        setClosable(true);
        setIconifiable(true);

        panelesCrudCliente.setBackground(new java.awt.Color(0, 204, 102));
        panelesCrudCliente.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                panelesCrudClienteStateChanged(evt);
            }
        });

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nombre.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        nombre.setText("NOMBRE:   ");

        apellido.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        apellido.setText("APELLIDOS:   ");

        cedula.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        cedula.setText("CEDULA:   ");

        txtCedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCedulaKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCedulaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCedulaKeyTyped(evt);
            }
        });

        txtApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoKeyTyped(evt);
            }
        });

        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

        btnGuardar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(0, 0, 255));
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guardar.png"))); // NOI18N
        btnGuardar.setText("GUARDAR");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        direccion.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        direccion.setText("DIRECCION : ");

        txtCorreo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCorreoKeyTyped(evt);
            }
        });

        telefono.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        telefono.setText("TELEFONO:");

        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });

        direcion5.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        direcion5.setText("CORREO:");

        direcion6.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        direcion6.setText("ROL:");

        comboRol.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        comboRol.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SELECIONE", "ADMIN", "USER" }));

        txtDirecion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDirecionKeyTyped(evt);
            }
        });

        direcion12.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        direcion12.setText("CONTRACEÑA:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92)
                .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92)
                .addComponent(txtDirecion, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(direcion5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(120, 120, 120)
                .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(direcion6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(130, 130, 130)
                .addComponent(comboRol, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(direcion12, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(btnGuardar))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cedula)
                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(apellido)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(telefono)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(direccion)
                    .addComponent(txtDirecion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(direcion5)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(direcion6)
                    .addComponent(comboRol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(direcion12)
                    .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(btnGuardar))
        );

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 54, 584, 373));

        agregarClientes.setFont(new java.awt.Font("Verdana", 3, 14)); // NOI18N
        agregarClientes.setText("Agregar Clientes");
        jPanel2.add(agregarClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 18, -1, -1));

        panelesCrudCliente.addTab("CREAR", jPanel2);

        tabla.setBackground(new java.awt.Color(204, 255, 255));
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Cedula", "NombreyApellido", "Direccion", "Telefono", "Correo", "Rol"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabla);
        if (tabla.getColumnModel().getColumnCount() > 0) {
            tabla.getColumnModel().getColumn(1).setResizable(false);
            tabla.getColumnModel().getColumn(2).setResizable(false);
            tabla.getColumnModel().getColumn(3).setResizable(false);
            tabla.getColumnModel().getColumn(4).setResizable(false);
            tabla.getColumnModel().getColumn(5).setResizable(false);
            tabla.getColumnModel().getColumn(6).setResizable(false);
        }

        listadeClientes.setFont(new java.awt.Font("Verdana", 3, 14)); // NOI18N
        listadeClientes.setText("LISTA DE CLIENTES");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addComponent(listadeClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(265, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 615, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(listadeClientes)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 412, Short.MAX_VALUE)
                .addGap(4, 4, 4))
        );

        panelesCrudCliente.addTab("LISTAR ", jPanel3);

        buscarclientes.setFont(new java.awt.Font("Trebuchet MS", 3, 24)); // NOI18N
        buscarclientes.setText("BUSCAR CLIENTES");

        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscarKeyTyped(evt);
            }
        });

        ingreseCedula.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        ingreseCedula.setText("INGRESE CEDULA: ");

        nombre2.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        nombre2.setText("NOMBRE: ");

        apillido2.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        apillido2.setText("APELLIDOS: ");

        jLabel30.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N

        txtApellidoB.setEditable(false);

        txtNombreB.setEditable(false);

        txtTelefonoB.setEditable(false);

        telefono2.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        telefono2.setText("TELEFONO:");

        direcion2.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        direcion2.setText("DIRECCION");

        txtDirecionB.setEditable(false);

        direcion3.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        direcion3.setText("CORREO");

        txtCorreoB.setEditable(false);

        direcion4.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        direcion4.setText("ROL");

        txtRolB.setEditable(false);

        javax.swing.GroupLayout panelBuscarClienteLayout = new javax.swing.GroupLayout(panelBuscarCliente);
        panelBuscarCliente.setLayout(panelBuscarClienteLayout);
        panelBuscarClienteLayout.setHorizontalGroup(
            panelBuscarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBuscarClienteLayout.createSequentialGroup()
                .addGroup(panelBuscarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBuscarClienteLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel30)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelBuscarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(direcion2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(apillido2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(telefono2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelBuscarClienteLayout.createSequentialGroup()
                                .addComponent(nombre2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 84, Short.MAX_VALUE)))
                        .addGap(62, 62, 62)
                        .addGroup(panelBuscarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBuscarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtNombreB)
                                .addComponent(txtApellidoB)
                                .addComponent(txtTelefonoB, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtDirecionB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelBuscarClienteLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(panelBuscarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelBuscarClienteLayout.createSequentialGroup()
                                .addComponent(direcion4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(38, 38, 38)
                                .addComponent(txtRolB, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelBuscarClienteLayout.createSequentialGroup()
                                .addComponent(direcion3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(txtCorreoB, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        panelBuscarClienteLayout.setVerticalGroup(
            panelBuscarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBuscarClienteLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(panelBuscarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBuscarClienteLayout.createSequentialGroup()
                        .addGroup(panelBuscarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombreB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nombre2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelBuscarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(apillido2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtApellidoB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelBuscarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(telefono2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtTelefonoB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelBuscarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(direcion2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtDirecionB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel30))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelBuscarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCorreoB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(direcion3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelBuscarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(direcion4)
                    .addComponent(txtRolB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(94, Short.MAX_VALUE))
        );

        buscar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar.png"))); // NOI18N
        buscar1.setText("BUSCAR");
        buscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(buscarclientes, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(ingreseCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(buscar1))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(panelBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(buscarclientes, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(ingreseCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(buscar1))
                .addGap(11, 11, 11)
                .addComponent(panelBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelesCrudCliente.addTab("BUSCAR", jPanel6);

        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cedula3.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        cedula3.setText("CEDULA: ");
        jPanel8.add(cedula3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 158, -1));

        txtModificar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtModificarKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtModificarKeyTyped(evt);
            }
        });
        jPanel8.add(txtModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, 130, -1));

        modificarcliente.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        modificarcliente.setText("MODIFICAR CLIENTE");
        jPanel8.add(modificarcliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 253, -1));

        jPanel11.setEnabled(false);

        nombre3.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        nombre3.setText("CEDULA:");

        apellido3.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        apellido3.setText("APELLIDOS: ");

        jLabel36.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N

        telefono3.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        telefono3.setText("TELEFONO:");

        direccion3.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        direccion3.setText("DIRECCION");

        actulizarM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/actualizar.png"))); // NOI18N
        actulizarM.setText("ACTUALIZAR");
        actulizarM.setEnabled(false);
        actulizarM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actulizarMActionPerformed(evt);
            }
        });

        txtCedulaM.setEditable(false);
        txtCedulaM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedulaMActionPerformed(evt);
            }
        });
        txtCedulaM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCedulaMKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCedulaMKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCedulaMKeyTyped(evt);
            }
        });

        txtNombreM.setEditable(false);
        txtNombreM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreMKeyTyped(evt);
            }
        });

        txtApellidoM.setEditable(false);
        txtApellidoM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoMKeyTyped(evt);
            }
        });

        txtTelefonoM.setEditable(false);
        txtTelefonoM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoMKeyTyped(evt);
            }
        });

        txtDirecionM.setEditable(false);
        txtDirecionM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDirecionMKeyTyped(evt);
            }
        });

        nombre5.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        nombre5.setText("NOMBRE: ");

        direcion9.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        direcion9.setText("CORREO:");

        txtCorreoM.setEditable(false);
        txtCorreoM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCorreoMKeyTyped(evt);
            }
        });

        direcion10.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        direcion10.setText("ROL:");

        comboRolM.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        comboRolM.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SELECIONE", "ADMIN", "USER" }));

        direcion13.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        direcion13.setText("CONTRACEÑA:");

        txtContraseñaM.setEditable(false);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(direccion3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(apellido3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(telefono3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(26, 26, 26))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nombre3, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nombre5, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(comboRolM, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel36)
                        .addGap(372, 372, 372))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtCedulaM, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                            .addComponent(txtNombreM, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtApellidoM, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDirecionM, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTelefonoM, javax.swing.GroupLayout.Alignment.LEADING))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(direcion9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(txtCorreoM, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(direcion10, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(actulizarM))
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(direcion13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtContraseñaM, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCedulaM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombre3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombreM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombre5))
                .addGap(19, 19, 19)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(apellido3)
                    .addComponent(txtApellidoM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefonoM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telefono3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDirecionM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(direccion3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(direcion9)
                    .addComponent(txtCorreoM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(direcion10)
                    .addComponent(comboRolM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(jLabel36)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtContraseñaM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(direcion13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(actulizarM)
                .addContainerGap(77, Short.MAX_VALUE))
        );

        jPanel8.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 510, 380));

        buscar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar.png"))); // NOI18N
        buscar2.setText("BUSCAR");
        buscar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscar2ActionPerformed(evt);
            }
        });
        jPanel8.add(buscar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, -1, -1));

        panelesCrudCliente.addTab("MODIFICAR", jPanel8);

        eliminarcliente.setFont(new java.awt.Font("Verdana", 3, 14)); // NOI18N
        eliminarcliente.setText("Eliminar Cliente");

        cedula4.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        cedula4.setText("CEDULA: ");

        nombre4.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        nombre4.setText("NOMBRE: ");

        apellido4.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        apellido4.setText("APELLIDOS: ");

        jLabel22.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N

        txtApellidoE.setEditable(false);

        txtNombreE.setEditable(false);

        txtTelefonoE.setEditable(false);

        telefono4.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        telefono4.setText("TELEFONO:");

        direccion4.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        direccion4.setText("DIRECCION");

        txtDirecionE.setEditable(false);

        btnEliminar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/garbage.png"))); // NOI18N
        btnEliminar.setText("ELIMINAR");
        btnEliminar.setEnabled(false);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        direcion7.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        direcion7.setText("CORREO");

        txtCorreoE.setEditable(false);

        txtRolE.setEditable(false);

        direcion8.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        direcion8.setText("ROL");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(nombre4, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(txtNombreE, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(direccion4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(apellido4, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(telefono4, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDirecionE, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtApellidoE)
                                .addComponent(txtTelefonoE, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtCorreoE, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRolE, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel22)
                .addContainerGap(90, Short.MAX_VALUE))
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addComponent(btnEliminar)
                .addContainerGap(160, Short.MAX_VALUE))
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(direcion8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(direcion7, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel22))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nombre4)
                            .addComponent(txtNombreE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(apellido4)
                            .addComponent(txtApellidoE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(telefono4)
                            .addComponent(txtTelefonoE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(direccion4)
                            .addComponent(txtDirecionE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCorreoE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(direcion7))
                .addGap(14, 14, 14)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(direcion8)
                    .addComponent(txtRolE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(btnEliminar))
        );

        txtEliminar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEliminarKeyTyped(evt);
            }
        });

        buscar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar.png"))); // NOI18N
        buscar3.setText("BUSCAR");
        buscar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscar3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(cedula4, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buscar3))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(eliminarcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(eliminarcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cedula4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscar3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(80, Short.MAX_VALUE))
        );

        panelesCrudCliente.addTab("ELIMINAR", jPanel4);

        lblControlarCliente.setFont(new java.awt.Font("Sitka Heading", 2, 24)); // NOI18N
        lblControlarCliente.setText("CONTROLADOR CLIENTES");

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/clienteP.png"))); // NOI18N
        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(lblControlarCliente)
                .addGap(44, 44, 44)
                .addComponent(jLabel17))
            .addComponent(panelesCrudCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(lblControlarCliente))
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(panelesCrudCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if (controladorUsuario != null) {
            int resp = JOptionPane.showConfirmDialog(this, "SEGURO DECESAS ELMINAR AL CLIENTE");
            if (JOptionPane.OK_OPTION == resp) {
                boolean eliminar = controladorUsuario.eliminar(usuarioAux);
                if (eliminar == true) {
                    JOptionPane.showMessageDialog(this, "Usuario Eliminado");
                    txtEliminar.setText("");
                    txtNombreE.setText("");
                    txtApellidoE.setText("");
                    txtTelefonoE.setText("");
                    txtDirecionE.setText("");
                    txtRolE.setText("");
                    txtCorreoE.setText("");
                    btnEliminar.setEnabled(false);
                    usuarioAux = null;
                } else {
                    JOptionPane.showMessageDialog(this, "Error al eliminar \n Posiblemete se este usando en otra base", "CLIENTE", JOptionPane.ERROR_MESSAGE);
                    txtEliminar.setText("");
                    txtNombreE.setText("");
                    txtApellidoE.setText("");
                    txtTelefonoE.setText("");
                    txtDirecionE.setText("");
                    txtRolE.setText("");
                    txtCorreoE.setText("");
                    btnEliminar.setEnabled(false);
                    usuarioAux = null;
                }
            } else {
                txtEliminar.setText("");
                txtNombreE.setText("");
                txtApellidoE.setText("");
                txtTelefonoE.setText("");
                txtDirecionE.setText("");
                txtRolE.setText("");
                txtCorreoE.setText("");
                btnEliminar.setEnabled(false);
                usuarioAux = null;
            }
        } else {
            JOptionPane.showMessageDialog(this, "Por favor realice la busqueda", "CLIENTE", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnEliminarActionPerformed


    private void actulizarMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actulizarMActionPerformed
        int cont = 0;
        if ("" != txtCedulaM.getText()) {
            cont++;
        }
        if ("" != txtNombreM.getText()) {
            cont++;
        }
        if ("" != txtApellidoM.getText()) {
            cont++;
        }
        if ("" != txtTelefonoM.getText()) {
            cont++;
        }
        if ("" != txtDirecionM.getText()) {
            cont++;
        }
        if (cont == 5) {
            if (usuarioAux != null) {
                int id = usuarioAux.getId();
                String cedula = txtCedulaM.getText();
                String nombre = txtNombreM.getText();
                String apellido = txtApellidoM.getText();
                String telefono = txtTelefonoM.getText();
                String direccion = txtDirecionM.getText();
                String rol = comboRolM.getSelectedItem().toString();
                String correo = txtCorreoM.getText();
                String contraseña = txtContraseñaM.getText();

                Usuario usuario = new Usuario(id, cedula, nombre, apellido, telefono, direccion, rol, correo, contraseña);
                boolean actualizar = controladorUsuario.actualizar(usuario);
                if (actualizar == true) {
                    JOptionPane.showMessageDialog(this, "Cliente Actualizado");
                    limpiarActualizar();
                } else {
                    JOptionPane.showMessageDialog(this, "Error al ACTUALIZAR", "CLIENTE", JOptionPane.ERROR_MESSAGE);
                    limpiarActualizar();
                }
            } else {
                JOptionPane.showMessageDialog(this, "Por favor realice la busqueda", "CLIENTE", JOptionPane.ERROR_MESSAGE);
                limpiarActualizar();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Exiten errores en los campos!! \nVerfique los datos ingresados", "CLUETE", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_actulizarMActionPerformed
    public void limpiarActualizar() {
        txtModificar.setText("");
        txtCedulaM.setText("");
        txtNombreM.setText("");
        txtApellidoM.setText("");
        txtTelefonoM.setText("");
        txtDirecionM.setText("");
        txtCorreoM.setText("");
        comboRolM.setSelectedIndex(0);
        txtContraseñaM.setText("");
        txtCedulaM.setBackground(Color.WHITE);

        txtCedulaM.setEditable(false);
        txtNombreM.setEditable(false);
        txtApellidoM.setEditable(false);
        txtTelefonoM.setEditable(false);
        txtDirecionM.setEditable(false);
        txtContraseñaM.setEditable(false);
        actulizarM.setEnabled(false);

        usuarioAux = null;
    }
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        boolean bander = true;
        if (txtCedula.getBackground() != Color.GREEN ) {
            bander = false;
        }
        if (0 >= txtNombre.getText().length()) {
            bander = false;
        }
        if (0 >= txtApellido.getText().length()) {
            bander = false;
        }
        if (0 >= txtTelefono.getText().length()) {
            bander = false;
        }
        if (0 >= txtDirecion.getText().length()) {
            bander = false;
        }
        if (0 >= txtCorreo.getText().length()) {
            bander = false;
        }
        if (0 == comboRol.getSelectedIndex()) {
            bander = false;
        }
        if (bander) {
            int id = 0;
            String cedula = txtCedula.getText();
            String nombre = txtNombre.getText();
            String apellido = txtApellido.getText();
            String telefono = txtTelefono.getText();
            String direccion = txtDirecion.getText();
            String rol = comboRol.getSelectedItem().toString();
            String correo = txtCorreo.getText();
            String contraseña = txtContraseña.getText().toString();

            Usuario usuario = new Usuario(id, cedula, nombre, apellido, telefono, direccion, rol, correo, contraseña);

            boolean ingresado;
            ingresado = controladorUsuario.ingresar(usuario);
            if (ingresado == true) {
                txtCedula.setText("");
                txtNombre.setText("");
                txtApellido.setText("");
                txtTelefono.setText("");
                txtCorreo.setText("");
                txtDirecion.setText("");
                txtContraseña.setText("");
                txtCedula.setBackground(Color.WHITE);
                comboRol.setSelectedIndex(0);
                JOptionPane.showMessageDialog(this, "CLIENTE INGRESADO");
            } else {
                JOptionPane.showMessageDialog(this, "ERROR AL INGRESAR");
            }

        } else {
            JOptionPane.showMessageDialog(this, "Exiten errores en los campos!! \nVerfique los datos ingresados", "USUARIO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnGuardarActionPerformed


    private void panelesCrudClienteStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_panelesCrudClienteStateChanged
        int x = panelesCrudCliente.getSelectedIndex();
        if (x == 1) {
            limpiarTabla();
            List<Usuario> lista;
            lista = controladorUsuario.listar();
            if (lista.isEmpty() == false) {
                DefaultTableModel model = (DefaultTableModel) tabla.getModel();
                int index = 0;
                for (Usuario u : lista) {
                    model.insertRow(index, new Object[]{u.getId(), u.getCedula(), u.getNombre() + " " + u.getApellido(), u.getDireccion(), u.getTelefono(), u.getCorreo(), u.getRol()});
                    index++;
                }
            } else {
                JOptionPane.showMessageDialog(this, "LISTA VACIA", "USUARIO", JOptionPane.ERROR_MESSAGE);
            }

        }
    }//GEN-LAST:event_panelesCrudClienteStateChanged

    public void limpiarTabla() {
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
    }

    private void txtCedulaMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedulaMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCedulaMActionPerformed

    private void buscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscar1ActionPerformed
        String cedula = txtBuscar.getText();
        Usuario usuario;
        usuario = controladorUsuario.buscar(cedula);
        if (usuario != null) {
            txtNombreB.setText(usuario.getNombre());
            txtApellidoB.setText(usuario.getApellido());
            txtTelefonoB.setText(usuario.getTelefono());
            txtDirecionB.setText(usuario.getDireccion());
            txtRolB.setText(usuario.getRol());
            txtCorreoB.setText(usuario.getCorreo());
        } else {
            txtNombreB.setText("");
            txtApellidoB.setText("");
            txtTelefonoB.setText("");
            txtDirecionB.setText("");
            txtRolB.setText("");
            txtCorreoB.setText("");
            txtBuscar.setText("");
            JOptionPane.showMessageDialog(this, "USUARIO NO ENCOTRADO", "USUARIO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_buscar1ActionPerformed


    private void buscar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscar2ActionPerformed
        String cedulaBuscar = txtModificar.getText();
        Usuario usuario;
        usuario = null;
        usuario = controladorUsuario.buscar(cedulaBuscar);
        if (usuario != null) {
            txtCedulaM.setText(usuario.getCedula());
            txtNombreM.setText(usuario.getNombre());
            txtApellidoM.setText(usuario.getApellido());
            txtTelefonoM.setText(usuario.getTelefono());
            txtDirecionM.setText(usuario.getDireccion());
            comboRolM.setSelectedItem(usuario.getRol());
            txtCorreoM.setText(usuario.getCorreo());
            txtContraseñaM.setText(usuario.getContraseña());
            txtCedulaM.setBackground(Color.GREEN);
            usuarioAux = usuario;

            txtCedulaM.setEditable(true);
            txtNombreM.setEditable(true);
            txtApellidoM.setEditable(true);
            txtTelefonoM.setEditable(true);
            txtDirecionM.setEditable(true);
            comboRolM.setEditable(true);
            txtCorreoM.setEditable(true);
            txtContraseñaM.setEditable(true);
            actulizarM.setEnabled(true);

        } else {
            txtNombreM.setText("");
            txtApellidoM.setText("");
            txtTelefonoM.setText("");
            txtDirecionM.setText("");
            comboRolM.setSelectedItem(0);
            txtCorreoM.setText("");
            txtContraseña.setText("");
            usuarioAux = null;
            txtCedulaM.setEditable(false);
            txtNombreM.setEditable(false);
            txtApellidoM.setEditable(false);
            txtTelefonoM.setEditable(false);
            txtDirecionM.setEditable(false);
            comboRolM.setEditable(false);
            txtCorreoM.setEditable(false);
            txtContraseña.setEditable(false);
            actulizarM.setEnabled(false);
            JOptionPane.showMessageDialog(this, "USUARIO NO ENCOTRADO", "USUARIO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_buscar2ActionPerformed

    private void buscar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscar3ActionPerformed
        String cedula = txtEliminar.getText();
        Usuario usuario;
        usuario = controladorUsuario.buscar(cedula);
        if (usuario != null) {
            txtNombreE.setText(usuario.getNombre());
            txtApellidoE.setText(usuario.getApellido());
            txtTelefonoE.setText(usuario.getTelefono());
            txtDirecionE.setText(usuario.getDireccion());
            txtRolE.setText(usuario.getRol());
            txtCorreoE.setText(usuario.getCorreo());
            usuarioAux = usuario;
            btnEliminar.setEnabled(true);
        } else {
            txtNombreE.setText("");
            txtApellidoE.setText("");
            txtTelefonoE.setText("");
            txtDirecionE.setText("");
            txtRolE.setText("");
            txtCorreoE.setText("");
            txtEliminar.setText("");
            JOptionPane.showMessageDialog(this, "USUARIO NO ENCOTRADO", "USUARIO", JOptionPane.ERROR_MESSAGE);
            usuarioAux = null;
            btnEliminar.setEnabled(false);
        }
    }//GEN-LAST:event_buscar3ActionPerformed

    private void txtCedulaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaKeyPressed
        controladorUsuario.keyTypedCedula(txtCedula, evt);
    }//GEN-LAST:event_txtCedulaKeyPressed

    private void txtCedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaKeyTyped
        if (evt.getKeyCode() != KeyEvent.VK_DELETE) {
            if (evt.getKeyChar() < '0' || evt.getKeyChar() > '9') {
                evt.consume();
            }
            if(txtCedula.getText().length() ==13){
                evt.consume();
            }
        }
    }//GEN-LAST:event_txtCedulaKeyTyped

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoKeyTyped
        char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtApellidoKeyTyped

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
        if (evt.getKeyCode() != KeyEvent.VK_DELETE) {
            if (evt.getKeyChar() < '0' || evt.getKeyChar() > '9') {
                evt.consume();
            }
        }
    }//GEN-LAST:event_txtTelefonoKeyTyped

    private void txtCorreoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCorreoKeyTyped

    }//GEN-LAST:event_txtCorreoKeyTyped

    private void txtDirecionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDirecionKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtDirecionKeyTyped

    private void txtCorreoMKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCorreoMKeyTyped

    }//GEN-LAST:event_txtCorreoMKeyTyped

    private void txtNombreMKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreMKeyTyped
        char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtNombreMKeyTyped

    private void txtApellidoMKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoMKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtApellidoMKeyTyped

    private void txtDirecionMKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDirecionMKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtDirecionMKeyTyped

    private void txtBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyTyped
        if (evt.getKeyCode() != KeyEvent.VK_DELETE) {
            if (evt.getKeyChar() < '0' || evt.getKeyChar() > '9') {
                evt.consume();
            }
        }
    }//GEN-LAST:event_txtBuscarKeyTyped

    private void txtModificarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtModificarKeyTyped
        if (evt.getKeyCode() != KeyEvent.VK_DELETE) {
            if (evt.getKeyChar() < '0' || evt.getKeyChar() > '9') {
                evt.consume();
            }
            if(txtCedulaM.getText().length() ==13){
                evt.consume();
            }
        }
    }//GEN-LAST:event_txtModificarKeyTyped

    private void txtCedulaMKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaMKeyTyped
        if (evt.getKeyCode() != KeyEvent.VK_DELETE) {
            if (evt.getKeyChar() < '0' || evt.getKeyChar() > '9') {
                evt.consume();
            }
            if(txtCedulaM.getText().length() ==13){
                evt.consume();
            }
        }
    }//GEN-LAST:event_txtCedulaMKeyTyped

    private void txtTelefonoMKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoMKeyTyped
        if (evt.getKeyCode() != KeyEvent.VK_DELETE) {
            if (evt.getKeyChar() < '0' || evt.getKeyChar() > '9') {
                evt.consume();
            }
        }
    }//GEN-LAST:event_txtTelefonoMKeyTyped

    private void txtEliminarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEliminarKeyTyped
        if (evt.getKeyCode() != KeyEvent.VK_DELETE) {
            if (evt.getKeyChar() < '0' || evt.getKeyChar() > '9') {
                evt.consume();
            }
        }
    }//GEN-LAST:event_txtEliminarKeyTyped

    private void txtCedulaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaKeyReleased
        controladorUsuario.keyReleesCedula(txtCedula, evt);
    }//GEN-LAST:event_txtCedulaKeyReleased

    private void txtCedulaMKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaMKeyPressed
        controladorUsuario.keyTypedCedula(txtCedulaM, evt);
    }//GEN-LAST:event_txtCedulaMKeyPressed

    private void txtModificarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtModificarKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtModificarKeyPressed

    private void txtCedulaMKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaMKeyReleased
        controladorUsuario.keyReleesCedula(txtCedulaM, evt);
    }//GEN-LAST:event_txtCedulaMKeyReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actulizarM;
    private javax.swing.JLabel agregarClientes;
    private javax.swing.JLabel apellido;
    private javax.swing.JLabel apellido3;
    private javax.swing.JLabel apellido4;
    private javax.swing.JLabel apillido2;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton buscar1;
    private javax.swing.JButton buscar2;
    private javax.swing.JButton buscar3;
    private javax.swing.JLabel buscarclientes;
    private javax.swing.JLabel cedula;
    private javax.swing.JLabel cedula3;
    private javax.swing.JLabel cedula4;
    private javax.swing.JComboBox<String> comboRol;
    private javax.swing.JComboBox<String> comboRolM;
    private javax.swing.JLabel direccion;
    private javax.swing.JLabel direccion3;
    private javax.swing.JLabel direccion4;
    private javax.swing.JLabel direcion10;
    private javax.swing.JLabel direcion12;
    private javax.swing.JLabel direcion13;
    private javax.swing.JLabel direcion2;
    private javax.swing.JLabel direcion3;
    private javax.swing.JLabel direcion4;
    private javax.swing.JLabel direcion5;
    private javax.swing.JLabel direcion6;
    private javax.swing.JLabel direcion7;
    private javax.swing.JLabel direcion8;
    private javax.swing.JLabel direcion9;
    private javax.swing.JLabel eliminarcliente;
    private javax.swing.JLabel ingreseCedula;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblControlarCliente;
    private javax.swing.JLabel listadeClientes;
    private javax.swing.JLabel modificarcliente;
    private javax.swing.JLabel nombre;
    private javax.swing.JLabel nombre2;
    private javax.swing.JLabel nombre3;
    private javax.swing.JLabel nombre4;
    private javax.swing.JLabel nombre5;
    private javax.swing.JPanel panelBuscarCliente;
    private javax.swing.JTabbedPane panelesCrudCliente;
    private javax.swing.JTable tabla;
    private javax.swing.JLabel telefono;
    private javax.swing.JLabel telefono2;
    private javax.swing.JLabel telefono3;
    private javax.swing.JLabel telefono4;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtApellidoB;
    private javax.swing.JTextField txtApellidoE;
    private javax.swing.JTextField txtApellidoM;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtCedulaM;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JPasswordField txtContraseñaM;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtCorreoB;
    private javax.swing.JTextField txtCorreoE;
    private javax.swing.JTextField txtCorreoM;
    private javax.swing.JTextField txtDirecion;
    private javax.swing.JTextField txtDirecionB;
    private javax.swing.JTextField txtDirecionE;
    private javax.swing.JTextField txtDirecionM;
    private javax.swing.JTextField txtEliminar;
    private javax.swing.JTextField txtModificar;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreB;
    private javax.swing.JTextField txtNombreE;
    private javax.swing.JTextField txtNombreM;
    private javax.swing.JTextField txtRolB;
    private javax.swing.JTextField txtRolE;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtTelefonoB;
    private javax.swing.JTextField txtTelefonoE;
    private javax.swing.JTextField txtTelefonoM;
    // End of variables declaration//GEN-END:variables
}
