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


}
