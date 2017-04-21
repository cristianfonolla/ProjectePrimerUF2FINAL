/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import ClasseProjecte.PersonatgesWow;
import static Vista.GUI_UF3.transformaDades;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import projecteprimeruf2final.ProjectePrimerFile;

/**
 *
 * @author cristian
 */
public class Vista extends javax.swing.JFrame {

    int filasel = -1;
    int j;
    static PersonatgesWow[] array = ProjectePrimerFile.getArray();
    PersonatgesWow[] arrayBorrat = new PersonatgesWow[ProjectePrimerFile.MAXPERSONATGES];
    int indexBorrat = -1;
    int ultimaPosicio;

    /**
     * Creates new form Vista
     */
    public Vista() throws IOException {
        initComponents();
        initComponentsMeu();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        taula = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        taula.setModel(new javax.swing.table.DefaultTableModel(
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
        taula.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                taulaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(taula);

        jButton1.setText("Modificar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Crear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Eliminar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel1.setText("Nom:");

        jLabel2.setText("Nivell:");

        jLabel3.setText("Raça:");

        jButton4.setText("Sortir");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel4.setText("Es Horda o aliança:");

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("És Horda");

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("És Aliança");

        jLabel5.setText("Recuperar Personatge Borrat:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton5.setText("Recuperar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton2)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton5))
                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField1)
                                    .addComponent(jTextField2)
                                    .addComponent(jTextField3)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jButton5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton3)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void taulaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_taulaMouseClicked

        filasel = taula.getSelectedRow();

