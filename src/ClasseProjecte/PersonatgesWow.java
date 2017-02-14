/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasseProjecte;

/**
 *
 * @author cristian
 */
public class PersonatgesWow {

    private String nom;
    private int nivell;
    private String raça;
    private boolean esHorda = true;
    private boolean omplit = false;

    public PersonatgesWow() {
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
        return "PersonatgesWow{" + "nom=" + nom + ", nivell=" + nivell + ", ra\u00e7a=" + raça + ", esHorda=" + esHorda + ", omplit=" + omplit + '}';
    }

}