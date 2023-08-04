import com.mysql.jdbc.Statement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import koneksi.konek;
import javax.swing.table.DefaultTableModel;
        
public class siswa extends javax.swing.JFrame {

    public siswa() {
        initComponents();
        datatabel();
        
    }
    private void datatabel(){
        DefaultTableModel tbl = new DefaultTableModel();
        
        tbl.addColumn("Nomor Induk");
        tbl.addColumn("Nama Siswa");
        tbl.addColumn("Jenis Kelasmin");
        tbl.addColumn("Alamat");
        tbl.addColumn("Kelas");
        tabel.setModel(tbl);
        try {
            Statement input = (Statement) konek.getConnection().createStatement();
            ResultSet res = input.executeQuery("select * from siswa");
            while (res.next()){
                tbl.addRow(new Object[] {
                    res.getString("no_induk"),
                    res.getString("nama"),
                    res.getString("jenkel"),
                    res.getString("alamat"),
                    res.getString("kelas"),
                });
                tabel.setModel(tbl);
            }
        } catch(Exception e){
            
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        noinduk = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        nama = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        kelas_combo = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jk = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        alamat = new javax.swing.JTextArea();
        baru = new javax.swing.JButton();
        save = new javax.swing.JButton();
        edit = new javax.swing.JButton();
        hapus = new javax.swing.JButton();
        keluar = new javax.swing.JButton();
        search = new javax.swing.JButton();
        cari = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabel = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Adobe Gothic Std B", 1, 18)); // NOI18N
        jLabel1.setText("INPUT DATA SISWA");

        jLabel2.setText("Nomor Induk");

        jLabel3.setText("Nama Siswa ");

        jLabel4.setText("Kelas");

        kelas_combo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-- PILIH --", "X", "XI", "XII" }));

        jLabel5.setText("Jenis Kelamin");

        jk.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-- PILIH --", "Laki - Laki", "Perempuan" }));

        jLabel6.setText("Alamat");

        alamat.setColumns(20);
        alamat.setRows(5);
        jScrollPane1.setViewportView(alamat);

        baru.setText("NEW");
        baru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                baruActionPerformed(evt);
            }
        });

        save.setText("SAVE");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        edit.setText("EDIT");
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });

        hapus.setText("DELETE");
        hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusActionPerformed(evt);
            }
        });

        keluar.setText("EXIT");
        keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluarActionPerformed(evt);
            }
        });

        search.setText("SEARCH");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cariActionPerformed(evt);
            }
        });

        tabel.setModel(new javax.swing.table.DefaultTableModel(
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
        tabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(318, 318, 318))
            .addGroup(layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(noinduk, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                                .addComponent(nama, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jk, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(kelas_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(baru)
                        .addGap(18, 18, 18)
                        .addComponent(save)
                        .addGap(18, 18, 18)
                        .addComponent(edit)
                        .addGap(18, 18, 18)
                        .addComponent(hapus)
                        .addGap(18, 18, 18)
                        .addComponent(keluar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(search)
                        .addGap(46, 46, 46)
                        .addComponent(cari, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(50, 50, 50))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(noinduk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(search)
                    .addComponent(cari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(kelas_combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(baru)
                            .addComponent(save)
                            .addComponent(edit)
                            .addComponent(hapus)
                            .addComponent(keluar))))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        // TODO add your handling code here:
        String no_induk = noinduk.getText();
        String nama_siswa = nama.getText();
        String jenkel = (String) jk.getSelectedItem();
        String alamat_siswa = alamat.getText();
        String kelas_siswa = (String) kelas_combo.getSelectedItem();
        
        try{
            Statement input = (Statement) konek.getConnection(). createStatement();
            input.executeUpdate("insert into siswa values('"+no_induk+"','"+nama_siswa+"','"+jenkel+"','"+alamat_siswa+"', '"+kelas_siswa+"')");
            input.close();
            JOptionPane.showMessageDialog(null, "DATA BERHASIL DISIMPAN");
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "DATA GAGAL DISIMPAN "+e.getMessage());
        }
        datatabel();
    }//GEN-LAST:event_saveActionPerformed

    private void tabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tabel.getModel();
        tabel.getSelectedRow();
        Object no_induk = model.getValueAt(tabel.getSelectedRow(), 0);
        noinduk.setText(String.valueOf(no_induk));
        Object nama_siswa = model.getValueAt(tabel.getSelectedRow(), 1);
        nama.setText(String.valueOf(nama_siswa));
        Object kelassiswa = model.getValueAt(tabel.getSelectedRow(), 4);
        kelas_combo.setSelectedItem(String.valueOf(kelassiswa));
        Object jenkel = model.getValueAt(tabel.getSelectedRow(), 2);
        jk.setSelectedItem(String.valueOf(jenkel));
        Object alamat_siswa = model.getValueAt(tabel.getSelectedRow(), 3);
        alamat.setText(String.valueOf(alamat_siswa));
    }//GEN-LAST:event_tabelMouseClicked

    private void hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusActionPerformed
        // TODO add your handling code here:
        String no_induk = noinduk.getText();
        String namasiswa = nama.getText();
        String kelas_siswa2 = (String) kelas_combo.getSelectedItem();
        String jenis_kelamin = (String) jk.getSelectedItem();
        String alamat_siswa2 = alamat.getText();
        
        try{
            Statement statement = (Statement) konek.getConnection().createStatement();
            statement.executeUpdate("Delete FROM siswa WHERE nomor_induk='"+no_induk+"'");
            statement.close();
            JOptionPane.showMessageDialog(null, "DATA BERHASIL DIHAPUS");
        }catch (Exception t) {
            JOptionPane.showMessageDialog(null, "DATA GAGAL DIHAPUS"+t.getMessage());
        }
        datatabel();
    }//GEN-LAST:event_hapusActionPerformed

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed

        if (edit.getText() == "editlah"){
            noinduk.requestFocus();
        }else{
                String no_induk = noinduk.getText();
                String nama_siswa = nama.getText();
                String jenis_kelamin = (String) jk.getSelectedItem();
                String alamat_siswa = alamat.getText();
                String kelas_siswa = (String) kelas_combo.getSelectedItem();
            try{
                Statement statement= (Statement) konek.getConnection().createStatement();
                statement.executeUpdate("UPDATE siswa SET nama='"+nama_siswa+"', jenkel='"+jenis_kelamin+"', alamat='"+alamat_siswa+"', kelas='"+kelas_siswa+"' WHERE nomor_induk='"+no_induk+"'");
                JOptionPane.showMessageDialog(null, "DATA BERHASIL DISIMPAN");
                noinduk.setText("");
                nama.setText("");
                kelas_combo.setSelectedItem("--PILIH KELAS--");
                jk.setSelectedItem("--PILIH JENKEL--");
                alamat.setText("");
                }
            catch(Exception t){
                JOptionPane.showMessageDialog(null,"DATA BERHASIL DI EDIT"+ t. getMessage());
            }
            datatabel();
        }
    }//GEN-LAST:event_editActionPerformed

    private void cariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cariActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_cariActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
                try{
            Statement statement = (Statement) konek.getConnection() .createStatement();
            ResultSet res = statement.executeQuery("SELECT * from siswa where "+ 
                    " nomor_induk like '"+cari.getText()+"' OR "+
                    " nama like '"+cari.getText()+"'");
            DefaultTableModel tbl = new DefaultTableModel();
            tbl.addColumn("nomor_induk");
            tbl.addColumn("nama");
            tbl.addColumn("jenkel");
            tbl.addColumn("alamat");
            tbl.addColumn("kelas");
            
            tabel.setModel(tbl);
            while(res.next()) {
                tbl.addRow(new Object[] {
                res.getString("nomor_induk"),
                res.getString("nama"),
                res.getString("jenkel"),
                res.getString("alamat"),
                res.getString("kelas"),
            });
                tabel.setModel(tbl);
            }
        }catch (Exception t) {
            JOptionPane.showMessageDialog(null, "DATA BERHASIL DI EDIT"+ t.getMessage ());
        }
    }//GEN-LAST:event_searchActionPerformed

    private void keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluarActionPerformed
        // TODO add your handling code here:
        int selectedOption = JOptionPane.showConfirmDialog(null, "Apakah anda akan menutup system?", "Tutup Aplikasi", JOptionPane.YES_NO_OPTION);
        if (selectedOption == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_keluarActionPerformed

    private void baruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_baruActionPerformed
        // TODO add your handling code here:
        noinduk.setText("");
        nama.setText("");
        kelas_combo.setSelectedItem("-- PILIH --");
        jk.setSelectedItem("-- PILIH --");
        alamat.setText("");
    }//GEN-LAST:event_baruActionPerformed
    
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
            java.util.logging.Logger.getLogger(siswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(siswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(siswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(siswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new siswa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea alamat;
    private javax.swing.JButton baru;
    private javax.swing.JTextField cari;
    private javax.swing.JButton edit;
    private javax.swing.JButton hapus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox jk;
    private javax.swing.JComboBox kelas_combo;
    private javax.swing.JButton keluar;
    private javax.swing.JTextField nama;
    private javax.swing.JTextField noinduk;
    private javax.swing.JButton save;
    private javax.swing.JButton search;
    private javax.swing.JTable tabel;
    // End of variables declaration//GEN-END:variables
}
