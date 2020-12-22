/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.nhankhau;

import controller.NhanKhauManagerController;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Vu
 */
public class NhanKhauPanel extends javax.swing.JPanel {

    /**
     * Creates new form NhanKhauPanel
     */
    NhanKhauManagerController nhanKhauControl = new NhanKhauManagerController();
    private static NhanKhauPanel instance;
    
    public NhanKhauPanel(JPanel panMainNhanKhau) {
        initComponents();
        setBounds(0, 0, 710, 442);
        nhanKhauControl.capNhatBang(DSNhanKhauTable);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        chitietbutton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        DSNhanKhauTable = new javax.swing.JTable();
        captamtrubutton = new javax.swing.JButton();
        capnhatbutton = new javax.swing.JButton();
        dstamtrubutton = new javax.swing.JButton();
        dstamvangbutton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtTimKiem = new javax.swing.JTextField();
        comboboxTimKiem = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        buttonTimKiem = new javax.swing.JButton();

        setBackground(new java.awt.Color(135, 206, 235));

        chitietbutton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        chitietbutton.setText("Xem chi tiết");
        chitietbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chitietbuttonActionPerformed(evt);
            }
        });

        DSNhanKhauTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mã định danh", "Số hộ khẩu", "Họ tên", "Ngày sinh", "Giới tính", "Địa chỉ"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        DSNhanKhauTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DSNhanKhauTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(DSNhanKhauTable);

        captamtrubutton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        captamtrubutton.setText("Cấp giấy tạm trú");
        captamtrubutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                captamtrubuttonActionPerformed(evt);
            }
        });

        capnhatbutton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        capnhatbutton.setText("Cập nhật trạng thái");
        capnhatbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                capnhatbuttonActionPerformed(evt);
            }
        });

        dstamtrubutton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        dstamtrubutton.setText("Danh sách tạm trú");
        dstamtrubutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dstamtrubuttonActionPerformed(evt);
            }
        });

        dstamvangbutton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        dstamvangbutton.setText("Danh sách tạm vắng");
        dstamvangbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dstamvangbuttonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Tìm kiếm:");

        comboboxTimKiem.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        comboboxTimKiem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Họ tên", "Mã định danh", "Số hộ khẩu" }));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Tìm kiếm theo:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Nhập thông tin tìm kiếm:");

        buttonTimKiem.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        buttonTimKiem.setText("Tìm kiếm");
        buttonTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTimKiemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(55, 55, 55)
                        .addComponent(jLabel2)))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(comboboxTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buttonTimKiem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(captamtrubutton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(chitietbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dstamtrubutton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dstamvangbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(capnhatbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2)
                        .addComponent(comboboxTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonTimKiem))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(chitietbutton)
                        .addGap(18, 18, 18)
                        .addComponent(captamtrubutton)
                        .addGap(18, 18, 18)
                        .addComponent(dstamtrubutton)
                        .addGap(18, 18, 18)
                        .addComponent(dstamvangbutton)
                        .addGap(18, 18, 18)
                        .addComponent(capnhatbutton)
                        .addGap(0, 144, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void chitietbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chitietbuttonActionPerformed
        // TODO add your handling code here:
        new ChiTietNhanKhauFR().setVisible(true);
    }//GEN-LAST:event_chitietbuttonActionPerformed

    private void DSNhanKhauTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DSNhanKhauTableMouseClicked
        // TODO add your handling code here:
        DefaultTableModel df=(DefaultTableModel) DSNhanKhauTable.getModel();
        int index=DSNhanKhauTable.getSelectedRow();
        nhanKhauControl.setMaDinhDanh((String)df.getValueAt(index, 0));
        nhanKhauControl.setSoHoKhau((String)df.getValueAt(index, 1));
    }//GEN-LAST:event_DSNhanKhauTableMouseClicked

    private void capnhatbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_capnhatbuttonActionPerformed
        // TODO add your handling code here:
        nhanKhauControl.capNhatBang(DSNhanKhauTable);
    }//GEN-LAST:event_capnhatbuttonActionPerformed

    private void dstamtrubuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dstamtrubuttonActionPerformed
        // TODO add your handling code here:
        new BangTamTruFR().setVisible(true);
    }//GEN-LAST:event_dstamtrubuttonActionPerformed

    private void dstamvangbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dstamvangbuttonActionPerformed
        // TODO add your handling code here:
        new BangTamVangFR().setVisible(true);
    }//GEN-LAST:event_dstamvangbuttonActionPerformed

    private void captamtrubuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_captamtrubuttonActionPerformed
        // TODO add your handling code here:
        new ThemTamTruFR().setVisible(true);
    }//GEN-LAST:event_captamtrubuttonActionPerformed

    private void buttonTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTimKiemActionPerformed
        // TODO add your handling code here:
        nhanKhauControl.timKiemNhankhau(comboboxTimKiem, DSNhanKhauTable, txtTimKiem.getText());
    }//GEN-LAST:event_buttonTimKiemActionPerformed

    public static NhanKhauPanel getInstance(JPanel panMainNhanKhau) {
		if(instance == null) {
			instance = new NhanKhauPanel(panMainNhanKhau);
		}
		return instance;
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable DSNhanKhauTable;
    private javax.swing.JButton buttonTimKiem;
    private javax.swing.JButton capnhatbutton;
    private javax.swing.JButton captamtrubutton;
    private javax.swing.JButton chitietbutton;
    private javax.swing.JComboBox<String> comboboxTimKiem;
    private javax.swing.JButton dstamtrubutton;
    private javax.swing.JButton dstamvangbutton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables
}