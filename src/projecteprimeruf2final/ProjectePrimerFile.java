/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteprimeruf2final;

import ClasseProjecte.PersonatgesWow;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Properties;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cristian
 */
public class ProjectePrimerFile {

    public static final int MAXPERSONATGES = 2000;

    private static int opcio = 0;

    private static File f = new File("personatgesWow.db");

    private static File file = new File("config");

    private static String arrayCapacitat;

    private static PersonatgesWow[] array = inicialitzarArray();

    public static PersonatgesWow[] getArray() {
        return array;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        inicialitzarArray();
        inicialitzarVariables();

        do {
            demanarOpcio();
            tractarOpcio();
        } while (!opcioFinal());

    }

    private static PersonatgesWow[] inicialitzarArray() {

        Properties props = new Properties();
        FileInputStream in = null;

        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(ProjectePrimerFile.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        try {
            in = new FileInputStream("configArray");
            props.load(in);

        } catch (IOException ex) {

            System.out.println("No hem pogut carregar l'arxiu de propietats!!");

        } finally {

            try {
                if (in != null) {
                    in.close();
                }
            } catch (IOException ex) {
                System.out.println("Error al tancar l'arxiu de propietats!!");
            }
        }

        /**
         *
         * Aqui instanciem l'array amb la capacitat dita per la vista anterior.
         *
         */
        arrayCapacitat = props.getProperty("array.cap");

        array = new PersonatgesWow[Integer.valueOf(arrayCapacitat)];

        return array;
    }

    private static void introduirPersonatge() {

        Scanner ent = new Scanner(System.in);

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
    }

    private static void modificarPersonatge() {
        Scanner ent = new Scanner(System.in);
        char siNo = 'N';
        int cont = 1;
        int i;
        for (i = 0; i < array.length && siNo != 'F'; i++) {
            if (array[i].isOmplit()) {
                System.out.format("\nPersonatge %d:\n", cont++);
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
    }

    private static void borrarPersonatges() {
        PersonatgesWow p = null;   //l'utilizo per apuntar al Personatge de les caselles de l'array
        Scanner ent = new Scanner(System.in);
        char siNo = 'N';
        int i;
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

    }

    private static void llistarPersonatges() {
        Scanner ent = new Scanner(System.in);

        boolean algun = false;
        char siNo = 'S';
        int i;
        for (i = 0; i < array.length; i++) {
            PersonatgesWow p = array[i];
            if (p.isOmplit()) {
                algun = true;
                System.out.println(p);
                do {
                    System.out.println("\nVols vore més personatges(S/N)?:");
                    siNo = ent.skip("[\r\n]*").nextLine().toUpperCase().charAt(0); //usem toUpperCase() que traduix el text introduït per l'usuari a majúscules,                     
                } while (siNo != 'S' && siNo != 'N');
            }
            if (siNo == 'N') {
                break;
            }
        }
        if (!algun) {
            System.out.println("\nNo hi ha personatges per mostrar, si vols, primer crea'n.");
        }
    }

    private static void recuperarPersonatge() {
        Scanner ent = new Scanner(System.in);
        //Primer recorrem l'array buscant caselles buides i preguntant quina volem recuperar
        char siNo = 'N';
        int cont = 0, i;
        for (i = 0; i < array.length && siNo != 'S' && siNo != 'F'; i++) {
            if (!array[i].isOmplit()) {
                System.out.format("\nPersonatge %d:\n", ++cont);
                System.out.println(array[i].toString());
                do {
                    System.out.println("\nVols recuperar el personatge(S/N) o finalitzar la cerca (F)?:");
                    siNo = ent.skip("[\r\n]*").nextLine().toUpperCase().charAt(0); //usem toUpperCase() que traduix el text introduït per l'usuari a majúscules, 
                    //per tant només haurem de tractar les lletres majúscules
                } while (siNo != 'S' && siNo != 'N' && siNo != 'F');
            }
            if (siNo == 'S') {
                break;
            }
        }
        //Si l'usuari ha contestat que sí és que ha triat un Personatge per modificar    
        if (siNo == 'S') {
            array[i].setOmplit(true);
            System.out.println("Personatge recuperat correctament.");
        } else if (cont == 0) {
            System.out.println("No hi ha Personatge per recuperat.");
        } else {
            System.out.println("Personatge no recuperat.");
        }
    }

    public static void inicialitzarVariables() throws IOException {

        //Índex per recòrrer l'array
        int i = 0;

        //Busquem el fitxer, i si existix el tractem
        if (f.exists()) {
            //L'usem per si no caben els objectes del fitxer a l'array poder finalitzar l'execució
            boolean acabar = false;

            //Obrim el fitxer per lectura
            ObjectInputStream lectura = null;
            try {
                //Obrim el fitxer per lectura
                lectura = new ObjectInputStream(new BufferedInputStream(new FileInputStream(f)));

                while (true) {
                    array[i] = (PersonatgesWow) lectura.readObject();
                    //Incrementar la i per separat ja que sinó dixem una casella a null
                    i++;
                }
            } catch (ArrayIndexOutOfBoundsException ex) {
                //Si entrem aquí és per que al fitxer hi ha més Personatge que els que caben a l'array. 
                //Podríem avisar a l'usuari i dixar que tanque l'aplicació ja que sinó pot perdre dades...
                System.err.println("Atenció, no caben tots els objectes. Si continues pots perdre dades. Vols continuar?(S/N):");
                Scanner ent = new Scanner(System.in);
                char siNo = ' ';
                do {
                    siNo = ent.skip("[\r\n]*").nextLine().toUpperCase().charAt(0); //usem toUpperCase() que traduix el text introduït per l'usuari a majúscules, 
                    //per tant només haurem de tractar les lletres majúscules
                } while (siNo != 'S' && siNo != 'N');
                if (siNo == 'N') {
                    acabar = true;
                }

            } catch (IOException ex) {
                //Aquí no cal fer res ja que significa que hem arribat al final del fitxer
            } catch (ClassNotFoundException ex) {
                //Aquí tampoc cal fer res ja que significa que el fitxer llegit no conté objectes de la classe Personatge
            } finally {
                try {
                    //Molt important tancar el fitxer de lectura
                    if (lectura != null) {
                        lectura.close();
                    }
                } catch (IOException ex) {
                    //No cal mostrar res
                }
                //Si hem decidit acabar parem l'execucuió
                if (acabar) {
                    System.exit(0);
                }
            }

        }
        //Acabem d'omplir l'array en nous Personatge sense dades
        for (; i < array.length; i++) {
            array[i] = new PersonatgesWow();
            array[i].setOmplit(false);
        }

        Properties props = new Properties();
        FileInputStream in = null;

        if (!f.exists()) {
            f.createNewFile();

        }

        try {
            in = new FileInputStream("config");
            props.load(in);

        } catch (IOException ex) {

            System.out.println("No hem pogut carregar l'arxiu de propietats!!");

        } finally {

            try {
                if (in != null) {
                    in.close();
                }
            } catch (IOException ex) {
                System.out.println("Error al tancar l'arxiu de propietats!!");
            }
        }

        arrayCapacitat = props.getProperty("array.cap");

    }

    private static boolean opcioFinal() {
        return opcio == 0;
    }

    private static void tractarOpcio() {
        switch (opcio) {
            case 0:                             //0. Sortir
                finalitzar();
                break;
            case 1:

                introduirPersonatge();

                break;

            case 2:
                modificarPersonatge();
                break;

            case 3:

                borrarPersonatges();
                break;
            case 4:
                llistarPersonatges();
                break;
            case 5:
                recuperarPersonatge();
                break;

            default:
                System.out.println("\nOpció incorrecta!!");
        }
    }

    private static void demanarOpcio() {
        Scanner ent = new Scanner(System.in);

        do {

            System.out.println("\n\nMenú de l'aplicació.");
            System.out.println("0. Sortir.");
            System.out.println("1. Introduïr personatge.");
            System.out.println("2. Modificar personatge.");
            System.out.println("3. Borrar personatge.");
            System.out.println("4. Llistar personatge.");
            System.out.println("5. Recuperar personatge borrat.");

            try {
                opcio = ent.nextInt();
                break;
            } catch (java.util.InputMismatchException e) {
                System.out.println("Opció incorrecta!");
                ent.next();
                continue;
            }

        } while (true);

    }

    private static void acabar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void finalitzar() {
        //Obrim el fitxer per escriptura
        ObjectOutputStream escriptura = null;
        try {
            //Obrim el fitxer
            escriptura = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(f)));

            //Recorrem l'array guardant els objectes vàlids al fitxer
            for (int i = 0; i < array.length; i++) {
                //Guardem al fitxer els Personatge omplits
                if (array[i].isOmplit()) {
                    escriptura.writeObject(array[i]);
                }
            }
        } catch (IOException ex) {
            //Aquí podem avisar a l'usuari de que no s'han guardat les dades
            System.err.println("Error en guardar les dades!!");
        } finally {
            try {
                //Molt important tancar el fitxer d'escriptura
                if (escriptura != null) {
                    escriptura.close();
                }
            } catch (IOException ex) {
                //No cal mostrar res
            }

        }

        //Missatge de comiat
        System.out.println("Adéu!!");

    }

}
