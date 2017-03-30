/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasseProjecte;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cristian
 */
public class MainProves {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        File f = new File("Test");

        PersonatgesWow personatge = new PersonatgesWow("Slinkor901");

        ObjectOutputStream sortida = null;

        try {
            sortida = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(f)));

            sortida.writeObject(personatge);

        } catch (IOException ex) {
            System.out.println("Error al obrir el fitxer.");
        } finally {
            try {
                sortida.close();
            } catch (IOException ex) {
                System.out.println("Error al tanca el fitxer.");
            }
        }

        ObjectInputStream entrada = null;

        try {
            entrada = new ObjectInputStream(new BufferedInputStream(new FileInputStream(f)));

            while (true) {

                PersonatgesWow p;
                try {
                    p = (PersonatgesWow) entrada.readObject();
                    System.out.println(p.getNom());
                } catch (IOException | ClassNotFoundException ex) {
                    break;
                }

            }

        } catch (IOException ex) {
            System.out.println("Error al obrir el fitxer per llegir Personatges.");
        } finally {
            try {
                entrada.close();
            } catch (IOException ex) {
                System.out.println("Error al tancar el fitxer.");
            }
        }

    }

}
