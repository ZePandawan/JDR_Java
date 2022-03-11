import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

import javax.swing.JFileChooser;

public class sauvegarde {
    private String nom;
	private String classe;
	private String race;
	private int age;
	private String Competence_1;
	private String Competence_2;
	private String Competence_3;
	private String [] inventory;

        public sauvegarde()
        {
            infos_persos save = new infos_persos();
            nom = save.getNom();
            classe = save.getClasse();
            race = save.getRace();
            age = save.getAge();
            Competence_1 = save.getComp1();
            Competence_2 = save.getComp2();
            Competence_3 = save.getComp3();
            inventory = save.getInv();
        }

        public void inFile() throws FileNotFoundException, UnsupportedEncodingException
        {
            JFileChooser filechoose = new JFileChooser();
            filechoose.setCurrentDirectory(new File("."));  /* ouvrir la boite de dialogue dans répertoire courant */
            filechoose.setDialogTitle("Enregistrer tous les exemples"); /* nom de la boite de dialogue */
             
            filechoose.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY); /* pour afficher seulement les répertoires */
             
            String approve = new String("Enregistrer"); /* Le bouton pour valider l’enregistrement portera la mention Enregistrer */
            int resultatEnregistrer = filechoose.showDialog(filechoose, approve); 
            if (resultatEnregistrer == JFileChooser.APPROVE_OPTION){ /* Si l’utilisateur clique sur le bouton Enregistrer */
                String chemin = filechoose.getSelectedFile().getAbsolutePath()+"\\"; /* pour avoir le chemin absolu */
                
                System.out.println(chemin);
                String filePath = chemin + "/mon-fichier.txt";

                PrintWriter writer = new PrintWriter(filePath, "UTF-8");
                writer.println(nom);
                writer.println(classe);
                writer.println(race);
                writer.println(age);
                writer.println(Competence_1);
                writer.println(Competence_2);
                writer.println(Competence_3);
                writer.println("Inventory :");
                for (String item : inventory) 
                {
                    writer.println(item);
                }
                
                writer.close();

            }

            
        }


}
