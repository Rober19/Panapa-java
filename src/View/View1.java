/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.PanController;
import Model.Pan;

/**
 *
 * @author Roberto Batty
 */
public class View1 extends javax.swing.JFrame {

    /**
     * Creates new form View1
     */
    PanController paco = new PanController();

    int indexMod_tbl = 0;
    //PACO es instanciar al PanController 

    public View1() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Productos = new javax.swing.JTabbedPane();
        Registrar_Producto = new javax.swing.JPanel();
        nombrePanReg_txt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        cantidadPanReg_txt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        precioPanReg_txt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaPanesReg_tbl = new javax.swing.JTable();
        registrarPan_btn = new javax.swing.JButton();
        Modificar_Producto = new javax.swing.JPanel();
        EditPan_btn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaPanesEdit_tbl = new javax.swing.JTable();
        cantidadPanEdit_txt = new javax.swing.JTextField();
        precioPanEdit_txt = new javax.swing.JTextField();
        nombrePanEdit_txt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        selecEditPan_chbx = new javax.swing.JCheckBox();
        precioPanEdit_txt1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        Consultar_Producto = new javax.swing.JPanel();
        selecEditPan_chbx1 = new javax.swing.JCheckBox();
        jLabel8 = new javax.swing.JLabel();
        precioPanEdit_txt2 = new javax.swing.JTextField();
        EditPan_btn1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        listaPanesEdit_tbl1 = new javax.swing.JTable();
        Eliminar_Producto = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        listaPanesEdit_tbl2 = new javax.swing.JTable();
        precioPanEdit_txt3 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        selecEditPan_chbx2 = new javax.swing.JCheckBox();
        EditPan_btn3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Productos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Actualizar_panel(evt);
            }
        });

        jLabel1.setText("Nombre del Tipo de Producto : ");

        jLabel2.setText("Cantidad : ");

        jLabel3.setText("Precio : ");

        listaPanesReg_tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Cantidad", "Precio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(listaPanesReg_tbl);

        registrarPan_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/guardar.png"))); // NOI18N
        registrarPan_btn.setText("Registrar");
        registrarPan_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarPan(evt);
            }
        });

        javax.swing.GroupLayout Registrar_ProductoLayout = new javax.swing.GroupLayout(Registrar_Producto);
        Registrar_Producto.setLayout(Registrar_ProductoLayout);
        Registrar_ProductoLayout.setHorizontalGroup(
            Registrar_ProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Registrar_ProductoLayout.createSequentialGroup()
                .addGroup(Registrar_ProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Registrar_ProductoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(Registrar_ProductoLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(Registrar_ProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nombrePanReg_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(Registrar_ProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Registrar_ProductoLayout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(precioPanReg_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Registrar_ProductoLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addGap(39, 39, 39)))
                        .addGroup(Registrar_ProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Registrar_ProductoLayout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(cantidadPanReg_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(Registrar_ProductoLayout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(jLabel2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                        .addComponent(registrarPan_btn)))
                .addGap(15, 15, 15))
        );
        Registrar_ProductoLayout.setVerticalGroup(
            Registrar_ProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Registrar_ProductoLayout.createSequentialGroup()
                .addGroup(Registrar_ProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Registrar_ProductoLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(registrarPan_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Registrar_ProductoLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(Registrar_ProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(Registrar_ProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3))
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(Registrar_ProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cantidadPanReg_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(precioPanReg_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nombrePanReg_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        Productos.addTab("Registrar Producto", Registrar_Producto);

        EditPan_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/editar.png"))); // NOI18N
        EditPan_btn.setText("Modificar");
        EditPan_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarPan(evt);
            }
        });

        listaPanesEdit_tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Cantidad", "Precio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        listaPanesEdit_tbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                selecProdModif_tbl(evt);
            }
        });
        jScrollPane2.setViewportView(listaPanesEdit_tbl);

        jLabel4.setText("Nuevo Nombre :  ");

        jLabel5.setText("Nuevo Precio : ");

        jLabel6.setText("Nueva Cantidad :");

        selecEditPan_chbx.setText("Seleccionado");
        selecEditPan_chbx.setEnabled(false);

        jLabel7.setText("Buscar :");

        javax.swing.GroupLayout Modificar_ProductoLayout = new javax.swing.GroupLayout(Modificar_Producto);
        Modificar_Producto.setLayout(Modificar_ProductoLayout);
        Modificar_ProductoLayout.setHorizontalGroup(
            Modificar_ProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Modificar_ProductoLayout.createSequentialGroup()
                .addGroup(Modificar_ProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Modificar_ProductoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2))
                    .addGroup(Modificar_ProductoLayout.createSequentialGroup()
                        .addGroup(Modificar_ProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Modificar_ProductoLayout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(Modificar_ProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nombrePanEdit_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(Modificar_ProductoLayout.createSequentialGroup()
                                        .addGap(37, 37, 37)
                                        .addComponent(jLabel4)))
                                .addGroup(Modificar_ProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(Modificar_ProductoLayout.createSequentialGroup()
                                        .addGap(39, 39, 39)
                                        .addComponent(jLabel5))
                                    .addGroup(Modificar_ProductoLayout.createSequentialGroup()
                                        .addGap(13, 13, 13)
                                        .addComponent(precioPanEdit_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(12, 12, 12)
                                .addGroup(Modificar_ProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cantidadPanEdit_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(Modificar_ProductoLayout.createSequentialGroup()
                                        .addGap(15, 15, 15)
                                        .addComponent(jLabel6)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Modificar_ProductoLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(selecEditPan_chbx)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7)
                                .addGap(12, 12, 12)
                                .addComponent(precioPanEdit_txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(104, 104, 104)))
                        .addComponent(EditPan_btn)))
                .addGap(15, 15, 15))
        );
        Modificar_ProductoLayout.setVerticalGroup(
            Modificar_ProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Modificar_ProductoLayout.createSequentialGroup()
                .addGroup(Modificar_ProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Modificar_ProductoLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(EditPan_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(Modificar_ProductoLayout.createSequentialGroup()
                        .addGap(0, 13, Short.MAX_VALUE)
                        .addGroup(Modificar_ProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(selecEditPan_chbx)
                            .addComponent(precioPanEdit_txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(Modificar_ProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(Modificar_ProductoLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(nombrePanEdit_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(Modificar_ProductoLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cantidadPanEdit_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(Modificar_ProductoLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(precioPanEdit_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(35, 35, 35)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        Productos.addTab("Modificar Producto", Modificar_Producto);

        selecEditPan_chbx1.setText("Seleccionado");
        selecEditPan_chbx1.setEnabled(false);

        jLabel8.setText("Buscar :");

        EditPan_btn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/buscar.png"))); // NOI18N
        EditPan_btn1.setText("Consultar");

        listaPanesEdit_tbl1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Cantidad", "Precio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(listaPanesEdit_tbl1);

        javax.swing.GroupLayout Consultar_ProductoLayout = new javax.swing.GroupLayout(Consultar_Producto);
        Consultar_Producto.setLayout(Consultar_ProductoLayout);
        Consultar_ProductoLayout.setHorizontalGroup(
            Consultar_ProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Consultar_ProductoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(selecEditPan_chbx1)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(precioPanEdit_txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(EditPan_btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(Consultar_ProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Consultar_ProductoLayout.createSequentialGroup()
                    .addGap(13, 13, 13)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 577, Short.MAX_VALUE)
                    .addGap(14, 14, 14)))
        );
        Consultar_ProductoLayout.setVerticalGroup(
            Consultar_ProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Consultar_ProductoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Consultar_ProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EditPan_btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(Consultar_ProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(selecEditPan_chbx1)
                        .addComponent(precioPanEdit_txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8)))
                .addContainerGap(339, Short.MAX_VALUE))
            .addGroup(Consultar_ProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Consultar_ProductoLayout.createSequentialGroup()
                    .addContainerGap(72, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(13, 13, 13)))
        );

        Productos.addTab("Consultar Producto", Consultar_Producto);

        listaPanesEdit_tbl2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Cantidad", "Precio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(listaPanesEdit_tbl2);

        jLabel9.setText("Buscar :");

        selecEditPan_chbx2.setText("Seleccionado");
        selecEditPan_chbx2.setEnabled(false);

        EditPan_btn3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/eliminar.png"))); // NOI18N
        EditPan_btn3.setText("Eliminar");

        javax.swing.GroupLayout Eliminar_ProductoLayout = new javax.swing.GroupLayout(Eliminar_Producto);
        Eliminar_Producto.setLayout(Eliminar_ProductoLayout);
        Eliminar_ProductoLayout.setHorizontalGroup(
            Eliminar_ProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Eliminar_ProductoLayout.createSequentialGroup()
                .addGroup(Eliminar_ProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Eliminar_ProductoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE))
                    .addGroup(Eliminar_ProductoLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(selecEditPan_chbx2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(precioPanEdit_txt3, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(EditPan_btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        Eliminar_ProductoLayout.setVerticalGroup(
            Eliminar_ProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Eliminar_ProductoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Eliminar_ProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(precioPanEdit_txt3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(selecEditPan_chbx2)
                    .addComponent(EditPan_btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)
                .addContainerGap())
        );

        Productos.addTab("Eliminar Producto", Eliminar_Producto);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Productos, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Productos, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registrarPan(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarPan
        paco.Create(new Pan(nombrePanReg_txt.getText(), Integer.parseInt(precioPanReg_txt.getText()), Integer.parseInt(cantidadPanReg_txt.getText()), "f2"));

        for (int i = 0; i < paco.getListaPan().size(); i++) {//getListPan = acceder al ArryList

            System.out.println(paco.getListaPan().get(i).getNombreTipo());
        }
        ListarRegistrar();

    }//GEN-LAST:event_registrarPan

    public void ListarRegistrar() {
        
        paco.Listar();

        listaPanesReg_tbl.setModel(new javax.swing.table.DefaultTableModel(
                paco.getListaPanesMtz(),
                new String[]{
                    "Nombre", "Cantidad", "Precio"
                }
        ) {
            boolean[] canEdit = new boolean[]{
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });

        jScrollPane1.setViewportView(listaPanesReg_tbl);

    }

    public void ListarModificar() {

      
        paco.Listar();

        listaPanesEdit_tbl.setModel(new javax.swing.table.DefaultTableModel(
                paco.getListaPanesMtz(),
                new String[]{
                    "Nombre", "Cantidad", "Precio"
                }
        ) {
            boolean[] canEdit = new boolean[]{
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });

        listaPanesEdit_tbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                selecProdModif_tbl(evt);
            }
        });

        jScrollPane2.setViewportView(listaPanesEdit_tbl);

    }

    private void Actualizar_panel(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Actualizar_panel
        ListarModificar();
    }//GEN-LAST:event_Actualizar_panel

    private void selecProdModif_tbl(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selecProdModif_tbl
        // rowAtPoint -> ( EVENTO 'evt' . getPoint() 'posicion' );
        int ab = listaPanesEdit_tbl.rowAtPoint(evt.getPoint());
        this.indexMod_tbl = ab;
        System.out.println("holaaaa y chaaaooo" + indexMod_tbl);

    }//GEN-LAST:event_selecProdModif_tbl

    private void modificarPan(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarPan

    }//GEN-LAST:event_modificarPan

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(View1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Consultar_Producto;
    private javax.swing.JButton EditPan_btn;
    private javax.swing.JButton EditPan_btn1;
    private javax.swing.JButton EditPan_btn3;
    private javax.swing.JPanel Eliminar_Producto;
    private javax.swing.JPanel Modificar_Producto;
    private javax.swing.JTabbedPane Productos;
    private javax.swing.JPanel Registrar_Producto;
    private javax.swing.JTextField cantidadPanEdit_txt;
    private javax.swing.JTextField cantidadPanReg_txt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable listaPanesEdit_tbl;
    private javax.swing.JTable listaPanesEdit_tbl1;
    private javax.swing.JTable listaPanesEdit_tbl2;
    private javax.swing.JTable listaPanesReg_tbl;
    private javax.swing.JTextField nombrePanEdit_txt;
    private javax.swing.JTextField nombrePanReg_txt;
    private javax.swing.JTextField precioPanEdit_txt;
    private javax.swing.JTextField precioPanEdit_txt1;
    private javax.swing.JTextField precioPanEdit_txt2;
    private javax.swing.JTextField precioPanEdit_txt3;
    private javax.swing.JTextField precioPanReg_txt;
    private javax.swing.JButton registrarPan_btn;
    private javax.swing.JCheckBox selecEditPan_chbx;
    private javax.swing.JCheckBox selecEditPan_chbx1;
    private javax.swing.JCheckBox selecEditPan_chbx2;
    // End of variables declaration//GEN-END:variables
}
