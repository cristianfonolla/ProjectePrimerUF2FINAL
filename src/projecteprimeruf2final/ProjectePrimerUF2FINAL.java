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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Array de presonatges del Wow on guardarem la informació de aquests mateixos.
        PersonatgesWow[] array = new PersonatgesWow[MAXPERSONATGES];

        String nom = "";
        int nivell = 0;
        String raça = "";
        boolean esHorda = true;
        boolean omplit = false;

        Scanner ent = new Scanner(System.in);
        int opcio;

        do {
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
                case 1:                             //1. Introduïr pilot
                    if (!omplit) {
                        System.out.println("\nNom:");
                        nom = ent.skip("[\r\n]*").nextLine();
                        System.out.println("Nivell:");
                        nivell = ent.skip("[\r\n]*").nextInt();
                        System.out.println("Raça:");
                        raça = ent.skip("[\r\n]*").nextLine();

                        char siNo;
                        do {
                            System.out.println("És Horda?(S/N)");
                            siNo = ent.skip("[\r\n]*").nextLine().toUpperCase().charAt(0); //usem toUpperCase() que traduix el text introduït per l'usuari a majúscules, 
                            //per tant només haurem de tractar les lletres majúscules
                        } while (siNo != 'S' && siNo != 'N');
                        if (siNo == 'S') {
                            esHorda = true;
                        } else {
                            esHorda = false;
                        }

                        omplit = true;

                    } else {
                        System.out.println("\nNo hi ha pilots per omplir, si vols primer borra'n.");
                    }
                    break;

                case 2:                             //2. Modificar personatge
                    if (omplit) {
                        char siNo;

                        do {
                            System.out.println("\nVols vore el Personatge??(S/N):");
                            siNo = ent.skip("[\r\n]*").nextLine().toUpperCase().charAt(0); //usem toUpperCase() que traduix el text introduït per l'usuari a majúscules, 
                            //per tant només haurem de tractar les lletres majúscules
                        } while (siNo != 'S' && siNo != 'N');
                        if (siNo == 'S') {
                            System.out.println("\nNom: " + nom);
                            System.out.println("Nivell: " + nivell);
                            System.out.println("Raça: " + raça);
                            if (esHorda) {
                                System.out.println("És Horda");
                            } else {
                                System.out.println("És Aliança");
                            }
                        }

                        do {
                            System.out.println("\nVols modificar el Personatge?(S/N):");
                            siNo = ent.skip("[\r\n]*").nextLine().toUpperCase().charAt(0);
                        } while (siNo != 'S' && siNo != 'N');

                        if (siNo == 'S') {

                            System.out.println("\nNom: " + nom);
                            do {
                                System.out.println("\nVols modificar el nom?(S/N):");
                                siNo = ent.skip("[\r\n]*").nextLine().toUpperCase().charAt(0);
                            } while (siNo != 'S' && siNo != 'N');
                            if (siNo == 'S') {
                                System.out.print("Nou nom: ");
                                nom = ent.skip("[\r\n]*").nextLine();
                            }

                            System.out.println("\nNivell: " + nivell);
                            do {
                                System.out.println("\nVols modificar el nivell?(S/N):");
                                siNo = ent.skip("[\r\n]*").nextLine().toUpperCase().charAt(0);
                            } while (siNo != 'S' && siNo != 'N');
                            if (siNo == 'S') {
                                System.out.print("Nou nivell: ");
                                nivell = ent.skip("[\r\n]*").nextInt();
                            }

                            System.out.println("\nRaça: " + raça);
                            do {
                                System.out.println("\nVols modificar la Raça?(S/N):");
                                siNo = ent.skip("[\r\n]*").nextLine().toUpperCase().charAt(0);
                            } while (siNo != 'S' && siNo != 'N');
                            if (siNo == 'S') {
                                System.out.print("Nova raça: ");
                                raça = ent.skip("[\r\n]*").nextLine();
                            }

                            if (esHorda) {
                                System.out.println("\nÉs Horda");
                            } else {
                                System.out.println("\nÉs Aliança");
                            }
                            do {
                                System.out.println("\nVols modificar si es Horda o no?(S/N):");
                                siNo = ent.skip("[\r\n]*").nextLine().toUpperCase().charAt(0);
                            } while (siNo != 'S' && siNo != 'N');
                            if (siNo == 'S') {

                                char esHome;
                                do {
                                    System.out.println("És Horda o Aliança?(H/A):");
                                    esHome = ent.skip("[\r\n]*").nextLine().toUpperCase().charAt(0);
                                } while (esHome != 'H' && esHome != 'A');

                                if (esHome == 'H') {

                                    esHorda = true;

                                } else {
                                    esHorda = false;
                                }

                                System.out.println("Canviat a: " + esHome);

                            }

                            System.out.println("Pilot modificat correctament.");
                        } else {
                            System.out.println("Pilot no modificat.");
                        }

                    } else {
                        System.out.println("\nNo hi ha pilots per modificar, si vols primer crea'n.");
                    }
                    break;
                case 3:                                     //3. Borrar pilot
                    if (omplit) {
                        char siNo;
                        do {
                            System.out.println("\nVols vore el Personatge??(S/N):");
                            siNo = ent.skip("[\r\n]*").nextLine().toUpperCase().charAt(0); //usem toUpperCase() que traduix el text introduït per l'usuari a majúscules, 
                            //per tant només haurem de tractar les lletres majúscules
                        } while (siNo != 'S' && siNo != 'N');
                        if (siNo == 'S') {
                            System.out.println("\nNom: " + nom);
                            System.out.println("Nivell: " + nivell);
                            System.out.println("Raça: " + raça);
                            if (esHorda) {
                                System.out.println("És Horda");
                            } else {
                                System.out.println("És Aliança");
                            }
                        }

                        do {
                            System.out.println("\nVols borrar el personatge?(S/N):");
                            siNo = ent.skip("[\r\n]*").nextLine().toUpperCase().charAt(0); //usem toUpperCase() que traduix el text introduït per l'usuari a majúscules, 
                            //per tant només haurem de tractar les lletres majúscules
                        } while (siNo != 'S' && siNo != 'N');
                        if (siNo == 'S') {
                            omplit = false;
                            System.out.println("Personatge borrat correctament.");
                        } else {
                            System.out.println("Personatge no borrat.");
                        }

                    } else {
                        System.out.println("\nNo hi ha pilots per borrar, si vols primer crea'n.");
                    }
                    break;
                case 4:                                     //4. Llistar pilots
                    if (omplit) {
                        System.out.println("\nNom: " + nom);
                        System.out.println("Nivell: " + nivell);
                        System.out.println("Raça: " + raça);
                        if (esHorda) {
                            System.out.println("És Horda");
                        } else {
                            System.out.println("És Aliança");
                        }
                    } else {
                        System.out.println("\nNo hi ha pilots per mostrar, si vols primer crea'n.");
                    }
                    break;
                case 5:                                     //5. Recuperar pilot borrat

                    if (!omplit) {

                        char siNo;
                        do {
                            System.out.println("\nVols vore el Personatge??(S/N):");
                            siNo = ent.skip("[\r\n]*").nextLine().toUpperCase().charAt(0); //usem toUpperCase() que traduix el text introduït per l'usuari a majúscules, 
                            //per tant només haurem de tractar les lletres majúscules
                        } while (siNo != 'S' && siNo != 'N');
                        if (siNo == 'S') {
                            System.out.println("\nNom: " + nom);
                            System.out.println("Nivell: " + nivell);
                            System.out.println("Raça: " + raça);
                            if (esHorda) {
                                System.out.println("És Horda");
                            } else {
                                System.out.println("És Aliança");
                            }
                        }

                        do {
                            System.out.println("\nVols recuperar el personatge?(S/N):");
                            siNo = ent.skip("[\r\n]*").nextLine().toUpperCase().charAt(0); //usem toUpperCase() que traduix el text introduït per l'usuari a majúscules, 
                            //per tant només haurem de tractar les lletres majúscules
                        } while (siNo != 'S' && siNo != 'N');
                        if (siNo == 'S') {
                            omplit = true;
                            System.out.println("Personatge recuperat correctament.");
                        } else {
                            System.out.println("Personatge no recuperat.");
                        }

                    } else {
                        System.out.println("\nNo hi ha personatges per recuperar, si vols primer borra'n.");
                    }

                    break;
                default:
                    System.out.println("\nOpció incorrecta!!");
            }
        } while (opcio != 0);

    }

}