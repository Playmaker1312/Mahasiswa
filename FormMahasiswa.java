
package and240530.model;

import and240530.controler.MahasiswaControler;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author Lab-J2-01
 */
public class FormMahasiswa extends javax.swing.JFrame {

    /**
     * Creates new form FormMahasiswa
     */
    private final MahasiswaControler controler;
    public FormMahasiswa() {
        initComponents();
        controler = new MahasiswaControler(this);
        controler.cancel();
        controler.viewData();
    }

    public JComboBox<String> getCboJenisKelamin() {
        return cboJenisKelamin;
    }

    public JTextField getTxtAlamat() {
        return txtAlamat;
    }

    public JTextField getTxtNOBP() {
        return txtNOBP;
    }

    public JTextField getTxtNama() {
        return txtNama;
    }

    public JTextField getTxtTglLahir() {
        return txtTgl;
    }

    public JTable getTabelMahasiswa() {
        return tabelMahasiswa;
    }

    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Lnobp = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Lalamat = new javax.swing.JLabel();
        ljekel = new javax.swing.JLabel();
        ltgllahir = new javax.swing.JLabel();
        txtNOBP = new javax.swing.JTextField();
        txtNama = new javax.swing.JTextField();
        txtAlamat = new javax.swing.JTextField();
        cboJenisKelamin = new javax.swing.JComboBox<>();
        btnInsert = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        txtTgl = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelMahasiswa = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 51));
        getContentPane().setLayout(null);

        Lnobp.setText("NOBP");
        getContentPane().add(Lnobp);
        Lnobp.setBounds(20, 20, 70, 16);

        jLabel2.setText("Nama");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 50, 70, 16);

        Lalamat.setText("Alamat");
        getContentPane().add(Lalamat);
        Lalamat.setBounds(20, 80, 70, 16);

        ljekel.setText("Jenis Kelamin");
        getContentPane().add(ljekel);
        ljekel.setBounds(20, 110, 80, 16);

        ltgllahir.setText("Tanggal Lahir");
        getContentPane().add(ltgllahir);
        ltgllahir.setBounds(20, 140, 80, 16);

        txtNOBP.setText("NOBP");
        txtNOBP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNOBPActionPerformed(evt);
            }
        });
        getContentPane().add(txtNOBP);
        txtNOBP.setBounds(120, 20, 320, 22);

        txtNama.setText("Nama");
        getContentPane().add(txtNama);
        txtNama.setBounds(120, 50, 320, 22);

        txtAlamat.setText("ALamat");
        getContentPane().add(txtAlamat);
        txtAlamat.setBounds(120, 80, 320, 22);

        cboJenisKelamin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboJenisKelamin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboJenisKelaminActionPerformed(evt);
            }
        });
        getContentPane().add(cboJenisKelamin);
        cboJenisKelamin.setBounds(120, 110, 72, 22);

        btnInsert.setText("Insert");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });
        getContentPane().add(btnInsert);
        btnInsert.setBounds(20, 190, 70, 23);

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdate);
        btnUpdate.setBounds(110, 190, 70, 23);

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btnDelete);
        btnDelete.setBounds(200, 190, 70, 23);

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancel);
        btnCancel.setBounds(290, 190, 70, 23);

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        getContentPane().add(btnExit);
        btnExit.setBounds(380, 190, 60, 23);

        txtTgl.setText("tglLahir");
        getContentPane().add(txtTgl);
        txtTgl.setBounds(120, 140, 320, 22);

        tabelMahasiswa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NOBP", "Nama", "Alamat", "Jenis Kelamin", "Tgl Lahir"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelMahasiswa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelMahasiswaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelMahasiswa);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 232, 452, 230);

        setSize(new java.awt.Dimension(490, 526));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNOBPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNOBPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNOBPActionPerformed

    private void cboJenisKelaminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboJenisKelaminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboJenisKelaminActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        controler.cancel();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        int jawab = JOptionPane.showOptionDialog(this,
                    "Apakah ingin Keluar ?",
                    "Keluar",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE,null,null,null);
        if(jawab==JOptionPane.YES_OPTION)
        System.exit(0);
        //dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        controler.insert();
        controler.viewData();
        controler.cancel();
    }//GEN-LAST:event_btnInsertActionPerformed

    private void tabelMahasiswaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelMahasiswaMouseClicked
        controler.getMahasiswa();
    }//GEN-LAST:event_tabelMahasiswaMouseClicked

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        controler.update();
        controler.viewData();
        controler.cancel();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        controler.delete();
        controler.viewData();
        controler.cancel();
    }//GEN-LAST:event_btnDeleteActionPerformed

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
            java.util.logging.Logger.getLogger(FormMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormMahasiswa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Lalamat;
    private javax.swing.JLabel Lnobp;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cboJenisKelamin;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel ljekel;
    private javax.swing.JLabel ltgllahir;
    private javax.swing.JTable tabelMahasiswa;
    private javax.swing.JTextField txtAlamat;
    private javax.swing.JTextField txtNOBP;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtTgl;
    // End of variables declaration//GEN-END:variables

    public Object getTxtTanggalLahir() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
