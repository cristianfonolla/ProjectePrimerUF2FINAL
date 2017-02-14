/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteprimeruf2final;

import ClasseProjecte.PersonatgesWow;
import java.util.Scanner;

/**
 *
 * @author cristian
 */
public class ProjectePrimerUF2FINAL {

    public static final int MAXPERSONATGES = 2;

    private static PersonatgesWow[] array = new PersonatgesWow[MAXPERSONATGES];

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);
        int opcio;
        PersonatgesWow p = null;

        for (int i = 0; i < array.length; i++) {
            array[i] = new PersonatgesWow();
            array[i].setOmplit(false);
        }

        do {
            char siNo;
            System.out.println("\n\nMenú de l'aplicació.");
            System.out.println("0. Sortir.");
            System.out.println("1. Introduïr personatge.");
            System.out.println("2. Modificar personatge.");
            System.out.println("3. Borrar personatge.");
            System.out.println("4. Llistar personatge.");
            System.out.println("5. Recuperar personatge borrat.");
            switch (opcio = ent.skip("[\r\n]*").nextInt()) {
                case 0:                             //0. Sortir
                    System.out.println("Adéu!!");
                    break;
                case 1:

                    int i;

                    for (i = 0; i < array.length && array[i].isOmplit(); i++);

                    if (i < array.length) {

                        System.out.println("\nNom:");
                        array[i].setNom(ent.skip("[\r\n]*").nextLine());
                        System.out.println("Nivell:");

                        try {
                            array[i].setNivell(ent.skip("[\r\n]*").nextInt());
                        } catch (Exception e) {
                            System.out.println("Introdueix un numero!!!");
                        }

                        System.out.println("Raça:");
                        array[i].setRaça(ent.skip("[\r\n]*").nextLine());

                        char esHorda;

                        do {

                            System.out.println("És horda o aliança?");
                            esHorda = ent.skip("[\r\n]*").nextLine().toUpperCase().charAt(0);

                        } while (esHorda != 'H' && esHorda != 'A');
                        array[i].setEsHorda(esHorda == 'H');
                        array[i].setOmplit(true);

                    } else {

                        System.out.println("No caben mes personatges, si vols posar-ne més, borra un!");

                    }

                    break;

                case 2:

                    siNo = 'N';
                    int cont = 1;
                    for (i = 0; i < array.length && siNo != 'F'; i++) {
                        if (array[i].isOmplit()) {
                            System.out.format("\nPilot %d:\n", cont++);
                            System.out.println(array[i].toString());
                            do {
                                System.out.println("\nVols modificar el Personatge(S/N) o finalitzar la cerca (F)?:");
                                siNo = ent.skip("[\r\n]*").nextLine().toUpperCase().charAt(0);

                            } while (siNo != 'S' && siNo != 'N' && siNo != 'F');
                        }
                        if (siNo == 'S') {
                            break;
                        }
                    }

                    if (siNo == 'S') {

                        System.out.println("\nNom: " + array[i].getNom());
                        do {
                            System.out.println("\nVols modificar el nom?(S/N):");
                            siNo = ent.skip("[\r\n]*").nextLine().toUpperCase().charAt(0);
                        } while (siNo != 'S' && siNo != 'N');
                        if (siNo == 'S') {
                            System.out.print("Nou nom: ");
                            array[i].setNom(ent.skip("[\r\n]*").nextLine());
                        }
                        System.out.println("\nDorsal: " + array[i].getNivell());
                        do {
                            System.out.println("\nVols modificar el nivell?(S/N):");
                            siNo = ent.skip("[\r\n]*").nextLine().toUpperCase().charAt(0);
                        } while (siNo != 'S' && siNo != 'N');
                        if (siNo == 'S') {
                            System.out.print("Nou nivell: ");
                            array[i].setNivell(ent.skip("[\r\n]*").nextInt());
                        }

                        System.out.println("\n Raça: " + array[i].getRaça());
                        do {
                            System.out.println("\nVols modificar la raça?(S/N):");
                            siNo = ent.skip("[\r\n]*").nextLine().toUpperCase().charAt(0);
                        } while (siNo != 'S' && siNo != 'N');
                        if (siNo == 'S') {
                            System.out.print("Nova raça: ");
                            array[i].setRaça(ent.skip("[\r\n]*").nextLine());
                        }

                        if (array[i].isEsHorda()) {
                            System.out.println("\nÉs Horda");
                        } else {
                            System.out.println("\nÉs Aliança");
                        }
                        do {
                            System.out.println("\nVols modificar la facció?(S/N):");
                            siNo = ent.skip("[\r\n]*").nextLine().toUpperCase().charAt(0);
                        } while (siNo != 'S' && siNo != 'N');
                        if (siNo == 'S') {
                            char esHorda;
                            do {
                                System.out.println("És horda o aliança?(H/A):");
                                esHorda = ent.skip("[\r\n]*").nextLine().toUpperCase().charAt(0);
                            } while (esHorda != 'H' && esHorda != 'A');
                            array[i].setEsHorda(esHorda == 'H');
                            System.out.print("Nou gènere: ");
                            if (array[i].isEsHorda()) {
                                System.out.println("Horda");
                            } else {
                                System.out.println("Aliança");
                            }
                        }

                        System.out.println("Personatge modificat correctament.");

                    } else {
                        System.out.println("\nNo hi ha personatges per modificar, o no n'has triat cap per modificar.");
                    }
                    break;

                case 3:
                    siNo = 'N';
                    for (i = 0; i < array.length && siNo != 'F'; i++) {
                        p = array[i];
                        if (p.isOmplit()) {
                            System.out.println(p);
                            do {
                                System.out.println("\nVols borrar el personatge(S/N) o finalitzar la cerca (F)?:");
                                siNo = ent.skip("[\r\n]*").nextLine().toUpperCase().charAt(0);

                            } while (siNo != 'S' && siNo != 'N' && siNo != 'F');
                        }
                        if (siNo == 'S') {
                            break;
                        }
                    }

                    if (siNo == 'S') {
                        p.setOmplit(false);
                        System.out.println("personatge borrat correctament.");

                    } else {
                        System.out.println("\nNo s'ha borrat cap personatge.");
                    }
                    break;
                case 4:
                    boolean algun = false;
                    siNo = 'S';
                    for (i = 0; i < array.length; i++) {
                        p = array[i];
                        if (p.isOmplit()) {
                            algun = true;
                            System.out.println(p);
                            do {
                                System.out.println("\nVols vore més personatge(S/N)?:");
                                siNo = ent.skip("[\r\n]*").nextLine().toUpperCase().charAt(0);

                            } while (siNo != 'S' && siNo != 'N');
                        }
                        if (siNo == 'N') {
                            break;
                        }
                    }
                    if (!algun) {
                        System.out.println("\nNo hi ha personatge per mostrar, si vols, primer crea'n.");
                    }
                    break;
                case 5:
                    if (array[0].getNom() != null) {
                        siNo = 'N';
                        for (i = 0; i < array.length && siNo != 'F'; i++) {
                            p = array[i];
                            if (!p.isOmplit()) {
                                System.out.println(p);
                                do {
                                    System.out.println("\nVols recuperar el personatge(S/N) o finalitzar la cerca (F)?:");
                                    siNo = ent.skip("[\r\n]*").nextLine().toUpperCase().charAt(0);

                                } while (siNo != 'S' && siNo != 'N' && siNo != 'F');
                            }
                            if (siNo == 'S') {
                                break;
                            }
                        }

                        if (siNo == 'S') {
                            p.setOmplit(true);
                            System.out.println("personatge recuperat correctament.");

                        } else {
                            System.out.println("\nNo s'ha recuperat cap personatges.");
                        }

                        break;
                    } else {

                        System.out.println("Primer introdueix un personatge");
                        break;
                    }

                default:
                    System.out.println("\nOpció incorrecta!!");
            }
        } while (opcio != 0);

    }

}