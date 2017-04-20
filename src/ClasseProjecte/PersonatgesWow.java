/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasseProjecte;

import java.io.Serializable;

/**
 *
 * @author cristian
 */
public class PersonatgesWow implements Serializable {

    private String nom;
    private int nivell;
    private String raça;
    private boolean esHorda = true;
    private boolean omplit = false;

    public PersonatgesWow() {
    }

    public PersonatgesWow(String nom) {
        this.nom = nom;
    }

    public PersonatgesWow(String nom, int nivell, String raça) {
        this.nom = nom;
        this.nivell = nivell;
        this.raça = raça;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNivell() {
        return nivell;
    }

    public void setNivell(int nivell) {
        this.nivell = nivell;
    }

    public String getRaça() {
        return raça;
    }

    public void setRaça(String raça) {
        this.raça = raça;
    }

    public boolean isEsHorda() {
        return esHorda;
    }

    public void setEsHorda(boolean esHorda) {
        this.esHorda = esHorda;
    }

    public boolean isOmplit() {
        return omplit;
    }

    public void setOmplit(boolean omplit) {
        this.omplit = omplit;
    }

    @Override
    public String toString() {

        if (esHorda) {
            return nom + ", " + nivell + ", " + raça + ", " + "és Horda!";
        } else {
            return nom + ", " + nivell + ", " + raça + ", " + "és Aliança!";
        }

    }

}
