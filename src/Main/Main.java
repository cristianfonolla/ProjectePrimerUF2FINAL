/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Vista.Vista;
import Vista.VistaPasswd;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author cristian
 */
public class Main {

    private static Vista vista;
    private static VistaPasswd vistaPass;
    private static String passwd;
    private static String nomUser;

    public static void main(String[] args) throws IOException {

        vista = new Vista();
        vistaPass = new VistaPasswd();
        passwd = vistaPass.getPasswd();
        nomUser = vistaPass.getNomUser();
        vista.setVisible(false);
        vistaPass.setVisible(true);

        control();

    }

    private static void control() {
        ActionListener actionListener = new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                if (actionEvent.getSource().equals(vistaPass.getjButton1())) {

                    if (vistaPass.getjTextField2().getText().equals(passwd) && vistaPass.getjTextField1().getText().equals(nomUser)) {

                        vistaPass.setVisible(false);
                        vista.setVisible(true);

                    } else {
                        
                        JOptionPane.showMessageDialog(null, "Error Usuari o Contrasenya INCORRECTES!");

                    }

                }
            }
        };

        vistaPass.getjButton1().addActionListener(actionListener);

    }
}
