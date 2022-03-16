public class infos_persos {
	protected String nom ;
	private String classe = "toto";
	private String race = "titi";
	private int age = 69;
	private String Competence_1 = "69";
	private String Competence_2 = "vutgv"; 
	private String Competence_3 = "izebth";
	private String [] inventory = {"uyiegrb","iquyzrg"};

	public infos_persos() {
		
	}

	public String getNom()
	{
		return this.nom;
	}

	public String getClasse()
	{
		return this.classe;
	}

	public String getRace()
	{
		return this.race;
	}

	public int getAge()
	{
		return this.age;
	}

	public String getComp1()
	{
		return this.Competence_1;
	}

	public String getComp2()
	{
		return this.Competence_2;
	}

	public String getComp3()
	{
		return this.Competence_3;
	}

	public String [] getInv()
	{
		return this.inventory;
	}


	public void setNom(String NewNom)
	{
		nom = NewNom;
	}

	public void setClasse(String classe)
	{
		this.classe = classe;
	}

	public void setRace(String race)
	{
		this.race = race;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	public void setComp1(String Competence_1)
	{
		this.Competence_1 = Competence_1;
	}

	public void setComp2(String Competence_2)
	{
		this.Competence_2 = Competence_2;
	}

	public void setComp3(String Competence_3)
	{
		this.Competence_3 = Competence_3;
	}

	public void setInv(String [] inventory)
	{
		this.inventory = inventory;
	}


}