        if (filasel != -1) {
            jTextField1.setText((String) taula.getValueAt(filasel, taula.getColumnCount() - 4));
            jTextField2.setText(String.valueOf(taula.getValueAt(filasel, taula.getColumnCount() - 3)));
            jTextField3.setText((String) taula.getValueAt(filasel, taula.getColumnCount() - 2));

            if ((boolean) taula.getValueAt(filasel, taula.getColumnCount() - 1)) {

                jRadioButton1.setSelected(true);
                jRadioButton2.setSelected(false);

            } else {
                jRadioButton2.setSelected(true);
                jRadioButton1.setSelected(false);
            }

            jButton1.setEnabled(true);
            jButton3.setEnabled(true);

        } else {
            jRadioButton1.setSelected(true);
            jRadioButton2.setSelected(false);
            jTextField1.setText("");
            jTextField2.setText("");
            jTextField3.setText("");
            jButton1.setEnabled(false);
            jButton3.setEnabled(false);
        }


    }//GEN-LAST:event_taulaMouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        ProjectePrimerFile.finalitzar();
        System.exit(0);

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //Crear Personatges Wow
//        int i;
//
//        for (i = 0; i < array.length && array[i].isOmplit(); i++);

        if (ultimaPosicio < array.length) {

            /*
            Variable de permis per crear
                1 - Permis per crear
                0 - Sense permis per crear
             */
            int permis = 1;

            if (jTextField1.getText().equals("") || jTextField2.getText().equals("") || jTextField3.getText().equals("")) {
                permis = 0;
            }

            if (permis == 1) {

                try {

//                    array[i].setNivell(Integer.valueOf(jTextField2.getText().trim()));
//
//                    array[i].setNom(jTextField1.getText().trim());
//
//                    array[i].setRaça(jTextField3.getText().trim());
//
//                    if (jRadioButton1.isSelected()) {
//                        array[i].setEsHorda(true);
//                    } else if (jRadioButton2.isSelected()) {
//                        array[i].setEsHorda(false);
//                    }
//
//                    array[i].setOmplit(true);
                    array[ultimaPosicio].setNivell(Integer.valueOf(jTextField2.getText().trim()));

                    array[ultimaPosicio].setNom(jTextField1.getText().trim());

                    array[ultimaPosicio].setRaça(jTextField3.getText().trim());

                    if (jRadioButton1.isSelected()) {
                        array[ultimaPosicio].setEsHorda(true);
                    } else if (jRadioButton2.isSelected()) {
                        array[ultimaPosicio].setEsHorda(false);
                    }

                    array[ultimaPosicio].setOmplit(true);

                    llimpiarCamps();
                } catch (java.lang.NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Has introduit un nivell incorrecte, "
                            + "introdueix-ne un de correcte (número enter positiu no més gran que )" + Integer.MAX_VALUE);
                } catch (ArrayIndexOutOfBoundsException ex) {
                    JOptionPane.showMessageDialog(null, "Borra primer el Personatge creat, o augmenta l'array");
                }

                jButton1.setEnabled(false);
                jButton3.setEnabled(false);

                ultimaPosicio++;

                GUI_UF3.carregaTaula(new String[]{"Fila", "Nom", "Nivell", "Raça", "Horda"},
                        transformaDades(array), taula);
            } else if (permis == 0) {
                JOptionPane.showMessageDialog(null, "Has de introduir tots els camps del Personatge "
                        + "que vols crear");
            }

        } else {
            JOptionPane.showMessageDialog(null, "Borra primer el Personatge creat, o augmenta l'array");
        }


    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        //Borrar
        filasel = taula.getSelectedRow();

        int persSel = (int) taula.getValueAt(filasel, taula.getColumnCount() - 5);

        if (filasel != -1) {

            try {

                arrayBorrat[++indexBorrat] = array[persSel];

                array[persSel].setOmplit(false);

                for (int i = persSel; i < array.length - 1; i++) {
                    array[i] = array[i + 1];
                }

                plenarComboBox();

            } catch (NumberFormatException e) {
                System.err.println("UNEXPECTED ERROR." + e.getMessage());

            }

        }

        if (indexBorrat != -1) {
            jButton5.setEnabled(true);
            jComboBox1.setEnabled(true);
        }

        llimpiarCamps();

        jButton1.setEnabled(false);
        jButton3.setEnabled(false);

        ultimaPosicio--;

        GUI_UF3.carregaTaula(new String[]{"Fila", "Nom", "Nivell", "Raça", "Horda"},
                transformaDades(array), taula);


    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Modificar

        filasel = taula.getSelectedRow();

        if (filasel != -1) {

            try {
                PersonatgesWow p = array[(int) taula.getValueAt(filasel, taula.getColumnCount() - 5)];

                p.setNivell(Integer.valueOf(jTextField2.getText().trim()));

                p.setNom(jTextField1.getText().trim());

                p.setRaça(jTextField3.getText().trim());

                if (jRadioButton1.isSelected()) {
                    p.setEsHorda(true);
                } else if (jRadioButton2.isSelected()) {
                    p.setEsHorda(false);
                }

            } catch (java.lang.NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Has de introduir tots els camps del Personatge "
                        + "que vols crear");
            }

            llimpiarCamps();

            jButton1.setEnabled(false);
            jButton3.setEnabled(false);

            GUI_UF3.carregaTaula(new String[]{"Fila", "Nom", "Nivell", "Raça", "Horda"},
                    transformaDades(array), taula);

        } else {

            JOptionPane.showMessageDialog(null, "Selecciona un Personatge per modificar-lo");

        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        try {
//            int i;
//
//            for (i = 0; i < array.length && array[i].isOmplit(); i++);

            PersonatgesWow p = (PersonatgesWow) jComboBox1.getSelectedItem();
            p.setOmplit(true);
//            array[i] = p;
            array[ultimaPosicio] = p;

            for (int k = jComboBox1.getSelectedIndex(); k < arrayBorrat.length - 1; k++) {

                arrayBorrat[k] = arrayBorrat[k + 1];

            }

            indexBorrat--;

            if (indexBorrat == -1) {
                jButton5.setEnabled(false);
                jComboBox1.setEnabled(false);
            }

            ultimaPosicio++;

            plenarComboBox();

            GUI_UF3.carregaTaula(new String[]{"Fila", "Nom", "Nivell", "Raça", "Horda"},
                    transformaDades(array), taula);
        } catch (ArrayIndexOutOfBoundsException ex) {
            JOptionPane.showMessageDialog(null, "Borra primer el Personatge creat, o augmenta l'array");
        }


    }//GEN-LAST:event_jButton5ActionPerformed

    private void initComponentsMeu() throws IOException {

        ProjectePrimerFile.inicialitzarVariables();

        GUI_UF3.carregaTaula(new String[]{"Fila", "Nom", "Nivell", "Raça", "Horda"},
                transformaDades(ProjectePrimerFile.getArray()), taula);

        int i = 0;
        for (; i < arrayBorrat.length; i++) {
            arrayBorrat[i] = new PersonatgesWow();
            arrayBorrat[i].setOmplit(false);
        }

        plenarComboBox();

        ultimaPosicio = ultimaPosicioOcupada();

        jRadioButton1.setSelected(true);
        jButton1.setEnabled(false);
        jButton5.setEnabled(false);
        jComboBox1.setEnabled(false);
        jButton3.setEnabled(false);

    }

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
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Vista().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Vista.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTable taula;
    // End of variables declaration//GEN-END:variables

    private void llimpiarCamps() {
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
    }

    private void plenarComboBox() {

        PersonatgesWow[] ap = new PersonatgesWow[indexBorrat + 1];

        for (int i = 0; i <= indexBorrat; i++) {
            ap[i] = arrayBorrat[i];

        }

        jComboBox1.setModel(new DefaultComboBoxModel((ap != null ? ap : new Object[]{})));

    }

    public static int ultimaPosicioOcupada() {

        int i;

        for (i = 0; i < array.length && array[i].isOmplit(); i++);

        return i;

    }

}
